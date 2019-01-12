package com.springboot.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.RepositoryInterface.EmployeeRepo;
import com.springboot.model.Emplyoee;
import com.springboot.serviceInterface.EmpServiceInterface;

@Service
public class EmployeeServiceImpl implements EmpServiceInterface {
	@Autowired
	EmployeeRepo employeeRepo;

	@Override
	public Emplyoee SaveEMPdetails(Emplyoee employee) {
		return employeeRepo.save(employee);
	}

	@Override
	public Iterable<Emplyoee> returnempdata() {
		return employeeRepo.findAll();
	}

	@Override
	public Emplyoee getempdtailsbyId(Long empId) {
		Emplyoee emp = employeeRepo.findById(empId).get();
		return emp;
	}

	@Override
	public void deleteEmp(Long emplyoeeId) {
		employeeRepo.deleteById(emplyoeeId);
		
	}

}
