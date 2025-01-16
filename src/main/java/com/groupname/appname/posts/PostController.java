package com.groupname.appname.posts;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.groupname.appname.middleware.ResourceNotFoundException;
import com.groupname.appname.posts.models.Post;
import com.groupname.appname.posts.services.PostService;

/**
 * REST controller for managing Post entities.
 */
@RestController
@RequestMapping("/api/posts")
public class PostController {

  @Autowired
  private PostService service;

  /**
   * Retrieves all posts.
   *
   * @return a list of all posts
   */
  @GetMapping
  public List<Post> getAll() {
    return service.findAll();
  }

  /**
   * Retrieves a post by its ID.
   *
   * @param id the ID of the post to retrieve
   * @return the post entity if found, or null if not found
   */
  @GetMapping("/{id}")
  public Post getById(@PathVariable Long id) {
    Post post = service.findById(id);
    if (post == null) {
      throw new ResourceNotFoundException("Post not found with id: " + id);
    }

    return post;
  }

  /**
   * Creates a new post.
   *
   * @param post the post entity to create
   * @return the created post entity
   */
  @PostMapping
  public Post create(@RequestBody Post post) {
    return service.save(post);
  }

  /**
   * Updates an existing post.
   *
   * @param id   the ID of the post to update
   * @param post the post entity with updated information
   * @return the updated post entity
   */
  @PutMapping("/{id}")
  public Post update(@PathVariable Long id, @RequestBody Post post) {
    post.setId(id);
    return service.save(post);
  }

  /**
   * Deletes a post by its ID.
   *
   * @param id the ID of the post to delete
   */
  @DeleteMapping("/{id}")
  public void delete(@PathVariable Long id) {
    service.deleteById(id);
  }
}