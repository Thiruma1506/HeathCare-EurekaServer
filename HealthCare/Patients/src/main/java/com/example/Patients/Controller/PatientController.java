package com.example.Patients.Controller;

import com.example.Patients.Entity.Patient;
import com.example.Patients.Service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patient")
public class PatientController {

    @Autowired
    public PatientService service;

    //create patient
    @PostMapping("/create")
    public ResponseEntity<Patient> createPatient(@RequestBody Patient patient){
        return ResponseEntity.status(201).body(service.createPatient(patient));
    }

    //get all patients
    @GetMapping("/allpatients")
    public ResponseEntity<List<Patient>> getAllPatients(){
        return ResponseEntity.ok().body(service.getAllPatient());
    }

    //get patients by id
    @GetMapping("/getpatientbyid/{id}")
    public ResponseEntity<Patient> getPatientById(@PathVariable int id){
        return ResponseEntity.ok().body(service.getPatientById(id));
    }
}
