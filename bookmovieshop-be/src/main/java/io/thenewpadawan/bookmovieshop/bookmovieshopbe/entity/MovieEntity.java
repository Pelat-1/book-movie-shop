package io.thenewpadawan.bookmovieshop.bookmovieshopbe.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "movie", schema = "book_movie_shop")
@Data
public class MovieEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String title;
//	@ManyToOne
	private String director;
	private Integer year;
	private String genre;
}
//select * from movie where title = "oddisea"
//in hibernate:
//select m from MovieEntity m where m.title = "oddisea"
