package com.fantasy.creature;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Creature {
	
	private String name;
	private double heightFt;
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
		// TODO Auto-generated method stub
		return this.name;
	}

	public void setHeightFt(double heightFt) {
		// TODO Auto-generated method stub
		this.heightFt = heightFt;
	}

	public Double getHeight() {
		// TODO Auto-generated method stub
		return this.heightFt;
	}

	public void setWeightLb(double weightLb) {
		// TODO Auto-generated method stub
		this.weightLb = weightLb;
	}

	public Double getWeight() {
		// TODO Auto-generated method stub
		return this.weightLb;
	}

	public void setStrength(double strength) {
		// TODO Auto-generated method stub
		this.strength = strength;
	}

	public Double getStrength() {
		// TODO Auto-generated method stub
		return this.strength;
	}

}
