package br.edu.fa7.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.fa7.model.Employee;
import br.edu.fa7.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public Iterable<Employee> findAll(){
		return employeeRepository.findAll();
	}
	
	public Employee find(Long id) {
		return employeeRepository.findOne(id);
	}
	
	public Employee save(Employee employee) {
		return employeeRepository.save(employee);
	}
	
	public void delete(Long id){
		employeeRepository.delete(id);
	}

}
