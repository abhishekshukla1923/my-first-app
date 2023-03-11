package com.example.lnsgr.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.lnsgr.entity.Blogpost;

public interface ProductRepository extends JpaRepository<Blogpost ,Integer>{
	List<Blogpost> findByCategoryId(int categoryId);

}
