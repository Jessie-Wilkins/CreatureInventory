package com.fantasy.creature.Entities;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.aspectj.weaver.tools.MatchingContext;

@Entity
public class Creature {
	private @Id @GeneratedValue Long id;
	private double speed;
	private String name;
	private double heightFt;
	private double weightLb;
	private double strength;
	private double endurance;
	private double intelligence;
	private double vitality;
	private double resistance;
	private double dexterity;

	public void setName(String name) {
		// TODO Auto-generated method stub
		try {
			if (hasSpecialCharacters(name)) {
				throw new IllegalArgumentException();
			} else {
				this.name = name;
			}

		} catch (Error e) {
			System.out.print("Please don't use any special characters!");
		}

	}

	private boolean hasSpecialCharacters(String name) {
		Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(name);

		return m.find();
	}

	public String getName() {
		return this.name;
	}

	public void setHeightFt(double heightFt) {
		this.heightFt = heightFt;
	}

	public Double getHeight() {
		return this.heightFt;
	}

	public void setWeightLb(double weightLb) {
		this.weightLb = weightLb;
	}

	public Double getWeight() {
		return this.weightLb;
	}

	public void setStrength(double strength) {
		this.strength = strength;
	}

	public Double getStrength() {
		return this.strength;
	}

	public Double getSpeed() {
		return this.speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public void setEndurance(double endurance) {
		this.endurance = endurance;

	}

	public Double getEndurance() {
		return this.endurance;
	}

	public void setIntelligence(double intelligence) {
		this.intelligence = intelligence;

	}

	public Double getIntelligence() {
		return this.intelligence;
	}

	public void setVitality(double vitality) {
		this.vitality = vitality;

	}

	public Double getVitality() {
		return this.vitality;
	}

	public void setResistance(double resistance) {
		this.resistance = resistance;

	}

	public Double getResistance() {
		return this.resistance;
	}

	public void setDexterity(double dexterity) {
		this.dexterity = dexterity;

	}

	public Double getDexterity() {
		return this.dexterity;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return this.id;
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();

		stringBuilder.append("Creature{ id: ").append(getId()).append(", name: ").append(this.name).append(", height: ")
				.append(this.heightFt).append("ft, weight: ").append(this.weightLb).append("lb, strength: ")
				.append(this.strength).append(", endurance: ").append(this.endurance).append(", intelligence: ")
				.append(this.intelligence).append(", vitality: ").append(this.vitality).append(", resistance: ")
				.append(this.resistance).append(", dexterity: ").append(this.dexterity);

		return stringBuilder.toString();
	}

	@Override
	public boolean equals(Object creature) {
		if (creature instanceof Creature) {
			Creature creatureCreature = (Creature) creature;
			return Objects.equals(creatureCreature.getId(), this.id)
					&& Objects.equals(creatureCreature.getDexterity(), this.dexterity)
					&& Objects.equals(creatureCreature.getStrength(), this.strength)
					&& Objects.equals(creatureCreature.getEndurance(), this.endurance)
					&& Objects.equals(creatureCreature.getHeight(), this.heightFt)
					&& Objects.equals(creatureCreature.getIntelligence(), this.intelligence)
					&& Objects.equals(creatureCreature.getName(), this.name)
					&& Objects.equals(creatureCreature.getResistance(), this.resistance)
					&& Objects.equals(creatureCreature.getSpeed(), this.speed)
					&& Objects.equals(creatureCreature.getVitality(), this.vitality)
					&& Objects.equals(creatureCreature.getWeight(), this.weightLb);
		} else {
			return false;
		}

	}

}
