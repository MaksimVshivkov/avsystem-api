package ru.avperm.avsystemapi.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.avperm.avsystemapi.entity.Race;
import ru.avperm.avsystemapi.services.RaceService;

import java.util.List;

@RestController
@Slf4j
@AllArgsConstructor
@RequestMapping("/api/")
@Tag(name = "Рейсы", description = "REST API для работы с рейсами")
public class RaceController {

    private final RaceService raceService;

    @GetMapping(path = "/race/all")
    @Operation(summary = "Получение полного списка рейсов", description = "Список рейсов", tags = {"Race"})
    public List<Race> getRaces() {
        return raceService.getAllRaces();
    }

    @GetMapping(path = "/race/today")
    @Operation(summary = "Получение сегодняшних рейсов рейсов", description = "Список сегодняшних рейсов", tags = {"Race"})
    public List<Race> getRacesToday() {
        return raceService.getAllTodayRaces();
    }

    @GetMapping(path = "/race/{id}")
    @Operation(summary = "Получение рейса по id", description = "Рейс по ID", tags = {"Race"})
    public Race getRaceById(@PathVariable("id") Long id) {
        return raceService.getRace(id);
    }

    @GetMapping(path = "/race/{idFrom}/{idTo}")
    @Operation(summary = "Получение рейса по пункт посадки и пункту назчения", description = "Список рейсов по пункту посадки и пункту назчения ", tags = {"Race"})
    public List<Race> getRacesBySpFromSpTo(@PathVariable("idFrom") Long idFrom, @PathVariable("idTo") Long idTo) {
        return raceService.getAllRacesBySpFromSpTo(idFrom, idTo);
    }

}
