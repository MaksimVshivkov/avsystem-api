package ru.avperm.avsystemapi.services;

import ru.avperm.avsystemapi.entity.Race;

import java.util.List;

public interface RaceService {

    /**
     * Получить рейс по ID
     *
     * @param id
     * @return
     */
    Race getRace(Long id);

    /**
     * Получить список всех рейсов
     *
     * @return List<Race> список рейсов
     */
    List<Race> getAllRaces();

    /**
     * Получить список сегодняшних рейсов рейсов
     *
     * @return List<Race> список рейсов
     */
    List<Race> getAllTodayRaces();

    /**
     * Получить список рейсов по пункт посадки и пункту отправления
     *
     * @param idFrom id остановки
     * @param idTo   id остановки
     * @return
     */
    List<Race> getAllRacesBySpFromSpTo(Long idFrom, Long idTo);

}
