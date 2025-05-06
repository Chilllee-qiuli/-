package cn.edu.sdu.java.server.models;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Table(	name = "student_sports_activity",
        uniqueConstraints = {
        })
public class StudentSportsActivity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer studentSportsActivityId;

    @ManyToOne
    @JoinColumn(name="personId")
    @JsonIgnore
    private Student student;

    @Size(max = 20)
    private String sportsClubName;

    @Size(max = 50)
    private String sportsCompetitionName;

    @Size(max = 50)
    private String sportsHonor;

}
