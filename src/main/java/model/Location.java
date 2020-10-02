package model;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "location")
public class Location {
	
	@Id
	@GeneratedValue
	private int id;

	@Column
	private Double latitude;

	@Column
	private Double longitude;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "survivor_id")
	private Survivor survivor;
	
	@Column(name = "location_date")
	private Timestamp locationDate;

	@Transient
	private final SimpleDateFormat DATE_TIME_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	public Location() {}
	
	public Location(Double latitude, Double longitude, Survivor survivor) {
		this.latitude = latitude;
		this.longitude = longitude;
		this.survivor = survivor;
		try {
			Date data = Calendar.getInstance().getTime();
			DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
			String timestamp = dateFormat.format(data);
			
			this.locationDate = new Timestamp(DATE_TIME_FORMAT.parse(timestamp).getTime());
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public Double getLatitude() {
		return latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public Timestamp getLocationDate() {
		return locationDate;
	}

}
