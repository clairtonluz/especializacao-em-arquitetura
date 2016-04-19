package br.edu.fa7.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.edu.fa7.model.Employee;
import br.edu.fa7.service.EmployeeService;

@RestController
@RequestMapping("employees")
public class EmployeeResource {

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(method = RequestMethod.GET)
	public Iterable<Employee> findAll() {
		return employeeService.findAll();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Employee find(@PathVariable Long id) {
		return employeeService.find(id);
	}

	@RequestMapping(method = RequestMethod.POST)
	public Employee save(@RequestBody Employee employee) {
		return employeeService.save(employee);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public Employee update(@PathVariable Long id, @RequestBody Employee employee) {
		return employeeService.save(employee);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void remove(@PathVariable Long id) {
		employeeService.delete(id);
	}

}
