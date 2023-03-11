package com.example.lnsgr.Service;

import java.util.List;

//import com.example.lnsgr.Dto.CategoryDto;
import com.example.lnsgr.entity.Blogpost;
import com.example.lnsgr.entity.Category;

public interface CategoryService {
	public Category saveCategory(Category category);
	public List<Category> fetchall();
	public Category findbyId(int id);
	

}
