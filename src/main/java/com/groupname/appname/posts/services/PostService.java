package com.groupname.appname.posts.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.groupname.appname.posts.interfaces.PostRepository;
import com.groupname.appname.posts.models.Post;

/**
 * Service class for managing Post entities.
 */
@Service
public class PostService {

  @Autowired
  private PostRepository repository;

  /**
   * Retrieves all posts.
   *
   * @return a list of all posts
   */
  public List<Post> findAll() {
    return repository.findAll();
  }

  /**
   * Retrieves a post by its ID.
   *
   * @param id the ID of the post to retrieve
   * @return an Optional containing the post if found, or empty if not found
   */
  public Post findById(Long id) {
    Optional<Post> post = repository.findById(id);
    return post.orElse(null);
  }

  /**
   * Saves a post entity.
   *
   * @param post the post entity to save
   * @return the saved post entity
   */
  public Post save(Post post) {
    return repository.save(post);
  }

  /**
   * Deletes a post by its ID.
   *
   * @param id the ID of the post to delete
   */
  public void deleteById(Long id) {
    repository.deleteById(id);
  }
}