
package com.fitness.tracker.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fitness.tracker.dao.FriendshipDao;

@Service
public class FriendshipServiceImpl implements FriendshipService {

    @Autowired
    private FriendshipDao friendshipDao;

    @Override
    public void sendFriendRequest(Long userId, Long friendId) {
        friendshipDao.sendFriendRequest(userId, friendId);
    }

    @Override
    public void acceptFriendRequest(Long userId, Long friendId) {
        friendshipDao.acceptFriendRequest(userId, friendId);
    }

    @Override
    public void rejectFriendRequest(Long userId, Long friendId) {
        friendshipDao.rejectFriendRequest(userId, friendId);
    }

    @Override
    public void unfriend(Long userId, Long friendId) {
        friendshipDao.unfriend(userId, friendId);
    }

}
