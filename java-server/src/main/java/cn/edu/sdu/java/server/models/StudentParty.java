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
@Table(	name = "student_party",
        uniqueConstraints = {
        })
public class StudentParty {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer studentPartyId;

    @ManyToOne
    @JoinColumn(name="personId")
    @JsonIgnore
    private Student student;

    @ManyToOne
    @JoinColumn(name="partyId")
    @JsonIgnore
    private Party party;
}
