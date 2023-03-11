package com.example.lnsgr.Service;

import java.util.List;
import java.util.stream.Collectors;

//import org.apache.el.stream.Optional;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lnsgr.Dto.CategoryDto;
import com.example.lnsgr.Dto.ProductDto;
import com.example.lnsgr.Repository.CategoryRepository;
import com.example.lnsgr.Repository.ProductRepository;
import com.example.lnsgr.entity.Blogpost;
import com.example.lnsgr.entity.Category;
@Service
public class BlogpostServiceImpl implements BlogpostService {
	@Autowired 
	private ProductRepository prodo;
	@Autowired 
	private CategoryRepository categoryrepo;

	@Override
	public void saveBlogPost(ProductDto poductDTO) {
		// TODO Auto-generated method stub
		Blogpost blogpost = convertToEntity(poductDTO);
		Category category = categoryrepo.findById(poductDTO.getCategoryId()).orElse(null);
		System.out.println(category);
		blogpost.setCategory(category);
		
		 prodo.save(blogpost) ;
	}

	@Override
	public List<ProductDto> findall() {
		List<Blogpost> blog1 = prodo.findAll();
		return blog1.stream().map(this::converToDto).collect(Collectors.toList());
		
	}

	@Override
	public ProductDto findById(int id) {
		
		
		Optional<Blogpost> opt =prodo.findById(id);
		return opt.map(this::converToDto).orElse(null);
		}

	
	

	
	private Blogpost convertToEntity(ProductDto productDTO) {
        Blogpost blog = new Blogpost ();
         blog.setTitle(productDTO.getTitle());
        blog.setContent(productDTO.getContent());
         return blog;
    }
	
	
	private ProductDto converToDto(Blogpost blogpost) {
		ProductDto prodto = new ProductDto();
		CategoryDto cdto = new CategoryDto();
		
	    prodto.setTitle(blogpost.getTitle());
	    prodto.setContent(blogpost.getContent());
	    prodto.setId(blogpost.getId());
	    prodto.setCategoryId(blogpost.getCategory().getId());
	   // System.out.println(blogpost.getCategory().);
	    return prodto;
	}

	@Override
	public List<Blogpost> getBlogpostByCategoryId(int categoryId){
		// TODO Auto-generated method stub
		
		
		Optional<Category> categoryOptional =categoryrepo.findById(categoryId);
		System.out.println(prodo.findByCategoryId(categoryId));
		 
	            return prodo.findByCategoryId(categoryId);
	         
		
	}

	
	
	

}
