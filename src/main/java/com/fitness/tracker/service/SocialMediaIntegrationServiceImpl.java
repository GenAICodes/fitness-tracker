
package com.fitness.tracker.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fitness.tracker.dao.SocialMediaIntegrationDao;
import com.fitness.tracker.model.Activity;
import com.fitness.tracker.model.Achievement;

@Service
public class SocialMediaIntegrationServiceImpl implements SocialMediaIntegrationService {

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

}
