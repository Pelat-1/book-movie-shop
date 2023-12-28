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
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Table(
		name = "bms_user",
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
	@Size(min = 2, max = 32)
	private String firstname;
	@Size(min = 2, max = 32)
	private String lastname;
	@Column(nullable = false)
	@Size(min = 6, max = 320)
	private String email;
	@Column(nullable = false)
	private String password;
	private String address;
	private Date birthday;
	@Column(name = "registration_date", nullable = false)
	private Timestamp registrationDate = new Timestamp(System.currentTimeMillis());
}
