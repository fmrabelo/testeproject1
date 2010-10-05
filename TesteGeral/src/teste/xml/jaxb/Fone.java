package teste.xml.jaxb;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlType;

@XmlType
public class Fone
    implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6600494921681782437L;
	private String numero;
	private String local;
	private String descricao;

	public Fone ()
	{
		super();
	}

	public Fone (String numero, String local, String descricao)
	{
		super();
		this.numero = numero;
		this.local = local;
		this.descricao = descricao;
	}

	/**
	 * @return the numero
	 */
	public final String getNumero ()
	{
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public final void setNumero (String numero)
	{
		this.numero = numero;
	}

	/**
	 * @return the local
	 */
	public final String getLocal ()
	{
		return local;
	}

	/**
	 * @param local the local to set
	 */
	public final void setLocal (String local)
	{
		this.local = local;
	}

	/**
	 * @return the descricao
	 */
	public final String getDescricao ()
	{
		return descricao;
	}

	/**
	 * @param descricao the descricao to set
	 */
	public final void setDescricao (String descricao)
	{
		this.descricao = descricao;
	}
}
