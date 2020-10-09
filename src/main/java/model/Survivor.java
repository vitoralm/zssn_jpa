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
	
	@OneToMany(mappedBy = "survivorLocation")
	private List<Location> locations;
	
	@OneToMany(mappedBy = "survivorInfectionReporter")
	private List<SurvivorInfectionReport> infectionReports;

	@OneToMany(mappedBy = "survivorInfectionReported")
	private List<SurvivorInfectionReport> infectionsReported;
	
	Survivor() {}
	
	public Survivor(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.locations = new ArrayList<Location>();
		this.infectionReports = new ArrayList<SurvivorInfectionReport>();
		
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public List<Location> getLocations() {
		return locations;
	}

	public Location getLastLocation() {
		return locations.get(locations.size() - 1);
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
