package cn.edu.sdu.java.server.models;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Table(	name = "leave_for_absence",
        uniqueConstraints = {
        })
public class LeaveForAbsence {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer leaveForAbsenceId;

    @ManyToOne
    @JoinColumn(name="personId")
    @JsonIgnore
    private Student student;

    @Size(max = 20)
    private String leaveForAbsenceType;

    @Size(max = 50)
    private String leaveForAbsenceReason;

    @Size(max = 20)
    private String leaveForAbsenceStartTime;

    @Size(max = 20)
    private String leaveForAbsenceEndTime;

    @Size(max = 20)
    private String leaveForAbsenceDestination;

    @ManyToOne
    @JoinColumn(name="personId")
    @JsonIgnore
    private Teacher teacher;
}
