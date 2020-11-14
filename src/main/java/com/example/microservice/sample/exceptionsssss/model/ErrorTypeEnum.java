package com.example.microservice.sample.exceptionsssss.model;

import lombok.Getter;

@Getter
public enum ErrorTypeEnum {

    AUTHENTICATION("Authentication", CodeEnum.AUTHENTICATION.getCode()),
    DATABASE("Database", CodeEnum.DATABASE.getCode()),
    NOT_FOUND("Notfound", CodeEnum.NOT_FOUND.getCode()),
    VALIDATION("Validation", CodeEnum.VALIDATION.getCode()),
    UNEXPECTED("Unexpected", CodeEnum.UNEXPECTED.getCode());

    private String name;
    private int code;

    private ErrorTypeEnum(String name, int code) {
        this.name = name;
        this.code = code;
    }
}
