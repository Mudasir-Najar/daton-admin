package com.saras.admin.controlAdvice;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.saras.admin.errorModel.ErrorModel;
import com.saras.admin.exception.AppException;
import com.saras.admin.restResponse.RestApiResponse;

import lombok.extern.slf4j.Slf4j;
@ControllerAdvice
@Slf4j
public class RestResponseEntityExceptionHandler {

	@ExceptionHandler(value = {AppException.class})
    protected ResponseEntity<Object> handleAppException(AppException exception) {
        RestApiResponse<Object> restApiResponse = RestApiResponse.builder().error(
                        ErrorModel.builder()
                                .code(exception.getCode().name())
                                .message(exception.getCode().getMessage())
                                .build())
                .build();
        log.warn(exception.toString());
        return new ResponseEntity<>(
                restApiResponse, new HttpHeaders(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(value = { Exception.class })
    protected ResponseEntity<Object> handleException(RuntimeException ex) {
        RestApiResponse<Boolean> restApiResponse = RestApiResponse.<Boolean>builder().data(false).error(
                        ErrorModel.builder()
                                .code(HttpStatus.INTERNAL_SERVER_ERROR.name())
                                .message("Something Went Wrong")
                                .build())
                .build();
        log.error("Error During a Request", ex);
        return new ResponseEntity<>(
                restApiResponse, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}