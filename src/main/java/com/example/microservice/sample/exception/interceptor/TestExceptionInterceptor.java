package com.example.microservice.sample.exception.interceptor;

import com.example.microservice.sample.exception.core.EntityNotFoundException;
import com.example.microservice.sample.exception.core.TestException;
import com.example.microservice.sample.exception.json.ApplicationExceptionAsJSON;
import com.example.microservice.sample.exception.json.TestExceptionAsJSON;
import lombok.NonNull;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by mtumilowicz on 2018-07-25.
 */
@RestControllerAdvice
class TestExceptionInterceptor {

    @ResponseStatus(code = HttpStatus.CONFLICT)
    @ExceptionHandler(TestException.class)
    @ResponseBody
    TestExceptionAsJSON testException(@NonNull HttpServletRequest request,
                                                       @NonNull TestException ex) {
//        Preconditions.checkArgument(nonNull(request.getRequestURI()));
//        Preconditions.checkArgument(nonNull(ex.getLocalizedMessage()));

//        return ApplicationExceptionAsJSON.builder()
//                .url(request.getRequestURI())
//                .message(ex.getLocalizedMessage())
//                .build();
        return new TestExceptionAsJSON("test Url", "test message");
    }
}
