
package com.fitness.tracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.fitness.tracker.service.FriendshipService;

@RestController
@RequestMapping("/api/friendship")
public class FriendshipController {

    @Autowired
    private FriendshipService friendshipService;

    @PostMapping("/{userId}/send-friend-request/{friendId}")
    public void sendFriendRequest(@PathVariable Long userId, @PathVariable Long friendId) {
        friendshipService.sendFriendRequest(userId, friendId);
    }

    @PostMapping("/{userId}/accept-friend-request/{friendId}")
    public void acceptFriendRequest(@PathVariable Long userId, @PathVariable Long friendId) {
        friendshipService.acceptFriendRequest(userId, friendId);
    }

    @PostMapping("/{userId}/reject-friend-request/{friendId}")
    public void rejectFriendRequest(@PathVariable Long userId, @PathVariable Long friendId) {
        friendshipService.rejectFriendRequest(userId, friendId);
    }

    @PostMapping("/{userId}/unfriend/{friendId}")
    public void unfriend(@PathVariable Long userId, @PathVariable Long friendId) {
        friendshipService.unfriend(userId, friendId);
    }

}
