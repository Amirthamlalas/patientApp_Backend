package com.nest.patientapp_backend.controller;


import com.nest.patientapp_backend.dao.PatientDao;
import com.nest.patientapp_backend.model.Patients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;


@RestController
public class PatientController {
    @Autowired
    private PatientDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/add",consumes ="application/json",produces = "application/json")
    public HashMap<String, String> AddPatient(@RequestBody Patients p){
        System.out.println(p.getName().toString());
        System.out.println(p.getAddress().toString());
        System.out.println(p.getDateofAppoinment().toString());
        dao.save(p);
        HashMap<String, String> map = new HashMap<>();
        map.put("status","success");
        return map;

    }
    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<Patients>view(){
        return (List<Patients>) dao.findAll();
    }
}
