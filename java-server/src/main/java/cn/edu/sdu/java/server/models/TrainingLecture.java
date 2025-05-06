package cn.edu.sdu.java.server.models;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.relational.core.sql.In;

@Getter
@Setter
@Entity
@Table(	name = "training_lecture",
        uniqueConstraints = {
        })
public class TrainingLecture {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer trainingLectureId;

    @Size(max = 20)
    private String theme;

    @Size(max = 20)
    private String lecturer;

    @Size(max = 20)
    private String durationTime;

    @Size(max = 20)
    private String participationType;

    private Boolean isVerified;


}
