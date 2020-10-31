package ru.avperm.avsystemapi.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;
import ru.avperm.avsystemapi.entity.Stopplace;
import ru.avperm.avsystemapi.services.StopplaceService;

import java.util.List;

@RestController
@Slf4j
@AllArgsConstructor
@RequestMapping("/api/")
@Tag(name = "Остановки", description = "REST API для работы с остановками")
public class StopplaceController {

    private final StopplaceService stopplaceService;

    @GetMapping(path = "/sp/all")
    @Cacheable("stopplace")
    @Operation(summary = "Получение всех остановок", description = "Список остановок", tags = {"Stopplace"})
    public List<Stopplace> getStopplaces() {
        return stopplaceService.getAllStopplaces();
    }

    @GetMapping(path = "/sp/{id}")
    @Cacheable("stopplace")
    @Operation(summary = "Получение остановки по id", description = "Остановка по ID", tags = {"Stopplace"})
    public Stopplace getStopplaceById(@PathVariable("id") Long id) {
        return stopplaceService.getStopplace(id);
    }

}
