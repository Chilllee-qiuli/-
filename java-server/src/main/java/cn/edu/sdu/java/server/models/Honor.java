package cn.edu.sdu.java.server.models;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Table(	name = "honor",
        uniqueConstraints = {
        })
public class Honor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer honorId;

    @ManyToOne
    @JoinColumn(name="personId")
    @JsonIgnore
    private Student student;

    @Size(max = 50)
    private String honorName;

    @Size(max = 20)
    private String honorTime;
}
