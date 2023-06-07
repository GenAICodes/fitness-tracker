
package com.fitness.tracker.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.fitness.tracker.dao.UserDao;
import com.fitness.tracker.model.User;

@Repository
public class UserRepositoryImpl implements UserDao {

    private Map<Long, User> users = new HashMap<>();
    private Long idCounter = 0L;

    @Override
    public void save(User user) {
        if (user.getId() == null) {
            user.setId(++idCounter);
        }
        users.put(user.getId(), user);
    }

    @Override
    public List<User> findAll() {
        return new ArrayList<>(users.values());
    }

    @Override
    public User findById(Long id) {
        return users.get(id);
    }

    @Override
    public void update(User user) {
        users.put(user.getId(), user);
    }

    @Override
    public void delete(User user) {
        users.remove(user.getId());
    }
}
