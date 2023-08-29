package com.unceentech.bondpay.Exceptions;

import lombok.Data;
@Data
public class ErrorResponse {
    private  Boolean error;
    private Integer statusCode;
    private String message;

    public ErrorResponse(Boolean error, Integer statusCode, String message) {
        this.error = error;
        this.statusCode = statusCode;
        this.message = message;
    }
}
