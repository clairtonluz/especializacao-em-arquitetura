package br.gov.fa7.cursoejb.exercicio6.async;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.ejb.Asynchronous;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.Queue;

@Stateless(name = "EmployeeService")
public class EmployeeServiceImpl implements EmployeeService {

	@EJB
	private EmployeeDAO employeeDAO;

	@Resource(name = "java:/jms/EmployeeQueue")
	private Queue queue;
	@Resource(name = "java:/JmsXA")
	private ConnectionFactory connFactory;

	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	@Override
	@Asynchronous
	public void importItems(List<Map<String, Object>> items) throws ParseException {
		for (Map<String, Object> map : items) {
			Employee employee = toEmployee(map);
			employeeDAO.save(employee);
		}
	}

	@Override
	public void queueImportItems(List<Map<String, Object>> items) throws JMSException, ParseException {
		List<List<Employee>> messages = split(items);

		for (List<Employee> msg : messages) {
			JMSUtils.publishMessage(queue, connFactory, msg);
		}
	}

	private Employee toEmployee(Map<String, Object> map) throws ParseException {
		Employee employee = new Employee();
		employee.setName(map.get("name").toString());
		employee.setSalary(new BigDecimal(map.get("salary").toString()));
		employee.setDayOfBirth(sdf.parse(map.get("dayOfBirth").toString()));
		return employee;
	}


	private List<List<Employee>> split(List<Map<String, Object>> items) throws ParseException {
		List<List<Employee>> messages = new ArrayList<List<Employee>>();

		List<Employee> employees = new ArrayList<Employee>();

		for (Map<String, Object> map : items) {
			if (employees.size() >= 1000) {
				messages.add(employees);
				employees = new ArrayList<Employee>();
			}

			employees.add(toEmployee(map));
		}

		if (!employees.isEmpty()) {
			messages.add(employees);
		}
		return messages;
	}

}
