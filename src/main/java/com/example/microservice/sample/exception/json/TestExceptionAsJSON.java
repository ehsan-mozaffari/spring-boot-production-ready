package com.example.microservice.sample.exception.json;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by mtumilowicz on 2018-07-25.
 */
//@Value
//@Builder
    @Data
    @AllArgsConstructor
public class TestExceptionAsJSON {
    private String url;
    private String message;
}
