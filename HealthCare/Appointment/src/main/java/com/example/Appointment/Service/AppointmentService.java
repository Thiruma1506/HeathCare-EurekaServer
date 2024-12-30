package com.example.Appointment.Service;

import com.example.Appointment.Entity.Appointment;
import com.example.Appointment.Entity.Patients;
import com.example.Appointment.FeignClient.PatientClient;
import com.example.Appointment.Repository.AppointmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentService {
    @Autowired
    private AppointmentRepo repo;

    @Autowired
    private PatientClient patientClient;

    // Get all appointments
    public List<Appointment> getAllAppointments() {
        List<Appointment> appointments = repo.findAll();
        for (Appointment appointment : appointments) {
            int patientId = appointment.getPatients().getId();
            Patients patient = patientClient.getPatientById(patientId);
            appointment.setPatients(patient);
        }
        return appointments;
    }

    // Create appointment
    public Appointment createAppointment(Appointment appointment) {
        int patientId = appointment.getPatients().getId();
        Patients patient = patientClient.getPatientById(patientId);
        appointment.setPatients(patient);
        return repo.save(appointment);
    }
}
