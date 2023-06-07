
package com.fitness.tracker.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.fitness.tracker.dao.ChallengeDao;
import com.fitness.tracker.model.Challenge;
import com.fitness.tracker.model.User;

@Repository
public class ChallengeRepositoryImpl implements ChallengeDao {

    private Map<Long, Challenge> challenges = new HashMap<>();
    private Long idCounter = 0L;

    @Override
    public void save(Challenge challenge) {
        if (challenge.getId() == null) {
            challenge.setId(++idCounter);
        }
        challenges.put(challenge.getId(), challenge);
    }

    @Override
    public List<Challenge> findAll() {
        return new ArrayList<>(challenges.values());
    }

    @Override
    public Challenge findById(Long id) {
        return challenges.get(id);
    }

    @Override
    public void update(Challenge challenge) {
        challenges.put(challenge.getId(), challenge);
    }

    @Override
    public void delete(Challenge challenge) {
        challenges.remove(challenge.getId());
    }

    @Override
    public List<Challenge> findByUserId(Long userId) {
        return challenges.values().stream()
                .filter(challenge -> challenge.getParticipants().stream()
                        .anyMatch(user -> user.getId().equals(userId)))
                .collect(Collectors.toList());
    }
}
