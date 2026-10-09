package org.example.repository;

import org.example.models.BaseEntity;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseRepository<T extends BaseEntity> {
    private final List<T> entities;
    public BaseRepository() {
        this.entities = new ArrayList<>();
    }
    public T save(T entity) {
        entities.add(entity);
        return entity;
    }
    public List<T> findAll() {
        return entities;
    }
}
