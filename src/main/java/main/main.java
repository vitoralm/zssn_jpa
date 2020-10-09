package main;

import model.Survivor;
import model.SurvivorInfectionReport;

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
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("projeto_jpa_zssn");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Survivor survivorVitor = entityManager.find(Survivor.class, 19);
		Survivor survivorSam = entityManager.find(Survivor.class, 21);
		
		SurvivorInfectionReport sir = new SurvivorInfectionReport(survivorVitor, survivorSam);
		
		EntityTransaction transacao = entityManager.getTransaction();
		transacao.begin();
		entityManager.persist(sir);
		transacao.commit();
		
		entityManager.close();
		entityManagerFactory.close();
		
	}

}
