/**
 * 
 */
package teste.xml.jaxb;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessOrder;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * @author desenvolvimento
 */
@XmlRootElement
@XmlAccessorOrder(XmlAccessOrder.ALPHABETICAL)
@XmlType(propOrder = {"sexo", "idade", "nome", "endereco"})
public class Contato
    implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -418914983534348270L;

	private String nome;
	private String sexo;
	private int idade;
	private Endereco endereco;

	/**
	 * 
	 */
	public Contato ()
	{
		// TODO Auto-generated constructor stub
	}

	public Contato (String nome, String sexo, int idade, Endereco endereco)
	{
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
		this.endereco = endereco;
	}

	/**
	 * @return the nome
	 */
	public final String getNome ()
	{
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public final void setNome (String nome)
	{
		this.nome = nome;
	}

	/**
	 * @return the sexo
	 */
	public final String getSexo ()
	{
		return sexo;
	}

	/**
	 * @param sexo the sexo to set
	 */
	public final void setSexo (String sexo)
	{
		this.sexo = sexo;
	}

	/**
	 * @return the idade
	 */
	public final int getIdade ()
	{
		return idade;
	}

	/**
	 * @param idade the idade to set
	 */
	public final void setIdade (int idade)
	{
		this.idade = idade;
	}

	/**
	 * @return the endereco
	 */
	public final Endereco getEndereco ()
	{
		return endereco;
	}

	/**
	 * @param endereco the endereco to set
	 */
	public final void setEndereco (Endereco endereco)
	{
		this.endereco = endereco;
	}

}
