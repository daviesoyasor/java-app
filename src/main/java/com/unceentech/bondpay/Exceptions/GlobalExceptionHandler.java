package com.unceentech.bondpay.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

// make this class a global exception handler
@ControllerAdvice
public class GlobalExceptionHandler {
    // The @ExceptionHandler annotation is used to handle specific exceptions.
    // use annotation to define that the method handles exception thrown within a request/response session.
    @ExceptionHandler(Exception.class)
    public final ResponseEntity<ErrorResponse> handleAllExceptions(Exception ex) {
        HttpStatus statusCode = determineStatusCode(ex);
        ErrorResponse error = new ErrorResponse(true, statusCode.value(), ex.getMessage());
        return new ResponseEntity<>(error, statusCode);
    }

    private HttpStatus determineStatusCode(Exception ex) {
        // You can implement custom logic here to determine the appropriate status code
        // based on the type of exception. For example:
        if (ex instanceof ResourceNotFoundException) {
            return HttpStatus.NOT_FOUND;
        }

        return HttpStatus.INTERNAL_SERVER_ERROR;
    }
}
