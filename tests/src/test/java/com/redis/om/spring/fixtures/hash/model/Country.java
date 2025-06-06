package com.redis.om.spring.fixtures.hash.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor(
    staticName = "of"
)
@RedisHash(
  "country"
)
public class Country {
  @Id
  @NonNull
  private String id;
}
