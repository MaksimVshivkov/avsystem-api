package ru.avperm.avsystemapi.services.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.avperm.avsystemapi.entity.Race;
import ru.avperm.avsystemapi.exceptions.EntityNotFound;
import ru.avperm.avsystemapi.repositories.RaceRepository;
import ru.avperm.avsystemapi.services.RaceService;

import java.util.List;

@Service
@AllArgsConstructor
public class RaceServiceImpl implements RaceService {

    private final RaceRepository raceRepository;

    @Override
    public Race getRace(Long id) {
        return raceRepository.findById(id).orElseThrow(() -> new EntityNotFound("RaceNotFound " + id));
    }

    @Override
    public List<Race> getAllRaces() {
        return raceRepository.findAll();
    }

    @Override
    public List<Race> getAllTodayRaces() {
        return raceRepository.findTodayAll();
    }

    @Override
    public List<Race> getAllRacesBySpFromSpTo(Long idFrom, Long idTo) {
        return raceRepository.findAllBySpFromSpTo(idFrom, idTo);
    }

}
