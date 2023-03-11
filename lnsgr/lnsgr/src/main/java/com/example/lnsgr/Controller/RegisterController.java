package com.example.lnsgr.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.lnsgr.Service.RegisterService;
import com.example.lnsgr.entity.Register;

@RestController
@CrossOrigin(origins ="http://localhost:4200")

public class RegisterController {
	@Autowired 
	private RegisterService registerservice;
		
	
	@PostMapping("/register")
	public  Register saveRegister( @RequestBody Register register) {
		return registerservice.saveRegister(register);
	}
}
