package alexjw.ppmtool.services;

import alexjw.ppmtool.domain.Project;
import alexjw.ppmtool.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectServiceImpl extends MyService<Project, Long, ProjectRepository> implements ProjectService {

    @Autowired
    public ProjectServiceImpl(ProjectRepository repository) {
        super(repository);
    }

}
