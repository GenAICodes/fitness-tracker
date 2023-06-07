
package com.fitness.tracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.fitness.tracker.model.Challenge;
import com.fitness.tracker.service.ChallengeService;

@RestController
@RequestMapping("/api/challenges")
public class ChallengeController {

    @Autowired
    private ChallengeService challengeService;

    @PostMapping
    public void createChallenge(@RequestBody Challenge challenge) {
        challengeService.save(challenge);
    }

    @GetMapping
    public List<Challenge> getAllChallenges() {
        return challengeService.findAll();
    }

    @GetMapping("/{id}")
    public Challenge getChallengeById(@PathVariable Long id) {
        return challengeService.findById(id);
    }

    @PutMapping("/{id}")
    public void updateChallenge(@RequestBody Challenge challenge) {
        challengeService.update(challenge);
    }

    @DeleteMapping("/{id}")
    public void deleteChallenge(@PathVariable Long id) {
        Challenge challenge = challengeService.findById(id);
        challengeService.delete(challenge);
    }

    @GetMapping("/user/{userId}")
    public List<Challenge> getChallengesByUserId(@PathVariable Long userId) {
        return challengeService.findByUserId(userId);
    }
}
