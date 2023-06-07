
package com.fitness.tracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fitness.tracker.service.SocialInteractionService;

@RestController
@RequestMapping("/api/social-interaction")
public class SocialInteractionController {

    @Autowired
    private SocialInteractionService socialInteractionService;

    @PostMapping("/{activityId}/comment")
    public void commentActivity(@PathVariable Long activityId, String comment) {
        socialInteractionService.commentActivity(activityId, comment);
    }

    @PostMapping("/{activityId}/like")
    public void likeActivity(@PathVariable Long activityId) {
        socialInteractionService.likeActivity(activityId);
    }

    @PostMapping("/{activityId}/share/{platform}")
    public void shareActivityOnSocialMedia(@PathVariable Long activityId, @PathVariable String platform) {
        socialInteractionService.shareActivityOnSocialMedia(activityId, platform);
    }

}
