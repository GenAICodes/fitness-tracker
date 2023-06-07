
package com.fitness.tracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fitness.tracker.dao.FriendshipRequestDao;
import com.fitness.tracker.model.FriendRequest;

@Service
public class FriendshipRequestServiceImpl implements FriendshipRequestService {

    @Autowired
    private FriendshipRequestDao friendshipRequestDao;

    @Override
    public List<FriendRequest> getFriendRequests(Long userId) {
        return friendshipRequestDao.getFriendRequests(userId);
    }

    @Override
    public void acceptFriendRequest(Long userId, Long friendId) {
        friendshipRequestDao.acceptFriendRequest(userId, friendId);
    }

    @Override
    public void rejectFriendRequest(Long userId, Long friendId) {
        friendshipRequestDao.rejectFriendRequest(userId, friendId);
    }

}
