package ru.avperm.avsystemapi.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;

/**
 * Рейс
 */
@Entity
@Data
@Table(name = "races")
public class Race {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
     * Дата рейса
     */
    private Date dateRace;

    /**
     * Статус рейса
     */
    private int statusId;

    /**
     * Автовокзал
     */
    @ManyToOne
    @JoinColumn(name = "awt_id")
    private BusStation busStation;

    /**
     * Маршрут
     */
    @ManyToOne
    @JoinColumn(name = "route_id")
    private Route route;

}
