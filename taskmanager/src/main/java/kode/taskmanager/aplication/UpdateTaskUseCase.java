package kode.taskmanager.aplication;

import kode.taskmanager.aplication.input.UpdateTaskInput;
import kode.taskmanager.aplication.output.TaskOutput;
import kode.taskmanager.domain.TaskId;
import kode.taskmanager.domain.TaskNotFoundExeption;
import kode.taskmanager.domain.TaskRepository;
import  kode.taskmanager.domain.Task;

public class UpdateTaskUseCase {
    private final TaskRepository repository;

    public UpdateTaskUseCase(TaskRepository repository) {
        this.repository = repository;
    }

    public TaskOutput execute(TaskId taskId, UpdateTaskInput input) {
    var task = repository.findById(taskId).orElseThrow(() -> new TaskNotFoundExeption(taskId));
        Task.update( input.title(), input.description(), input.status());
        var updated = repository.save(task);
        return TaskOutput.from(updated);
    }
}
