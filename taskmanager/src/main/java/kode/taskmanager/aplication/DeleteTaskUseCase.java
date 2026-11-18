package kode.taskmanager.aplication;

import kode.taskmanager.domain.Task;
import kode.taskmanager.domain.TaskId;
import kode.taskmanager.domain.TaskNotFoundExeption;
import kode.taskmanager.domain.TaskRepository;

public class DeleteTaskUseCase {
    private final TaskRepository respository;

    public DeleteTaskUseCase(TaskRepository repository) {
        this.respository = repository;
    }

    public void execute(TaskId taskId) {
        if (respository.findById(taskId).isEmpty()) {
            throw new TaskNotFoundExeption(taskId);

        }
        respository.delete(taskId);
    }
}
