package com.javatechie.repository;

import com.javatechie.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface PatientRepository extends JpaRepository<Patient,Long> {
}
