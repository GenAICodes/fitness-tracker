
package com.fitness.tracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fitness.tracker.dao.ActivityDao;
import com.fitness.tracker.model.Activity;

@Service
public class ActivityFeedServiceImpl implements ActivityFeedService {

    @Autowired
    private ActivityDao activityDao;

    @Override
    public List<Activity> getActivityFeed(Long userId) {
        return activityDao.getActivityFeed(userId);
    }

    @Override
    public List<Activity> getFriendActivityFeed(Long userId) {
        return activityDao.getFriendActivityFeed(userId);
    }

}
