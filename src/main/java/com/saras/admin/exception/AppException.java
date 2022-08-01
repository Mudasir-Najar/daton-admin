package com.saras.admin.exception;

import lombok.Getter;

@Getter
public class AppException extends RuntimeException {

  private static final long serialVersionUID = 1L;

  private final ResponseCodeEnum code;

  public AppException(ResponseCodeEnum code) {
    super(getMessageFromCode(code));
    this.code = code;
  }

  private static String getMessageFromCode(ResponseCodeEnum code) {
      return code.name() + "_" + code.getCode() + "  " + code.getMessage();
  }
}