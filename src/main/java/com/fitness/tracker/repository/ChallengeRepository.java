
package com.fitness.tracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fitness.tracker.model.Challenge;

public interface ChallengeRepository extends JpaRepository<Challenge, Long> {

}
