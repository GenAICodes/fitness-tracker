
package com.fitness.tracker.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fitness.tracker.model.Activity;

public class ActivityRowMapper implements RowMapper<Activity> {

    @Override
    public Activity mapRow(ResultSet rs, int rowNum) throws SQLException {
        Activity activity = new Activity();
        activity.setId(rs.getLong("id"));
        activity.setUserId(rs.getLong("user_id"));
        activity.setType(rs.getString("type"));
        activity.setDescription(rs.getString("description"));
        activity.setDate(rs.getTimestamp("date"));
        activity.setLikes(rs.getInt("likes"));
        return activity;
    }

}
