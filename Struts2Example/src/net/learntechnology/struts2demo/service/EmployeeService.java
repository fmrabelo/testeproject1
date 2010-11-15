package net.learntechnology.struts2demo.service;

import net.learntechnology.struts2demo.vo.Employee;

import java.util.List;

@SuppressWarnings("unchecked")
public interface EmployeeService
{
	public List getAllEmployees ();

	public void updateEmployee (Employee emp);

	public void deleteEmployee (Integer id);

	public Employee getEmployee (Integer id);

	public void insertEmployee (Employee emp);
}
