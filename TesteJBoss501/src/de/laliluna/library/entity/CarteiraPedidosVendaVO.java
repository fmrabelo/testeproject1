package de.laliluna.library.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import de.laliluna.library.entity.pk.CarteiraPedidosVendaVOPK;

@Entity
@NamedQuery(name = "CarteiraPedidosVendaVO.findAll", query = "select o from CarteiraPedidosVendaVO o")
@Table(name = "CARTEIRA_PEDIDOS_VENDA")
@IdClass(CarteiraPedidosVendaVOPK.class)
public class CarteiraPedidosVendaVO
    implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2248952932400695810L;
	@Id
	@Column(name = "ANO_PEDIDO", nullable = false)
	private Long anoPedido;
	@Id
	@Column(name = "COD_FILIAL", nullable = false, insertable = true, updatable = true)
	private Long codFilial;
	@Id
	@Column(name = "NRO_SEQ_PEDIDO", nullable = false, unique = true)
	private Long nroSeqPedido;

	@Column(name = "ALIQUOTA_ICMS")
	private Double aliquotaIcms;
	@Column(name = "COD_EMITENTE", nullable = false)
	private Long codEmitente;

	@Column(name = "COD_OBS_PRODUTO")
	private Long codObsProduto;
	@Column(name = "CONDICAO_PAGAMENTO")
	private String condicaoPagamento;
	@Column(name = "DATA_EMISSAO")
	private Timestamp dataEmissao;
	@Column(name = "DISPOSITIVO_LEGAL")
	private String dispositivoLegal;
	@Column(name = "FLAG_CARTEIRA")
	private String flagCarteira;
	@Column(name = "FLAG_ESTATISTICA")
	private String flagEstatistica;
	@Column(name = "FLAG_FLUXO", nullable = false)
	private String flagFluxo;
	@Column(name = "FLAG_RECALC_FORMULA")
	private String flagRecalcFormula;
	@Column(name = "FLAG_SINDICATO")
	private String flagSindicato;
	@Column(name = "FLAG_URGENTE")
	private String flagUrgente;
	@Column(name = "FRETE_PRINCIPAL")
	private Double fretePrincipal;
	@Column(name = "FRETE_SECUNDARIO")
	private Double freteSecundario;
	@Column(name = "FRETE_TRANSBORDO")
	private Double freteTransbordo;
	@Column(name = "NRO_DD_VENCIMENTO")
	private Long nroDdVencimento;
	@Column(name = "NRO_DIAS_VENCTO")
	private Long nroDiasVencto;
	@Column(name = "NRO_PEDIDO_FORNECIMENTO", nullable = false)
	private Long nroPedidoFornecimento;

	@Column(name = "OBSERVACAO_COBRANCA")
	private String observacaoCobranca;
	@Column(name = "OBSERVACAO_COMERCIAL")
	private String observacaoComercial;
	@Column(name = "OBSERVACAO_PRODUTO")
	private String observacaoProduto;
	@Column(name = "POLO_TRANSBORDO")
	private String poloTransbordo;
	@Column(name = "SITUACAO_PEDIDO")
	private String situacaoPedido;
	@Column(name = "TIPO_EMBALAGEM")
	private String tipoEmbalagem;
	@Column(name = "TIPO_FRETE")
	private String tipoFrete;
	@Column(name = "TIPO_FRETE_CIF")
	private String tipoFreteCif;
	@Column(name = "TIPO_TRANSPORTE")
	private String tipoTransporte;

	// @ManyToOne
	// @JoinColumn(name = "COD_PARCEIRO", referencedColumnName = "COD_PARCEIRO")
	// private ParceirosVO parceirosVO;
	// @ManyToOne
	// @JoinColumn(name = "COD_PORTADOR", referencedColumnName = "COD_PORTADOR")
	// private Portadores portadores;
	// @ManyToOne
	// @JoinColumn(name = "COD_GERENTE", referencedColumnName = "COD_GERENTE")
	// private GerentesVendaVO gerentesVendaVO;

	@OneToMany(mappedBy = "carteiraPedidosVendaVO")
	private List<NotasFiscaisVendaVO> notasFiscaisVendaVOList;

	@OneToMany(mappedBy = "carteiraPedidosVendaVO")
	private List<OrdemDeProducaoVO> ordemDeProducaoVOList;

	@ManyToOne
	@JoinColumn(name = "COD_FILIAL", referencedColumnName = "COD_FILIAL", insertable = false, updatable = false)
	private FiliaisVO filiaisVO;

	// @ManyToOne
	// @JoinColumn(name = "COD_AGENTE", referencedColumnName = "COD_AGENTE")
	// private AgentesVendaVO agentesVendaVO;
	// @ManyToOne
	// @JoinColumn(name = "COD_TIPO_NOTA", referencedColumnName =
	// "COD_TIPO_NOTA")
	// private TiposNotasFiscais tiposNotasFiscais;
	// @ManyToOne
	// @JoinColumn(name = "COD_SUPERVISOR", referencedColumnName =
	// "COD_SUPERVISOR")
	// private SupervisoresVenda supervisoresVenda;
	// @ManyToOne
	// @JoinColumn(name = "COD_CLIENTE_VENDEDOR", referencedColumnName =
	// "COD_PARCEIRO")
	// private ParceirosVO parceirosVO1;
	// @ManyToOne
	// @JoinColumn(name = "COD_CLIENTE_FIADOR", referencedColumnName =
	// "COD_PARCEIRO")
	// private ParceirosVO parceirosVO2;

	public CarteiraPedidosVendaVO ()
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

	public Long getAnoPedido ()
	{
		return anoPedido;
	}

	public void setAnoPedido (Long anoPedido)
	{
		this.anoPedido = anoPedido;
	}

	public Long getCodEmitente ()
	{
		return codEmitente;
	}

	public void setCodEmitente (Long codEmitente)
	{
		this.codEmitente = codEmitente;
	}

	public Long getCodFilial ()
	{
		return codFilial;
	}

	public void setCodFilial (Long codFilial)
	{
		this.codFilial = codFilial;
	}

	public Long getCodObsProduto ()
	{
		return codObsProduto;
	}

	public void setCodObsProduto (Long codObsProduto)
	{
		this.codObsProduto = codObsProduto;
	}

	public String getCondicaoPagamento ()
	{
		return condicaoPagamento;
	}

	public void setCondicaoPagamento (String condicaoPagamento)
	{
		this.condicaoPagamento = condicaoPagamento;
	}

	public Timestamp getDataEmissao ()
	{
		return dataEmissao;
	}

	public void setDataEmissao (Timestamp dataEmissao)
	{
		this.dataEmissao = dataEmissao;
	}

	public String getDispositivoLegal ()
	{
		return dispositivoLegal;
	}

	public void setDispositivoLegal (String dispositivoLegal)
	{
		this.dispositivoLegal = dispositivoLegal;
	}

	public String getFlagCarteira ()
	{
		return flagCarteira;
	}

	public void setFlagCarteira (String flagCarteira)
	{
		this.flagCarteira = flagCarteira;
	}

	public String getFlagEstatistica ()
	{
		return flagEstatistica;
	}

	public void setFlagEstatistica (String flagEstatistica)
	{
		this.flagEstatistica = flagEstatistica;
	}

	public String getFlagFluxo ()
	{
		return flagFluxo;
	}

	public void setFlagFluxo (String flagFluxo)
	{
		this.flagFluxo = flagFluxo;
	}

	public String getFlagRecalcFormula ()
	{
		return flagRecalcFormula;
	}

	public void setFlagRecalcFormula (String flagRecalcFormula)
	{
		this.flagRecalcFormula = flagRecalcFormula;
	}

	public String getFlagSindicato ()
	{
		return flagSindicato;
	}

	public void setFlagSindicato (String flagSindicato)
	{
		this.flagSindicato = flagSindicato;
	}

	public String getFlagUrgente ()
	{
		return flagUrgente;
	}

	public void setFlagUrgente (String flagUrgente)
	{
		this.flagUrgente = flagUrgente;
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

	public Long getNroDdVencimento ()
	{
		return nroDdVencimento;
	}

	public void setNroDdVencimento (Long nroDdVencimento)
	{
		this.nroDdVencimento = nroDdVencimento;
	}

	public Long getNroDiasVencto ()
	{
		return nroDiasVencto;
	}

	public void setNroDiasVencto (Long nroDiasVencto)
	{
		this.nroDiasVencto = nroDiasVencto;
	}

	public Long getNroPedidoFornecimento ()
	{
		return nroPedidoFornecimento;
	}

	public void setNroPedidoFornecimento (Long nroPedidoFornecimento)
	{
		this.nroPedidoFornecimento = nroPedidoFornecimento;
	}

	public Long getNroSeqPedido ()
	{
		return nroSeqPedido;
	}

	public void setNroSeqPedido (Long nroSeqPedido)
	{
		this.nroSeqPedido = nroSeqPedido;
	}

	public String getObservacaoCobranca ()
	{
		return observacaoCobranca;
	}

	public void setObservacaoCobranca (String observacaoCobranca)
	{
		this.observacaoCobranca = observacaoCobranca;
	}

	public String getObservacaoComercial ()
	{
		return observacaoComercial;
	}

	public void setObservacaoComercial (String observacaoComercial)
	{
		this.observacaoComercial = observacaoComercial;
	}

	public String getObservacaoProduto ()
	{
		return observacaoProduto;
	}

	public void setObservacaoProduto (String observacaoProduto)
	{
		this.observacaoProduto = observacaoProduto;
	}

	public String getPoloTransbordo ()
	{
		return poloTransbordo;
	}

	public void setPoloTransbordo (String poloTransbordo)
	{
		this.poloTransbordo = poloTransbordo;
	}

	public String getSituacaoPedido ()
	{
		return situacaoPedido;
	}

	public void setSituacaoPedido (String situacaoPedido)
	{
		this.situacaoPedido = situacaoPedido;
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
	// notasFiscaisVendaVO.setCarteiraPedidosVendaVO(this);
	// return notasFiscaisVendaVO;
	// }
	//
	// public NotasFiscaisVendaVO removeNotasFiscaisVendaVO (NotasFiscaisVendaVO
	// notasFiscaisVendaVO)
	// {
	// getNotasFiscaisVendaVOList().remove(notasFiscaisVendaVO);
	// notasFiscaisVendaVO.setCarteiraPedidosVendaVO(null);
	// return notasFiscaisVendaVO;
	// }
	//
	public List<OrdemDeProducaoVO> getOrdemDeProducaoVOList ()
	{
		return ordemDeProducaoVOList;
	}

	public void setOrdemDeProducaoVOList (List<OrdemDeProducaoVO> ordemDeProducaoVOList)
	{
		this.ordemDeProducaoVOList = ordemDeProducaoVOList;
	}

	// public OrdemDeProducaoVO addOrdemDeProducaoVO (OrdemDeProducaoVO
	// ordemDeProducaoVO)
	// {
	// getOrdemDeProducaoVOList().add(ordemDeProducaoVO);
	// ordemDeProducaoVO.setCarteiraPedidosVendaVO(this);
	// return ordemDeProducaoVO;
	// }
	//
	// public OrdemDeProducaoVO removeOrdemDeProducaoVO (OrdemDeProducaoVO
	// ordemDeProducaoVO)
	// {
	// getOrdemDeProducaoVOList().remove(ordemDeProducaoVO);
	// ordemDeProducaoVO.setCarteiraPedidosVendaVO(null);
	// return ordemDeProducaoVO;
	// }

	public FiliaisVO getFiliaisVO ()
	{
		return filiaisVO;
	}

	public void setFiliaisVO (FiliaisVO filiaisVO)
	{
		this.filiaisVO = filiaisVO;
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
}
