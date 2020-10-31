package ru.avperm.avsystemapi.services.impl;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Service;
import ru.avperm.avsystemapi.services.CacheService;

@Service
public class CacheServiceImpl implements CacheService {

    @CacheEvict(value = "busstation", allEntries = true)
    public boolean clearCacheBusStation() {
        return true;
    }

    @CacheEvict(value = "stopplace", allEntries = true)
    public boolean clearCacheStopplace() {
        return true;
    }
}
