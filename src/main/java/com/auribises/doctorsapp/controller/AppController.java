package com.auribises.doctorsapp.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.auribises.doctorsapp.model.Appointments;
import com.auribises.doctorsapp.model.Patient;
import com.auribises.doctorsapp.repository.AppointmentRepository;
import com.auribises.doctorsapp.repository.PatientRepository;  

@RestController
@RequestMapping(path = "/doctorsapp")
public class AppController {

	@Autowired
	PatientRepository pRepo;
	
	@Autowired
	AppointmentRepository aRepo; 
	
	//CRUD ON PATIENTS  :
	@PostMapping(path= "/addpatient")
	public ResponseEntity<Patient> addPatient(@RequestParam String name, @RequestParam Integer age, @RequestParam Character gender, @RequestParam String phone, @RequestParam String dob) {
		
		Patient patient = new Patient(null, name, age, gender, phone, dob, appointments);
		pRepo.save(patient);
		
		return new ResponseEntity<Patient>(patient, HttpStatus.OK);
		
	}
	@GetMapping(path="/getPatients")
	public ResponseEntity<ArrayList<Patient>> getPatients(){
		
		ArrayList<Patient> pList = new ArrayList<Patient>();
		pRepo.findAll().forEach((p) -> pList.add(p));//note : patient has a sublist 
		
		return new ResponseEntity<ArrayList<Patient>>(pList, HttpStatus.OK);
		
	}
	@GetMapping(path = "/update/{pid}")
	public ResponseEntity<Patient> updatePatient(@PathVariable("pid") Integer pid){
		
		Patient patient = new Patient(pid, //,String name, Integer age, Character gender, String phone, String dob, ArrayList<Appointments> appointments);
		)
	    pRepo.save(patient);
		
		return new ResponseEntity<Patient>(patient, HttpStatus.OK);
		
	}
	
	@GetMapping(path = "/delete/{pid}")
	public ResponseEntity<Patient> deletePatient(@PathVariable("pid") Integer pid){
		
		Patient patient = new Patient();
		patient.setPid(pid);
		pRepo.delete(patient);
		
		return new ResponseEntity<Patient>(patient, HttpStatus.OK);
	}
	
	
//	#CRUD ON APPOINTMENTS : 
	@PostMapping(path="/addAppointment")
	public ResponseEntity<Appointments> addAppointment(@RequestParam String pname, @RequestParam String date, @RequestParam String time,@RequestParam String status) {
		
		Appointments ap = new Appointments(null, pname,date,time,status);
		aRepo.save(ap);
		
		return new ResponseEntity<Appointments>(ap, HttpStatus.OK);
		
	}
	
	@GetMapping(path="/getAppointments")
	public ResponseEntity<ArrayList<Appointments>> getAppointments(){
		
		ArrayList<Appointments> apList = new ArrayList<Appointments>();
		aRepo.findAll().forEach((a) -> apList.add(a));//note : patient has a sublist 
		
		return new ResponseEntity<ArrayList<Appointments>>(apList, HttpStatus.OK);
		
	}
	
	@GetMapping(path = "/update/{aid}")
	public ResponseEntity<Appointments> updateAppointment(@PathVariable("aid") Integer aid){
		
		Appointments ap = new Appointments(aid, "John", "11-04-2023", "11:11:11");
		aRepo.save(ap);
		
		return new ResponseEntity<Appointments>(ap, HttpStatus.OK);
		
	}
	
	@GetMapping(path = "/delete/{aid}")
	public ResponseEntity<Appointments> deleteAppointment(@PathVariable("aid") Integer aid){
		
		Appointments ap = new Appointments();
		ap.setAid(aid);
		aRepo.delete(ap);
		
		return new ResponseEntity<Appointments>(ap, HttpStatus.OK);
		
	}

	
	
}