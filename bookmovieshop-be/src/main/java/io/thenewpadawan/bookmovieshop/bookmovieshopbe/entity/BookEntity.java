package io.thenewpadawan.bookmovieshop.bookmovieshopbe.entity;

import jakarta.persistence.Column;
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
	//Column serve quando il nome del campo nel db non è perfettamete identico a questo della variabile
	@Column(name = "firsteditionyear")
	private Integer firstEditionYear;
	@Column(name = "editionnumber")
	private Integer editionNumber = 1;
	@Column(name = "printyear")
	private Integer printYear;
	private String genre;
//	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//	private List<String> authors;
}
