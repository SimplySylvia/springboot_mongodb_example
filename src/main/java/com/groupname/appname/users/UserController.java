package com.groupname.appname.users;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.groupname.appname.middleware.ResourceNotFoundException;
import com.groupname.appname.users.models.User;
import com.groupname.appname.users.services.UserService;

/**
 * REST controller for managing users.
 */
@RestController
@RequestMapping("/api/users")
public class UserController {

  @Autowired
  private UserService userService;

  /**
   * Retrieves a list of all users.
   *
   * @return a list of User objects
   */
  @GetMapping()
  public List<User> getUsers() {
    return userService.getUsers();
  }

  /**
   * Retrieves a user by their ID.
   *
   * @param id the ID of the user to retrieve
   * @return the User object with the specified ID
   * @throws ResourceNotFoundException if the user with the specified ID is not
   *                                   found
   */
  @GetMapping("/{id}")
  public User getById(@PathVariable String id) {
    User user = userService.getUserById(id);
    if (user == null) {
      throw new ResourceNotFoundException("User not found with id: " + id);
    }
    return user;
  }

  /**
   * Creates a new user.
   *
   * @param user the User object to create
   * @return the created User object
   */
  @PostMapping()
  public User createUser(@RequestBody User user) {
    return userService.createUser(user);
  }

  /**
   * Updates an existing user.
   *
   * @param id   the ID of the user to update
   * @param user the User object with updated information
   * @return the updated User object
   */
  @PutMapping("/{id}")
  public User update(@PathVariable String id, @RequestBody User user) {
    return userService.updateUser(id, user);
  }

  /**
   * Deletes a user by their ID.
   *
   * @param id the ID of the user to delete
   * @return a ResponseEntity with status OK
   */
  @DeleteMapping("/{id}")
  public ResponseEntity<Void> delete(@PathVariable String id) {
    userService.deleteById(id);
    return ResponseEntity.ok().build();
  }

}
