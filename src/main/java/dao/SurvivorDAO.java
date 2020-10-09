package dao;

import javax.persistence.EntityTransaction;

import model.Survivor;

public class SurvivorDAO extends DAO{
	
	public Survivor getSurvivorById(int id) {
		
		Survivor survivor = entityManager.find(Survivor.class, id);
		return survivor;
		
	}
	
	public void insertSurvivor(Survivor survivor) {
		
		EntityTransaction transaction = getTransaction();
		
		try {
			transaction.begin();
			entityManager.persist(survivor);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.getMessage();
		}

	}
	
	public void mergeSurvivor(Survivor survivor) {
		
		EntityTransaction transaction = getTransaction();
		
		try {
			transaction.begin();
			entityManager.merge(survivor);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.getMessage();
		}
		
	}
	
}
