package com.groupname.appname.middleware;

/**
 * Exception thrown when a requested resource is not found.
 * This exception extends {@link RuntimeException}, so it is an unchecked
 * exception.
 * 
 * <p>
 * Use this exception to indicate that a specific resource, such as an entity or
 * a file,
 * could not be found in the application.
 * </p>
 * 
 * <p>
 * Example usage:
 * </p>
 * 
 * <pre>
 * {@code
 * if (resource == null) {
 *   throw new ResourceNotFoundException("Resource not found with id: " + resourceId);
 * }
 * }
 * </pre>
 * 
 * @param message the detail message explaining the reason for the exception
 */
public class ResourceNotFoundException extends RuntimeException {
  public ResourceNotFoundException(String message) {
    super(message);
  }
}
