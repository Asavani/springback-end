package com.niit.HibSpring;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringRunner;

import com.niit.config.ApplicationContext;
import com.niit.model.EmployeeRegistration;
import com.niit.service.EmpService;
@RunWith(SpringRunner.class)
@SpringJUnitConfig(classes = ApplicationContext.class)
public class Main {

	@Autowired
	private EmpService employeeService;
	EmployeeRegistration emp;
	@Test
	public void test() {
		EmployeeRegistration emp1 = new EmployeeRegistration();
		emp1.setEmpId(2);
		emp1.setEmpName("Sunil");
		emp1.setEmpEmailId("asavani.sunil@gmail.com");
		emp1.setEmpPassword("sunil@123");
		emp1.setRole("Trainer");
		boolean res=employeeService.addEmp(emp1);
		assertEquals("Insert",true,res);
	}
	

}
