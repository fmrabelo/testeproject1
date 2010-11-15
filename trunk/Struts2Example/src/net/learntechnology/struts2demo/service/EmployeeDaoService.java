package net.learntechnology.struts2demo.service;

import net.learntechnology.struts2demo.persistence.EmployeeDao;
import net.learntechnology.struts2demo.persistence.EmployeeNoDBdao;
import net.learntechnology.struts2demo.vo.Employee;

import java.util.List;

@SuppressWarnings("unchecked")
public class EmployeeDaoService
    implements EmployeeService
{
	private EmployeeDao dao;

	public EmployeeDaoService ()
	{
		this.dao = new EmployeeNoDBdao();
	}

	public List getAllEmployees ()
	{
		return dao.getAllEmployees();
	}

	public void updateEmployee (Employee emp)
	{
		dao.update(emp);
	}

	public void deleteEmployee (Integer id)
	{
		dao.delete(id);
	}

	public Employee getEmployee (Integer id)
	{
		return dao.getEmployee(id);
	}

	public void insertEmployee (Employee emp)
	{
		dao.insert(emp);
	}
}
