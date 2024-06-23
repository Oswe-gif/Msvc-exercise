package com.gymAI.exercise.application.ports.outputs;

import com.gymAI.exercise.domain.model.Exercise;

import java.util.Optional;

public interface ExercisePersistencePort {
    //lo de base de datos
    Optional<Exercise> findById(Long id);
}