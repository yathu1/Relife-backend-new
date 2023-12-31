package com.Employee.RegisterLogin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Employee.RegisterLogin.common.ApiResponse;
import com.Employee.RegisterLogin.model.Category;
import com.Employee.RegisterLogin.service.CategoryService;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping("/category")
public class CategoryController {
	
	@Autowired
	CategoryService categoryService;
	
	@PostMapping("/create")
	public ResponseEntity<ApiResponse> createCategory(@RequestBody Category category) {
		categoryService.createCategory(category);
		return new ResponseEntity<ApiResponse>(new ApiResponse(true, "created the category"), HttpStatus.CREATED);
	}
	
	@GetMapping("/list")
	public  List<Category>  listCategory() {
		return  categoryService.listCategory();
	
	}
	
	@PostMapping("/update/{categoryId}")
	public String updateCategory(@PathVariable("categoryId") int categoryId,@RequestBody Category category) {
		
		categoryService.editCategory(categoryId,category);

		return "category Updated";
		
}}

