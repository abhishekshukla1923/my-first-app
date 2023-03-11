package com.example.lnsgr.Service;

import java.util.List;

import com.example.lnsgr.entity.Department;

public interface DepartmentService {
	public Department saveDepartment(Department department);
	public List<Department> fetchDepartment();

}
