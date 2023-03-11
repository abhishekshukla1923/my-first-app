package com.example.lnsgr.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.lnsgr.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department , Integer> {

}
