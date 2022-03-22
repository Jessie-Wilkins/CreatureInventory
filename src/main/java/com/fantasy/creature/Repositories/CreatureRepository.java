package com.fantasy.creature.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fantasy.creature.Entities.Creature;

public interface CreatureRepository extends JpaRepository<Creature, Long> {
}
