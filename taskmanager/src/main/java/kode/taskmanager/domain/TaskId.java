package kode.taskmanager.domain;

import org.springframework.util.Assert;

import java.util.UUID;

public record TaskId(UUID id) {
    // identifica um construtor e torna o id imutável
    public TaskId {
        Assert.notNull(id, "id must not be null");
    }


    public TaskId(){
        this(UUID.randomUUID());
    }
}
