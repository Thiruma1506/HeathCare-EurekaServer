package com.example.Patients.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "patientinfo")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Patient {
    @Id
    public int id;
    public String patientname;
    public String patientaddress;
}
