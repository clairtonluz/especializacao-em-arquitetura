package br.gov.fa7.cursoejb.exercicio6.async;

import java.util.List;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.EJB;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;

@MessageDriven(activationConfig = {
		@ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue"),
		@ActivationConfigProperty(propertyName = "destination", propertyValue = "java:/jms/EmployeeQueue") })
public class EmployeeMDB implements MessageListener {

	@EJB
	private EmployeeDAO employeeDAO;

	@Override
	public void onMessage(Message message) {
		System.out.println("TESTE");

		if (message instanceof ObjectMessage) {
			ObjectMessage objMsg = (ObjectMessage) message;
			try {
				List<Employee> employees = (List<Employee>) objMsg.getObject();
				for (Employee employee : employees) {
					employeeDAO.save(employee);
				}
			} catch (JMSException e) {
				e.printStackTrace();
			}
		}

	}

}
