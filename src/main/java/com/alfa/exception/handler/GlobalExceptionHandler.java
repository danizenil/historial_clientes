package com.alfa.exception.handler;

import java.util.HashMap;
import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import com.alfa.exception.ExceptionNotFound;

@ControllerAdvice
public class GlobalExceptionHandler {

  @ExceptionHandler
  public ResponseEntity<Map<String, Object>> exceptionHandlerNotFound(ExceptionNotFound ex) {
    Map<String, Object> response = new HashMap<String, Object>();
    response.put("message", ex.getMessage());
    return new ResponseEntity<Map<String, Object>>(response, HttpStatus.NOT_FOUND);
  }

}
