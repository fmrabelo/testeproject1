package net.learntechnology.struts2demo.persistence;

import java.util.List;
import java.util.Map;

@SuppressWarnings("unchecked")
public interface DepartmentDao
{
	public List getAllDepartments ();

	public Map getDepartmentsMap ();
}
