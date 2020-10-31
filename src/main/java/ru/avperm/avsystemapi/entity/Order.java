package ru.avperm.avsystemapi.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * Интернет-заказ
 */
@Entity
@Data
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
     * Id пользователя, который сделал заказ
     */
    private int userId;

    /**
     * Сумма заказа
     */
    private Double price;

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

    /**
     * Рейс, на который куплен билет
     */
    @ManyToOne
    @JoinColumn(name = "race_id")
    private Race race;

    /**
     * Статус заказа
     */
    private int statusId;

}
