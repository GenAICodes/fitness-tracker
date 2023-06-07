
package com.fitness.tracker.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.fitness.tracker.model.Activity;
import com.fitness.tracker.model.Achievement;

@Repository
public class SocialMediaIntegrationDaoImpl implements SocialMediaIntegrationDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void shareActivity(Activity activity) {
        String sql = "INSERT INTO social_media_activity (activity_id, platform) VALUES (?, ?)";
        jdbcTemplate.update(sql, activity.getId(), activity.getPlatform());
    }

    @Override
    public void shareAchievement(Achievement achievement) {
        String sql = "INSERT INTO social_media_achievement (achievement_id, platform) VALUES (?, ?)";
        jdbcTemplate.update(sql, achievement.getId(), achievement.getPlatform());
    }

}
