
package com.fitness.tracker.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fitness.tracker.dao.SocialInteractionDao;

@Service
public class SocialInteractionServiceImpl implements SocialInteractionService {

    @Autowired
    private SocialInteractionDao socialInteractionDao;

    @Override
    public void commentActivity(Long activityId, String comment) {
        socialInteractionDao.commentActivity(activityId, comment);
    }

    @Override
    public void likeActivity(Long activityId) {
        socialInteractionDao.likeActivity(activityId);
    }

    @Override
    public void shareActivityOnSocialMedia(Long activityId, String platform) {
        socialInteractionDao.shareActivityOnSocialMedia(activityId, platform);
    }

}
