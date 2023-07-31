package com.eren.springbootfilestructure.exception.response;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Builder
@Data
public class APIError {

    private String errorMessage;

    private String errorCode;
    private int errorCodeInt;

    private String request;

    private String requestType;

    private String customMessage;
    private LocalDateTime localDateTime;

}
