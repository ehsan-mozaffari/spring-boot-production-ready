package app.exception.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Optional;

@Data
@AllArgsConstructor
public class Error {

    private Integer code;
    private String errorType;
    private String message;
    private Optional<String> userMessage;
    private String traceId;
}
