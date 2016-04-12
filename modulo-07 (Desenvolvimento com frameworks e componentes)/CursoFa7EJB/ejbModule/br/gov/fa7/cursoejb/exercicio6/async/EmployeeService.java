package br.gov.fa7.cursoejb.exercicio6.async;

import java.text.ParseException;
import java.util.List;
import java.util.Map;

import javax.ejb.Remote;

@Remote
public interface EmployeeService {
	public void importItems(List<Map<String, Object>> items) throws ParseException;

}
