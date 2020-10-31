package ru.avperm.avsystemapi.exceptions;

public class EntityNotFound extends RuntimeException {
    public EntityNotFound(String errorMessage) {
        super(errorMessage);
    }
}