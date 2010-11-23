package de.laliluna.library.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQuery(name = "SerieNotaFiscal.findAll", query = "select o from SerieNotaFiscal o")
@Table(name = "SERIE_NOTA_FISCAL")
public class SerieNotaFiscal
    implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 159146993020226446L;

	@Id
	@Column(nullable = false)
	private String serie;

	@Column(name = "DATA_CANCELAMENTO")
	private Timestamp dataCancelamento;
	@Column(nullable = false)
	private String descricao;
	@Column(name = "FLAG_ENTRADA", nullable = false)
	private String flagEntrada;
	@Column(name = "FLAG_SAIDA", nullable = false)
	private String flagSaida;

	// @OneToMany(mappedBy = "serieNotaFiscal")
	// private List<NotasFiscaisVendaVO> notasFiscaisVendaVOList;

	public SerieNotaFiscal ()
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

	public String getFlagEntrada ()
	{
		return flagEntrada;
	}

	public void setFlagEntrada (String flagEntrada)
	{
		this.flagEntrada = flagEntrada;
	}

	public String getFlagSaida ()
	{
		return flagSaida;
	}

	public void setFlagSaida (String flagSaida)
	{
		this.flagSaida = flagSaida;
	}

	public String getSerie ()
	{
		return serie;
	}

	public void setSerie (String serie)
	{
		this.serie = serie;
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
	// notasFiscaisVendaVO.setSerieNotaFiscal(this);
	// return notasFiscaisVendaVO;
	// }
	//
	// public NotasFiscaisVendaVO removeNotasFiscaisVendaVO(NotasFiscaisVendaVO
	// notasFiscaisVendaVO) {
	// getNotasFiscaisVendaVOList().remove(notasFiscaisVendaVO);
	// notasFiscaisVendaVO.setSerieNotaFiscal(null);
	// return notasFiscaisVendaVO;
	// }
}
