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
@Table(	name = "party",
        uniqueConstraints = {
        })
public class Party {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer partyId;

    @Size(max = 20)
    private String partyTheme;

    @Size(max = 20)
    private String partyLocation;

    @ManyToOne
    @JoinColumn(name="personId")
    @JsonIgnore
    private Person person;
}
