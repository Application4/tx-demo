package com.javatechie.service;

import com.javatechie.common.PromoCodeValidator;
import com.javatechie.dto.PatientAppointmentRequest;
import com.javatechie.model.Appointment;
import com.javatechie.model.Patient;
import com.javatechie.repository.AppointmentRepository;
import com.javatechie.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AppointmentService {

    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private AppointmentRepository appointmentRepository;


    @Transactional
    public String bookAppointment(PatientAppointmentRequest appointmentRequest) {
        //SAVE PATIENT
        Patient patient = appointmentRequest.getPatient();
        Long patientId = patientRepository.save(patient).getPatientId();

        System.out.println("Patient information saved ");

        //SAVE APPOINTMENT
        Appointment appointment = appointmentRequest.getAppointment();

        // Before book the appointment just validate the prom_code
        if (appointment.getPromoCode() != null) {
            PromoCodeValidator.validatePromoCode(appointment.getPromoCode());
        }
        //SET patient id in appointment table
        appointment.setPatientId(patientId);
        //SAVE appointment object
        String appointmentNo = appointmentRepository.save(appointment).getAppointmentNo();

        return "Hi " + patient.getName() +
                " Your appointment with doctor " +
                appointment.getDoctorName() +
                " booked successfully at " +
                appointment.getAppointmentDate().toString();
    }

}
