package com.groupname.appname.middleware;

/**
 * The ErrorResponse class is a simple POJO (Plain Old Java Object) that represents an error response.
 * It contains the HTTP status code, an error message, and a timestamp indicating
 * when the error occurred.
 */
public class ErrorResponse {
  private int status;
  private String message;
  private long timestamp;

  /**
   * Default constructor for ErrorResponse.
   */
  public ErrorResponse() {
  }

  /**
   * Constructs an ErrorResponse with the specified status, message, and timestamp.
   *
   * @param status    the HTTP status code
   * @param message   the error message
   * @param timestamp the timestamp when the error occurred
   */
  public ErrorResponse(int status, String message, long timestamp) {
    this.status = status;
    this.message = message;
    this.timestamp = timestamp;
  }

  /**
   * Returns the HTTP status code.
   *
   * @return the HTTP status code
   */
  public int getStatus() {
    return status;
  }

  /**
   * Sets the HTTP status code.
   *
   * @param status the HTTP status code
   */
  public void setStatus(int status) {
    this.status = status;
  }

  /**
   * Returns the error message.
   *
   * @return the error message
   */
  public String getMessage() {
    return message;
  }

  /**
   * Sets the error message.
   *
   * @param message the error message
   */
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   * Returns the timestamp when the error occurred.
   *
   * @return the timestamp when the error occurred
   */
  public long getTimestamp() {
    return timestamp;
  }

  /**
   * Sets the timestamp when the error occurred.
   *
   * @param timestamp the timestamp when the error occurred
   */
  public void setTimestamp(long timestamp) {
    this.timestamp = timestamp;
  }
}
