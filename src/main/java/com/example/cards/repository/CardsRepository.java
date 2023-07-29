package com.example.cards.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cards.entity.CardsEntity;

@Repository
public interface CardsRepository extends JpaRepository<CardsEntity, Integer> {

	List<CardsEntity> findByCustomerId(int customerId);
}
