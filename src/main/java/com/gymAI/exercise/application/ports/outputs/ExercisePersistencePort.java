package com.gymAI.exercise.application.ports.outputs;

import com.gymAI.exercise.domain.model.Exercise;

import java.util.List;
import java.util.Optional;

public interface ExercisePersistencePort {
    //lo de base de datos
    Optional<Exercise> findById(Long id);
    List<Exercise> getAll();
    Exercise save(Exercise exercise);
    void deleteById(Long id);
    List<Exercise> findAllById(List<Long> ids);
    boolean existsById(Long id);
}
