package de.laliluna.library.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQuery(name = "EspecieNotaFiscalVO.findAll", query = "select o from EspecieNotaFiscalVO o")
@Table(name = "ESPECIE_NOTA_FISCAL")
public class EspecieNotaFiscalVO
    implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6671484801624319797L;
	@Id
	@Column(nullable = false)
	private String especie;

	@Column(name = "DATA_CANCELAMENTO")
	private Timestamp dataCancelamento;
	@Column(nullable = false)
	private String descricao;

	// @OneToMany(mappedBy = "especieNotaFiscalVO")
	// private List<NotasFiscaisVendaVO> notasFiscaisVendaVOList;

	public EspecieNotaFiscalVO ()
	{
	}

	public Timestamp getDataCancelamento ()
	{
		return dataCancelamento;
	}

	public void setDataCancelamento (Timestamp dataCancelamento)
	{
		this.dataCancelamento = dataCancelamento;
	}

	public String getDescricao ()
	{
		return descricao;
	}

	public void setDescricao (String descricao)
	{
		this.descricao = descricao;
	}

	public String getEspecie ()
	{
		return especie;
	}

	public void setEspecie (String especie)
	{
		this.especie = especie;
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
	// notasFiscaisVendaVO.setEspecieNotaFiscalVO(this);
	// return notasFiscaisVendaVO;
	// }
	//
	// public NotasFiscaisVendaVO removeNotasFiscaisVendaVO(NotasFiscaisVendaVO
	// notasFiscaisVendaVO) {
	// getNotasFiscaisVendaVOList().remove(notasFiscaisVendaVO);
	// notasFiscaisVendaVO.setEspecieNotaFiscalVO(null);
	// return notasFiscaisVendaVO;
	// }
}
