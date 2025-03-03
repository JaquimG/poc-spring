package com.example.demo.domain;

import java.util.Date;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;


@Document
public class Point {
	
	@Id
	private String id;
	
	private Position currentlyPosition;
	private double speedKmh;
	private Date date;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Position getCurrentlyPosition() {
		return currentlyPosition;
	}
	public void setCurrentlyPosition(Position currentlyPosition) {
		this.currentlyPosition = currentlyPosition;
	}
	public double getSpeedKmh() {
		return speedKmh;
	}
	public void setSpeedKmh(double speedKmh) {
		this.speedKmh = speedKmh;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	

}
