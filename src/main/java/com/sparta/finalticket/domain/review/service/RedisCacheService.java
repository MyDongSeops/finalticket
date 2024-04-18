package com.sparta.finalticket.domain.review.service;

import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RedisCacheService {

    private final RedisService redisService;

    @Cacheable(value = "reviews", key = "#reviewId")
    public String getCachedReviewData(Long reviewId) {
        return redisService.getValues("review_" + reviewId);
    }

    @CacheEvict(value = "reviews", key = "#reviewId")
    public void clearReviewCache(Long reviewId) {
        redisService.deleteValues("review_" + reviewId);
    }

    public void cacheReviewData(Long reviewId, String reviewData) {
        redisService.setValues("review_" + reviewId, reviewData);
    }
}
