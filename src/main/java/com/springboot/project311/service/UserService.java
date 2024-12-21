package com.springboot.project311.service;


import com.springboot.project311.model.User;

import java.util.List;

public interface UserService {
    void add(User user);
    List<User> listUsers();
    User update (User user);
    void delete (Long userId);
    User findById (Long userId);
}
