package com.eren.springbootfilestructure.exception;

import com.eren.springbootfilestructure.exception.response.APIError;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.ConstraintViolationException;
import java.time.LocalDateTime;

@ControllerAdvice
public class CustomErrorHandler extends RuntimeException{
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<APIError> handleConstraintViolationException(ConstraintViolationException e, HttpServletRequest request, HttpServletResponse response, WebRequest webRequest) {
        return new ResponseEntity<>(
                APIError.builder()
                        .errorMessage(e.getMessage())
                        .errorCode(HttpStatus.BAD_REQUEST.toString())
                        .errorCodeInt(HttpStatus.BAD_REQUEST.value())
                        .request(request.getRequestURI())
                        .requestType(request.getMethod())
                        .customMessage("Custom Message")
                        .localDateTime(LocalDateTime.now())
                        .build()
                , HttpStatus.BAD_REQUEST);
    }
}
