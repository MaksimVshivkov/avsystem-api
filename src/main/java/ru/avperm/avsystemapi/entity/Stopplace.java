package ru.avperm.avsystemapi.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "stopplaces")
public class Stopplace {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private Integer regionCode;

}
