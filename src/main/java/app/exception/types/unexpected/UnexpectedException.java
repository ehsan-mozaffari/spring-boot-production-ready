package app.exception.types.unexpected;

import app.exception.model.ErrorResponse;
import app.exception.model.ErrorTypeEnum;
import app.exception.types.GlobalException;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.Optional;
import java.util.UUID;

public class UnexpectedException extends GlobalException {

    public UnexpectedException(ErrorResponse errorResponse) throws JsonProcessingException {
        super(errorResponse);
    }

    public UnexpectedException(String message, Optional<String> userMessage) throws JsonProcessingException {
        this(buildResponse(ErrorTypeEnum.UNEXPECTED.getCode(), ErrorTypeEnum.UNEXPECTED, message, userMessage, UUID.randomUUID().toString()));
    }
}
