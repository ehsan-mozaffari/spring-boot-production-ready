package com.example.microservice.sample.exception.interceptor;

import com.example.microservice.sample.exception.core.EntityNotFoundException;
import com.example.microservice.sample.exception.json.ApplicationExceptionAsJSON;
import lombok.NonNull;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by mtumilowicz on 2018-07-25.
 */
@RestControllerAdvice
class EntityNotFoundExceptionInterceptor {

    @ResponseStatus(code = HttpStatus.NOT_FOUND)
    @ExceptionHandler(EntityNotFoundException.class)
    @ResponseBody
    ApplicationExceptionAsJSON entityNotFoundException(@NonNull HttpServletRequest request,
                                                       @NonNull EntityNotFoundException ex) {
//        Preconditions.checkArgument(nonNull(request.getRequestURI()));
//        Preconditions.checkArgument(nonNull(ex.getLocalizedMessage()));

        return ApplicationExceptionAsJSON.builder()
                .url(request.getRequestURI())
                .message(ex.getLocalizedMessage())
                .build();
    }
}
