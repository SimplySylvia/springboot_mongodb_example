package com.groupname.appname.posts.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * Represents a blog post entity with mandatory content and optional category.
 */
@Entity
public class Post {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false, columnDefinition = "TEXT")
  private String content;

  private String category;

  // Getters and setters

  /**
   * Gets the ID of the post.
   *
   * @return the ID of the post
   */
  public Long getId() {
    return id;
  }

  /**
   * Sets the ID of the post.
   *
   * @param id the ID to set
   */
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * Gets the content of the post.
   *
   * @return the content of the post
   */
  public String getContent() {
    return content;
  }

  /**
   * Sets the content of the post.
   *
   * @param content the content to set
   */
  public void setContent(String content) {
    this.content = content;
  }

  /**
   * Gets the category of the post.
   *
   * @return the category of the post
   */
  public String getCategory() {
    return category;
  }

  /**
   * Sets the category of the post.
   *
   * @param category the category to set
   */
  public void setCategory(String category) {
    this.category = category;
  }
}
