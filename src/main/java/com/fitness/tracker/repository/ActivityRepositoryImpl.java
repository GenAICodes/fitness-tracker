
package com.fitness.tracker.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.fitness.tracker.dao.ActivityDao;
import com.fitness.tracker.model.Activity;
import com.fitness.tracker.model.User;

@Repository
public class ActivityRepositoryImpl implements ActivityDao {

    private Map<Long, Activity> activities = new HashMap<>();
    private Long idCounter = 0L;

    @Override
    public void save(Activity activity) {
        if (activity.getId() == null) {
            activity.setId(++idCounter);
        }
        activities.put(activity.getId(), activity);
    }

    @Override
    public List<Activity> findAll() {
        return new ArrayList<>(activities.values());
    }

    @Override
    public Activity findById(Long id) {
        return activities.get(id);
    }

    @Override
    public void update(Activity activity) {
        activities.put(activity.getId(), activity);
    }

    @Override
    public void delete(Activity activity) {
        activities.remove(activity.getId());
    }

    @Override
    public List<Activity> findByUserId(Long userId) {
        return activities.values().stream()
                .filter(activity -> activity.getUser().getId().equals(userId))
                .collect(Collectors.toList());
    }
}
