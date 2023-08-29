package com.unceentech.bondpay.Repositories;

import com.unceentech.bondpay.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//let spring create an object of this interface and automatically inject it in which ever class that autowires it
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByFirstName(String firstName);
}
