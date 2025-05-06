package cn.edu.sdu.java.server.models;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Table(	name = "political_status",
        uniqueConstraints = {
        })
public class PoliticalStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer politicalStatusId;

    @ManyToOne
    @JoinColumn(name="personId")
    @JsonIgnore
    private Student student;

    //枚举类，共青团员，共产党，群众
}
