package ru.avperm.avsystemapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.avperm.avsystemapi.entity.Stopplace;

@Repository
public interface StopplaceRepository extends JpaRepository<Stopplace, Long> {
}
