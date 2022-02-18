package com.auribises.doctorsapp.model;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Appointments {
	
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer aid;
	String pname;  //patient-name
	String date;
	String time;
	String status;
	
	public Appointments(){
		//set default appointment by checking today's free schedule :?????? 
//		Date d = new Date();
//		this.date = String.valueOf(d);
//		
//		String time = new SimpleDateFormat("HH:mm").format(d);
//		
		
	}
	public Appointments(Integer aid, String pname, String date, String status) {
		super();
		this.aid = aid;
		this.pname = pname;
		this.date = date;
		this.status = status;
	}
	
	//getters and setters :
	public Integer getAid() {
		return aid;
	}
	public void setAid(Integer aid) {
		this.aid = aid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	//toString method: 
	@Override
	public String toString() {
		return "Appointments [aid=" + aid + ", pname=" + pname + ", date=" + date + ", status=" + status + "]";
	}
	
	
}
