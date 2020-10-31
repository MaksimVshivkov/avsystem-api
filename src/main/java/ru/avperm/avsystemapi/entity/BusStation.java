package ru.avperm.avsystemapi.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * Автовокзал
 */
@Entity
@Data
@Table(name = "awtlist")
public class BusStation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String address;

    private String phones;

}
