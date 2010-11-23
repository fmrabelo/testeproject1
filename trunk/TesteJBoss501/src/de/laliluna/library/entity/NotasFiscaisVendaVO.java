package de.laliluna.library.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import de.laliluna.library.entity.pk.NotasFiscaisVendaVOPK;

@Entity
@NamedQuery(name = "NotasFiscaisVendaVO.findAll", query = "select o from NotasFiscaisVendaVO o")
@Table(name = "NOTAS_FISCAIS_VENDA")
@IdClass(NotasFiscaisVendaVOPK.class)
public class NotasFiscaisVendaVO
    implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3685642194395160710L;
	@Id
	@Column(name = "MODELO_NF", nullable = false)
	private String modeloNf;
	@Id
	@Column(name = "COD_FILIAL", nullable = false)
	private Long codFilial;
	@Id
	@Column(nullable = false, insertable = true, updatable = true)
	private String especie;
	@Id
	@Column(name = "NUMERO_NF", nullable = false)
	private Long numeroNf;
	@Id
	@Column(nullable = false)
	private String serie;

	@Column(name = "ALIQUOTA_ICMS")
	private Double aliquotaIcms;
	@Column(name = "AUD_DATA_HORA")
	private Timestamp audDataHora;
	@Column(name = "AUD_USUARIO_BD")
	private String audUsuarioBd;
	@Column(name = "AUD_USUARIO_SO")
	private String audUsuarioSo;
	@Column(name = "BASE_CALCULO_ICMS")
	private Double baseCalculoIcms;
	@Column(name = "BASE_CALCULO_IPI")
	private Double baseCalculoIpi;
	@Column(name = "CONDICAO_PAGAMENTO")
	private String condicaoPagamento;
	@Column(name = "DATA_GERACAO_NSU")
	private Timestamp dataGeracaoNsu;
	@Column(name = "DATA_IMPRESSAO_NSU")
	private Timestamp dataImpressaoNsu;
	@Column(name = "DESC_INDUST_REMESSA")
	private String descIndustRemessa;
	@Column(name = "DISPOSITIVO_LEGAL")
	private String dispositivoLegal;
	@Column(name = "DT_EMISSAO")
	private Timestamp dtEmissao;
	@Column(name = "DT_SAIDA")
	private Timestamp dtSaida;
	@Column(name = "FLAG_ESTOQUE")
	private String flagEstoque;
	@Column(name = "FLAG_PORTO_FABRICA")
	private String flagPortoFabrica;
	@Column(name = "FLAG_RENTABILIDADE", nullable = false)
	private String flagRentabilidade;
	@Column(name = "FRETE_PRINCIPAL")
	private Double fretePrincipal;
	@Column(name = "FRETE_SECUNDARIO")
	private Double freteSecundario;
	@Column(name = "FRETE_TRANSBORDO")
	private Double freteTransbordo;
	@Column(name = "HORA_SAIDA")
	private String horaSaida;
	@Column(name = "MARCA_SACARIA")
	private String marcaSacaria;
	@Column(name = "NRO_DD_VENCIMENTO")
	private Long nroDdVencimento;
	@Column(name = "NRO_LOTE")
	private Long nroLote;
	@Column(name = "NUMERO_NSU")
	private Long numeroNsu;
	@Column(name = "OBS_INDUST_REMESSA")
	private String obsIndustRemessa;
	@Column(name = "OBS_LIVROS_FISCAIS")
	private String obsLivrosFiscais;
	@Column(name = "PLACA_VEICULO")
	private String placaVeiculo;
	@Column(name = "SITUACAO_NOTA")
	private String situacaoNota;
	@Column(name = "TIPO_EMBALAGEM")
	private String tipoEmbalagem;
	@Column(name = "TIPO_FRETE", nullable = false)
	private String tipoFrete;
	@Column(name = "TIPO_FRETE_CIF")
	private String tipoFreteCif;
	@Column(name = "TIPO_TRANSPORTE", nullable = false)
	private String tipoTransporte;
	@Column(name = "UF_PLACA_VEICULO")
	private String ufPlacaVeiculo;
	@Column(name = "VALOR_CONTABIL")
	private Double valorContabil;
	@Column(name = "VALOR_ICMS")
	private Double valorIcms;
	@Column(name = "VALOR_IPI")
	private Double valorIpi;
	@Column(name = "VALOR_ISENTO_ICMS")
	private Double valorIsentoIcms;
	@Column(name = "VALOR_ISENTO_IPI")
	private Double valorIsentoIpi;
	@Column(name = "VALOR_OUTROS_ICMS")
	private Double valorOutrosIcms;
	@Column(name = "VALOR_OUTROS_IPI")
	private Double valorOutrosIpi;
	@Column(name = "VALOR_SEGUNDA_NATUREZA")
	private Double valorSegundaNatureza;
	@Column(name = "VALOR_TRANSF_SALDO")
	private Double valorTransfSaldo;

	// @ManyToOne
	// @JoinColumn(name = "COD_CLIENTE", referencedColumnName = "COD_PARCEIRO")
	// private ParceirosVO parceirosVO;
	//	
	// @ManyToOne
	// @JoinColumn(name = "COD_CLIENTE_VENDEDOR", referencedColumnName =
	// "COD_PARCEIRO")
	// private ParceirosVO parceirosVO1;
	//	
	// @ManyToOne
	// @JoinColumn(name = "COD_CLIENTE_FIADOR", referencedColumnName =
	// "COD_PARCEIRO")
	// private ParceirosVO parceirosVO2;
	//	
	@ManyToOne
	@JoinColumn(name = "COD_FILIAL_FRETE", referencedColumnName = "COD_FILIAL")
	private FiliaisVO filiaisFreteVO;

	// @ManyToOne
	// @JoinColumn(name = "COD_PORTADOR", referencedColumnName = "COD_PORTADOR")
	// private Portadores portadores;
	//	
	@ManyToOne
	@JoinColumn(name = "COD_FILIAL", insertable = false, updatable = false)
	private FiliaisVO filiaisVO;

	// @ManyToOne
	// @JoinColumn(name = "SERIE", referencedColumnName = "SERIE")
	// private SerieNotaFiscal serieNotaFiscal;
	//	
	@ManyToOne
	@JoinColumns({
	    @JoinColumn(name = "COD_FILIAL", referencedColumnName = "COD_FILIAL", insertable = false, updatable = false),
	    @JoinColumn(name = "NRO_SEQ_PEDIDO", referencedColumnName = "NRO_SEQ_PEDIDO", insertable = false, updatable = false),
	    @JoinColumn(name = "ANO_PEDIDO", referencedColumnName = "ANO_PEDIDO", insertable = false, updatable = false)})
	private CarteiraPedidosVendaVO carteiraPedidosVendaVO;

	//	
	// @ManyToOne
	// @JoinColumn(name = "COD_GERENTE", referencedColumnName = "COD_GERENTE")
	// private GerentesVendaVO gerentesVendaVO;
	//	
	// @ManyToOne
	// @JoinColumn(name = "ESPECIE", referencedColumnName = "ESPECIE")
	// private EspecieNotaFiscalVO especieNotaFiscalVO;
	//	
	// @ManyToOne
	// @JoinColumn(name = "COD_AGENTE", referencedColumnName = "COD_AGENTE")
	// private AgentesVendaVO agentesVendaVO;
	//	
	// @ManyToOne
	// @JoinColumn(name = "COD_TIPO_NOTA", referencedColumnName =
	// "COD_TIPO_NOTA")
	// private TiposNotasFiscais tiposNotasFiscais;
	//	
	@ManyToOne
	@JoinColumns({
	    @JoinColumn(name = "COD_FILIAL", referencedColumnName = "COD_FILIAL", insertable = false, updatable = false),
	    @JoinColumn(name = "NRO_ORDEM_PRODUCAO", referencedColumnName = "NRO_ORDEM_PRODUCAO", insertable = false, updatable = false)})
	private OrdemDeProducaoVO ordemDeProducaoVO;

	// @ManyToOne
	// @JoinColumn(name = "COD_SUPERVISOR", referencedColumnName =
	// "COD_SUPERVISOR")
	// private SupervisoresVenda supervisoresVenda;
	//	
	// @ManyToOne
	// @JoinColumn(name = "COD_TRANSPORTADORA", referencedColumnName =
	// "COD_PARCEIRO")
	// private ParceirosVO parceirosVO3;

	public NotasFiscaisVendaVO ()
	{
	}

	public Double getAliquotaIcms ()
	{
		return aliquotaIcms;
	}

	public void setAliquotaIcms (Double aliquotaIcms)
	{
		this.aliquotaIcms = aliquotaIcms;
	}

	public Timestamp getAudDataHora ()
	{
		return audDataHora;
	}

	public void setAudDataHora (Timestamp audDataHora)
	{
		this.audDataHora = audDataHora;
	}

	public String getAudUsuarioBd ()
	{
		return audUsuarioBd;
	}

	public void setAudUsuarioBd (String audUsuarioBd)
	{
		this.audUsuarioBd = audUsuarioBd;
	}

	public String getAudUsuarioSo ()
	{
		return audUsuarioSo;
	}

	public void setAudUsuarioSo (String audUsuarioSo)
	{
		this.audUsuarioSo = audUsuarioSo;
	}

	public Double getBaseCalculoIcms ()
	{
		return baseCalculoIcms;
	}

	public void setBaseCalculoIcms (Double baseCalculoIcms)
	{
		this.baseCalculoIcms = baseCalculoIcms;
	}

	public Double getBaseCalculoIpi ()
	{
		return baseCalculoIpi;
	}

	public void setBaseCalculoIpi (Double baseCalculoIpi)
	{
		this.baseCalculoIpi = baseCalculoIpi;
	}

	public Long getCodFilial ()
	{
		return codFilial;
	}

	public void setCodFilial (Long codFilial)
	{
		this.codFilial = codFilial;
	}

	public String getCondicaoPagamento ()
	{
		return condicaoPagamento;
	}

	public void setCondicaoPagamento (String condicaoPagamento)
	{
		this.condicaoPagamento = condicaoPagamento;
	}

	public Timestamp getDataGeracaoNsu ()
	{
		return dataGeracaoNsu;
	}

	public void setDataGeracaoNsu (Timestamp dataGeracaoNsu)
	{
		this.dataGeracaoNsu = dataGeracaoNsu;
	}

	public Timestamp getDataImpressaoNsu ()
	{
		return dataImpressaoNsu;
	}

	public void setDataImpressaoNsu (Timestamp dataImpressaoNsu)
	{
		this.dataImpressaoNsu = dataImpressaoNsu;
	}

	public String getDescIndustRemessa ()
	{
		return descIndustRemessa;
	}

	public void setDescIndustRemessa (String descIndustRemessa)
	{
		this.descIndustRemessa = descIndustRemessa;
	}

	public String getDispositivoLegal ()
	{
		return dispositivoLegal;
	}

	public void setDispositivoLegal (String dispositivoLegal)
	{
		this.dispositivoLegal = dispositivoLegal;
	}

	public Timestamp getDtEmissao ()
	{
		return dtEmissao;
	}

	public void setDtEmissao (Timestamp dtEmissao)
	{
		this.dtEmissao = dtEmissao;
	}

	public Timestamp getDtSaida ()
	{
		return dtSaida;
	}

	public void setDtSaida (Timestamp dtSaida)
	{
		this.dtSaida = dtSaida;
	}

	public String getEspecie ()
	{
		return especie;
	}

	public void setEspecie (String especie)
	{
		this.especie = especie;
	}

	public String getFlagEstoque ()
	{
		return flagEstoque;
	}

	public void setFlagEstoque (String flagEstoque)
	{
		this.flagEstoque = flagEstoque;
	}

	public String getFlagPortoFabrica ()
	{
		return flagPortoFabrica;
	}

	public void setFlagPortoFabrica (String flagPortoFabrica)
	{
		this.flagPortoFabrica = flagPortoFabrica;
	}

	public String getFlagRentabilidade ()
	{
		return flagRentabilidade;
	}

	public void setFlagRentabilidade (String flagRentabilidade)
	{
		this.flagRentabilidade = flagRentabilidade;
	}

	public Double getFretePrincipal ()
	{
		return fretePrincipal;
	}

	public void setFretePrincipal (Double fretePrincipal)
	{
		this.fretePrincipal = fretePrincipal;
	}

	public Double getFreteSecundario ()
	{
		return freteSecundario;
	}

	public void setFreteSecundario (Double freteSecundario)
	{
		this.freteSecundario = freteSecundario;
	}

	public Double getFreteTransbordo ()
	{
		return freteTransbordo;
	}

	public void setFreteTransbordo (Double freteTransbordo)
	{
		this.freteTransbordo = freteTransbordo;
	}

	public String getHoraSaida ()
	{
		return horaSaida;
	}

	public void setHoraSaida (String horaSaida)
	{
		this.horaSaida = horaSaida;
	}

	public String getMarcaSacaria ()
	{
		return marcaSacaria;
	}

	public void setMarcaSacaria (String marcaSacaria)
	{
		this.marcaSacaria = marcaSacaria;
	}

	public String getModeloNf ()
	{
		return modeloNf;
	}

	public void setModeloNf (String modeloNf)
	{
		this.modeloNf = modeloNf;
	}

	public Long getNroDdVencimento ()
	{
		return nroDdVencimento;
	}

	public void setNroDdVencimento (Long nroDdVencimento)
	{
		this.nroDdVencimento = nroDdVencimento;
	}

	public Long getNroLote ()
	{
		return nroLote;
	}

	public void setNroLote (Long nroLote)
	{
		this.nroLote = nroLote;
	}

	public Long getNumeroNf ()
	{
		return numeroNf;
	}

	public void setNumeroNf (Long numeroNf)
	{
		this.numeroNf = numeroNf;
	}

	public Long getNumeroNsu ()
	{
		return numeroNsu;
	}

	public void setNumeroNsu (Long numeroNsu)
	{
		this.numeroNsu = numeroNsu;
	}

	public String getObsIndustRemessa ()
	{
		return obsIndustRemessa;
	}

	public void setObsIndustRemessa (String obsIndustRemessa)
	{
		this.obsIndustRemessa = obsIndustRemessa;
	}

	public String getObsLivrosFiscais ()
	{
		return obsLivrosFiscais;
	}

	public void setObsLivrosFiscais (String obsLivrosFiscais)
	{
		this.obsLivrosFiscais = obsLivrosFiscais;
	}

	public String getPlacaVeiculo ()
	{
		return placaVeiculo;
	}

	public void setPlacaVeiculo (String placaVeiculo)
	{
		this.placaVeiculo = placaVeiculo;
	}

	public String getSerie ()
	{
		return serie;
	}

	public void setSerie (String serie)
	{
		this.serie = serie;
	}

	public String getSituacaoNota ()
	{
		return situacaoNota;
	}

	public void setSituacaoNota (String situacaoNota)
	{
		this.situacaoNota = situacaoNota;
	}

	public String getTipoEmbalagem ()
	{
		return tipoEmbalagem;
	}

	public void setTipoEmbalagem (String tipoEmbalagem)
	{
		this.tipoEmbalagem = tipoEmbalagem;
	}

	public String getTipoFrete ()
	{
		return tipoFrete;
	}

	public void setTipoFrete (String tipoFrete)
	{
		this.tipoFrete = tipoFrete;
	}

	public String getTipoFreteCif ()
	{
		return tipoFreteCif;
	}

	public void setTipoFreteCif (String tipoFreteCif)
	{
		this.tipoFreteCif = tipoFreteCif;
	}

	public String getTipoTransporte ()
	{
		return tipoTransporte;
	}

	public void setTipoTransporte (String tipoTransporte)
	{
		this.tipoTransporte = tipoTransporte;
	}

	public String getUfPlacaVeiculo ()
	{
		return ufPlacaVeiculo;
	}

	public void setUfPlacaVeiculo (String ufPlacaVeiculo)
	{
		this.ufPlacaVeiculo = ufPlacaVeiculo;
	}

	public Double getValorContabil ()
	{
		return valorContabil;
	}

	public void setValorContabil (Double valorContabil)
	{
		this.valorContabil = valorContabil;
	}

	public Double getValorIcms ()
	{
		return valorIcms;
	}

	public void setValorIcms (Double valorIcms)
	{
		this.valorIcms = valorIcms;
	}

	public Double getValorIpi ()
	{
		return valorIpi;
	}

	public void setValorIpi (Double valorIpi)
	{
		this.valorIpi = valorIpi;
	}

	public Double getValorIsentoIcms ()
	{
		return valorIsentoIcms;
	}

	public void setValorIsentoIcms (Double valorIsentoIcms)
	{
		this.valorIsentoIcms = valorIsentoIcms;
	}

	public Double getValorIsentoIpi ()
	{
		return valorIsentoIpi;
	}

	public void setValorIsentoIpi (Double valorIsentoIpi)
	{
		this.valorIsentoIpi = valorIsentoIpi;
	}

	public Double getValorOutrosIcms ()
	{
		return valorOutrosIcms;
	}

	public void setValorOutrosIcms (Double valorOutrosIcms)
	{
		this.valorOutrosIcms = valorOutrosIcms;
	}

	public Double getValorOutrosIpi ()
	{
		return valorOutrosIpi;
	}

	public void setValorOutrosIpi (Double valorOutrosIpi)
	{
		this.valorOutrosIpi = valorOutrosIpi;
	}

	public Double getValorSegundaNatureza ()
	{
		return valorSegundaNatureza;
	}

	public void setValorSegundaNatureza (Double valorSegundaNatureza)
	{
		this.valorSegundaNatureza = valorSegundaNatureza;
	}

	public Double getValorTransfSaldo ()
	{
		return valorTransfSaldo;
	}

	public void setValorTransfSaldo (Double valorTransfSaldo)
	{
		this.valorTransfSaldo = valorTransfSaldo;
	}

	//
	// public ParceirosVO getParceirosVO ()
	// {
	// return parceirosVO;
	// }
	//
	// public void setParceirosVO (ParceirosVO parceirosVO)
	// {
	// this.parceirosVO = parceirosVO;
	// }
	//
	// public ParceirosVO getParceirosVO1 ()
	// {
	// return parceirosVO1;
	// }
	//
	// public void setParceirosVO1 (ParceirosVO parceirosVO1)
	// {
	// this.parceirosVO1 = parceirosVO1;
	// }
	//
	// public ParceirosVO getParceirosVO2 ()
	// {
	// return parceirosVO2;
	// }
	//
	// public void setParceirosVO2 (ParceirosVO parceirosVO2)
	// {
	// this.parceirosVO2 = parceirosVO2;
	// }
	//
	// public Portadores getPortadores ()
	// {
	// return portadores;
	// }
	//
	// public void setPortadores (Portadores portadores)
	// {
	// this.portadores = portadores;
	// }
	//
	public FiliaisVO getFiliaisVO ()
	{
		return filiaisVO;
	}

	public void setFiliaisVO (FiliaisVO filiaisVO)
	{
		this.filiaisVO = filiaisVO;
	}

	public FiliaisVO getFiliaisFreteVO ()
	{
		return filiaisFreteVO;
	}

	public void setFiliaisFreteVO (FiliaisVO filiaisFreteVO)
	{
		this.filiaisFreteVO = filiaisFreteVO;
	}

	// public SerieNotaFiscal getSerieNotaFiscal ()
	// {
	// return serieNotaFiscal;
	// }
	//
	// public void setSerieNotaFiscal (SerieNotaFiscal serieNotaFiscal)
	// {
	// this.serieNotaFiscal = serieNotaFiscal;
	// }
	//
	public CarteiraPedidosVendaVO getCarteiraPedidosVendaVO ()
	{
		return carteiraPedidosVendaVO;
	}

	public void setCarteiraPedidosVendaVO (CarteiraPedidosVendaVO carteiraPedidosVendaVO)
	{
		this.carteiraPedidosVendaVO = carteiraPedidosVendaVO;
	}

	//
	// public GerentesVendaVO getGerentesVendaVO ()
	// {
	// return gerentesVendaVO;
	// }
	//
	// public void setGerentesVendaVO (GerentesVendaVO gerentesVendaVO)
	// {
	// this.gerentesVendaVO = gerentesVendaVO;
	// }
	//
	// public EspecieNotaFiscalVO getEspecieNotaFiscalVO ()
	// {
	// return especieNotaFiscalVO;
	// }
	//
	// public void setEspecieNotaFiscalVO (EspecieNotaFiscalVO
	// especieNotaFiscalVO)
	// {
	// this.especieNotaFiscalVO = especieNotaFiscalVO;
	// }
	//
	// public AgentesVendaVO getAgentesVendaVO ()
	// {
	// return agentesVendaVO;
	// }
	//
	// public void setAgentesVendaVO (AgentesVendaVO agentesVendaVO)
	// {
	// this.agentesVendaVO = agentesVendaVO;
	// }
	//
	// public TiposNotasFiscais getTiposNotasFiscais ()
	// {
	// return tiposNotasFiscais;
	// }
	//
	// public void setTiposNotasFiscais (TiposNotasFiscais tiposNotasFiscais)
	// {
	// this.tiposNotasFiscais = tiposNotasFiscais;
	// }
	//
	public OrdemDeProducaoVO getOrdemDeProducaoVO ()
	{
		return ordemDeProducaoVO;
	}

	public void setOrdemDeProducaoVO (OrdemDeProducaoVO ordemDeProducaoVO)
	{
		this.ordemDeProducaoVO = ordemDeProducaoVO;
	}
	//
	// public SupervisoresVenda getSupervisoresVenda ()
	// {
	// return supervisoresVenda;
	// }
	//
	// public void setSupervisoresVenda (SupervisoresVenda supervisoresVenda)
	// {
	// this.supervisoresVenda = supervisoresVenda;
	// }
	//
	// public ParceirosVO getParceirosVO3 ()
	// {
	// return parceirosVO3;
	// }
	//
	// public void setParceirosVO3 (ParceirosVO parceirosVO3)
	// {
	// this.parceirosVO3 = parceirosVO3;
	// }
}
