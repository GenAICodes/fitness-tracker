
package com.fitness.tracker.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fitness.tracker.model.Challenge;
import com.fitness.tracker.repository.ChallengeRepository;

@Repository
public class ChallengeRepositoryImpl implements ChallengeDao {

    @Autowired
    private ChallengeRepository challengeRepository;

    @Override
    public void save(Challenge challenge) {
        challengeRepository.save(challenge);
    }

    @Override
    public List<Challenge> findAll() {
        return challengeRepository.findAll();
    }

    @Override
    public Challenge findById(Long id) {
        return challengeRepository.findById(id).orElse(null);
    }

    @Override
    public void update(Challenge challenge) {
        challengeRepository.save(challenge);
    }

    @Override
    public void delete(Challenge challenge) {
        challengeRepository.delete(challenge);
    }

    @Override
    public List<Challenge> findByUserId(Long userId) {
        return challengeRepository.findAll().stream()
                .filter(challenge -> challenge.getParticipants().stream()
                        .anyMatch(user -> user.getId().equals(userId)))
                .toList();
    }
}
