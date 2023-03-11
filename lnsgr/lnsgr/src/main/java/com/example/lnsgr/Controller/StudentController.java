package com.example.lnsgr.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.lnsgr.Service.IndiaService;
import com.example.lnsgr.entity.India;

@CrossOrigin(origins= "http://localhost:4200")
@RestController
public class StudentController {
	@Autowired
	private IndiaService indiaService;
	
	@PostMapping("/india")
	public  India saveIndia( @RequestBody India india) {
		return indiaService.saveIndia(india);
		
	}
	@GetMapping("/india")
	public List<India> fetchallIndia(){
		return indiaService.fetchallIndia();
		
	}
	@GetMapping("/india/{id1}")
	public India fetchIndiabyId(@PathVariable("id1") int id) {
		return indiaService.fetchIndiabyId(id);
	}

}
