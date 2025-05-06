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
public class ArtPerformanceActivity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer artPerformanceActivityId;

    @Size(max = 20)
    private String artPerformanceActivityName;

    @Size(max = 20)
    private String artPerformanceActivityType;

    @Size(max = 20)
    private String artPerformanceActivityRole;
}
