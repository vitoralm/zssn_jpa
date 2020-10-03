package controller;

import dao.LocationDAO;
import dao.SurvivorDAO;
import model.Location;
import model.Survivor;

public class SurvivorController {
	
	SurvivorDAO survivorDAO;
	
	public SurvivorController() {
		
		this.survivorDAO = new SurvivorDAO();
		
	}
	
	public void insert(String nome, int idade, String sexo, Double latitude, Double longitude) {
		
		Survivor survivor = new Survivor(nome, idade, sexo);
		survivorDAO.insertSurvivor(survivor);
		
		Location location = new Location(latitude, longitude, survivor);
		LocationDAO locationDAO = new LocationDAO();
		locationDAO.insertLocation(location);
		locationDAO.close();
		
	}
	
	public Survivor getSurvivorById(int id) {
		
		return survivorDAO.getSurvivorById(id);
		
	}
	
	public void updateSurvivorLastLocationById(int id, Double latitude, Double longitude) {
		
		Survivor survivor = survivorDAO.getSurvivorById(id);
		Location location = new Location(latitude, longitude, survivor);
		LocationDAO locationDAO = new LocationDAO();
		locationDAO.insertLocation(location);
		
	}
	
	public void close() {
		
		survivorDAO.close();
		
	}
	
}
