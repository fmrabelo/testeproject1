/**
 * 
 */
package teste.xml.jaxb;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

/**
 * @author desenvolvimento
 */
@XmlType
public class Endereco
    implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1419186779063549068L;

	private String logradouro;
	private int numero;
	private String bairro;
	private String cidade;
	private String cep;
	private List<Fone> fones;

	/**
	 * 
	 */
	public Endereco ()
	{
	}

	/**
	 * @param logradouro
	 * @param numero
	 * @param bairro
	 * @param cidade
	 * @param cep
	 */
	public Endereco (String logradouro, int numero, String bairro, String cidade, String cep)
	{
		super();
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.cep = cep;
	}

	/**
	 * @return the logradouro
	 */
	public final String getLogradouro ()
	{
		return logradouro;
	}

	/**
	 * @param logradouro the logradouro to set
	 */
	public final void setLogradouro (String logradouro)
	{
		this.logradouro = logradouro;
	}

	/**
	 * @return the numero
	 */
	public final int getNumero ()
	{
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public final void setNumero (int numero)
	{
		this.numero = numero;
	}

	/**
	 * @return the bairro
	 */
	public final String getBairro ()
	{
		return bairro;
	}

	/**
	 * @param bairro the bairro to set
	 */
	public final void setBairro (String bairro)
	{
		this.bairro = bairro;
	}

	/**
	 * @return the cidade
	 */
	public final String getCidade ()
	{
		return cidade;
	}

	/**
	 * @param cidade the cidade to set
	 */
	public final void setCidade (String cidade)
	{
		this.cidade = cidade;
	}

	/**
	 * @return the cep
	 */
	public final String getCep ()
	{
		return cep;
	}

	/**
	 * @param cep the cep to set
	 */
	public final void setCep (String cep)
	{
		this.cep = cep;
	}

	/**
	 * @return the fones
	 */
	public final List<Fone> getFones ()
	{
		return fones;
	}

	/**
	 * @param fones the fones to set
	 */
	public final void setFones (List<Fone> fones)
	{
		this.fones = fones;
	}

}
