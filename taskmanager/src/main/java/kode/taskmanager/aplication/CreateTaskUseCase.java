package kode.taskmanager.aplication;

import kode.taskmanager.aplication.input.CreateTaskInput;
import kode.taskmanager.aplication.output.TaskOutput;
import kode.taskmanager.domain.Task;
import kode.taskmanager.domain.TaskRepository;
import org.springframework.stereotype.Service;


@Service
public class CreateTaskUseCase {
    private final TaskRepository repository;

    public CreateTaskUseCase(TaskRepository repository) {
         this.repository = repository;
    }

   public TaskOutput execute(CreateTaskInput input) {
       var task = new Task(input.title(), input.description());
       var save = repository.save(task);
    return TaskOutput.from(task);

    }
}
