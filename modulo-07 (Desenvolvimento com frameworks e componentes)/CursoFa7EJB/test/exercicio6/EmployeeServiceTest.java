package exercicio6;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.List;
import java.util.Map;

import javax.jms.JMSException;
import javax.naming.NamingException;

import org.junit.Before;
import org.junit.Test;

import com.thoughtworks.xstream.XStream;

import br.gov.fa7.cursoejb.exercicio1.JNDIUtils;
import br.gov.fa7.cursoejb.exercicio6.async.EmployeeService;

public class EmployeeServiceTest {

	private EmployeeService employeeService;

	@Before
	public void setup() throws NamingException {
		employeeService = JNDIUtils.lookup(
				"ejb:CursoFa7/CursoFa7EJB/EmployeeService!br.gov.fa7.cursoejb.exercicio6.async.EmployeeService");
	}

	@Test
	public void testCarregarXml() throws ParseException, IOException {
		List<Map<String, Object>> list = readFile();
		employeeService.importItems(list);
	}

	@Test
	public void testCarregarXmlJMS() throws ParseException, IOException, JMSException {
		List<Map<String, Object>> list = readFile();
		employeeService.queueImportItems(list);
	}

	private List<Map<String, Object>> readFile() {
		return (List<Map<String, Object>>) new XStream().fromXML(new File("employee.xml"));
	}

}
