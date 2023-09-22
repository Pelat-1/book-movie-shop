package io.thenewpadawan.bookmovieshop.bookmovieshopbe.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "book", schema = "book_movie_shop")
@Data
public class BookEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String title;
	private Integer firstEditionYear;
	private Integer editionNumber;
	private Integer printYear;
	private String genre;
//	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//	private List<String> authors;
}
