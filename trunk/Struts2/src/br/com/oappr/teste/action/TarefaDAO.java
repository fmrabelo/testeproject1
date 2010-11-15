/**
 * 
 */
package br.com.oappr.teste.action;

import java.util.ArrayList;
import java.util.List;

/**
 * @author rabelo
 */
public class TarefaDAO
{

	private static List<Tarefa> listTarefas = null;

	/**
	 * @param tarefa
	 */
	public void adiciona (Tarefa tarefa)
	{
		if (tarefa == null)
		{
			System.out.println("Tarefa nula, não adicionada!");
		}
		if ((this.getListTarefas() == null) || listTarefas.isEmpty())
		{
			this.setListTarefas(new ArrayList<Tarefa>(5));
		}
		listTarefas.add(tarefa);
		System.out.println("tarefa adicionada....");
	}

	/**
	 * @return
	 */
	public List<Tarefa> lista ()
	{
		return this.getListTarefas();
	}

	/**
	 * @return the listTarefas
	 */
	private List<Tarefa> getListTarefas ()
	{
		return listTarefas;
	}

	/**
	 * @param listTarefas the listTarefas to set
	 */
	private void setListTarefas (List<Tarefa> listTarefas)
	{
		TarefaDAO.listTarefas = listTarefas;
	}

	/**
	 * @param id
	 * @return
	 */
	public List<Tarefa> removeTarefa (Long id)
	{
		if (id == null)
		{
			System.out.println("Tarefa nula, não removida!");
		}
		if ((this.getListTarefas() == null) || listTarefas.isEmpty())
		{
			System.out.println("Não existe tarefa para ser removida. Lista Vazia!!");
		}
		boolean removido = false;
		for (Tarefa t : listTarefas)
		{
			if (t.getId().longValue() == id.longValue())
			{
				listTarefas.remove(t);
				removido = true;
				break;
			}
		}
		if (removido)
		{
			System.out.printf("tarefa %s removida....", id);
		}
		else
		{
			System.out.printf("tarefa %s não localizada para remoção....", id);
		}
		return this.getListTarefas();
	}
}
