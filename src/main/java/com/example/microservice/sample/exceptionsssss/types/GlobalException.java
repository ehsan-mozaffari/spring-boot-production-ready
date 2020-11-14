package com.example.microservice.sample.exceptionsssss.types;

import com.example.microservice.sample.exceptionsssss.model.Error;
import com.example.microservice.sample.exceptionsssss.model.ErrorResponse;
import com.example.microservice.sample.exceptionsssss.model.ErrorTypeEnum;
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
