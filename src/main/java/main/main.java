package main;

import model.Survivor;

import java.security.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import model.Location;

public class main {

	public static void main(String[] args) {
		
//		Survivor survivor = new Survivor("Pedro", 22, "Masculino");
//		Location location_a = new Location(1.75, 2.25, survivor);
//		Location location_b = new Location(19.75, 13.35, survivor);
		
		//survivor.setUltLocation(location_a);
		//survivor.setUltLocation(location_b);
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("projeto_jpa_zssn");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
//		EntityTransaction transaction = entityManager.getTransaction();
//		transaction.begin();
//		entityManager.persist(survivor);
//		entityManager.persist(location_a);
//		entityManager.persist(location_b);
//		transaction.commit();
		
		Survivor survivor2 = entityManager.find(Survivor.class, 6);
		System.out.println("Ultima localização: " + survivor2.getLastLocation().getLatitude() + " " + survivor2.getLastLocation().getLongitude());
		
		System.out.println("Todas as localizações:");
		for (int i = 0; i < survivor2.getLocations().size(); i++) {
			System.out.println(survivor2.getLocations().get(i).getLatitude());
			System.out.println(survivor2.getLocations().get(i).getLongitude());
			System.out.println(survivor2.getLocations().get(i).getLocationDate());
		}
		
		entityManager.close();
		entityManagerFactory.close();
		
	}

}
