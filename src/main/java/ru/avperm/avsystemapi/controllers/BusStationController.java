package ru.avperm.avsystemapi.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.avperm.avsystemapi.entity.BusStation;
import ru.avperm.avsystemapi.services.BusStationService;

import java.util.List;

@RestController
@Slf4j
@AllArgsConstructor
@RequestMapping("/api/")
@Tag(name = "Автовокзалы", description = "REST API для работы с справочником автовокзалов")
public class BusStationController {

    private final BusStationService busStationService;

    @GetMapping(path = "/busstation/all")
    @Cacheable("busstation")
    @Operation(summary = "Получение списка автовокзалов", description = "Список автовокзалов", tags = {"BusStation"})
    public List<BusStation> getBusStationList() {
        return busStationService.getAllBusStations();
    }

    @GetMapping(path = "/busstation/{id}")
    @Cacheable("busstation")
    @Operation(summary = "Получение автовокзала по id", description = "Остановка по ID", tags = {"BusStation"})
    public BusStation getBusStationById(@PathVariable("id") Long id) {
        return busStationService.getBusStation(id);
    }

}
