package com.unceentech.bondpay.ThirdParty.Contracts;

import java.util.List;

public interface IPaymentGateway {
    List<String> getBanks();
    String transfer(String currency, String receiverBankCode, String receiverAccountNumber, String narration, Integer amount);
}
