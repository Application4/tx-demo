package com.javatechie.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "APPOINTMENT_TBL")
public class Appointment {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    private String appointmentNo;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date appointmentDate;
    private String doctorName;
    private Long patientId;
    private String disease;
    //validate PromoCode before book the appointment
    private String promoCode;


}
