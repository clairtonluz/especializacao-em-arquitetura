package br.gov.fa7.cursoejb.exercicio6.async;

import java.io.Serializable;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.ObjectMessage;
import javax.jms.Queue;
import javax.jms.Session;

public abstract class JMSUtils {

	public static void publishMessage(Queue queue, ConnectionFactory connFactory, Object obj) throws JMSException {
		Connection conn = connFactory.createConnection();
		Session session = conn.createSession(true, Session.AUTO_ACKNOWLEDGE); 
		MessageProducer producer = session.createProducer(queue);
		ObjectMessage message = session.createObjectMessage();
		message.setObject((Serializable) obj);
		producer.send(message);
		conn.close();
	}

}
