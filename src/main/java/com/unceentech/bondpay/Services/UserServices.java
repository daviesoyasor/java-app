package com.unceentech.bondpay.Services;

import com.unceentech.bondpay.Models.User;
import com.unceentech.bondpay.Repositories.UserRepository;
import com.unceentech.bondpay.ThirdParty.Contracts.IUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServices {
    private final IUtility utilityServices;
    private final UserRepository userRepository;

    // Explanation:
    // @Component: I want you to create an object from this class when it is need and
    // @Autowired: I want you to automatically inject the implementation of the interface object
    // @Qualifier: If there are multiple implementations, then inject this specific implementation.
    @Autowired
    public UserServices(@Qualifier("VTPass") IUtility utilityServices, UserRepository userRepository) {
        this.utilityServices = utilityServices;
        this.userRepository = userRepository;
    }


    public List<User> getUsers(){
        return this.userRepository.findAll();
    }

    public User createUser(User user){
        return this.userRepository.save(user);
    }

    public Optional<User> getUser(Long id){
        return this.userRepository.findById(id);
    }


    public int buyAirtime(String serviceID, Integer amount, String phone){
        return this.utilityServices.buyAirtime(serviceID, amount, phone);
    }

}
