
package com.fitness.tracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fitness.tracker.model.Activity;
import com.fitness.tracker.model.Achievement;
import com.fitness.tracker.service.SocialMediaIntegrationService;

@RestController
@RequestMapping("/api/social-media-integration")
public class SocialMediaIntegrationController {

    @Autowired
    private SocialMediaIntegrationService socialMediaIntegrationService;

    @PostMapping("/activity")
    public void shareActivity(@RequestBody Activity activity) {
        socialMediaIntegrationService.shareActivity(activity);
    }

    @PostMapping("/achievement")
    public void shareAchievement(@RequestBody Achievement achievement) {
        socialMediaIntegrationService.shareAchievement(achievement);
    }

}
