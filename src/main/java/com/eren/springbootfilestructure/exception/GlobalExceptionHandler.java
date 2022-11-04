//package com.eren.springbootfilestructure.exception;
//
//import com.eren.springbootfilestructure.exception.response.APIError;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.context.request.WebRequest;
//import org.springframework.web.servlet.NoHandlerFoundException;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.validation.ValidationException;
//
//@ControllerAdvice
//public class GlobalExceptionHandler {
//
//    @ExceptionHandler({ValidationException.class})
//    public ResponseEntity<APIError> validationException(
//            ValidationException ex,
//            HttpServletRequest request) {
//
//        return new ResponseEntity<>(
//                APIError.builder()
//                        .errorMessage(ex.getLocalizedMessage())
//                        .errorCode(HttpStatus.BAD_REQUEST.toString())
//                        .request(request.getRequestURI())
//                        .requestType(request.getMethod())
//                        .customMessage("Request is not valid")
//                        .build(), HttpStatus.BAD_REQUEST);
//    }
//
////    @ExceptionHandler({Exception.class})
////    public ResponseEntity<APIError> genericException(
////            Exception ex,
////            HttpServletRequest request, HttpServletResponse response, WebRequest webRequest) {
////        return new ResponseEntity<>(
////                APIError.builder()
////                        .errorMessage(ex.getLocalizedMessage())
////                        .errorCode(HttpStatus.INTERNAL_SERVER_ERROR.toString())
////                        .request(request.getRequestURI())
////                        .requestType(request.getMethod())
////                        .customMessage("Could not process request")
////                        .build(), HttpStatus.INTERNAL_SERVER_ERROR);
////    }
//
//    @ExceptionHandler({NoHandlerFoundException.class})
//    public ResponseEntity<APIError> handleDataNotFoundExceptions(
//            Exception ex,
//            HttpServletRequest request, HttpServletResponse response, WebRequest webRequest) {
//        return new ResponseEntity<>(
//                APIError.builder()
//                        .errorMessage(ex.getLocalizedMessage())
//                        .errorCode(HttpStatus.NOT_FOUND.toString())
//                        .request(request.getRequestURI())
//                        .requestType(request.getMethod())
//                        .customMessage("Could not not found")
//                        .build(), HttpStatus.NOT_FOUND);
//    }
//
//    @ExceptionHandler({NotFound.class})
//    public ResponseEntity<APIError> handleDataNotsFoundExceptions(
//            Exception ex,
//            HttpServletRequest request, HttpServletResponse response, WebRequest webRequest) {
//        return new ResponseEntity<>(
//                APIError.builder()
//                        .errorMessage(ex.getLocalizedMessage())
//                        .errorCode(HttpStatus.NOT_FOUND.toString())
//                        .request(request.getRequestURI())
//                        .requestType(request.getMethod())
//                        .customMessage("Could not not found")
//                        .build(), HttpStatus.NOT_FOUND);
//    }
//
//}