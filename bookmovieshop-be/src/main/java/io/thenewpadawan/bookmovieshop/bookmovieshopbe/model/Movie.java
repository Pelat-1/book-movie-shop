package io.thenewpadawan.bookmovieshop.bookmovieshopbe.model;

import lombok.Data;

@Data
public class Movie {
	private String title;
	private String director;
	private int year;
	private String genre;
}
