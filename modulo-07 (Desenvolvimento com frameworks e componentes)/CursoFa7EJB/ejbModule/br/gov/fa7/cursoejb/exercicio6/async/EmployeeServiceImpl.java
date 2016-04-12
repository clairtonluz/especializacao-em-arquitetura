package br.gov.fa7.cursoejb.exercicio6.async;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

import javax.ejb.Asynchronous;
import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless(name = "EmployeeService")
public class EmployeeServiceImpl implements EmployeeService {

	@EJB
	private EmployeeDAO employeeDAO;

	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	@Override
	@Asynchronous
	public void importItems(List<Map<String, Object>> items) throws ParseException {
		for (Map<String, Object> map : items) {
			Employee employee = new Employee();
			employee.setName(map.get("name").toString());
			employee.setSalary(new BigDecimal(map.get("salary").toString()));
			employee.setDayOfBirth(sdf.parse(map.get("dayOfBirth").toString()));

			employeeDAO.save(employee);
		}
	}

}
