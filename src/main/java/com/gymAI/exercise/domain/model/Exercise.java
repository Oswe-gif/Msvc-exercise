package com.gymAI.exercise.domain.model;

import lombok.*;

import java.util.List;

@Builder
@Setter
@Getter
public class Exercise {
    //un objeto POJO
    private Long id;
    private String title;
    private String details;
    //private List<Routine> routines;

}
