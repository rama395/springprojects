package com.springbootjpa.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

@Entity
@Table(name="FLIGHT_DETAILS")
@Data
@Builder
public class FlightDetails
{
    @Column(name="F_NO")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer fno;
    @Column(name="F_COMP",length = 30)
    private String fcomp;
    @Column(name="TYPE",length = 30)
    private String type;
    @Column(name="CAPACITY")
    private Integer capacity;

}
