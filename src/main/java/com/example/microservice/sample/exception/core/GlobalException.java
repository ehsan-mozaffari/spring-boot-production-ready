package com.example.microservice.sample.exception.core;

import com.example.microservice.sample.exception.json.Error;
import com.example.microservice.sample.exception.json.ErrorResponse;
import com.example.microservice.sample.exception.json.ErrorTypeEnum;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Optional;

public class GlobalException extends RuntimeException {
    public static ErrorResponse buildResponse(int code, ErrorTypeEnum errorType, String message, Optional<String> userMessage, String traceId) {
        return new ErrorResponse(
                new Error(code, errorType.getName(), message, userMessage, traceId)
        );
    }

    public GlobalException(ErrorResponse errorResponse) throws JsonProcessingException {

        super(new ObjectMapper().writeValueAsString(errorResponse));
    }
}
