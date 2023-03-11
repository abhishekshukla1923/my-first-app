package com.example.lnsgr.Service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.lnsgr.Repository.RegisterRepository;
import com.example.lnsgr.entity.Register;

@Service

public class RegisterServiceImpl implements RegisterService {
	@Autowired
	private RegisterRepository registerrepo;
    

	@Override
	public Register saveRegister(Register register) {
		
				return registerrepo.save(register);
		
	}

	@Override
	public List<Register> fetchall() {
		// TODO Auto-generated method stub
		return registerrepo.findAll();
	}

}