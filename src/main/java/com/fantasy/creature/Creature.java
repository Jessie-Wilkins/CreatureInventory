package com.fantasy.creature;

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
	private Double speed;
	private String name;
	private Double heightFt;
	private double weightLb;
	private double strength;

	public void setName(String name) {
		// TODO Auto-generated method stub
		try {
			if (hasSpecialCharacters(name)) {
				throw new IllegalArgumentException();
			}
			else {
				this.name = name;
			}
			
		}
		catch(Error e) {
			System.out.print("Please don't use any special characters!");	
		}
		
	}

	private boolean hasSpecialCharacters(String name) {
		Pattern p = Pattern.compile(
		        "[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
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

	public void setEndurance(double d) {
		// TODO Auto-generated method stub
		
	}

	public Double getEndurance() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setIntelligence(double d) {
		// TODO Auto-generated method stub
		
	}

	public Double getIntelligence() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setVitality(double d) {
		// TODO Auto-generated method stub
		
	}

	public Double getVitality() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setResistance(double d) {
		// TODO Auto-generated method stub
		
	}

	public Double getResistance() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setDexterity(double d) {
		// TODO Auto-generated method stub
		
	}

	public Double getDexterity() {
		// TODO Auto-generated method stub
		return null;
	}

}
