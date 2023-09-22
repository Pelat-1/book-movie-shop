package io.thenewpadawan.bookmovieshop.bookmovieshopbe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.thenewpadawan.bookmovieshop.bookmovieshopbe.entity.MovieEntity;

@Repository
public interface MovieRepository extends JpaRepository<MovieEntity, Integer> {
}
