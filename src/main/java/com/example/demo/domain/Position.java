package com.example.demo.domain;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;


@Document
public class Position {
	
	private double longitude;
	private double latitude;
	
	
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	
	
}
