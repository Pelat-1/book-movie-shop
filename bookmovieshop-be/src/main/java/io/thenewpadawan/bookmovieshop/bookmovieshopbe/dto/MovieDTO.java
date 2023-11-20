package io.thenewpadawan.bookmovieshop.bookmovieshopbe.dto;

import lombok.Data;

@Data
public class MovieDTO {
	private String title;
	private String director;
	private Integer year;
	private String genre;
}
