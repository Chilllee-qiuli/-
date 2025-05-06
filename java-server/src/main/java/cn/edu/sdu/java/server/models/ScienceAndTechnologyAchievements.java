package cn.edu.sdu.java.server.models;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Table(	name = "science_and_technology_achievements",
        uniqueConstraints = {
        })
public class ScienceAndTechnologyAchievements {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer scienceAndTechnologyAchievementsId;

    @ManyToOne
    @JoinColumn(name="personId")
    @JsonIgnore
    private Student student;

    @Size(max = 20)
    private String name;

    @Size(max = 50)
    private String description;

    @Size(max = 20)
    private String applyDate;

    @Size(max = 20)
    private String publishDate;

    @Size(max = 50)
    private String certificate_path;

    @Size(max = 50)
    private String demo_url;//演示视频链接

    @ManyToOne
    @JoinColumn(name="personId")
    @JsonIgnore
    private Teacher teacher;

}
