package com.redis.om.spring.search.stream;

public interface EntityStream {
  <E> SearchStream<E> of(final Class<E> entityClass);

  <E> SearchStream<E> of(final Class<E> entityClass, String searchIndex, String idField);
}
