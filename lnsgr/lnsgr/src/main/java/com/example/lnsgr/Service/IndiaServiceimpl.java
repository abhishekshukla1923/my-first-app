package com.example.lnsgr.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lnsgr.Repository.IndiaRepository;
import com.example.lnsgr.entity.India;

@Service

public class IndiaServiceimpl implements IndiaService {
	@Autowired
	private IndiaRepository indiaRepository;

	@Override
	public India saveIndia(India india) {
		// TODO Auto-generated method stub
		return indiaRepository.save(india) ;
	}

	@Override
	public List<India> fetchallIndia() {
		// TODO Auto-generated method stub
		return indiaRepository.findAll();
	}

	@Override
	public India fetchIndiabyId(int id) {
		// TODO Auto-generated method stub
		return indiaRepository.findById(id).get();
	}

}
