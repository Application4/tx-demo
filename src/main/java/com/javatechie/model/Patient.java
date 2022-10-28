package com.javatechie.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "PATIENT_TBL")
public class Patient {

    @Id
    @GeneratedValue
    private Long patientId;
    private String name;
    private String email;
    private String gender;
    private int age;
    private String address;
}
