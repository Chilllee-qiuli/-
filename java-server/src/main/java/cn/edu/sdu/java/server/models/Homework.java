package cn.edu.sdu.java.server.models;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Table(	name = "homework",
        uniqueConstraints = {
        })
public class Homework {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer homeworkId;

    @ManyToOne
    @JoinColumn(name="courseId")
    @JsonIgnore
    private Course course;

    @Size(max = 20)
    private String homeworkTitle;

    @Size(max = 20)
    private String homeworkStartTime;

    @Size(max = 20)
    private String homeworkDeadline;

    private Double homeworkMaxScore;
}
