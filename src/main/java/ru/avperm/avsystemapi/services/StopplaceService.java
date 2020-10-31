package ru.avperm.avsystemapi.services;

import ru.avperm.avsystemapi.entity.Stopplace;

import java.util.List;

public interface StopplaceService {

    /**
     * Получить остановку по id
     *
     * @param id номер остановки
     * @return Stopplace {@link Stopplace}
     */
    Stopplace getStopplace(Long id);

    /**
     * Получить список всех остановок
     *
     * @return List<Stopplace>
     */
    List<Stopplace> getAllStopplaces();

}
