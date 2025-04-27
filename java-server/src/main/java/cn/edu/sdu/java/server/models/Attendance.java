package cn.edu.sdu.java.server.models;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Table(	name = "attendance",
        uniqueConstraints = {
        })
public class Attendance {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer attendanceId;

    @ManyToOne
    @JoinColumn(name="personId")
    @JsonIgnore
    private Student student;

    @ManyToOne
    @JoinColumn(name="coureId")
    @JsonIgnore
    private Course course;

    @Size(max = 20)
    private String recordDate;

    private Boolean attendanceSituation;
}
