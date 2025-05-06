package cn.edu.sdu.java.server.models;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.net.Inet4Address;

@Getter
@Setter
@Entity
@Table(	name = "consumption_record",
        uniqueConstraints = {
        })
public class ConsumptionRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer consumptionRecordId;

    @ManyToOne
    @JoinColumn(name="personId")
    @JsonIgnore
    private Student student;

    @Size(max = 20)
    private String consumptionType;

    @Size(max = 20)
    private String consumptionTime;

    @Size(max = 20)
    private String consumptionAmount;
}
