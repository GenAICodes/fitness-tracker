
package com.fitness.tracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fitness.tracker.model.Activity;
import com.fitness.tracker.service.ActivityFeedService;

@RestController
@RequestMapping("/api/activity-feed")
public class ActivityFeedController {

    @Autowired
    private ActivityFeedService activityFeedService;

    @GetMapping("/{userId}")
    public List<Activity> getActivityFeed(@PathVariable Long userId) {
        return activityFeedService.getActivityFeed(userId);
    }

    @GetMapping("/friend/{userId}")
    public List<Activity> getFriendActivityFeed(@PathVariable Long userId) {
        return activityFeedService.getFriendActivityFeed(userId);
    }

}
