
package com.fitness.tracker.service;

import java.util.List;

import com.fitness.tracker.model.Activity;

public interface ActivityService {
    void save(Activity activity);
    List<Activity> findAll();
    Activity findById(Long id);
    void update(Activity activity);
    void delete(Activity activity);
    List<Activity> findByUserId(Long userId);
}
