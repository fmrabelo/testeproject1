package de.laliluna.library.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQuery(name = "AgentesVendaVO.findAll", query = "select o from AgentesVendaVO o")
@Table(name = "AGENTES_VENDA")
public class AgentesVendaVO
    implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 9156419181325631477L;
	private String cgc;
	@Id
	@Column(name = "COD_AGENTE", nullable = false)
	private Long codAgente;

	private String contato;
	@Column(name = "CONTA_CREDITO")
	private Long contaCredito;
	@Column(name = "CONTA_DEBITO")
	private Long contaDebito;
	private String descricao;
	@Column(name = "NOME_FANTASIA")
	private String nomeFantasia;
	@Column(name = "ROWID_MTZ")
	private String rowidMtz;
	@Column(name = "TIPO_PESSOA")
	private String tipoPessoa;

	// @ManyToOne
	// @JoinColumn(name = "COD_PARCEIRO", referencedColumnName = "COD_PARCEIRO")
	// private ParceirosVO parceirosVO;

	// @OneToMany(mappedBy = "agentesVendaVO")
	// private List<OrdemDeProducaoVO> ordemDeProducaoVOList;
	//	
	// @OneToMany(mappedBy = "agentesVendaVO")
	// private List<CarteiraPedidosVendaVO> carteiraPedidosVendaVOList;
	//	
	// @OneToMany(mappedBy = "agentesVendaVO")
	// private List<NotasFiscaisVendaVO> notasFiscaisVendaVOList;

	public AgentesVendaVO ()
	{
	}

	public String getCgc ()
	{
		return cgc;
	}

	public void setCgc (String cgc)
	{
		this.cgc = cgc;
	}

	public Long getCodAgente ()
	{
		return codAgente;
	}

	public void setCodAgente (Long codAgente)
	{
		this.codAgente = codAgente;
	}

	public String getContato ()
	{
		return contato;
	}

	public void setContato (String contato)
	{
		this.contato = contato;
	}

	public Long getContaCredito ()
	{
		return contaCredito;
	}

	public void setContaCredito (Long contaCredito)
	{
		this.contaCredito = contaCredito;
	}

	public Long getContaDebito ()
	{
		return contaDebito;
	}

	public void setContaDebito (Long contaDebito)
	{
		this.contaDebito = contaDebito;
	}

	public String getDescricao ()
	{
		return descricao;
	}

	public void setDescricao (String descricao)
	{
		this.descricao = descricao;
	}

	public String getNomeFantasia ()
	{
		return nomeFantasia;
	}

	public void setNomeFantasia (String nomeFantasia)
	{
		this.nomeFantasia = nomeFantasia;
	}

	public String getRowidMtz ()
	{
		return rowidMtz;
	}

	public void setRowidMtz (String rowidMtz)
	{
		this.rowidMtz = rowidMtz;
	}

	public String getTipoPessoa ()
	{
		return tipoPessoa;
	}

	public void setTipoPessoa (String tipoPessoa)
	{
		this.tipoPessoa = tipoPessoa;
	}
	//
	// public List<OrdemDeProducaoVO> getOrdemDeProducaoVOList() {
	// return ordemDeProducaoVOList;
	// }
	//
	// public void setOrdemDeProducaoVOList(List<OrdemDeProducaoVO>
	// ordemDeProducaoVOList) {
	// this.ordemDeProducaoVOList = ordemDeProducaoVOList;
	// }
	//
	// public OrdemDeProducaoVO addOrdemDeProducaoVO(OrdemDeProducaoVO
	// ordemDeProducaoVO) {
	// getOrdemDeProducaoVOList().add(ordemDeProducaoVO);
	// ordemDeProducaoVO.setAgentesVendaVO(this);
	// return ordemDeProducaoVO;
	// }
	//
	// public OrdemDeProducaoVO removeOrdemDeProducaoVO(OrdemDeProducaoVO
	// ordemDeProducaoVO) {
	// getOrdemDeProducaoVOList().remove(ordemDeProducaoVO);
	// ordemDeProducaoVO.setAgentesVendaVO(null);
	// return ordemDeProducaoVO;
	// }
	//
	// public ParceirosVO getParceirosVO() {
	// return parceirosVO;
	// }
	//
	// public void setParceirosVO(ParceirosVO parceirosVO) {
	// this.parceirosVO = parceirosVO;
	// }
	//
	// public List<CarteiraPedidosVendaVO> getCarteiraPedidosVendaVOList() {
	// return carteiraPedidosVendaVOList;
	// }
	//
	// public void setCarteiraPedidosVendaVOList(List<CarteiraPedidosVendaVO>
	// carteiraPedidosVendaVOList) {
	// this.carteiraPedidosVendaVOList = carteiraPedidosVendaVOList;
	// }
	//
	// public CarteiraPedidosVendaVO
	// addCarteiraPedidosVendaVO(CarteiraPedidosVendaVO carteiraPedidosVendaVO)
	// {
	// getCarteiraPedidosVendaVOList().add(carteiraPedidosVendaVO);
	// carteiraPedidosVendaVO.setAgentesVendaVO(this);
	// return carteiraPedidosVendaVO;
	// }
	//
	// public CarteiraPedidosVendaVO
	// removeCarteiraPedidosVendaVO(CarteiraPedidosVendaVO
	// carteiraPedidosVendaVO) {
	// getCarteiraPedidosVendaVOList().remove(carteiraPedidosVendaVO);
	// carteiraPedidosVendaVO.setAgentesVendaVO(null);
	// return carteiraPedidosVendaVO;
	// }
	//
	// public List<NotasFiscaisVendaVO> getNotasFiscaisVendaVOList() {
	// return notasFiscaisVendaVOList;
	// }
	//
	// public void setNotasFiscaisVendaVOList(List<NotasFiscaisVendaVO>
	// notasFiscaisVendaVOList) {
	// this.notasFiscaisVendaVOList = notasFiscaisVendaVOList;
	// }
	//
	// public NotasFiscaisVendaVO addNotasFiscaisVendaVO(NotasFiscaisVendaVO
	// notasFiscaisVendaVO) {
	// getNotasFiscaisVendaVOList().add(notasFiscaisVendaVO);
	// notasFiscaisVendaVO.setAgentesVendaVO(this);
	// return notasFiscaisVendaVO;
	// }
	//
	// public NotasFiscaisVendaVO removeNotasFiscaisVendaVO(NotasFiscaisVendaVO
	// notasFiscaisVendaVO) {
	// getNotasFiscaisVendaVOList().remove(notasFiscaisVendaVO);
	// notasFiscaisVendaVO.setAgentesVendaVO(null);
	// return notasFiscaisVendaVO;
	// }
}
