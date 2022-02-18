package com.auribises.doctorsapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.auribises.doctorsapp.model.Patient;

public interface PatientRepository extends CrudRepository<Patient, String>{
	//PatientRepository can now be used to perform CRUD Operations on Patients 
}