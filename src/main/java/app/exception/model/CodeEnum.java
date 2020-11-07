package app.exception.model;

import lombok.Getter;

@Getter
public enum CodeEnum {

    AUTHENTICATION(1),
    DATABASE(2),

    NOT_FOUND(3),
    NOT_FOUND_ENTITY(301),

    VALIDATION(4),
    UNEXPECTED(5);

    private int code;

    private CodeEnum(int code) {
        this.code = code;
    }
}
