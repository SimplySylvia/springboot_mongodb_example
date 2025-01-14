package com.groupname.appname.users.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.groupname.appname.users.interfaces.UserRepository;
import com.groupname.appname.users.models.User;

/**
 * UserService is a service class that provides methods to manage users.
 * It interacts with the UserRepository to perform CRUD operations.
 * 
 * <p>
 * This class is annotated with @Service to indicate that it's a Spring service
 * component.
 * </p>
 * 
 * <p>
 * Methods:
 * </p>
 * <ul>
 * <li>{@link #getUsers()} - Retrieves a list of all users.</li>
 * <li>{@link #getUserById(String)} - Retrieves a user by their ID.</li>
 * <li>{@link #createUser(User)} - Creates a new user.</li>
 * <li>{@link #deleteById(String)} - Deletes a user by their ID.</li>
 * </ul>
 * 
 * <p>
 * Dependencies:
 * </p>
 * <ul>
 * <li>{@link UserRepository} - The repository interface for user data
 * operations.</li>
 * </ul>
 * 
 * <p>
 * Annotations:
 * </p>
 * <ul>
 * <li>{@link Autowired} - Used to inject the UserRepository dependency.</li>
 * <li>{@link Service} - Indicates that this class is a Spring service
 * component.</li>
 * </ul>
 * 
 * @see UserRepository
 * @see User
 */

@Service
public class UserService {

  @Autowired
  private UserRepository userRepository;

  /**
   * Retrieves a list of all users.
   *
   * @return a list of User objects representing all users in the repository.
   */
  public List<User> getUsers() {
    return userRepository.findAll();
  }

  /**
   * Retrieves a user by their unique identifier.
   *
   * @param id the unique identifier of the user to retrieve
   * @return the User object if found, or null if no user with the given id exists
   */
  public User getUserById(String id) {
    Optional<User> user = userRepository.findById(id);
    return user.orElse(null);
  }

  /**
   * Creates a new user by saving the provided user object to the repository.
   *
   * @param user the user object to be created and saved
   * @return the saved user object
   */
  public User createUser(User user) {
    return userRepository.save(user);
  }

  /**
   * Updates an existing user with the provided user object.
   *
   * @param id   the unique identifier of the user to update
   * @param user the updated user object
   * @return the updated user object
   */
  public User updateUser(String id, User user) {
    user.setId(id);
    return userRepository.save(user);
  }

  /**
   * Deletes a user by their unique identifier.
   *
   * @param id the unique identifier of the user to be deleted
   */
  public void deleteById(String id) {
    userRepository.deleteById(id);
  }

}
