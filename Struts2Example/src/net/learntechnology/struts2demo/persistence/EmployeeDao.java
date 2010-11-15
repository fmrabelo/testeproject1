package net.learntechnology.struts2demo.persistence;

import net.learntechnology.struts2demo.vo.Employee;

import java.util.List;

@SuppressWarnings("unchecked")
public interface EmployeeDao
{
	public List getAllEmployees ();

	public Employee getEmployee (Integer id);

	public void update (Employee emp);

	public void insert (Employee emp);

	public void delete (Integer id);
}
