package project.G9.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//Entity class
@Entity

public class Placement{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	   private Long id;
	   private String name;
	   private String college;
	   private String  privatedate;
	   private String qualification;
	   private String year;

	   
	   public Placement() {
		super();
	}


	public Placement(Long id, String name, String college, String privatedate, String qualification, String year) {
		super();
		this.id = id;
		this.name = name;
		this.college = college;
		this.privatedate = privatedate;
		this.qualification = qualification;
		this.year = year;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCollege() {
		return college;
	}


	public void setCollege(String college) {
		this.college = college;
	}


	public String getPrivatedate() {
		return privatedate;
	}


	public void setPrivatedate(String privatedate) {
		this.privatedate = privatedate;
	}


	public String getQualification() {
		return qualification;
	}


	public void setQualification(String qualification) {
		this.qualification = qualification;
	}


	public String getYear() {
		return year;
	}


	public void setYear(String year) {
		this.year = year;
	}


	@Override
	public String toString() {
		return "Placement [id=" + id + ", name=" + name + ", college=" + college + ", privatedate=" + privatedate
				+ ", qualification=" + qualification + ", year=" + year + "]";
	}
	 
	   
}
