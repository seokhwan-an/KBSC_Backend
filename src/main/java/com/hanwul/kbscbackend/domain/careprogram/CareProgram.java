package com.hanwul.kbscbackend.domain.careprogram;

import com.hanwul.kbscbackend.common.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
@Table(name = "care_program")
public class CareProgram extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 45)
    private String name;

    private String description;

    @Column(length = 200)
    private String location;

}
