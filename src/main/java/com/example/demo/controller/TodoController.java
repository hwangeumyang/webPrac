package com.example.demo.controller;

import java.util.List;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.dto.ResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.service.TodoService;

@RestController
@RequestMapping("todo")
public class TodoController {
	
	@Autowired
	private TodoService service;
	
	@GetMapping("test")
	public ResponseEntity<?> testTodoResponseEntity(){
		String str = service.testService();
		List<String> list = new ArrayList<>();
//		list.add("hello Todo Entity response");
		list.add(str);
		ResponseDTO<String> response = ResponseDTO.<String>builder().data(list).build();		
		return ResponseEntity.ok().body(response);
	}

}
