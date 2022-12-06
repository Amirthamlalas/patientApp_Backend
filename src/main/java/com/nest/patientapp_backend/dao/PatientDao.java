package com.nest.patientapp_backend.dao;

import com.nest.patientapp_backend.model.Patients;
import org.springframework.data.repository.CrudRepository;

public interface PatientDao extends CrudRepository<Patients,Integer> {
}
