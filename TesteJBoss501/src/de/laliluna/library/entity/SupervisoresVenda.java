package de.laliluna.library.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQuery(name = "SupervisoresVenda.findAll", query = "select o from SupervisoresVenda o")
@Table(name = "SUPERVISORES_VENDA")
public class SupervisoresVenda
    implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3587334741848623157L;
	@Id
	@Column(name = "COD_SUPERVISOR", nullable = false)
	private Long codSupervisor;
	@Column(name = "COD_SUPERINTENDENTE")
	private Long codSuperintendente;
	private String descricao;

	// @OneToMany(mappedBy = "supervisoresVenda")
	// private List<OrdemDeProducaoVO> ordemDeProducaoVOList;
	// @OneToMany(mappedBy = "supervisoresVenda")
	// private List<CarteiraPedidosVendaVO> carteiraPedidosVendaVOList;
	// @OneToMany(mappedBy = "supervisoresVenda")
	// private List<NotasFiscaisVendaVO> notasFiscaisVendaVOList;

	public SupervisoresVenda ()
	{
	}

	public Long getCodSuperintendente ()
	{
		return codSuperintendente;
	}

	public void setCodSuperintendente (Long codSuperintendente)
	{
		this.codSuperintendente = codSuperintendente;
	}

	public Long getCodSupervisor ()
	{
		return codSupervisor;
	}

	public void setCodSupervisor (Long codSupervisor)
	{
		this.codSupervisor = codSupervisor;
	}

	public String getDescricao ()
	{
		return descricao;
	}

	public void setDescricao (String descricao)
	{
		this.descricao = descricao;
	}

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
	// ordemDeProducaoVO.setSupervisoresVenda(this);
	// return ordemDeProducaoVO;
	// }
	//
	// public OrdemDeProducaoVO removeOrdemDeProducaoVO(OrdemDeProducaoVO
	// ordemDeProducaoVO) {
	// getOrdemDeProducaoVOList().remove(ordemDeProducaoVO);
	// ordemDeProducaoVO.setSupervisoresVenda(null);
	// return ordemDeProducaoVO;
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
	// carteiraPedidosVendaVO.setSupervisoresVenda(this);
	// return carteiraPedidosVendaVO;
	// }
	//
	// public CarteiraPedidosVendaVO
	// removeCarteiraPedidosVendaVO(CarteiraPedidosVendaVO
	// carteiraPedidosVendaVO) {
	// getCarteiraPedidosVendaVOList().remove(carteiraPedidosVendaVO);
	// carteiraPedidosVendaVO.setSupervisoresVenda(null);
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
	// notasFiscaisVendaVO.setSupervisoresVenda(this);
	// return notasFiscaisVendaVO;
	// }
	//
	// public NotasFiscaisVendaVO removeNotasFiscaisVendaVO(NotasFiscaisVendaVO
	// notasFiscaisVendaVO) {
	// getNotasFiscaisVendaVOList().remove(notasFiscaisVendaVO);
	// notasFiscaisVendaVO.setSupervisoresVenda(null);
	// return notasFiscaisVendaVO;
	// }
}
