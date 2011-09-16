package net.learntechnology.struts2demo.action;

import java.util.List;
import java.util.Map;

import net.learntechnology.struts2demo.service.DepartmentDaoService;
import net.learntechnology.struts2demo.service.DepartmentService;
import net.learntechnology.struts2demo.service.EmployeeDaoService;
import net.learntechnology.struts2demo.service.EmployeeService;
import net.learntechnology.struts2demo.vo.Department;
import net.learntechnology.struts2demo.vo.Employee;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * The Action Class Used for CRUD Project
 * @author Ma YueFeng
 */
@SuppressWarnings("unchecked")
public class EmployeeAction
    extends ActionSupport
{

	private static final long serialVersionUID = 1L;
	private static EmployeeService empService = new EmployeeDaoService();
	private static DepartmentService deptService = new DepartmentDaoService();
	private Employee employee;
	private List<Employee> employees;
	private List<Department> departments;

	public String jasperAction ()
	{
		this.getAllEmployees();
		if ((employees != null) && employees.isEmpty())
		{
			System.out.println("Lista employee para Jasper ok: " + employees.size());
		}
		return Action.SUCCESS;
	}

	public String getAllEmployees ()
	{
		employees = empService.getAllEmployees();
		return Action.SUCCESS;
	}

	public String setUpForInsertOrUpdate ()
	{
		this.prep();
		if ((employee != null) && (employee.getEmployeeId() != null))
		{
			employee = empService.getEmployee(employee.getEmployeeId());
		}
		return Action.SUCCESS;
	}

	public String insertOrUpdate ()
	{
		if (!this.validationSuccessful())
		{
			return "input";
		}
		else
		{
			if (employee.getEmployeeId() == null)
			{
				empService.insertEmployee(employee);
			}
			else
			{
				empService.updateEmployee(employee);
			}

		}
		return Action.SUCCESS;
	}

	public String deleteEmployee ()
	{
		empService.deleteEmployee(employee.getEmployeeId());
		return Action.SUCCESS;
	}

	private void prep ()
	{
		departments = deptService.getAllDepartments();
		Map session = ActionContext.getContext().getSession();
		session.put("departments", departments);
	}

	private boolean validationSuccessful ()
	{
		String err = "? é campo obrigatório!!";
		if ((employee.getFirstName() == null) || (employee.getFirstName().trim().length() < 1))
		{
			this.addActionMessage(err.replace("?", "Primeiro Nome"));
		}
		if ((employee.getLastName() == null) || (employee.getLastName().trim().length() < 1))
		{
			this.addActionMessage(err.replace("?", "Último Nome"));
		}
		if (employee.getAge() != null)
		{
			if ((employee.getAge() > 90) || (employee.getAge() < 15))
			{
				this.addActionMessage(err.replace("?",
				    "O Campo idade deve estar entre 15 e 90 anos e"));
			}
		}
		if (this.hasActionMessages())
		{
			return false;
		}
		else
		{
			return true;
		}

	}

	public List<Employee> getEmployees ()
	{
		return employees;
	}

	public void setEmployees (List<Employee> employees)
	{
		this.employees = employees;
	}

	public Employee getEmployee ()
	{
		return employee;
	}

	public void setEmployee (Employee employee)
	{
		this.employee = employee;
	}

}
