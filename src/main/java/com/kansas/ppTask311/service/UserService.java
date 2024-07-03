package com.kansas.ppTask311.service;



import com.kansas.ppTask311.model.User;
import jakarta.validation.Valid;


import java.util.List;

public interface UserService {
    List<User> getAllUsers ();
    Object getUserById(long id);
    void addUser(User user);
    void removeUser(long id);
    void updateUser(@Valid User user);
}