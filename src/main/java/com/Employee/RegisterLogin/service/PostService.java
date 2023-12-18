package com.Employee.RegisterLogin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Employee.RegisterLogin.model.Post;
import com.Employee.RegisterLogin.repository.PostRepository;


@Service
public class PostService {
	@Autowired
	PostRepository postRepo;
	
	public void createPost(Post post) {
		postRepo.save(post);
	}
}
