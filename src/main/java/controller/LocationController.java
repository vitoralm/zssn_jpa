package controller;

import dao.LocationDAO;
import model.Location;
import model.Survivor;

public class LocationController {
	
	LocationDAO locationDAO;
	
	public LocationController() {
		this.locationDAO = new LocationDAO();
	}
	
	public void insertLocation(Double latitude, Double longitude, Survivor survivor) {
		Location location = new Location(latitude, longitude, survivor);
		locationDAO.insertLocation(location);
	}
	
	public void close() {
		locationDAO.close();
	}
	
}
