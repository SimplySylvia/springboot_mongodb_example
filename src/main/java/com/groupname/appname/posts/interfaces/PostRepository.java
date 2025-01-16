package com.groupname.appname.posts.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.groupname.appname.posts.models.Post;

/**
 * Repository interface for Post entities, providing basic CRUD operations.
 */
public interface PostRepository extends JpaRepository<Post, Long> {
}
