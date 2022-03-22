package com.fantasy.creature.Controllers;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.reset;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import com.fantasy.creature.Entities.Creature;
import com.fantasy.creature.Repositories.CreatureRepository;

public class CreatureControllerTest {
	
	private Creature creature;
	private CreatureRepository creatureRepository;
	private CreatureController creatureController;
	
	@BeforeEach
	public void beforeEach() {
		creature = mock(Creature.class);
		when(creature.getId()).thenReturn(1L);
		when(creature.getDexterity()).thenReturn(5.2);
		when(creature.getEndurance()).thenReturn(8.9);
		when(creature.getHeight()).thenReturn(6.2);
		when(creature.getName()).thenReturn("Griffin");
		when(creature.getIntelligence()).thenReturn(2.3);
		when(creature.getResistance()).thenReturn(9.0);
		when(creature.getSpeed()).thenReturn(7.0);
		when(creature.getStrength()).thenReturn(14.7);
		when(creature.getVitality()).thenReturn(50.1);
		when(creature.getWeight()).thenReturn(300.93);
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Creature{ id: ").append(creature.getId()).append(", name: ").append(creature.getName())
				.append(", height: ").append(creature.getHeight()).append("ft, weight: ").append(creature.getWeight())
				.append("lb, strength: ").append(creature.getStrength()).append(", endurance: ")
				.append(creature.getEndurance()).append(", intelligence: ").append(creature.getIntelligence())
				.append(", vitality: ").append(creature.getVitality()).append(", resistance: ")
				.append(creature.getResistance()).append(", dexterity: ").append(creature.getDexterity());
		
		List<Creature> creatureList = new ArrayList<Creature>();
		creatureList.add(creature);
		
		creatureRepository = mock(CreatureRepository.class);
		
		when(creatureRepository.findAll()).thenReturn(creatureList);

		creatureController = new CreatureController(creatureRepository);	
		
		when(creature.toString()).thenReturn(stringBuilder.toString());
	}
	
	@AfterEach
	public void afterEach() {
		reset(creature);
		reset(creatureRepository);
	}
	
	@Test
	public void testThatGetCreatureGetsAllCreatures() {
		assertEquals("["+creature.toString()+"]", creatureController.getCreatures());
	}

}
