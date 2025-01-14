package com.groupname.appname.users.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Represents a user in the system.
 * This class is mapped to the "users" collection in the database.
 */
@Document(collection = "users")
public class User {

  /**
   * The unique identifier for the user.
   */
  @Id
  private String id;

  /**
   * The name of the user.
   */
  private String name;

  /**
   * The age of the user.
   */
  private int age;

  /**
   * Constructs a new User with the specified name and age.
   *
   * @param name the name of the user
   * @param age  the age of the user
   */
  public User(String name, int age) {
    this.name = name;
    this.age = age;
  }

  /**
   * Returns the unique identifier of the user.
   *
   * @return the user's id
   */
  public String getId() {
    return id;
  }

  /**
   * Sets the unique identifier of the user.
   *
   * @param id the user's id
   */
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Returns the name of the user.
   *
   * @return the user's name
   */
  public String getName() {
    return name;
  }

  /**
   * Sets the name of the user.
   *
   * @param name the user's name
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Returns the age of the user.
   *
   * @return the user's age
   */
  public int getAge() {
    return age;
  }

  /**
   * Sets the age of the user.
   *
   * @param age the user's age
   */
  public void setAge(int age) {
    this.age = age;
  }
}
