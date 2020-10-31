package ru.avperm.avsystemapi.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Time;

/**
 * Маршрут
 */
@Entity
@Data
@Table(name = "routes")
public class Route {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private Time timeOut;

    /**
     * Пункт посадки
     */
    @ManyToOne
    @JoinColumn(name = "sp_from_id")
    private Stopplace spFrom;

    /**
     * Пункт назначения
     */
    @ManyToOne
    @JoinColumn(name = "sp_to_id")
    private Stopplace spTo;

}
