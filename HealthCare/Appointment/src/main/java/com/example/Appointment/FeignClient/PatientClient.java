package com.example.Appointment.FeignClient;

import com.example.Appointment.Config.Clientconfig;
import com.example.Appointment.Entity.Patients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "patient",configuration = Clientconfig.class )
public interface PatientClient {
    @GetMapping("/getpatientbyid/{id}")
    Patients getPatientById(@PathVariable("id") int id);
}
