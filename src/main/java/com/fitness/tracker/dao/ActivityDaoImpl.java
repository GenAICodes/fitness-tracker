
package com.fitness.tracker.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.fitness.tracker.model.Activity;

@Repository
public class ActivityDaoImpl implements ActivityDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Activity> getActivityFeed(Long userId) {
        String sql = "SELECT * FROM activity WHERE user_id = ? ORDER BY date DESC LIMIT 10";
        return jdbcTemplate.query(sql, new Object[] { userId }, new ActivityRowMapper());
    }

    @Override
    public List<Activity> getFriendActivityFeed(Long userId) {
        String sql = "SELECT * FROM activity WHERE user_id IN (SELECT friend_id FROM friend WHERE user_id = ?) ORDER BY date DESC LIMIT 10";
        return jdbcTemplate.query(sql, new Object[] { userId }, new ActivityRowMapper());
    }

}
