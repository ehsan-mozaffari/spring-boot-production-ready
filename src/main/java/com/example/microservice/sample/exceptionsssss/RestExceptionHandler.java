package com.example.microservice.sample.exceptionsssss;


import com.example.microservice.sample.controller.SampleRestController;
import com.example.microservice.sample.exceptionsssss.model.ApiError;
import com.example.microservice.sample.exceptionsssss.types.GlobalException;
import com.example.microservice.sample.exceptionsssss.types.unexpected.UnexpectedException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

//@Order(Ordered.HIGHEST_PRECEDENCE)
@ControllerAdvice
//@EnableAspectJAutoProxy
//@EnableWebMvc
public class RestExceptionHandler extends ResponseEntityExceptionHandler {


    @ExceptionHandler(GlobalException.class)
    public ResponseEntity<Object> handleCityNotFoundException(
            GlobalException ex, WebRequest request) {

        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("message", "City not found");

        return new ResponseEntity<>(body, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(UnexpectedException.class)
    public ResponseEntity<Object> handleNodataFoundException(
            UnexpectedException ex, WebRequest request) {

        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("message", "No cities found");

        return new ResponseEntity<>(body, HttpStatus.NOT_FOUND);
    }

//    @Override
//    protected ResponseEntity<Object> handleMethodArgumentNotValid(
//            MethodArgumentNotValidException ex, HttpHeaders headers,
//            HttpStatus status, WebRequest request) {
//
//        Map<String, Object> body = new LinkedHashMap<>();
//        body.put("timestamp", LocalDate.now());
//        body.put("status", status.value());
//
//        List<String> errors = ex.getBindingResult()
//                .getFieldErrors()
//                .stream()
//                .map(x -> x.getDefaultMessage())
//                .collect(Collectors.toList());
//
//        body.put("errors", errors);
//
//        return new ResponseEntity<>(body, HttpStatus.BAD_REQUEST);
//    }


//    @ExceptionHandler({UnexpectedException.class, GlobalException.class})
//    @ResponseBody
//    ResponseEntity<?> handleControllerException(HttpServletRequest request, Throwable ex) {
//        HttpStatus status = getStatus(request);
//        return buildResponseEntity(new ApiError(HttpStatus.BAD_REQUEST, "error", ex));
//    }
//
//    private HttpStatus getStatus(HttpServletRequest request) {
//        Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");
//        if (statusCode == null) {
//            return HttpStatus.INTERNAL_SERVER_ERROR;
//        }
//        return HttpStatus.valueOf(statusCode);
//    }

    //Add six global exception
//    @ExceptionHandler(UnexpectedException.class)
//    public ResponseEntity<Object> handleExceptions(UnexpectedException e , WebRequest webRequest){
//        System.out.println("111111111111111111111111111111111111111111111111111111111");
//        return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
//    }
//
//    @ExceptionHandler(GlobalException.class)
//    public ResponseEntity<Object> handleGlobalExceptions(GlobalException e , WebRequest webRequest){
//        System.out.println("222222222222222222222222222222222222222222222222222");
//        return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
//    }

//    @ExceptionHandler(RuntimeException.class)
//    public ModelAndView handleIOException(RuntimeException exception){
//        ModelAndView andView = new ModelAndView();
//        andView.setViewName("error");
//        return andView;
//    }
//    @ExceptionHandler(GlobalException.class)
//    public ModelAndView handleSQLException(GlobalException exception){
//        ModelAndView andView = new ModelAndView();
//        andView.setViewName("error");
//        return andView;
//    }

//    @Override
//    public ResponseEntity<Object> handleHttpMessageNotReadable(HttpMessageNotReadableException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
//        String error = "Malformed JSON request";
//        return buildResponseEntity(new ApiError(HttpStatus.BAD_REQUEST, error, ex));
//    }

    private ResponseEntity<Object> buildResponseEntity(ApiError apiError) {
        return new ResponseEntity<Object>(apiError, apiError.getStatus());
    }

    //other exception handlers below

//    @ExceptionHandler(UnexpectedException.class)
//    public ResponseEntity<Object> handleUnexpectedException(
//            UnexpectedException ex) {
//        ApiError apiError = new ApiError(NOT_FOUND);
//        apiError.setMessage(ex.getMessage());
//        return buildResponseEntity(apiError);
//    }

//    @ResponseStatus(HttpStatus.CONFLICT)  // 409
//    @ExceptionHandler(RuntimeException.class)
//    public ResponseEntity<Object> handleRuntimeException(
//            RuntimeException ex) {
//        ApiError apiError = new ApiError(NOT_FOUND);
//        apiError.setMessage(ex.getMessage());
//        return buildResponseEntity(apiError);
//    }

//    @ResponseStatus(HttpStatus.CONFLICT)  // 409
//    @ExceptionHandler(GlobalException.class)
//    public ResponseEntity<Object> handleGlobalException(
//            RuntimeException ex) {
//        ApiError apiError = new ApiError(NOT_FOUND);
//        apiError.setMessage(ex.getMessage());
//        return buildResponseEntity(apiError);
//    }


//    @Override
//    public ResponseEntity<Object> handleExceptionInternal(Exception ex, @Nullable Object body, HttpHeaders headers, HttpStatus status, WebRequest request) {
//        System.out.println("222222222222222222222222222222222222222222222222222");
//        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
//    }

}
