package br.gov.fa7.cursoejb.exercicio6.async;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
@LocalBean
public class EmployeeDAO {

	@PersistenceContext
	private EntityManager em;

	public void save(Employee employee) {
		em.persist(employee);
	}
	
	public List<Employee> findAll() {
		return em.createQuery("select e from Employee e", Employee.class).getResultList();
		
	}

}
