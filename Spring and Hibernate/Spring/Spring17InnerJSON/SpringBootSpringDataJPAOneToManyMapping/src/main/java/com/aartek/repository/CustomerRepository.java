package com.aartek.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aartek.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
