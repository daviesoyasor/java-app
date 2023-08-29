package com.unceentech.bondpay.ThirdParty.Implementations;

import com.unceentech.bondpay.ThirdParty.Contracts.IPaymentGateway;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("Paystack")
public class Paystack implements IPaymentGateway {
    @Override
    public List<String> getBanks() {
        return null;
    }

    @Override
    public String transfer(String currency, String receiverBankCode, String receiverAccountNumber, String narration, Integer amount) {
        return null;
    }
}
