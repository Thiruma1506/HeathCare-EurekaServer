package com.example.Appointment.Repository;

import com.example.Appointment.Entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepo extends JpaRepository<Appointment,Integer> {
}
