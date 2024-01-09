package com.gl.service;

import java.util.List;

import com.gl.entity.Employee;

public interface EmployeeService {

	public List<Employee> getAllEmployees();

	public void saveEmployee(Employee theEmployee);

	public Employee getEmployeeById(int id);

	public Employee updateEmployee(Employee theEmployee);

	public void deleteEmployeeById(int empId);
}
