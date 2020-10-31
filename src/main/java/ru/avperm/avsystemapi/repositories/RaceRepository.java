package ru.avperm.avsystemapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.avperm.avsystemapi.entity.Race;

import java.util.List;

@Repository
public interface RaceRepository extends JpaRepository<Race, Long> {

    @Query(value = "select r.* from races r " +
            "where r.date_race = current_date() ", nativeQuery = true)
    List<Race> findTodayAll();

    @Query(value = "select r.* " +
            "from races r " +
            "inner join routes ON routes.ID=r.route_id " +
            "where r.date_race >= current_date() and routes.sp_from_id=:idFrom and routes.sp_to_id=:idTo", nativeQuery = true)
    List<Race> findAllBySpFromSpTo(@Param(value = "idFrom") Long idFrom, @Param(value = "idTo") Long idTo);

}
