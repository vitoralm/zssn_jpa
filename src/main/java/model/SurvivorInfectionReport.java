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
@Table(name = "survivor_infection_report")
public class SurvivorInfectionReport {
	
	@Id
	@GeneratedValue
	private int id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "survivor_reporter_id")
	private Survivor survivorReporter;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "survivor_reported_id")
	private Survivor survivorReported;
	
	@Column(name = "location_date")
	private Timestamp locationDate;

	@Transient
	private final SimpleDateFormat DATE_TIME_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	public SurvivorInfectionReport(Survivor survivorReporter, Survivor survivorReported) {
		try {
			Date data = Calendar.getInstance().getTime();
			DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
			String timestamp = dateFormat.format(data);
			
			this.locationDate = new Timestamp(DATE_TIME_FORMAT.parse(timestamp).getTime());
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public Survivor getSurvivorReporter() {
		return survivorReporter;
	}

	public Survivor getSurvivorReported() {
		return survivorReported;
	}
	
}
