package cn.edu.sdu.java.server.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Table(	name = "innovation_project",
        uniqueConstraints = {
        })
public class InnovationProject {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer innovationProjectId;

    @Size(max = 50)
    private String innovationProjectName;

    @Size(max = 50)
    private String description;

    @Size(max = 50)
    private String innovationProjectPath;


}
