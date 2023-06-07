
package com.fitness.tracker.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fitness.tracker.dto.ActivityDto;
import com.fitness.tracker.repository.ActivityRepository;

@Service
public class ActivityServiceImpl implements ActivityService {

    private ActivityRepository activityRepository;

    public ActivityServiceImpl(ActivityRepository activityRepository) {
        this.activityRepository = activityRepository;
    }

    @Override
    public void save(ActivityDto activityDto) {
        // Your code here
    }

    @Override
    public List<ActivityDto> findAll() {
        // Your code here
        return null;
    }

    @Override
    public ActivityDto findById(Long id) {
        // Your code here
        return null;
    }

    @Override
    public void update(ActivityDto activityDto) {
        // Your code here
    }

    @Override
    public void delete(ActivityDto activityDto) {
        // Your code here
    }

    @Override
    public List<ActivityDto> findByUserId(Long userId) {
        // Your code here
        return null;
    }
}
