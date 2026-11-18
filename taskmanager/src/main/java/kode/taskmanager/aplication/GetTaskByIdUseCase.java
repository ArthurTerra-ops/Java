package kode.taskmanager.aplication;

import kode.taskmanager.aplication.output.TaskOutput;
import kode.taskmanager.domain.TaskId;
import kode.taskmanager.domain.TaskRepository;
import kode.taskmanager.domain.TaskNotFoundExeption;
import org.springframework.stereotype.Service;

@Service
public class GetTaskByIdUseCase {
    private final TaskRepository repository;

    public GetTaskByIdUseCase(TaskRepository repository){
        this.repository = repository;
    }

    public TaskOutput execute(TaskId id) {
      return repository.findById(id).map(TaskOutput::from).orElseThrow(() -> new TaskNotFoundExeption(id));
    };
}
