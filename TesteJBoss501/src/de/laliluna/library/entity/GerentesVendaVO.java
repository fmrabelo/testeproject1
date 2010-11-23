package de.laliluna.library.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQuery(name = "GerentesVendaVO.findAll", query = "select o from GerentesVendaVO o")
@Table(name = "GERENTES_VENDA")
public class GerentesVendaVO
    implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3103582012401707035L;
	@Id
	@Column(name = "COD_GERENTE", nullable = false)
	private Long codGerente;

	@Column(name = "AERENDT_ULT_ALT")
	private Timestamp aerendtUltAlt;
	private String descricao;
	@Column(name = "ROWID_MTZ")
	private String rowidMtz;

	// @OneToMany(mappedBy = "gerentesVendaVO")
	// private List<OrdemDeProducaoVO> ordemDeProducaoVOList;
	// @OneToMany(mappedBy = "gerentesVendaVO")
	// private List<CarteiraPedidosVendaVO> carteiraPedidosVendaVOList;
	// @OneToMany(mappedBy = "gerentesVendaVO")
	// private List<NotasFiscaisVendaVO> notasFiscaisVendaVOList;

	public GerentesVendaVO ()
	{
	}

	public Timestamp getAerendtUltAlt ()
	{
		return aerendtUltAlt;
	}

	public void setAerendtUltAlt (Timestamp aerendtUltAlt)
	{
		this.aerendtUltAlt = aerendtUltAlt;
	}

	public Long getCodGerente ()
	{
		return codGerente;
	}

	public void setCodGerente (Long codGerente)
	{
		this.codGerente = codGerente;
	}

	public String getDescricao ()
	{
		return descricao;
	}

	public void setDescricao (String descricao)
	{
		this.descricao = descricao;
	}

	public String getRowidMtz ()
	{
		return rowidMtz;
	}

	public void setRowidMtz (String rowidMtz)
	{
		this.rowidMtz = rowidMtz;
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
	// ordemDeProducaoVO.setGerentesVendaVO(this);
	// return ordemDeProducaoVO;
	// }
	//
	// public OrdemDeProducaoVO removeOrdemDeProducaoVO(OrdemDeProducaoVO
	// ordemDeProducaoVO) {
	// getOrdemDeProducaoVOList().remove(ordemDeProducaoVO);
	// ordemDeProducaoVO.setGerentesVendaVO(null);
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
	// carteiraPedidosVendaVO.setGerentesVendaVO(this);
	// return carteiraPedidosVendaVO;
	// }
	//
	// public CarteiraPedidosVendaVO
	// removeCarteiraPedidosVendaVO(CarteiraPedidosVendaVO
	// carteiraPedidosVendaVO) {
	// getCarteiraPedidosVendaVOList().remove(carteiraPedidosVendaVO);
	// carteiraPedidosVendaVO.setGerentesVendaVO(null);
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
	// notasFiscaisVendaVO.setGerentesVendaVO(this);
	// return notasFiscaisVendaVO;
	// }
	//
	// public NotasFiscaisVendaVO removeNotasFiscaisVendaVO(NotasFiscaisVendaVO
	// notasFiscaisVendaVO) {
	// getNotasFiscaisVendaVOList().remove(notasFiscaisVendaVO);
	// notasFiscaisVendaVO.setGerentesVendaVO(null);
	// return notasFiscaisVendaVO;
	// }
}
