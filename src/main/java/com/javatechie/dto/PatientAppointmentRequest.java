package com.javatechie.dto;

import com.javatechie.model.Appointment;
import com.javatechie.model.Patient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PatientAppointmentRequest {

    private Patient patient;

    private Appointment appointment;
}
