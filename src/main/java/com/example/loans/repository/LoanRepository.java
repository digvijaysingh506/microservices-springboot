package com.example.loans.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.loans.entity.LoanEntity;

@Repository
public interface LoanRepository extends JpaRepository<LoanEntity, Integer> {

	List<LoanEntity> findByCustomerIdOrderByStartDateDesc(int customerId);
}
