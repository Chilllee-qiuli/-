package cn.edu.sdu.java.server.models;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Table(	name = "student_statistics",
        uniqueConstraints = {
        })
public class PreEnrollmentInformation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer preEnrollmentInformationId;

    @OneToOne
    @JoinColumn(name="personId")
    @JsonIgnore
    private Student student;

    @Size(max = 20)
    private String highSchoolName;

    @Size(max = 20)
    private String middleSchoolName;

    @Size(max = 20)
    private String primarySchoolName;

    @Size(max = 20)
    private String collegeEntranceExaminationScore;

}
