package io.thenewpadawan.bookmovieshop.bookmovieshopbe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.thenewpadawan.bookmovieshop.bookmovieshopbe.entity.BookEntity;

@Repository
public interface BookRepository extends JpaRepository<BookEntity, Integer>{

}
