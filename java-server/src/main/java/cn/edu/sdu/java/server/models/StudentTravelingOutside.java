package cn.edu.sdu.java.server.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Table(	name = "student_traveling_outside",
        uniqueConstraints = {
        })
public class StudentTravelingOutside {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer studentTravelingOutsideId;

    @ManyToOne
    @JoinColumn(name="personId")
    @JsonIgnore
    private Student student;

    @ManyToOne
    @JoinColumn(name="personId")
    @JsonIgnore
    private Teacher teacher;
}
