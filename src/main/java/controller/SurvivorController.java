package controller;

import dao.SurvivorDAO;
import model.Survivor;

public class SurvivorController {
	
	SurvivorDAO survivorDAO;
	
	public SurvivorController() {
		this.survivorDAO = new SurvivorDAO();
	}
	
	public void insert(String nome, int idade, String sexo, Double latitude, Double longitude) {
		Survivor survivor = new Survivor(nome, idade, sexo);
		survivorDAO.insertSurvivor(survivor);
		LocationController locationController = new LocationController();
		locationController.insertLocation(latitude, longitude, survivor);
		locationController.close();
	}
	
	public Survivor getSurvivor(int primaryKey) {
		return survivorDAO.getSurvivor(primaryKey);
	}
	
	public void close() {
		survivorDAO.close();
	}
	
}
