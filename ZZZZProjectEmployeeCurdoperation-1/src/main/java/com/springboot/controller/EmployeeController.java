package com.springboot.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.model.Emplyoee;
import com.springboot.serviceInterface.EmpServiceInterface;

@RestController
@RequestMapping(value = "/welcome")
public class EmployeeController {
	@Autowired
	private EmpServiceInterface empServiceInterface;

	// Create employee
	@PostMapping(value = "/employees")
	public Emplyoee InsertEmployeeDetails(@RequestBody Emplyoee employee) {
		return empServiceInterface.SaveEMPdetails(employee);
	}
	
	@GetMapping(value="/getallEmp")
	Iterable<Emplyoee> getAllemplyoees() 
	{
		return empServiceInterface.returnempdata();
	}
	
	@GetMapping(value="/getemp/{id}")
	public Emplyoee getemplyoeeById(@PathVariable(value = "id") Long empId) {
		
		return empServiceInterface.getempdtailsbyId(empId);
	}

	@PutMapping(value="/updateemp")
	public ResponseEntity<Emplyoee> UpdateempDetails(@PathVariable(value = "id") Long emplyoeeId,@RequestBody Emplyoee emplyoeeDetails){
		
		Emplyoee emplyoee=empServiceInterface.getempdtailsbyId(emplyoeeId);
		
		final Emplyoee updatedemplyoee = empServiceInterface.SaveEMPdetails(emplyoeeDetails);
		return ResponseEntity.ok(updatedemplyoee);
		
	}
	@DeleteMapping(value="/deleteEmp")
	public Map<String, Boolean> deleteemplyoee(@PathVariable(value = "id") Long emplyoeeId) {
		
		empServiceInterface.deleteEmp(emplyoeeId);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
}
