package com.example.lnsgr.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.lnsgr.Dto.CategoryDto;
import com.example.lnsgr.Repository.CategoryRepository;
import com.example.lnsgr.entity.Blogpost;
import com.example.lnsgr.entity.Category;
@Service
public class CategoryServiceImpl implements CategoryService {
	@Autowired CategoryRepository categoryrepo;

	@Override
	public Category saveCategory(@RequestBody Category category) {
		// TODO Auto-generated method stub
		return categoryrepo.save(category);
	}

	@Override
	public List<Category> fetchall() {
		// TODO Auto-generated method stub
		return categoryrepo.findAll();
	}

	@Override
	public Category findbyId(int id) {
		// TODO Auto-generated method stub
		return categoryrepo.findById(id).get();
	}

	
	
}
