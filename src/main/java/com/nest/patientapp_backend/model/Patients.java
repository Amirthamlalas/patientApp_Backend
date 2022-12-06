package com.nest.patientapp_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Patient")
public class Patients {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String address;
    private String phoneno;
    private String dateofAppoinment;

    public Patients() {
    }

    public Patients(int id, String name, String address, String phoneno, String dateofAppoinment) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneno = phoneno;
        this.dateofAppoinment = dateofAppoinment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    public String getDateofAppoinment() {
        return dateofAppoinment;
    }

    public void setDateofAppoinment(String dateofAppoinment) {
        this.dateofAppoinment = dateofAppoinment;
    }
}
