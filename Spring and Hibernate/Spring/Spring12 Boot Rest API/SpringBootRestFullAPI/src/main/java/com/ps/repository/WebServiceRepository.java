package com.ps.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WebServiceRepository extends JpaRepository<WebServiceModel, Integer>{

	
}
