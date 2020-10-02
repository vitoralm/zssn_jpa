package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import model.Survivor;

public class SurvivorDAO extends DAO{
	
//	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("projeto_jpa_zssn");
//	EntityManager entityManager = entityManagerFactory.createEntityManager();
	
	public Survivor getSurvivor(int primaryKey) {
		
		Survivor survivor = entityManager.find(Survivor.class, primaryKey);
		return survivor;
		
	}
	
	public void insertSurvivor(Survivor survivor) {
		
		EntityTransaction transaction = getTransaction();
		try {
			transaction.begin();
			entityManager.persist(survivor);
		} catch (Exception e) {
			transaction.rollback();
			e.getMessage();
		} finally {
			transaction.commit();
		}

	}
	
//	public EntityTransaction getTransaction() {
//		return entityManager.getTransaction();
//	}
//	
//	public void close() {
//		entityManager.close();
//		entityManagerFactory.close();
//	}
	
}
