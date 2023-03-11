package com.example.lnsgr.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.lnsgr.entity.Blogpost;
import com.example.lnsgr.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Integer> {
	

}
