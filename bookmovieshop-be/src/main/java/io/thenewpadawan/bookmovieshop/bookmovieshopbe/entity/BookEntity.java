package io.thenewpadawan.bookmovieshop.bookmovieshopbe.entity;

import java.util.List;

import lombok.Data;

@Data
public class BookEntity {
	private String title;
	private Integer firstEditionYear;
	private Integer editionNumber;
	private Integer printYear;
	private String genre;
//	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//	private List<String> authors;
}
