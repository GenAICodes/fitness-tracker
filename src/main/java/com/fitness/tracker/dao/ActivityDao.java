
package com.fitness.tracker.dao;

import java.util.List;

import com.fitness.tracker.model.Activity;

public interface ActivityDao {
    void save(Activity activity);
    List<Activity> findAll();
    Activity findById(Long id);
    void update(Activity activity);
    void delete(Activity activity);
    List<Activity> findByUserId(Long userId);
}
