package cn.edu.sdu.java.server.models;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Table(	name = "traveling_outside",
        uniqueConstraints = {
        })
public class TravelingOutside {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer travelingOutsideId;

    @Size(max = 20)
    private String destination;

    @Size(max = 20)
    private String departureTime;

    @Size(max = 20)
    private String returnTime;

    @Size(max = 20)
    private String vehicle;
}
