package com.simpleQuiz.simple.quiz.project.student.DTO;

import com.simpleQuiz.simple.quiz.project.student.data.model.StudentClass;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;

@Data
public class StudentRequest {
    private String firstName;
    private String lastName;
    private String password;
    private String email;

}
