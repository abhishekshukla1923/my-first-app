package com.example.lnsgr.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.lnsgr.entity.Register;

public interface RegisterRepository extends JpaRepository<Register ,Integer> {
//	public Register findByEmail(String email);
//	public Register findByEmailAndPassword(String email,String password);

}
