package com.javatechie.repository;

import com.javatechie.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface AppointmentRepository extends JpaRepository<Appointment,String> {
}
