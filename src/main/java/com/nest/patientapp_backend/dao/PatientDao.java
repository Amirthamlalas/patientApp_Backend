package com.nest.patientapp_backend.dao;

import com.nest.patientapp_backend.model.Patients;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface PatientDao extends CrudRepository<Patients,Integer> {
    @Query(value = "SELECT `id`, `address`, `dateof_appoinment`, `name`, `phoneno` FROM `patient` WHERE `name`= :name",nativeQuery = true)
    List<Patients>searchPatient(@Param("name") String name);

    @Modifying
    @Transactional
    @Query(value = "DELETE FROM `patient` WHERE `id`= :id",nativeQuery = true)
    void deletePatient(@Param("id")Integer id);
}
