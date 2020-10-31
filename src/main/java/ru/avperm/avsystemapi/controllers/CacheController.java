package ru.avperm.avsystemapi.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.avperm.avsystemapi.services.CacheService;

@RestController
@Slf4j
@AllArgsConstructor
@RequestMapping("/api/")
@Tag(name = "Кеш", description = "REST API для работы с кешем")
public class CacheController {

    private final CacheService cacheService;

    @GetMapping(path = "/clear-cache/stopplace")
    @Operation(summary = "Очистка кеша остановок", description = "Очистка кеша", tags = {"cache"})
    public Boolean clearCacheStopplace() {
        return cacheService.clearCacheStopplace();
    }

    @GetMapping(path = "/clear-cache/busstation")
    @Operation(summary = "Очистка кеша автовокзалов", description = "Очистка кеша", tags = {"cache"})
    public Boolean clearCacheBusStation() {
        return cacheService.clearCacheBusStation();
    }
}
