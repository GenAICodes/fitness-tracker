
package com.fitness.tracker.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class FriendshipDaoImpl implements FriendshipDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void sendFriendRequest(Long userId, Long friendId) {
        String sql = "INSERT INTO friend_request (user_id, friend_id) VALUES (?, ?)";
        jdbcTemplate.update(sql, userId, friendId);
    }

    @Override
    public void acceptFriendRequest(Long userId, Long friendId) {
        String sql = "INSERT INTO friend (user_id, friend_id) VALUES (?, ?), (?, ?)";
        jdbcTemplate.update(sql, userId, friendId, friendId, userId);
    }

    @Override
    public void rejectFriendRequest(Long userId, Long friendId) {
        String sql = "DELETE FROM friend_request WHERE user_id = ? AND friend_id = ?";
        jdbcTemplate.update(sql, userId, friendId);
    }

    @Override
    public void unfriend(Long userId, Long friendId) {
        String sql = "DELETE FROM friend WHERE (user_id = ? AND friend_id = ?) OR (user_id = ? AND friend_id = ?)";
        jdbcTemplate.update(sql, userId, friendId, friendId, userId);
    }

}
