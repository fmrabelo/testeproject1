/**
 * 
 */
package br.com.oappr.teste.action;

import java.util.Calendar;

/**
 * @author rabelo
 */
public class Tarefa
{

	private Long id;
	private String descricao;
	private boolean finalizado;
	private Calendar dataFinalizacao;

	/**
	 * 
	 */
	public Tarefa ()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the id
	 */
	public Long getId ()
	{
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId (Long id)
	{
		this.id = id;
	}

	/**
	 * @return the descricao
	 */
	public String getDescricao ()
	{
		return descricao;
	}

	/**
	 * @param descricao the descricao to set
	 */
	public void setDescricao (String descricao)
	{
		this.descricao = descricao;
	}

	/**
	 * @return the finalizado
	 */
	public boolean isFinalizado ()
	{
		return finalizado;
	}

	/**
	 * @param finalizado the finalizado to set
	 */
	public void setFinalizado (boolean finalizado)
	{
		this.finalizado = finalizado;
	}

	/**
	 * @return the dataFinalizacao
	 */
	public Calendar getDataFinalizacao ()
	{
		return dataFinalizacao;
	}

	/**
	 * @param dataFinalizacao the dataFinalizacao to set
	 */
	public void setDataFinalizacao (Calendar dataFinalizacao)
	{
		this.dataFinalizacao = dataFinalizacao;
	}
}
