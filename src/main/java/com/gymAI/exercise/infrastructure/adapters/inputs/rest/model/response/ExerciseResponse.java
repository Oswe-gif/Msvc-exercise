package com.gymAI.exercise.infrastructure.adapters.inputs.rest.model.response;

import com.gymAI.exercise.domain.model.Routine;
import com.gymAI.exercise.infrastructure.adapters.outputs.persistence.entity.RoutineEntity;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class ExerciseResponse {
    private Long id;
    private String title;
    private String details;
}
