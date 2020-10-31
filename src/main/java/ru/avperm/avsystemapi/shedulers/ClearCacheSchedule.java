package ru.avperm.avsystemapi.shedulers;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import ru.avperm.avsystemapi.services.CacheService;

@Component
@AllArgsConstructor
@Slf4j
public class ClearCacheSchedule {

    private final CacheService cacheService;

    /**
     * Каждые 60 секунд будет очищаться кеш для остановок и автовокзалов
     */
    @Scheduled(fixedDelay = 60 * 1000, initialDelay = 60 * 1000)
    void processClearCache() {
        log.info("processClearCache");

        if (cacheService.clearCacheBusStation()) {
            log.info("Clear cache BusStation successful");
        } else {
            log.info("Clear cache BusStation NOT successful");
        }

        if (cacheService.clearCacheStopplace()) {
            log.info("Clear cache Stopplace successful");
        } else {
            log.info("Clear cache Stopplace NOT successful");
        }
    }

}
