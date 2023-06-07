
package com.fitness.tracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fitness.tracker.dao.ChallengeDao;
import com.fitness.tracker.model.Challenge;

@Service
public class ChallengeServiceImpl implements ChallengeService {

    @Autowired
    private ChallengeDao challengeDao;

    @Override
    public void save(Challenge challenge) {
        challengeDao.save(challenge);
    }

    @Override
    public List<Challenge> findAll() {
        return challengeDao.findAll();
    }

    @Override
    public Challenge findById(Long id) {
        return challengeDao.findById(id);
    }

    @Override
    public void update(Challenge challenge) {
        challengeDao.update(challenge);
    }

    @Override
    public void delete(Challenge challenge) {
        challengeDao.delete(challenge);
    }

    @Override
    public List<Challenge> findByUserId(Long userId) {
        return challengeDao.findByUserId(userId);
    }
}
