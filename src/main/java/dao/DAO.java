package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

// Super class for DAO classes
public class DAO {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("projeto_jpa_zssn");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	
	public EntityTransaction getTransaction() {
		return entityManager.getTransaction();
	}
	
	public void close() {
		entityManager.close();
		entityManagerFactory.close();
	}
}
