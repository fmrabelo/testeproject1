package de.laliluna.library.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import de.laliluna.library.entity.pk.OrdemDeProducaoVOPK;

@Entity
@NamedQuery(name = "OrdemDeProducaoVO.findAll", query = "select o from OrdemDeProducaoVO o")
@Table(name = "ORDEM_DE_PRODUCAO")
@IdClass(OrdemDeProducaoVOPK.class)
public class OrdemDeProducaoVO
    implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6261824833459832187L;

	@Column(name = "ALIQUOTA_ICMS")
	private Double aliquotaIcms;

	@Id
	@Column(name = "COD_FILIAL", unique = true, nullable = false, insertable = true, updatable = true)
	private Long codFilial;

	@Id
	@Column(name = "NRO_ORDEM_PRODUCAO", nullable = false)
	private Long nroOrdemProducao;

	@Column(name = "CONDICAO_PAGAMENTO")
	private String condicaoPagamento;
	@Column(name = "DISPOSITIVO_LEGAL")
	private String dispositivoLegal;
	@Column(name = "DT_CANCELAMENTO")
	private Timestamp dtCancelamento;
	@Column(name = "DT_EMISSAO", nullable = false)
	private Timestamp dtEmissao;
	@Column(name = "FLAG_CANCELADO")
	private String flagCancelado;
	@Column(name = "FLAG_CARREGAMENTO")
	private String flagCarregamento;
	@Column(name = "FLAG_MANIPULADO", nullable = false)
	private String flagManipulado;
	@Column(name = "FLAG_MOVIMENTA_ESTOQUE", nullable = false)
	private String flagMovimentaEstoque;
	@Column(name = "FRETE_PRINCIPAL")
	private Double fretePrincipal;
	@Column(name = "FRETE_SECUNDARIO")
	private Double freteSecundario;
	@Column(name = "FRETE_TRANSBORDO")
	private Double freteTransbordo;
	@Column(name = "MARCA_SACARIA")
	private String marcaSacaria;
	@Column(name = "NOME_MOTORISTA")
	private String nomeMotorista;
	@Column(name = "OBS_ESCRITA_FISCAL")
	private String obsEscritaFiscal;
	@Column(name = "OBS_EXPEDICAO")
	private String obsExpedicao;
	@Column(name = "PLACA_VEICULO", nullable = false)
	private String placaVeiculo;
	@Column(name = "POLO_TRANSBORDO")
	private String poloTransbordo;
	@Column(name = "SITUACAO_ORDEM")
	private String situacaoOrdem;
	@Column(name = "TIPO_EMBALAGEM")
	private String tipoEmbalagem;
	@Column(name = "TIPO_FRETE")
	private String tipoFrete;
	@Column(name = "TIPO_FRETE_CIF")
	private String tipoFreteCif;
	@Column(name = "TIPO_PESAGEM", nullable = false)
	private String tipoPesagem;
	@Column(name = "TIPO_TRANSPORTADOR", nullable = false)
	private String tipoTransportador;
	@Column(name = "TIPO_TRANSPORTE")
	private String tipoTransporte;
	@Column(name = "UF_PLACA_VEICULO")
	private String ufPlacaVeiculo;
	@Column(name = "USR_ALTERACAO")
	private String usrAlteracao;
	@Column(name = "USR_CANCELAMENTO")
	private String usrCancelamento;

	@ManyToOne
	@JoinColumn(name = "COD_FILIAL", referencedColumnName = "COD_FILIAL", insertable = false, updatable = false)
	private FiliaisVO filiaisVO;

	@ManyToOne
	@JoinColumns({
	    @JoinColumn(name = "COD_FILIAL", referencedColumnName = "COD_FILIAL", insertable = false, updatable = false),
	    @JoinColumn(name = "NRO_SEQ_PEDIDO", referencedColumnName = "NRO_SEQ_PEDIDO", insertable = false, updatable = false),
	    @JoinColumn(name = "ANO_PEDIDO", referencedColumnName = "ANO_PEDIDO", insertable = false, updatable = false)})
	private CarteiraPedidosVendaVO carteiraPedidosVendaVO;

	// @ManyToOne
	// @JoinColumn(name = "COD_AGENTE", referencedColumnName = "COD_AGENTE")
	// private AgentesVendaVO agentesVendaVO;
	// @ManyToOne
	// @JoinColumn(name = "COD_SUPERVISOR", referencedColumnName =
	// "COD_SUPERVISOR")
	// private SupervisoresVenda supervisoresVenda;
	// @ManyToOne
	// @JoinColumn(name = "COD_TRANSP_TRANSB", referencedColumnName =
	// "COD_PARCEIRO")
	// private ParceirosVO parceirosVO;
	// @ManyToOne
	// @JoinColumn(name = "COD_TIPO_NOTA", referencedColumnName =
	// "COD_TIPO_NOTA")
	// private TiposNotasFiscais tiposNotasFiscais;
	// @ManyToOne
	// @JoinColumn(name = "COD_GERENTE", referencedColumnName = "COD_GERENTE")
	// private GerentesVendaVO gerentesVendaVO;

	// @ManyToOne
	// @JoinColumn(name = "COD_CLIENTE_VENDEDOR", referencedColumnName =
	// "COD_PARCEIRO")
	// private ParceirosVO parceirosVO1;

	@OneToMany(mappedBy = "ordemDeProducaoVO")
	private List<NotasFiscaisVendaVO> notasFiscaisVendaVOList;

	//	
	// @ManyToOne
	// @JoinColumn(name = "COD_TRANSPORTADORA", referencedColumnName =
	// "COD_PARCEIRO")
	// private ParceirosVO parceirosVO2;
	// @ManyToOne
	// @JoinColumn(name = "COD_PORTADOR", referencedColumnName = "COD_PORTADOR")
	// private Portadores portadores;
	// @ManyToOne
	// @JoinColumn(name = "COD_CLIENTE", referencedColumnName = "COD_PARCEIRO")
	// private ParceirosVO parceirosVO3;
	// @ManyToOne
	// @JoinColumn(name = "COD_CLIENTE_FIADOR", referencedColumnName =
	// "COD_PARCEIRO")
	// private ParceirosVO parceirosVO4;

	public OrdemDeProducaoVO ()
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

	public String getDispositivoLegal ()
	{
		return dispositivoLegal;
	}

	public void setDispositivoLegal (String dispositivoLegal)
	{
		this.dispositivoLegal = dispositivoLegal;
	}

	public Timestamp getDtCancelamento ()
	{
		return dtCancelamento;
	}

	public void setDtCancelamento (Timestamp dtCancelamento)
	{
		this.dtCancelamento = dtCancelamento;
	}

	public Timestamp getDtEmissao ()
	{
		return dtEmissao;
	}

	public void setDtEmissao (Timestamp dtEmissao)
	{
		this.dtEmissao = dtEmissao;
	}

	public String getFlagCancelado ()
	{
		return flagCancelado;
	}

	public void setFlagCancelado (String flagCancelado)
	{
		this.flagCancelado = flagCancelado;
	}

	public String getFlagCarregamento ()
	{
		return flagCarregamento;
	}

	public void setFlagCarregamento (String flagCarregamento)
	{
		this.flagCarregamento = flagCarregamento;
	}

	public String getFlagManipulado ()
	{
		return flagManipulado;
	}

	public void setFlagManipulado (String flagManipulado)
	{
		this.flagManipulado = flagManipulado;
	}

	public String getFlagMovimentaEstoque ()
	{
		return flagMovimentaEstoque;
	}

	public void setFlagMovimentaEstoque (String flagMovimentaEstoque)
	{
		this.flagMovimentaEstoque = flagMovimentaEstoque;
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

	public String getMarcaSacaria ()
	{
		return marcaSacaria;
	}

	public void setMarcaSacaria (String marcaSacaria)
	{
		this.marcaSacaria = marcaSacaria;
	}

	public String getNomeMotorista ()
	{
		return nomeMotorista;
	}

	public void setNomeMotorista (String nomeMotorista)
	{
		this.nomeMotorista = nomeMotorista;
	}

	public Long getNroOrdemProducao ()
	{
		return nroOrdemProducao;
	}

	public void setNroOrdemProducao (Long nroOrdemProducao)
	{
		this.nroOrdemProducao = nroOrdemProducao;
	}

	public String getObsEscritaFiscal ()
	{
		return obsEscritaFiscal;
	}

	public void setObsEscritaFiscal (String obsEscritaFiscal)
	{
		this.obsEscritaFiscal = obsEscritaFiscal;
	}

	public String getObsExpedicao ()
	{
		return obsExpedicao;
	}

	public void setObsExpedicao (String obsExpedicao)
	{
		this.obsExpedicao = obsExpedicao;
	}

	public String getPlacaVeiculo ()
	{
		return placaVeiculo;
	}

	public void setPlacaVeiculo (String placaVeiculo)
	{
		this.placaVeiculo = placaVeiculo;
	}

	public String getPoloTransbordo ()
	{
		return poloTransbordo;
	}

	public void setPoloTransbordo (String poloTransbordo)
	{
		this.poloTransbordo = poloTransbordo;
	}

	public String getSituacaoOrdem ()
	{
		return situacaoOrdem;
	}

	public void setSituacaoOrdem (String situacaoOrdem)
	{
		this.situacaoOrdem = situacaoOrdem;
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

	public String getTipoPesagem ()
	{
		return tipoPesagem;
	}

	public void setTipoPesagem (String tipoPesagem)
	{
		this.tipoPesagem = tipoPesagem;
	}

	public String getTipoTransportador ()
	{
		return tipoTransportador;
	}

	public void setTipoTransportador (String tipoTransportador)
	{
		this.tipoTransportador = tipoTransportador;
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

	public String getUsrAlteracao ()
	{
		return usrAlteracao;
	}

	public void setUsrAlteracao (String usrAlteracao)
	{
		this.usrAlteracao = usrAlteracao;
	}

	public String getUsrCancelamento ()
	{
		return usrCancelamento;
	}

	public void setUsrCancelamento (String usrCancelamento)
	{
		this.usrCancelamento = usrCancelamento;
	}

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
	public CarteiraPedidosVendaVO getCarteiraPedidosVendaVO ()
	{
		return carteiraPedidosVendaVO;
	}

	public void setCarteiraPedidosVendaVO (CarteiraPedidosVendaVO carteiraPedidosVendaVO)
	{
		this.carteiraPedidosVendaVO = carteiraPedidosVendaVO;
	}

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
	public List<NotasFiscaisVendaVO> getNotasFiscaisVendaVOList ()
	{
		return notasFiscaisVendaVOList;
	}

	public void setNotasFiscaisVendaVOList (List<NotasFiscaisVendaVO> notasFiscaisVendaVOList)
	{
		this.notasFiscaisVendaVOList = notasFiscaisVendaVOList;
	}

	//
	// public NotasFiscaisVendaVO addNotasFiscaisVendaVO (NotasFiscaisVendaVO
	// notasFiscaisVendaVO)
	// {
	// getNotasFiscaisVendaVOList().add(notasFiscaisVendaVO);
	// notasFiscaisVendaVO.setOrdemDeProducaoVO(this);
	// return notasFiscaisVendaVO;
	// }
	//
	// public NotasFiscaisVendaVO removeNotasFiscaisVendaVO (NotasFiscaisVendaVO
	// notasFiscaisVendaVO)
	// {
	// getNotasFiscaisVendaVOList().remove(notasFiscaisVendaVO);
	// notasFiscaisVendaVO.setOrdemDeProducaoVO(null);
	// return notasFiscaisVendaVO;
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
	// public ParceirosVO getParceirosVO3 ()
	// {
	// return parceirosVO3;
	// }
	//
	// public void setParceirosVO3 (ParceirosVO parceirosVO3)
	// {
	// this.parceirosVO3 = parceirosVO3;
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

	// public ParceirosVO getParceirosVO4 ()
	// {
	// return parceirosVO4;
	// }
	//
	// public void setParceirosVO4 (ParceirosVO parceirosVO4)
	// {
	// this.parceirosVO4 = parceirosVO4;
	// }
}
