package com.saras.admin.exception;

import org.springframework.http.HttpStatus;

import lombok.Getter;

@Getter
public enum ResponseCodeEnum {
	USER_NOT_FOUND("HX401", HttpStatus.BAD_REQUEST, "User not found"),
	SOURCE_NOT_FOUND("HX402", HttpStatus.BAD_REQUEST, "SOURCE not found"),
	TABLE_NOT_FOUND("HX403", HttpStatus.BAD_REQUEST, "TABLE not found"),
	EMAIL_NOT_FOUND("HX404", HttpStatus.BAD_REQUEST, "EMAIL not found"),
	FRISTNAME_NOT_FOUND("HX405", HttpStatus.BAD_REQUEST, "FIRSTNAME not found"),
	LASTNAME_NOT_FOUND("HX406", HttpStatus.BAD_REQUEST, "LASTNAME not found"),
	TIMEZONE_NOT_FOUND("HX407", HttpStatus.BAD_REQUEST, "TIMEZONE not found"),
	EMPLOYEE_EMAIL_NOT_FOUND("HX408", HttpStatus.BAD_REQUEST, "EMPLOYEE_EMAIL not found"),
	EMPLOYEE_NAME_NOT_FOUND("HX409", HttpStatus.BAD_REQUEST, "EMPLOYEENAME not found"),
	MOBILE_NUMBER_NOT_FOUND("HX500", HttpStatus.BAD_REQUEST, "MOBILENUMBER not found"),
	FREQENCY_EMAIL_NOT_FOUND("HX501", HttpStatus.BAD_REQUEST, "FREQENCY_EMAIL_NOT_FOUND"),
	NAME_NOT_FOUND("HX502", HttpStatus.BAD_REQUEST, "NAME not found");
	
    private final String code;
    private final HttpStatus httpStatus;
    private final String message;

    ResponseCodeEnum(String code, HttpStatus httpStatus, String message) {
        this.code = code;
        this.httpStatus = httpStatus;
        this.message = message;
    }
}
