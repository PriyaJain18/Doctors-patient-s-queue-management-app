package com.auribises.doctorsapp.model;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Patient {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer pid;
	String name;
	Integer age;
	Character gender;
	String phone;
	String dob;
	ArrayList<Appointments> appointments;
	
	public Patient() {

	}
	public Patient(Integer pid,String name, Integer age, Character gender, String phone, String dob, ArrayList<Appointments> appointments) {
		super();
		this.pid = pid;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
		this.dob = dob;
		this.appointments = appointments;
	}
	
	//Getters and Setters :
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Character getGender() {
		return gender;
	}
	public void setGender(Character gender) {
		this.gender = gender;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	//getters and setters for arraylist of appointments : 
	public ArrayList<Appointments>  getAppointments() {
		return this.appointments;
	}
	public void setAppointments(ArrayList<Appointments> appointments) {
		this.appointments = appointments;
	}
	
	//toString method : 
	@Override
	public String toString() {
		return "Patient [pid=" + pid + ", name=" + name + ", age=" + age + ", gender=" + gender + ", phone=" + phone
				+ ", dob=" + dob + ", appointments=" + appointments + "]";
	}
	
}

//ArrayList<appointments> aps = new ArrayList<appointments>();
//aps.add("1","2","4");
//aps.add("1","2","3");
//Patient p1 = new (X,Y,aps)