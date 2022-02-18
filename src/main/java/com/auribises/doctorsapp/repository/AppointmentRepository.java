package com.auribises.doctorsapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.auribises.doctorsapp.model.Appointments;

public interface AppointmentRepository extends CrudRepository<Appointments, String>{
	// AppointmentRepository can now be used to perform CRUD Operations on Appointment 
}