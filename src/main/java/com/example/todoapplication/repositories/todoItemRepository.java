package com.example.todoapplication.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.todoapplication.models.todoItem;

@Repository

public interface todoItemRepository extends JpaRepository<todoItem, Long> {
    
}
