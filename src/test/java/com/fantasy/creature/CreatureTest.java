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
		assertEquals(creature.getName(), "Griffin");
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
		assertEquals(creature.getHeight(), 1.5);
	}
	
	@Test()
	void canInsertCreatureWeight() {
		creature.setWeightLb(100.5);
		assertEquals(creature.getWeight(), 100.5);
	}
	
	@Test()
	void canInsertCreatureStrength() {
		creature.setStrength(30.6);
		assertEquals(creature.getStrength(), 30.6);
	}

}
