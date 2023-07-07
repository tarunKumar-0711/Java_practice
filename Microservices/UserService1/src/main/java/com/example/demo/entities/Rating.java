package com.example.demo.entities;

import javax.persistence.Transient;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Rating {
	private String ratingID;
	private String userId;
	private String hotelId;
	private int rating;
	private String feedback;
	
	@Transient
	private Hotel hotel;
}