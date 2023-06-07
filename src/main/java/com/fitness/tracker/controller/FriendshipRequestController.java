
package com.fitness.tracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.fitness.tracker.model.FriendRequest;
import com.fitness.tracker.service.FriendshipRequestService;

@RestController
@RequestMapping("/api/friend-request")
public class FriendshipRequestController {

    @Autowired
    private FriendshipRequestService friendshipRequestService;

    @GetMapping("/{userId}")
    public List<FriendRequest> getFriendRequests(@PathVariable Long userId) {
        return friendshipRequestService.getFriendRequests(userId);
    }

    @PostMapping("/{userId}/accept-friend-request/{friendId}")
    public void acceptFriendRequest(@PathVariable Long userId, @PathVariable Long friendId) {
        friendshipRequestService.acceptFriendRequest(userId, friendId);
    }

    @PostMapping("/{userId}/reject-friend-request/{friendId}")
    public void rejectFriendRequest(@PathVariable Long userId, @PathVariable Long friendId) {
        friendshipRequestService.rejectFriendRequest(userId, friendId);
    }

}
