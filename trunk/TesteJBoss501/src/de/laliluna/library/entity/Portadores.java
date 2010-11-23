package de.laliluna.library.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "Portadores.findAll", query = "select o from Portadores o")
public class Portadores
    implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4147145678528712781L;
	@Id
	@Column(name = "COD_PORTADOR", nullable = false)
	private Long codPortador;
	private String descricao;

	// @OneToMany(mappedBy = "portadores")
	// private List<NotasFiscaisVendaVO> notasFiscaisVendaVOList;
	// @OneToMany(mappedBy = "portadores")
	// private List<CarteiraPedidosVendaVO> carteiraPedidosVendaVOList;
	// @OneToMany(mappedBy = "portadores")
	// private List<OrdemDeProducaoVO> ordemDeProducaoVOList;

	public Portadores ()
	{
	}

	public Long getCodPortador ()
	{
		return codPortador;
	}

	public void setCodPortador (Long codPortador)
	{
		this.codPortador = codPortador;
	}

	public String getDescricao ()
	{
		return descricao;
	}

	public void setDescricao (String descricao)
	{
		this.descricao = descricao;
	}

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
	// notasFiscaisVendaVO.setPortadores(this);
	// return notasFiscaisVendaVO;
	// }
	//
	// public NotasFiscaisVendaVO removeNotasFiscaisVendaVO(NotasFiscaisVendaVO
	// notasFiscaisVendaVO) {
	// getNotasFiscaisVendaVOList().remove(notasFiscaisVendaVO);
	// notasFiscaisVendaVO.setPortadores(null);
	// return notasFiscaisVendaVO;
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
	// carteiraPedidosVendaVO.setPortadores(this);
	// return carteiraPedidosVendaVO;
	// }
	//
	// public CarteiraPedidosVendaVO
	// removeCarteiraPedidosVendaVO(CarteiraPedidosVendaVO
	// carteiraPedidosVendaVO) {
	// getCarteiraPedidosVendaVOList().remove(carteiraPedidosVendaVO);
	// carteiraPedidosVendaVO.setPortadores(null);
	// return carteiraPedidosVendaVO;
	// }
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
	// ordemDeProducaoVO.setPortadores(this);
	// return ordemDeProducaoVO;
	// }
	//
	// public OrdemDeProducaoVO removeOrdemDeProducaoVO(OrdemDeProducaoVO
	// ordemDeProducaoVO) {
	// getOrdemDeProducaoVOList().remove(ordemDeProducaoVO);
	// ordemDeProducaoVO.setPortadores(null);
	// return ordemDeProducaoVO;
	// }
}
