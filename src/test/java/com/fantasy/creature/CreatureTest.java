package com.fantasy.creature;

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

}
