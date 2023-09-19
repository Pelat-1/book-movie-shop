package io.thenewpadawan.bookmovieshop.bookmovieshopbe.dto;

import lombok.Data;

@Data
public class BookDTO {
	private String title;
	private Integer firstEditionYear;
	private Integer editionNumber;
	private Integer printYear;
	private String genre;
}
