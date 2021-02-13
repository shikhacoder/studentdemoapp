package com.studentdemo.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "studentdemo")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	
	  @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	  
	  @JoinColumn(name = "DEPARTMENT_ID") 
	  private Department department;
	 
	
	@Column(name = "STUDENT_FIRST_NAME")
	private String stuFname;

	@Column(name = "STUDENT_LAST_NAME")
	private String stuLname;

	@Column(name = "ADDRESS")
	private String address;

	@Column(name = "MOBILE_NO")
	private int mobileNo;

	public Student() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	/*
	 * public Department getDepartment() { return department; }
	 * 
	 * public void setDepartment(Department department) { this.department =
	 * department; }
	 */
	public String getStuFname() {
		return stuFname;
	}

	public void setStuFname(String stuFname) {
		this.stuFname = stuFname;
	}

	public String getStuLname() {
		return stuLname;
	}

	public void setStuLname(String stuLname) {
		this.stuLname = stuLname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ",stuFname=" + stuFname + ", stuLname=" + stuLname
				+ ", address=" + address + ", mobileNo=" + mobileNo + "]";
	}

}
