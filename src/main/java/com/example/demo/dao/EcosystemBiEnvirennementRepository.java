package com.example.demo.dao;

import com.example.demo.entities.EcosystemBiEnvirennement;
import com.example.demo.entities.ITinventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
@CrossOrigin("*")
public interface EcosystemBiEnvirennementRepository extends JpaRepository<EcosystemBiEnvirennement,Long> {
}
