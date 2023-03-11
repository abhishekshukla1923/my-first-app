package com.example.lnsgr.Service;

import java.util.List;

import com.example.lnsgr.entity.Register;

public interface RegisterService {
	public Register saveRegister(Register register);
	public List<Register> fetchall();
	//public Register fetchRegisterByEmail(String email);
	//public Register fetchRegisterByEmailAndPassword(String email,String password);

}
