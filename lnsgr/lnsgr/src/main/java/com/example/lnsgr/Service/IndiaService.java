package com.example.lnsgr.Service;

import java.util.List;

import com.example.lnsgr.entity.India;

public interface IndiaService {
	public India saveIndia(India india);
	public List<India> fetchallIndia();
	public India fetchIndiabyId(int id);

}
