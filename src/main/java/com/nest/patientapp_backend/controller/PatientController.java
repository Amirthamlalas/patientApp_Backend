package com.nest.patientapp_backend.controller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PatientController {

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/add",consumes ="application/json",produces = "application/json")
    public String AddPatient(){
        return "added patient successfully";
    }
}
