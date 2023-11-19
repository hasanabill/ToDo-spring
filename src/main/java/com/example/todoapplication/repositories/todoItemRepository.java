package com.example.todoapplication.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.todoapplication.models.TodoItem;

@Repository

public interface TodoItemRepository extends JpaRepository<TodoItem, Long> {

}
