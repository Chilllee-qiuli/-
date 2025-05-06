package cn.edu.sdu.java.server.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Table(	name = "competition",
        uniqueConstraints = {
        })
public class Competition {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer competitionId;

    @ManyToOne
    @JoinColumn(name="personId")
    @JsonIgnore
    private Student student;

    @Size(max = 20)
    private String competitionName;

    @Size(max = 20)
    private String organizer;

    @Size(max = 20)
    private String awardLevel;

    @Size(max = 20)
    private String time;

    @Size(max = 20)
    private String awardCertificatePath;

    private enum role{
        Captain,Teammate;
    }
}

