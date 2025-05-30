package com.redis.om.spring.fixtures.hash.repository;

import java.util.Collection;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.redis.om.spring.fixtures.hash.model.HashProjectionPojo;
import com.redis.om.spring.repository.RedisEnhancedRepository;

public interface HashProjectionRepository extends RedisEnhancedRepository<HashProjectionPojo, String> {
  Optional<HashProjection> findByName(String name);

  Collection<HashProjection> findAllByName(String name);

  Page<HashProjection> findAllByName(String name, Pageable pageable);
}
