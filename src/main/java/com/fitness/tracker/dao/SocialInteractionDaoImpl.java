
package com.fitness.tracker.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class SocialInteractionDaoImpl implements SocialInteractionDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void commentActivity(Long activityId, String comment) {
        String sql = "INSERT INTO activity_comment (activity_id, comment) VALUES (?, ?)";
        jdbcTemplate.update(sql, activityId, comment);
    }

    @Override
    public void likeActivity(Long activityId) {
        String sql = "UPDATE activity SET likes = likes + 1 WHERE id = ?";
        jdbcTemplate.update(sql, activityId);
    }

    @Override
    public void shareActivityOnSocialMedia(Long activityId, String platform) {
        String sql = "INSERT INTO social_media_activity (activity_id, platform) VALUES (?, ?)";
        jdbcTemplate.update(sql, activityId, platform);
    }

}
