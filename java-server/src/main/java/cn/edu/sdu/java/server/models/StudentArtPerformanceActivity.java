package cn.edu.sdu.java.server.models;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Table(	name = "art_performance_activity",
        uniqueConstraints = {
        })
public class StudentArtPerformanceActivity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer studentArtPerformanceActivityId;

    @ManyToOne
    @JoinColumn(name="personId")
    @JsonIgnore
    private Student student;

    @ManyToOne
    @JoinColumn(name="artPerformanceActivityId")
    @JsonIgnore
    private ArtPerformanceActivity artPerformanceActivity;

}
