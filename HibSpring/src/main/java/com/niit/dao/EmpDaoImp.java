package com.niit.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.model.EmployeeRegistration;
@Repository("empDao")
@Transactional

public class EmpDaoImp implements EmpDao{
	@Autowired
	private SessionFactory sessionFactory;
	public boolean addEmp(EmployeeRegistration emp) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(emp);
		return true;
	}

	public boolean updateEmp(EmployeeRegistration emp) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(emp);
		return true;

	}

	public boolean deleteEmp(int Id) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(getEmpById(Id));
		return true;

		
	}

	public List<EmployeeRegistration> getEmpDetails() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from EmployeeRegistration").list();
	}

	public EmployeeRegistration getEmpById(int Id) {
		// TODO Auto-generated method stub
		return (EmployeeRegistration) sessionFactory.getCurrentSession()
				.createQuery("from EmployeeRegistration where empId=" + Id).uniqueResult();
	}

	public EmployeeRegistration getEmpByName(String name) {
		// TODO Auto-generated method stub
		return (EmployeeRegistration) sessionFactory.getCurrentSession()
				.createQuery("from EmployeeRegistration where empName='" + name + "'").uniqueResult();
	}

}
