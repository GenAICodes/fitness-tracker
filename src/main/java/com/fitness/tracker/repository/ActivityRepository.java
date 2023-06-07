
package com.fitness.tracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fitness.tracker.model.Activity;

public interface ActivityRepository extends JpaRepository<Activity, Long> {
}
