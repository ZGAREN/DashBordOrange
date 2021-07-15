package com.example.demo.dao;

import com.example.demo.entities.Tool;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ToolsRepository extends JpaRepository<Tool,Long> {
}
