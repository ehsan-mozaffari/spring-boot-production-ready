package com.example.microservice.sample.exceptionsssss.types.unexpected;

import com.example.microservice.sample.exceptionsssss.model.ErrorResponse;
import com.example.microservice.sample.exceptionsssss.model.ErrorTypeEnum;
import com.example.microservice.sample.exceptionsssss.types.GlobalException;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.Optional;
import java.util.UUID;

@ResponseStatus(value= HttpStatus.CONFLICT,
        reason="Data integrity violation")  // 409
public class UnexpectedException extends GlobalException {

    public UnexpectedException(ErrorResponse errorResponse) throws JsonProcessingException {
        super(errorResponse);
    }

    public UnexpectedException(String message, Optional<String> userMessage) throws JsonProcessingException {
        this(buildResponse(ErrorTypeEnum.UNEXPECTED.getCode(), ErrorTypeEnum.UNEXPECTED, message, userMessage, UUID.randomUUID().toString()));
    }
}
