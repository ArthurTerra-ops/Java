package kode.taskmanager.aplication.input;

import java.util.Optional;

public record CreateTaskInput(String title, Optional<String> description ) {
}
