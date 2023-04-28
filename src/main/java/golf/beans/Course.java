package golf.beans;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

/**
 * @author Trevor Parrish - tparrish2
 * CIS175 - Spring 2023
 * Apr 26, 2023
 */

@Entity
public class Course {
	@Id
	@GeneratedValue
	private long id;
	private String courseName;
	private String city;
	private boolean isPublic; // will be true if it's a public course and false if it's a private country club
	private int holeAmount;
	
	// default no-arg constructor
	public Course() {
		super();
		this.isPublic = true;
		this.holeAmount = 18;
	}
	
	// other constructors
	public Course(String courseName) {
		super();
		this.courseName = courseName;
	}
	
	public Course(String courseName, String city, boolean isPublic) {
		super();
		this.courseName = courseName;
		this.city = city;
		this.isPublic = isPublic;
	}
	
	public Course(String courseName, String city, boolean isPublic, int holeAmount) {
		super();
		this.courseName = courseName;
		this.city = city;
		this.isPublic = isPublic;
		this.holeAmount = holeAmount;
	}

	public Course(int id, String courseName, String city, boolean isPublic, int holeAmount) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.city = city;
		this.isPublic = isPublic;
		this.holeAmount = holeAmount;
	}
	
	// getters and setters
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public boolean isPublic() {
		return isPublic;
	}

	public void setPublic(boolean isPublic) {
		this.isPublic = isPublic;
	}

	public int getHoleAmount() {
		return holeAmount;
	}

	public void setHoleAmount(int holeAmount) {
		this.holeAmount = holeAmount;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", courseName=" + courseName + ", city=" + city + ", isPublic=" + isPublic
				+ ", holeAmount=" + holeAmount + "]";
	}
}
