package cn.edu.sdu.java.server.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Table(	name = "student_innovation_project",
        uniqueConstraints = {
        })
public class StudentInnovationProject {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer studentInnovationProjectId;

    @ManyToOne
    @JoinColumn(name="personId")
    @JsonIgnore
    private Student student;

    @ManyToOne
    @JoinColumn(name="innovationProjectId")
    @JsonIgnore
    private InnovationProject innovationProject;

    @Size(max = 30)
    private String teamName;

    //枚举类，队员还是队长
    @ManyToOne
    @JoinColumn(name="personId")
    @JsonIgnore
    private Teacher teacher;

}
