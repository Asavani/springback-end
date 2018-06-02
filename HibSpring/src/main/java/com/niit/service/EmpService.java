package com.niit.service;

import java.util.List;

import javax.transaction.Transactional;

import com.niit.model.EmployeeRegistration;

@Transactional
public interface EmpService {
	boolean addEmp(EmployeeRegistration emp);
	boolean updateEmp(EmployeeRegistration emp);
	boolean deleteEmp(int Id);
	List<EmployeeRegistration> getEmpDetails();
	EmployeeRegistration getEmpById(int Id);
	EmployeeRegistration getEmpByName(String name);

}
