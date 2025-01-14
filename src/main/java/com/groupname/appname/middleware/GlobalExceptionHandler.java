package com.groupname.appname.middleware;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

/**
 * GlobalExceptionHandler is a centralized exception handling class annotated
 * with @ControllerAdvice.
 * It handles exceptions thrown by the application and returns appropriate HTTP
 * responses.
 */
@ControllerAdvice
public class GlobalExceptionHandler {

  /**
   * Handles ResourceNotFoundException and returns a 404 Not Found response.
   *
   * @param ex      the ResourceNotFoundException thrown
   * @param request the current web request
   * @return a ResponseEntity containing an ErrorResponse with a 404 status code
   */
  @ExceptionHandler(ResourceNotFoundException.class)
  public ResponseEntity<ErrorResponse> handleResourceNotFoundException(ResourceNotFoundException ex,
      WebRequest request) {
    ErrorResponse errorResponse = new ErrorResponse(
        HttpStatus.NOT_FOUND.value(),
        ex.getMessage(),
        System.currentTimeMillis());
    return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
  }

  /**
   * Handles all other exceptions and returns a 500 Internal Server Error
   * response.
   *
   * @param ex      the Exception thrown
   * @param request the current web request
   * @return a ResponseEntity containing an ErrorResponse with a 500 status code
   */
  @ExceptionHandler(Exception.class)
  public ResponseEntity<ErrorResponse> handleGlobalException(Exception ex, WebRequest request) {
    ErrorResponse errorResponse = new ErrorResponse(
        HttpStatus.INTERNAL_SERVER_ERROR.value(),
        ex.getMessage(),
        System.currentTimeMillis());
    return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
  }
}
