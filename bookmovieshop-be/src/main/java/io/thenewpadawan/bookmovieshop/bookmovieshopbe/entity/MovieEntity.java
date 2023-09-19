package io.thenewpadawan.bookmovieshop.bookmovieshopbe.entity;

import lombok.Data;

@Data
public class MovieEntity {
	private String title;
//	@ManyToOne
	private String director;
	private Integer year;
	private String genre;
}
