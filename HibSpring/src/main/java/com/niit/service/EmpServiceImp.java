package com.niit.service;

import java.util.List;

import com.niit.dao.EmpDao;
import com.niit.model.EmployeeRegistration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class EmpServiceImp implements EmpService{

	@Autowired
	private EmpDao empDao;

	public boolean addEmp(EmployeeRegistration emp) {
		// TODO Auto-generated method stub
		if (empDao.getEmpById(emp.getEmpId()) != null) {
			return false;
		} else {
			empDao.addEmp(emp);
			return true;
		}
	}

	public boolean updateEmp(EmployeeRegistration emp) {
		// TODO Auto-generated method stub
		return empDao.updateEmp(emp);
	}

	public boolean deleteEmp(int Id) {
		// TODO Auto-generated method stub
		if(empDao.getEmpById(Id)!=null) {	
			empDao.deleteEmp(Id);
			return true;
		}
		else {
			return false;
		}
	}

	public List<EmployeeRegistration> getEmpDetails() {
		// TODO Auto-generated method stub
		return empDao.getEmpDetails();
	}

	public EmployeeRegistration getEmpById(int Id) {
		// TODO Auto-generated method stub
		return empDao.getEmpById(Id);
	}

	public EmployeeRegistration getEmpByName(String name) {
		// TODO Auto-generated method stub
		return empDao.getEmpByName(name);
	}

}
