package singleTable.main.model.dao;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name="Employee")
@Table
public class Employee {
	
	@Id
	@Column(name = "EMPLOYEE_ID")
	@GeneratedValue(strategy = GenerationType.AUTO) 
	private long id;
	@Column(name = "EMPLOYEE_NAME")
	private String name;
	@Column(name = "EMPLOYEE_EMAIL")
	private String Email;
	
	@Temporal(TemporalType.TIMESTAMP)
    @Column(name = "EMPLOYMENTDATE")
	private Date   employmentDate;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public Date getEmploymentDate() {
		return employmentDate;
	}

	public void setEmploymentDate(Date employmentDate) {
		this.employmentDate = employmentDate;
	}
	
	public String toString(){
		return "Id("+id +") Name ("+name+") Date("+employmentDate+")";
	}
}
