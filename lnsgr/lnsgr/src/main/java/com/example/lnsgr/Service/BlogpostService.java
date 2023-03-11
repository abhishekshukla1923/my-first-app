package com.example.lnsgr.Service;

import java.util.List;

import com.example.lnsgr.Dto.ProductDto;
import com.example.lnsgr.entity.Blogpost;

public interface BlogpostService {
		public void  saveBlogPost(ProductDto poductdto );
	public List<ProductDto> findall();
	public ProductDto findById(int id);
	//public List<Blogpost> getBlogpostById(int categoryId);
	public List<Blogpost> getBlogpostByCategoryId(int categoryId);
	

}
