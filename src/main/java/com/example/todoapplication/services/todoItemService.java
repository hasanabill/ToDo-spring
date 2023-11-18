package com.example.todoapplication.services;

import java.time.Instant;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.todoapplication.models.todoItem;
import com.example.todoapplication.repositories.todoItemRepository;

@Service
public class todoItemService {
    @Autowired
    private todoItemRepository todoItemRepository;

    public Iterable<todoItem>getAll(){
        return todoItemRepository.findAll();
    }

    public Optional<todoItem> getById(Long id){
        return todoItemRepository.findById(id);
    }

    public todoItem save(todoItem todoItem){
        if(todoItem.getId() == null){
            todoItem.setCreatedAt(Instant.now());
        }

        todoItem.setUpdatedAt(Instant.now());

        return todoItemRepository.save(todoItem);
    }

    public void delete(todoItem todoItem){
        todoItemRepository.delete(todoItem);
    }
}
