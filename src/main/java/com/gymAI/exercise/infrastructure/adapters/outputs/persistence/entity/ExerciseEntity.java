package com.gymAI.exercise.infrastructure.adapters.outputs.persistence.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity
@Table(name="exercises")
public class ExerciseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToMany(mappedBy = "exercises")
    private List<RoutineEntity> routines;
    @NotBlank
    private String title;
    private String details;

    /*@Override
    public String toString() {
        return "ExerciseEntity{" +
                "id=" + id +
                ", routines=" + routines +
                ", title='" + title + '\'' +
                ", details='" + details + '\'' +
                '}';
    }*/
}
