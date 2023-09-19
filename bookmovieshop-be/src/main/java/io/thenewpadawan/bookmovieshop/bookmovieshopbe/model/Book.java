package io.thenewpadawan.bookmovieshop.bookmovieshopbe.model;

import java.time.Year;
import java.util.List;

import lombok.Data;

@Data
public class Book {
	private String title;
	private List<String> authors;
	private int firstEditionYear = Year.now().getValue();
	private int editionNumber = 1;
	private int printYear = firstEditionYear;
	private String genre;
}
