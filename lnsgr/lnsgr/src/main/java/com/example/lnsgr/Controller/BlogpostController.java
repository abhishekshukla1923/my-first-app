package com.example.lnsgr.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lnsgr.Dto.ProductDto;
import com.example.lnsgr.Repository.ProductRepository;
import com.example.lnsgr.Service.BlogpostService;
import com.example.lnsgr.entity.Blogpost;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class BlogpostController {
	@Autowired 
	private BlogpostService blogpostservice;
	
	@Autowired 
	private ProductRepository productRepository;
	
	@PostMapping("/blogpost")
	public void saveBlogPost( @RequestBody ProductDto poductdto) {
	blogpostservice.saveBlogPost(poductdto);
	}
	
	
	
		
	
	
	
	@GetMapping("/blogpost")
	public List<ProductDto> findall(){
		return blogpostservice.findall();
	}
	@GetMapping("/blogpost/{id1}")
	public ProductDto findById(@PathVariable("id1") int id) {
		return blogpostservice.findById(id);
	}
	@GetMapping("/category/{categoryId1}")
	public List<Blogpost> getBlogpostByCategoryId(@PathVariable("categoryId1") int categoryId) {
		return blogpostservice.getBlogpostByCategoryId(categoryId);
	}

}
