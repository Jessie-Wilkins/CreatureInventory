package com.fantasy.creature.Controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.fantasy.creature.Entities.Creature;
import com.fantasy.creature.Repositories.CreatureRepository;

@RestController
public class CreatureController {
	
	private final CreatureRepository repository;
	
	CreatureController(CreatureRepository repository) {
		this.repository = repository;
	}

	@GetMapping("/creatures")
	public Object getCreatures() {
		
		List<Creature> creatureList = this.repository.findAll();
		
		return creatureList.toString();
	}
	@GetMapping("/creatures/{id}")
	public Object getCreatureById(@PathVariable int id) {
		return this.repository.findById(Integer.toUnsignedLong(id)).get().toString();
	}
	@GetMapping("/creatures/{name}")
	public Object getCreatureByName(@PathVariable String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
