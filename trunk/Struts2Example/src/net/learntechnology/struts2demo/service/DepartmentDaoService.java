package net.learntechnology.struts2demo.service;

import net.learntechnology.struts2demo.persistence.DepartmentDao;
import net.learntechnology.struts2demo.persistence.DepartmentNoDBdao;

import java.util.List;

@SuppressWarnings("unchecked")
public class DepartmentDaoService
    implements DepartmentService
{
	private DepartmentDao dao;

	public DepartmentDaoService ()
	{
		this.dao = new DepartmentNoDBdao();
	}

	public List getAllDepartments ()
	{
		return dao.getAllDepartments();
	}
}
