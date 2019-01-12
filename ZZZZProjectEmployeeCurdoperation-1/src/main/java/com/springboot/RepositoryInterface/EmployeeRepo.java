package com.springboot.RepositoryInterface;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.model.Emplyoee;

@Repository
public interface EmployeeRepo extends CrudRepository<Emplyoee, Long>{
	
}