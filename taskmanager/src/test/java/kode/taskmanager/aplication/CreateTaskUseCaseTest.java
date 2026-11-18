package kode.taskmanager.aplication;

import kode.taskmanager.aplication.input.CreateTaskInput;
import kode.taskmanager.aplication.output.TaskOutput;
import kode.taskmanager.domain.Task;
import kode.taskmanager.domain.TaskRepository;
import kode.taskmanager.infrastructure.repository.ImMemoryTaskRepositoryImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.client.ExpectedCount.times;

@SpringBootTest
class CreateTaskUseCaseTest {

@Mock
    TaskRepository repository;

@InjectMocks
CreateTaskUseCase useCase;

    @Test
    void shoud_create_task_successfully(){
        var input = new CreateTaskInput("Estudar Java", Optional.of("descricao"));
        when(repository.save(any(Task.class)))
                .thenAnswer(invocation -> invocation.getArgument(0));
        TaskOutput output = useCase.execute(input);

        assertNotNull(output);
        assertNotNull(output.id());
        assertEquals("Estudar Java", output.title());
        assertEquals(Optional.of("descricao"), output.description());

        //verify(repository, times(1)).save(any(Task.class));
    }
}