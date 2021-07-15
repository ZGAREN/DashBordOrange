package com.example.demo.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class GroupeOrange implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idGroup;
    private String nameGroup;
    //private int numberCountrie;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @OneToMany(mappedBy = "groupe")
    private Collection<Countrie> countrie;





}

