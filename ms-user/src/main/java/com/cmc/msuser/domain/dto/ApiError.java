package com.cmc.msuser.domain.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/**
 * Simple structure for sending errors over the wire.
 * 
 * @author jupiter
 *
 */
@NoArgsConstructor
@Data
public class ApiError implements Serializable {

  private static final long serialVersionUID = 1L;
  private HttpStatus status;
  private String message;
  private List<String> errors;

  /**
   * Constructor ApiError.
   */
  public ApiError(final HttpStatus status, final String message, final List<String> errors) {
    super();
    this.status = status;
    this.message = message;
    this.errors = errors;
  }

  /**
   * Constructor ApiError.
   */
  public ApiError(final HttpStatus status, final String message, final String error) {
    super();
    this.status = status;
    this.message = message;
    errors = Arrays.asList(error);
  }

}
