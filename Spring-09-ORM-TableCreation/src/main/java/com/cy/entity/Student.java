package com.cy.entity;


import com.cy.enums.Gender;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;

    private String firstName;
    @Column(name = "studentLastName")
    private String lasttName;
    private String email;

    @Transient //makes it non-exist on the table
    private String city;

    @Temporal(TemporalType.DATE)
    private Date birthDate;
    @Temporal(TemporalType.TIME)
    private Date birthTime;
    @Temporal(TemporalType.TIMESTAMP)
    private Date birthDateTime;

    @Enumerated(EnumType.STRING)
    private Gender gender;

}
