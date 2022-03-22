package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.persistence.TodoRepository;
import com.example.demo.model.TodoEntity;


@Service
public class TodoService {
	
	@Autowired
	private TodoRepository repository;
	public String testService() {
		// creation todoentity
		TodoEntity entity = TodoEntity.builder().title("my forst todoitem").build();
		// save TodoEntity
		repository.save(entity);
		// retreive TodoEntity
		TodoEntity savedEntity = repository.findById(entity.getId()).get();
		
		System.out.println("service:testService():: entity's id : " + entity.getId());
		
		
		return savedEntity.getTitle();
	}
	

}
