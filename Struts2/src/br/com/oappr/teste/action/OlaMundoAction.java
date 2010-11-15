/**
 * 
 */
package br.com.oappr.teste.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

/**
 * @author rabelo
 */
public class OlaMundoAction
{
	@Action(value = "olaMundoStruts", results = {@Result(location = "/jsp/olaMundoStruts.jsp", name = "success")})
	public String execute ()
	{
		System.out.println("Executando a l�gica com Struts2");
		// return "ok";
		return com.opensymphony.xwork2.Action.SUCCESS;
	}
}
