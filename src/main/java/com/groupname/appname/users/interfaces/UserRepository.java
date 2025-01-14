package com.groupname.appname.users.interfaces;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.groupname.appname.users.models.User;

public interface UserRepository extends MongoRepository<User, String> {
}

