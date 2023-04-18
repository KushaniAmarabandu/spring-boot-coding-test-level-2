package com.accenture.codingtest.springbootcodingtest.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.domain.Pageable;

import com.accenture.codingtest.springbootcodingtest.model.Project;

public interface ProjectService {

	Optional<Project> findById(UUID id);

	List<Project> findAll(Pageable pagination, String q);

	void createProject(Project project);

	void updateProject(Project project, UUID id);

	void patchProject(Project project, UUID id);

	void deleteProject(UUID id);

}
