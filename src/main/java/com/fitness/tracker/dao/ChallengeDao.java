
package com.fitness.tracker.dao;

import java.util.List;

import com.fitness.tracker.model.Challenge;

public interface ChallengeDao {
    void save(Challenge challenge);
    List<Challenge> findAll();
    Challenge findById(Long id);
    void update(Challenge challenge);
    void delete(Challenge challenge);
    List<Challenge> findByUserId(Long userId);
}
