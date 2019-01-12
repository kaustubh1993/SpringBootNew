package com.springboot.serviceInterface;

import com.springboot.model.Emplyoee;

public interface EmpServiceInterface {
	Emplyoee SaveEMPdetails(Emplyoee employee);

	Iterable<Emplyoee> returnempdata();

	Emplyoee getempdtailsbyId(Long empId);

	void deleteEmp(Long emplyoeeId);



}