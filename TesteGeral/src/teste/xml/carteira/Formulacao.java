package teste.xml.carteira;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Classe Bean utilizada no processo para gerar arquivo XML a ser enviado para
 * determinado cliente da Fertipar. Neste processo foi utilizada a API java
 * Jaxb.
 * @author desenvolvimento
 * 
 * <pre>
 * 
 *  This file was generated by the JavaTM Architecture for XML Binding(JAXB)
 *  Reference Implementation, vhudson-jaxb-ri-2.2-7
 *  See &lt;a href=&quot;http://java.sun.com/xml/jaxb&quot;&gt;http://java.sun.com/xml/jaxb&lt;/a&gt;
 *  Any modifications to this file will be lost upon recompilation of the source
 *  schema.
 *  Generated on: 2010.06.10 at 03:56:09 PM BRT
 * 
 * </pre>
 * 
 * <p>
 *         Java class for Formulacao complex type.
 *         <p>
 *         The following schema fragment specifies the expected content
 *         contained within this class.
 * 
 * <pre>
 * &lt;complexType name=&quot;Formulacao&quot;&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base=&quot;{http://www.w3.org/2001/XMLSchema}anyType&quot;&gt;
 *       &lt;sequence&gt;
 *         &lt;element name=&quot;tipo_produto&quot; type=&quot;{http://www.w3.org/2001/XMLSchema}string&quot;/&gt;
 *         &lt;element name=&quot;cod_produto&quot; type=&quot;{http://www.w3.org/2001/XMLSchema}long&quot;/&gt;
 *         &lt;element name=&quot;descricao_produto_sacaria&quot; type=&quot;{http://www.w3.org/2001/XMLSchema}string&quot;/&gt;
 *         &lt;element name=&quot;quantidade&quot; type=&quot;{http://www.w3.org/2001/XMLSchema}double&quot;/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Formulacao", propOrder = {"tipoProduto", "codProduto", "descricaoProdutoSacaria",
    "quantidade"})
public class Formulacao
{

	@XmlElement(name = "tipo_produto", required = true)
	protected String tipoProduto;
	@XmlElement(name = "cod_produto")
	protected long codProduto;
	@XmlElement(name = "descricao_produto_sacaria", required = true)
	protected String descricaoProdutoSacaria;
	protected double quantidade;

	/**
	 * Gets the value of the tipoProduto property.
	 * @return possible object is {@link String }
	 */
	public String getTipoProduto ()
	{
		return tipoProduto;
	}

	/**
	 * Sets the value of the tipoProduto property.
	 * @param value allowed object is {@link String }
	 */
	public void setTipoProduto (String value)
	{
		this.tipoProduto = value;
	}

	/**
	 * Gets the value of the codProduto property.
	 */
	public long getCodProduto ()
	{
		return codProduto;
	}

	/**
	 * Sets the value of the codProduto property.
	 */
	public void setCodProduto (long value)
	{
		this.codProduto = value;
	}

	/**
	 * Gets the value of the descricaoProdutoSacaria property.
	 * @return possible object is {@link String }
	 */
	public String getDescricaoProdutoSacaria ()
	{
		return descricaoProdutoSacaria;
	}

	/**
	 * Sets the value of the descricaoProdutoSacaria property.
	 * @param value allowed object is {@link String }
	 */
	public void setDescricaoProdutoSacaria (String value)
	{
		this.descricaoProdutoSacaria = value;
	}

	/**
	 * Gets the value of the quantidade property.
	 */
	public double getQuantidade ()
	{
		return quantidade;
	}

	/**
	 * Sets the value of the quantidade property.
	 */
	public void setQuantidade (double value)
	{
		this.quantidade = value;
	}

}
