package ru.avperm.avsystemapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.avperm.avsystemapi.entity.BusStation;

@Repository
public interface BusStationRepository extends JpaRepository<BusStation, Long> {
}
