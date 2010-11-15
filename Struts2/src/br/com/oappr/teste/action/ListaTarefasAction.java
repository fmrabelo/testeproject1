/**
 * 
 */
package br.com.oappr.teste.action;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

/**
 * @author rabelo
 */
public class ListaTarefasAction
{
	private List<Tarefa> tarefas;

	@Action(value = "listaTarefas", results = {@Result(name = "ok", location = "/jsp/lista-tarefas.jsp")})
	public String execute ()
	{
		tarefas = new TarefaDAO().lista();
		return "ok";
	}

	@Action(value = "cadastroTarefa", results = {@Result(name = "ok", location = "/jsp/formulario_tarefas.jsp")})
	public String cadastroTarefa ()
	{
		return "ok";
	}

	public List<Tarefa> getTarefas ()
	{
		return tarefas;
	}
}
