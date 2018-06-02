package com.niit.dao;
import java.util.List;

import com.niit.model.EmployeeRegistration;

public interface EmpDao {
	boolean addEmp(EmployeeRegistration emp);

	boolean updateEmp(EmployeeRegistration emp);

	boolean deleteEmp(int Id);

	List<EmployeeRegistration> getEmpDetails();

	EmployeeRegistration getEmpById(int Id);

	EmployeeRegistration getEmpByName(String name);

}
