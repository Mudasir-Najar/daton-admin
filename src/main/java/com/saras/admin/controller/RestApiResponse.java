package com.saras.admin.controller;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.saras.admin.errorModel.ErrorModel;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Singular;

import java.util.List;

@Builder
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@NoArgsConstructor
@AllArgsConstructor
public class RestApiResponse<T> {
  private T data;

  @Singular
  private List<ErrorModel> errors;
}