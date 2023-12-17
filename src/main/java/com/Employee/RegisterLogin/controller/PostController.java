package com.Employee.RegisterLogin.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Employee.RegisterLogin.common.ApiResponse;

import com.Employee.RegisterLogin.model.Post;
import com.Employee.RegisterLogin.service.PostService;



@RestController
@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping("/posts")
public class PostController {

	@Autowired
	PostService postService;
	
	 @PostMapping("/create")
	 public ResponseEntity<ApiResponse> createPost(@RequestBody Post post) {
			postService.createPost(post);
			return new ResponseEntity<ApiResponse>(new ApiResponse(true, "created the post"), HttpStatus.CREATED);
		}
}
