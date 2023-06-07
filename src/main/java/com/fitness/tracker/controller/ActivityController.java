
package com.fitness.tracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.fitness.tracker.model.Activity;
import com.fitness.tracker.service.ActivityService;

@RestController
@RequestMapping("/api/activities")
public class ActivityController {

    @Autowired
    private ActivityService activityService;

    @PostMapping
    public void createActivity(@RequestBody Activity activity) {
        activityService.save(activity);
    }

    @GetMapping
    public List<Activity> getAllActivities() {
        return activityService.findAll();
    }

    @GetMapping("/{id}")
    public Activity getActivityById(@PathVariable Long id) {
        return activityService.findById(id);
    }

    @PutMapping("/{id}")
    public void updateActivity(@RequestBody Activity activity) {
        activityService.update(activity);
    }

    @DeleteMapping("/{id}")
    public void deleteActivity(@PathVariable Long id) {
        Activity activity = activityService.findById(id);
        activityService.delete(activity);
    }

    @GetMapping("/user/{userId}")
    public List<Activity> getActivitiesByUserId(@PathVariable Long userId) {
        return activityService.findByUserId(userId);
    }
}
