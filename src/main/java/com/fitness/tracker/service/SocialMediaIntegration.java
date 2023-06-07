
package com.fitness.tracker.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fitness.tracker.dao.SocialMediaIntegrationDao;
import com.fitness.tracker.model.Activity;
import com.fitness.tracker.model.Achievement;

@Service
public class SocialMediaIntegration implements SocialMediaIntegrationService {

    @Autowired
    private SocialMediaIntegrationDao socialMediaIntegrationDao;

    @Override
    public void shareActivity(Activity activity) {
        socialMediaIntegrationDao.shareActivity(activity);
    }

    @Override
    public void shareAchievement(Achievement achievement) {
        socialMediaIntegrationDao.shareAchievement(achievement);
    }

    @Override
    public void commentActivity(Long activityId, String comment) {
        socialMediaIntegrationDao.commentActivity(activityId, comment);
    }

    @Override
    public void likeActivity(Long activityId) {
        socialMediaIntegrationDao.likeActivity(activityId);
    }

    @Override
    public void shareActivityOnSocialMedia(Long activityId, String platform) {
        socialMediaIntegrationDao.shareActivityOnSocialMedia(activityId, platform);
    }
}
