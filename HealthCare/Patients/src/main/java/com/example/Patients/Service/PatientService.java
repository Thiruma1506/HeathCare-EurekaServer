package com.example.Patients.Service;

import com.example.Patients.Entity.Patient;
import com.example.Patients.Repository.PatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {
    @Autowired
    public PatientRepo repo;

    //get all patients
    public List<Patient> getAllPatient(){
        return repo.findAll();
    }

    //create a new patient
    public Patient createPatient(Patient patient){
        return repo.save(patient);
    }

    public Patient getPatientById(int id) {
        return repo.findById(id).orElseThrow(()->new RuntimeException("Patient ID not found, please make sure to enter the correct ID"));
    }
}
