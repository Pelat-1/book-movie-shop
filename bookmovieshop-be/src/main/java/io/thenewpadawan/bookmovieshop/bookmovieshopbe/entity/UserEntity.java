package io.thenewpadawan.bookmovieshop.bookmovieshopbe.entity;

import java.sql.Date;
import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.Data;

@Entity
@Table(name = "user",
		schema = "book_movie_shop",
		uniqueConstraints = {
				@UniqueConstraint(columnNames = {"email"})
		}
)
@Data
public class UserEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(nullable = false)
	private String email;
	@Column(nullable = false)
	private String password;
	private String address;
	private Date birthday;
	@Column(nullable = false)
	private Timestamp registrationDate = new Timestamp(System.currentTimeMillis());
}
