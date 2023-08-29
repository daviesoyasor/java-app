package com.unceentech.bondpay.ThirdParty.Implementations;

import com.unceentech.bondpay.ThirdParty.Contracts.IUtility;
import org.springframework.stereotype.Component;

@Component("VTPass")
public class VTPass implements IUtility {
    @Override
    public int buyAirtime(String serviceID, Integer amount, String phone) {
        return 0;
    }
}
