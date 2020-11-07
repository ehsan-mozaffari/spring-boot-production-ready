package app.exception.types;

import app.exception.model.Error;
import app.exception.model.ErrorResponse;
import app.exception.model.ErrorTypeEnum;
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
