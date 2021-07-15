package com.example.demo.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class EcosystemBigDataplatform implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_EcoDataPlatform;
    private String namePlatform;
    private String logoPlatform;
    private String statuEcosys_BigData_platform;
    private int nubreOfCase_interruption;
    private int numbreOfNoeud;
    private String makeOrbuy;
    private double useOccupation;
    private double sizeBigDataPlatform;
    private Date datelencementProjet;
    private String TypeEnvirennement;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @ManyToOne
    private Countrie countries;

}
