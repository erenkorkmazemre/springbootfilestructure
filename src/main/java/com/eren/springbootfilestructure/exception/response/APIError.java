package com.eren.springbootfilestructure.exception.response;

import lombok.Builder;
import lombok.Data;

import javax.servlet.http.HttpServletRequest;

@Builder
@Data
public class APIError {

    private String errorMessage;

    private String errorCode;

    private String request;

    private String requestType;

    private String customMessage;

}
