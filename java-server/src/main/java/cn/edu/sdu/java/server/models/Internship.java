package cn.edu.sdu.java.server.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Table(	name = "internship",
        uniqueConstraints = {
        })
public class Internship {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer internshipId;

    @ManyToOne
    @JoinColumn(name="personId")
    @JsonIgnore
    private Student student;

    @Size(max = 20)
    private String internshipTheme;

    @Size(max = 30)
    private String companyName;

    @Size(max = 20)
    private String location;

    @Size(max = 20)
    private String position;

    @Size(max = 20)
    private String startTime;

    @Size(max = 20)
    private String endTime;

    @Size(max = 20)
    private String description;

    //progress需要加一个枚举外键
}
