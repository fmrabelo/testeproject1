/**
 * 
 */
package br.com.oappr.teste.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

/**
 * @author rabelo
 */
public class AdicionaTarefasAction
{
	private Tarefa tarefa;

	@Action(value = "adicionaTarefa", results = {@Result(name = "ok", location = "/jsp/tarefa-adicionada.jsp")})
	public String execute ()
	{
		System.out.println(".......................");
		new TarefaDAO().adiciona(tarefa);
		return "ok";
	}

	/**
	 * @return the tarefa
	 */
	public Tarefa getTarefa ()
	{
		return tarefa;
	}

	/**
	 * @param tarefa the tarefa to set
	 */
	public void setTarefa (Tarefa tarefa)
	{
		this.tarefa = tarefa;
	}

}
