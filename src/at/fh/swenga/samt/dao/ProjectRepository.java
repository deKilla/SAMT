package at.fh.swenga.samt.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import at.fh.swenga.samt.model.ProjectModel;

@Repository
@Transactional
public interface ProjectRepository extends JpaRepository<ProjectModel, Integer>{
	

}
