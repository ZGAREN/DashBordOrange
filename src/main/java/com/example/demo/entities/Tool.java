package com.example.demo.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Tool implements Serializable {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long idTools;
        private String nameTools;
        private int nmbreTools;
        @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
        @ManyToOne
        private ITinventory categorie;

}
