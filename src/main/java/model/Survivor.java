package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="survivor")
public class Survivor {
	
	@Id
	@GeneratedValue
	private int id;
	
	@Column
	private String name;
	
	@Column
	private int age;
	
	@Column
	private String gender;
	
	@OneToMany(mappedBy = "survivor")
	private List<Location> locations;

	public Survivor() {}
	
	public Survivor(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.locations = new ArrayList<Location>();
	}

	public List<Location> getLocations() {
		return locations;
	}

	public Location getLastLocation() {
		return locations.get(locations.size() - 1);
	}

}
