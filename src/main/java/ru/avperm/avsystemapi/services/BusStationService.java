package ru.avperm.avsystemapi.services;

import ru.avperm.avsystemapi.entity.BusStation;

import java.util.List;

public interface BusStationService {

    /**
     * Получить автовокзал по id
     *
     * @param id номер автовокзала
     * @return Автовокзал {@link BusStation}
     */
    BusStation getBusStation(Long id);

    /**
     * Получить список всех автовокзалов
     *
     * @return List<BusStation>
     */
    List<BusStation> getAllBusStations();

}
