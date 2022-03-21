package com.fantasy.creature.Entities;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class CreatureTest {

	Creature creature;

	@BeforeEach
	void setUp() throws Exception {
		creature = new Creature();
	}

	@AfterEach
	void tearDown() throws Exception {
		creature = null;
	}

	@Test
	void canInsertCreatureNameWithoutError() {
		creature.setName("Griffin");
		assertEquals("Griffin", creature.getName());
	}

	@Test()
	void canNotInsertCreatureWithSpecialCharacter() {
		assertThrows(IllegalArgumentException.class, new Executable() {
			public void execute() throws Throwable {
				creature.setName("Griffin$");
			}
		});
	}

	@Test()
	void canInsertCreatureHeight() {
		creature.setHeightFt(1.5);
		assertEquals(1.5, creature.getHeight());
	}

	@Test()
	void canInsertCreatureWeight() {
		creature.setWeightLb(100.5);
		assertEquals(100.5, creature.getWeight());
	}

	@Test()
	void canInsertCreatureStrength() {
		creature.setStrength(30.6);
		assertEquals(30.6, creature.getStrength());
	}

	@Test()
	void canInsertCreatureEndurance() {
		creature.setEndurance(11.7);
		assertEquals(11.7, creature.getEndurance());
	}

	@Test()
	void canInsertCreatureIntelligence() {
		creature.setIntelligence(5.32);
		assertEquals(5.32, creature.getIntelligence());
	}

	@Test()
	void canInsertCreatureVitality() {
		creature.setVitality(300.01);
		assertEquals(300.01, creature.getVitality());
	}

	@Test()
	void canInsertCreatureResistance() {
		creature.setResistance(10.30);
		assertEquals(10.30, creature.getResistance());
	}

	@Test()
	void canInsertCreatureDexterity() {
		creature.setDexterity(50.9);
		assertEquals(50.9, creature.getDexterity());
	}

	@Test()
	void canGetStringifiedObject() {
		creature.setName("Griffin");
		creature.setHeightFt(1.5);
		creature.setWeightLb(100.5);
		creature.setStrength(30.6);
		creature.setEndurance(11.7);
		creature.setIntelligence(5.32);
		creature.setVitality(300.01);
		creature.setResistance(10.30);
		creature.setDexterity(50.9);
		creature.setId((long) 1);
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Creature{ id: ").append(creature.getId()).append(", name: ").append(creature.getName())
				.append(", height: ").append(creature.getHeight()).append("ft, weight: ").append(creature.getWeight())
				.append("lb, strength: ").append(creature.getStrength()).append(", endurance: ")
				.append(creature.getEndurance()).append(", intelligence: ").append(creature.getIntelligence())
				.append(", vitality: ").append(creature.getVitality()).append(", resistance: ")
				.append(creature.getResistance()).append(", dexterity: ").append(creature.getDexterity());
		System.out.println(stringBuilder.toString());
		System.out.println(creature.toString());
		System.out.println("Creatures are the same: " + stringBuilder.toString().equals(creature.toString()));
		assertEquals(stringBuilder.toString(), creature.toString());
	}
	
	@Test()
	void canCompareDifferentCreatureObjectsWithSameContentAndSayTheyAreEqual() {
		creature.setName("Griffin");
		creature.setHeightFt(1.5);
		creature.setWeightLb(100.5);
		creature.setStrength(30.6);
		creature.setEndurance(11.7);
		creature.setIntelligence(5.32);
		creature.setVitality(300.01);
		creature.setResistance(10.30);
		creature.setDexterity(50.9);
		creature.setId((long) 1);
		
		Creature localCreature = new Creature();
		localCreature.setName("Griffin");
		localCreature.setHeightFt(1.5);
		localCreature.setWeightLb(100.5);
		localCreature.setStrength(30.6);
		localCreature.setEndurance(11.7);
		localCreature.setIntelligence(5.32);
		localCreature.setVitality(300.01);
		localCreature.setResistance(10.30);
		localCreature.setDexterity(50.9);
		localCreature.setId((long) 1);
		
		assertTrue(creature.equals(localCreature));
	}

}
