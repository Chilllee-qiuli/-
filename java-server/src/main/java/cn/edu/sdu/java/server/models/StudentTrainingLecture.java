package cn.edu.sdu.java.server.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Table(	name = "student_training_lecture_double_recognition",
        uniqueConstraints = {
        })
public class StudentTrainingLecture {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer StudentTrainingLectureDoubleRecognitionId;

    @ManyToOne
    @JoinColumn(name="studentId")
    @JsonIgnore
    private Student student;

    @ManyToOne
    @JoinColumn(name="trainingLectureId")
    @JsonIgnore
    private TrainingLecture trainingLecture;
}
