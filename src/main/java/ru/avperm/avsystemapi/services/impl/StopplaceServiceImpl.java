package ru.avperm.avsystemapi.services.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.avperm.avsystemapi.entity.Stopplace;
import ru.avperm.avsystemapi.exceptions.EntityNotFound;
import ru.avperm.avsystemapi.repositories.StopplaceRepository;
import ru.avperm.avsystemapi.services.StopplaceService;

import java.util.List;

@Service
@AllArgsConstructor
public class StopplaceServiceImpl implements StopplaceService {

    private final StopplaceRepository stopplaceRepository;

    @Override
    public Stopplace getStopplace(Long id) {
        return stopplaceRepository.findById(id).orElseThrow(() -> new EntityNotFound("StopplaceNotFound " + id));
    }

    @Override
    public List<Stopplace> getAllStopplaces() {
        return stopplaceRepository.findAll();
    }
}
