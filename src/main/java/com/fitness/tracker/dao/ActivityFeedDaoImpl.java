
package com.fitness.tracker.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.fitness.tracker.model.Activity;

@Repository
public class ActivityFeedDaoImpl implements ActivityFeedDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Activity> getActivityFeed() {
        String sql = "SELECT * FROM activity ORDER BY date DESC";
        return jdbcTemplate.query(sql, new ActivityRowMapper());
    }

    @Override
    public List<Activity> getActivityFeedByUserId(Long userId) {
        String sql = "SELECT * FROM activity WHERE user_id = ? ORDER BY date DESC";
        return jdbcTemplate.query(sql, new Object[] { userId }, new ActivityRowMapper());
    }
}
