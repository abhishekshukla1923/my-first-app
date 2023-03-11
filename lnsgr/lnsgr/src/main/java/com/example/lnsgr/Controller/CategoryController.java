package com.example.lnsgr.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.lnsgr.Dto.CategoryDto;
import com.example.lnsgr.Service.CategoryService;
import com.example.lnsgr.entity.Blogpost;
import com.example.lnsgr.entity.Category;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CategoryController {
	@Autowired
	private CategoryService categoryService;
	@PostMapping("/category")
	public Category saveCategory(@RequestBody Category category) {
		 return categoryService.saveCategory(category);
	}
	@GetMapping("/category")
	public List<Category> fetchall(){
		return categoryService.fetchall();
	}
//	@GetMapping("/category/{id1}")
//	public Category findById(@PathVariable("id1") int id) {
//		return categoryService.findbyId(id);
//	}
	
	

}
