package com.devtiro.tasks.domain.dto;

import com.devtiro.tasks.domain.entities.TaskPrioriy;
import com.devtiro.tasks.domain.entities.TaskStatus;

import java.time.LocalDateTime;
import java.util.UUID;

public record TaskDto(
        UUID id,
        String title,
        String description,
        LocalDateTime dueDate,
        TaskPrioriy priority,
        TaskStatus status
) {

}
