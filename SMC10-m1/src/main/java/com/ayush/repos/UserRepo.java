package com.ayush.repos;

import org.springframework.data.repository.CrudRepository;

import com.ayush.entities.User;

public interface UserRepo extends CrudRepository<User, Integer>{

}
