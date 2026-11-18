package kode.taskmanager.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface TaskRepository {
    Task save(Task task);
    List<Task> findAll();
    Optional<Task> findById(TaskId id);
    void delete(TaskId id);
}
