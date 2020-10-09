package dao;

import javax.persistence.EntityTransaction;

import model.Location;

public class LocationDAO extends DAO {
	
	public void insertLocation(Location location) {
		
		EntityTransaction transaction = getTransaction();
		
		try {
			transaction.begin();
			entityManager.persist(location);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.getMessage();
		}
		
	}
}
