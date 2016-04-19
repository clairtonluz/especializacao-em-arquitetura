package br.edu.fa7.repository;

import org.springframework.data.repository.CrudRepository;

import br.edu.fa7.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long>{

}
