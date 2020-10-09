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
	
	public Survivor createSurvivor(String name, int age, String gender) {
		
		Survivor survivor = new Survivor(name, age, gender);
		return survivor;
		
	}
	
	public void insert(String name, int age, String gender, Double latitude, Double longitude) {
		
		Survivor survivor = createSurvivor(name, age, gender);
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
		locationDAO.close();
		
	}
	
	public void mergeSurvivor(Survivor survivor) {
		
		survivorDAO.mergeSurvivor(survivor);
		
	}
	
	public void close() {
		
		survivorDAO.close();
		
	}
	
}
