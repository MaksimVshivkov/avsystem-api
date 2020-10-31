package ru.avperm.avsystemapi.services.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.avperm.avsystemapi.entity.BusStation;
import ru.avperm.avsystemapi.exceptions.EntityNotFound;
import ru.avperm.avsystemapi.repositories.BusStationRepository;
import ru.avperm.avsystemapi.services.BusStationService;

import java.util.List;

@Service
@AllArgsConstructor
public class BusStationServiceImpl implements BusStationService {

    private final BusStationRepository busStationRepository;

    @Override
    public BusStation getBusStation(Long id) {
        return busStationRepository.findById(id).orElseThrow(() -> new EntityNotFound("BusStationNotFound " + id));
    }

    @Override
    public List<BusStation> getAllBusStations() {
        return busStationRepository.findAll();
    }
}
