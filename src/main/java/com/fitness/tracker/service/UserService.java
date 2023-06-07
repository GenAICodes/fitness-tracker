
package com.fitness.tracker.service;

import java.util.List;

import com.fitness.tracker.model.User;

public interface UserService {
    void save(User user);
    List<User> findAll();
    User findById(Long id);
    void update(User user);
    void delete(User user);
}
