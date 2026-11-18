package kode.taskmanager.aplication;

import kode.taskmanager.aplication.output.TaskOutput;
import kode.taskmanager.domain.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetTasksUseCase {
    private final TaskRepository repository;

    public GetTasksUseCase(TaskRepository repository){
    this.repository = repository;
    }
    public List<TaskOutput> execute() {
        return repository.findAll().stream().map(TaskOutput::from).toList();
    }
}
