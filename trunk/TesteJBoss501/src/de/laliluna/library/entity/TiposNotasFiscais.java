package de.laliluna.library.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQuery(name = "TiposNotasFiscais.findAll", query = "select o from TiposNotasFiscais o")
@Table(name = "TIPOS_NOTAS_FISCAIS")
public class TiposNotasFiscais
    implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4272797237871469113L;
	@Id
	@Column(name = "COD_TIPO_NOTA", nullable = false)
	private Long codTipoNota;

	@Column(name = "COD_GRUPO_OPERACAO", nullable = false)
	private Long codGrupoOperacao;
	@Column(name = "COD_TRANSACAO", nullable = false)
	private Long codTransacao;
	@Column(name = "COD_TRIBUTACAO", nullable = false)
	private Long codTributacao;
	@Column(nullable = false)
	private String descricao;
	@Column(name = "DISPOSITIVO_LEGAL")
	private String dispositivoLegal;
	@Column(name = "FLAG_ALIQUOTA_ICMS", nullable = false)
	private String flagAliquotaIcms;
	@Column(name = "FLAG_ALIQUOTA_IPI", nullable = false)
	private String flagAliquotaIpi;
	@Column(name = "FLAG_ATIVO", nullable = false)
	private String flagAtivo;
	@Column(name = "FLAG_BASECALC_ICMS", nullable = false)
	private String flagBasecalcIcms;
	@Column(name = "FLAG_BASECALC_IPI", nullable = false)
	private String flagBasecalcIpi;
	@Column(name = "FLAG_BCICMS_FRETE", nullable = false)
	private String flagBcicmsFrete;
	@Column(name = "FLAG_BCICMS_FRETE_FATORDEDUCAO", nullable = false)
	private String flagBcicmsFreteFatordeducao;
	@Column(name = "FLAG_BCICMS_OUTRASDESPESAS", nullable = false)
	private String flagBcicmsOutrasdespesas;
	@Column(name = "FLAG_BCICMS_TEMIPI", nullable = false)
	private String flagBcicmsTemipi;
	@Column(name = "FLAG_DUPLICATA", nullable = false)
	private String flagDuplicata;
	@Column(name = "FLAG_EM", nullable = false)
	private String flagEm;
	@Column(name = "FLAG_EMPRESTIMO", nullable = false)
	private String flagEmprestimo;
	@Column(name = "FLAG_ESTOQUE_ATIVO", nullable = false)
	private String flagEstoqueAtivo;
	@Column(name = "FLAG_ESTOQUE_FISICO", nullable = false)
	private String flagEstoqueFisico;
	@Column(name = "FLAG_ESTOQUE_PASSIVO", nullable = false)
	private String flagEstoquePassivo;
	@Column(name = "FLAG_ESTORNO_ICMS", nullable = false)
	private String flagEstornoIcms;
	@Column(name = "FLAG_FATOR_DEDUCAO", nullable = false)
	private String flagFatorDeducao;
	@Column(name = "FLAG_IPI_DESP_ACESSORIA", nullable = false)
	private String flagIpiDespAcessoria;
	@Column(name = "FLAG_ISENTAS_ICMS", nullable = false)
	private String flagIsentasIcms;
	@Column(name = "FLAG_ISENTAS_IPI", nullable = false)
	private String flagIsentasIpi;
	@Column(name = "FLAG_LIVRO_FISCAL", nullable = false)
	private String flagLivroFiscal;
	@Column(name = "FLAG_NOTAS_MAES", nullable = false)
	private String flagNotasMaes;
	@Column(name = "FLAG_OUTROS_ICMS", nullable = false)
	private String flagOutrosIcms;
	@Column(name = "FLAG_OUTROS_IPI", nullable = false)
	private String flagOutrosIpi;
	@Column(name = "FLAG_RENTABILIDADE", nullable = false)
	private String flagRentabilidade;
	@Column(name = "FLAG_VALOR_ICMS", nullable = false)
	private String flagValorIcms;
	@Column(name = "FLAG_VALOR_IPI", nullable = false)
	private String flagValorIpi;
	@Column(name = "FLAG_VENCIMENTO", nullable = false)
	private String flagVencimento;
	private String observacao;
	@Column(name = "PERC_BCICMS_FRETE", nullable = false)
	private Double percBcicmsFrete;
	@Column(name = "PERC_ISENTASICMS_FRETE", nullable = false)
	private Double percIsentasicmsFrete;
	@Column(name = "PERC_ISENTAS_BCICMS", nullable = false)
	private Double percIsentasBcicms;
	@Column(name = "PERC_ISENTAS_BCIPI", nullable = false)
	private Double percIsentasBcipi;
	@Column(name = "PERC_OUTROSICMS_FRETE", nullable = false)
	private Double percOutrosicmsFrete;
	@Column(name = "PERC_OUTROS_BCICMS", nullable = false)
	private Double percOutrosBcicms;
	@Column(name = "PERC_OUTROS_BCIPI", nullable = false)
	private Double percOutrosBcipi;
	@Column(name = "PERC_VALOR_BCICMS", nullable = false)
	private Double percValorBcicms;
	@Column(name = "PERC_VALOR_BCIPI", nullable = false)
	private Double percValorBcipi;
	@Column(name = "TIPO_MOVIMENTO", nullable = false)
	private String tipoMovimento;

	// @OneToMany(mappedBy = "tiposNotasFiscais")
	// private List<OrdemDeProducaoVO> ordemDeProducaoVOList;
	// @OneToMany(mappedBy = "tiposNotasFiscais")
	// private List<CarteiraPedidosVendaVO> carteiraPedidosVendaVOList;
	// @OneToMany(mappedBy = "tiposNotasFiscais")
	// private List<NotasFiscaisVendaVO> notasFiscaisVendaVOList;

	public TiposNotasFiscais ()
	{
	}

	public Long getCodGrupoOperacao ()
	{
		return codGrupoOperacao;
	}

	public void setCodGrupoOperacao (Long codGrupoOperacao)
	{
		this.codGrupoOperacao = codGrupoOperacao;
	}

	public Long getCodTipoNota ()
	{
		return codTipoNota;
	}

	public void setCodTipoNota (Long codTipoNota)
	{
		this.codTipoNota = codTipoNota;
	}

	public Long getCodTransacao ()
	{
		return codTransacao;
	}

	public void setCodTransacao (Long codTransacao)
	{
		this.codTransacao = codTransacao;
	}

	public Long getCodTributacao ()
	{
		return codTributacao;
	}

	public void setCodTributacao (Long codTributacao)
	{
		this.codTributacao = codTributacao;
	}

	public String getDescricao ()
	{
		return descricao;
	}

	public void setDescricao (String descricao)
	{
		this.descricao = descricao;
	}

	public String getDispositivoLegal ()
	{
		return dispositivoLegal;
	}

	public void setDispositivoLegal (String dispositivoLegal)
	{
		this.dispositivoLegal = dispositivoLegal;
	}

	public String getFlagAliquotaIcms ()
	{
		return flagAliquotaIcms;
	}

	public void setFlagAliquotaIcms (String flagAliquotaIcms)
	{
		this.flagAliquotaIcms = flagAliquotaIcms;
	}

	public String getFlagAliquotaIpi ()
	{
		return flagAliquotaIpi;
	}

	public void setFlagAliquotaIpi (String flagAliquotaIpi)
	{
		this.flagAliquotaIpi = flagAliquotaIpi;
	}

	public String getFlagAtivo ()
	{
		return flagAtivo;
	}

	public void setFlagAtivo (String flagAtivo)
	{
		this.flagAtivo = flagAtivo;
	}

	public String getFlagBasecalcIcms ()
	{
		return flagBasecalcIcms;
	}

	public void setFlagBasecalcIcms (String flagBasecalcIcms)
	{
		this.flagBasecalcIcms = flagBasecalcIcms;
	}

	public String getFlagBasecalcIpi ()
	{
		return flagBasecalcIpi;
	}

	public void setFlagBasecalcIpi (String flagBasecalcIpi)
	{
		this.flagBasecalcIpi = flagBasecalcIpi;
	}

	public String getFlagBcicmsFrete ()
	{
		return flagBcicmsFrete;
	}

	public void setFlagBcicmsFrete (String flagBcicmsFrete)
	{
		this.flagBcicmsFrete = flagBcicmsFrete;
	}

	public String getFlagBcicmsFreteFatordeducao ()
	{
		return flagBcicmsFreteFatordeducao;
	}

	public void setFlagBcicmsFreteFatordeducao (String flagBcicmsFreteFatordeducao)
	{
		this.flagBcicmsFreteFatordeducao = flagBcicmsFreteFatordeducao;
	}

	public String getFlagBcicmsOutrasdespesas ()
	{
		return flagBcicmsOutrasdespesas;
	}

	public void setFlagBcicmsOutrasdespesas (String flagBcicmsOutrasdespesas)
	{
		this.flagBcicmsOutrasdespesas = flagBcicmsOutrasdespesas;
	}

	public String getFlagBcicmsTemipi ()
	{
		return flagBcicmsTemipi;
	}

	public void setFlagBcicmsTemipi (String flagBcicmsTemipi)
	{
		this.flagBcicmsTemipi = flagBcicmsTemipi;
	}

	public String getFlagDuplicata ()
	{
		return flagDuplicata;
	}

	public void setFlagDuplicata (String flagDuplicata)
	{
		this.flagDuplicata = flagDuplicata;
	}

	public String getFlagEm ()
	{
		return flagEm;
	}

	public void setFlagEm (String flagEm)
	{
		this.flagEm = flagEm;
	}

	public String getFlagEmprestimo ()
	{
		return flagEmprestimo;
	}

	public void setFlagEmprestimo (String flagEmprestimo)
	{
		this.flagEmprestimo = flagEmprestimo;
	}

	public String getFlagEstoqueAtivo ()
	{
		return flagEstoqueAtivo;
	}

	public void setFlagEstoqueAtivo (String flagEstoqueAtivo)
	{
		this.flagEstoqueAtivo = flagEstoqueAtivo;
	}

	public String getFlagEstoqueFisico ()
	{
		return flagEstoqueFisico;
	}

	public void setFlagEstoqueFisico (String flagEstoqueFisico)
	{
		this.flagEstoqueFisico = flagEstoqueFisico;
	}

	public String getFlagEstoquePassivo ()
	{
		return flagEstoquePassivo;
	}

	public void setFlagEstoquePassivo (String flagEstoquePassivo)
	{
		this.flagEstoquePassivo = flagEstoquePassivo;
	}

	public String getFlagEstornoIcms ()
	{
		return flagEstornoIcms;
	}

	public void setFlagEstornoIcms (String flagEstornoIcms)
	{
		this.flagEstornoIcms = flagEstornoIcms;
	}

	public String getFlagFatorDeducao ()
	{
		return flagFatorDeducao;
	}

	public void setFlagFatorDeducao (String flagFatorDeducao)
	{
		this.flagFatorDeducao = flagFatorDeducao;
	}

	public String getFlagIpiDespAcessoria ()
	{
		return flagIpiDespAcessoria;
	}

	public void setFlagIpiDespAcessoria (String flagIpiDespAcessoria)
	{
		this.flagIpiDespAcessoria = flagIpiDespAcessoria;
	}

	public String getFlagIsentasIcms ()
	{
		return flagIsentasIcms;
	}

	public void setFlagIsentasIcms (String flagIsentasIcms)
	{
		this.flagIsentasIcms = flagIsentasIcms;
	}

	public String getFlagIsentasIpi ()
	{
		return flagIsentasIpi;
	}

	public void setFlagIsentasIpi (String flagIsentasIpi)
	{
		this.flagIsentasIpi = flagIsentasIpi;
	}

	public String getFlagLivroFiscal ()
	{
		return flagLivroFiscal;
	}

	public void setFlagLivroFiscal (String flagLivroFiscal)
	{
		this.flagLivroFiscal = flagLivroFiscal;
	}

	public String getFlagNotasMaes ()
	{
		return flagNotasMaes;
	}

	public void setFlagNotasMaes (String flagNotasMaes)
	{
		this.flagNotasMaes = flagNotasMaes;
	}

	public String getFlagOutrosIcms ()
	{
		return flagOutrosIcms;
	}

	public void setFlagOutrosIcms (String flagOutrosIcms)
	{
		this.flagOutrosIcms = flagOutrosIcms;
	}

	public String getFlagOutrosIpi ()
	{
		return flagOutrosIpi;
	}

	public void setFlagOutrosIpi (String flagOutrosIpi)
	{
		this.flagOutrosIpi = flagOutrosIpi;
	}

	public String getFlagRentabilidade ()
	{
		return flagRentabilidade;
	}

	public void setFlagRentabilidade (String flagRentabilidade)
	{
		this.flagRentabilidade = flagRentabilidade;
	}

	public String getFlagValorIcms ()
	{
		return flagValorIcms;
	}

	public void setFlagValorIcms (String flagValorIcms)
	{
		this.flagValorIcms = flagValorIcms;
	}

	public String getFlagValorIpi ()
	{
		return flagValorIpi;
	}

	public void setFlagValorIpi (String flagValorIpi)
	{
		this.flagValorIpi = flagValorIpi;
	}

	public String getFlagVencimento ()
	{
		return flagVencimento;
	}

	public void setFlagVencimento (String flagVencimento)
	{
		this.flagVencimento = flagVencimento;
	}

	public String getObservacao ()
	{
		return observacao;
	}

	public void setObservacao (String observacao)
	{
		this.observacao = observacao;
	}

	public Double getPercBcicmsFrete ()
	{
		return percBcicmsFrete;
	}

	public void setPercBcicmsFrete (Double percBcicmsFrete)
	{
		this.percBcicmsFrete = percBcicmsFrete;
	}

	public Double getPercIsentasicmsFrete ()
	{
		return percIsentasicmsFrete;
	}

	public void setPercIsentasicmsFrete (Double percIsentasicmsFrete)
	{
		this.percIsentasicmsFrete = percIsentasicmsFrete;
	}

	public Double getPercIsentasBcicms ()
	{
		return percIsentasBcicms;
	}

	public void setPercIsentasBcicms (Double percIsentasBcicms)
	{
		this.percIsentasBcicms = percIsentasBcicms;
	}

	public Double getPercIsentasBcipi ()
	{
		return percIsentasBcipi;
	}

	public void setPercIsentasBcipi (Double percIsentasBcipi)
	{
		this.percIsentasBcipi = percIsentasBcipi;
	}

	public Double getPercOutrosicmsFrete ()
	{
		return percOutrosicmsFrete;
	}

	public void setPercOutrosicmsFrete (Double percOutrosicmsFrete)
	{
		this.percOutrosicmsFrete = percOutrosicmsFrete;
	}

	public Double getPercOutrosBcicms ()
	{
		return percOutrosBcicms;
	}

	public void setPercOutrosBcicms (Double percOutrosBcicms)
	{
		this.percOutrosBcicms = percOutrosBcicms;
	}

	public Double getPercOutrosBcipi ()
	{
		return percOutrosBcipi;
	}

	public void setPercOutrosBcipi (Double percOutrosBcipi)
	{
		this.percOutrosBcipi = percOutrosBcipi;
	}

	public Double getPercValorBcicms ()
	{
		return percValorBcicms;
	}

	public void setPercValorBcicms (Double percValorBcicms)
	{
		this.percValorBcicms = percValorBcicms;
	}

	public Double getPercValorBcipi ()
	{
		return percValorBcipi;
	}

	public void setPercValorBcipi (Double percValorBcipi)
	{
		this.percValorBcipi = percValorBcipi;
	}

	public String getTipoMovimento ()
	{
		return tipoMovimento;
	}

	public void setTipoMovimento (String tipoMovimento)
	{
		this.tipoMovimento = tipoMovimento;
	}

	// public List<OrdemDeProducaoVO> getOrdemDeProducaoVOList ()
	// {
	// return ordemDeProducaoVOList;
	// }
	//
	// public void setOrdemDeProducaoVOList (List<OrdemDeProducaoVO>
	// ordemDeProducaoVOList)
	// {
	// this.ordemDeProducaoVOList = ordemDeProducaoVOList;
	// }
	//
	// public OrdemDeProducaoVO addOrdemDeProducaoVO (OrdemDeProducaoVO
	// ordemDeProducaoVO)
	// {
	// getOrdemDeProducaoVOList().add(ordemDeProducaoVO);
	// ordemDeProducaoVO.setTiposNotasFiscais(this);
	// return ordemDeProducaoVO;
	// }
	//
	// public OrdemDeProducaoVO removeOrdemDeProducaoVO (OrdemDeProducaoVO
	// ordemDeProducaoVO)
	// {
	// getOrdemDeProducaoVOList().remove(ordemDeProducaoVO);
	// ordemDeProducaoVO.setTiposNotasFiscais(null);
	// return ordemDeProducaoVO;
	// }
	//
	// public List<CarteiraPedidosVendaVO> getCarteiraPedidosVendaVOList ()
	// {
	// return carteiraPedidosVendaVOList;
	// }
	//
	// public void setCarteiraPedidosVendaVOList (
	// List<CarteiraPedidosVendaVO> carteiraPedidosVendaVOList)
	// {
	// this.carteiraPedidosVendaVOList = carteiraPedidosVendaVOList;
	// }
	//
	// public CarteiraPedidosVendaVO addCarteiraPedidosVendaVO (
	// CarteiraPedidosVendaVO carteiraPedidosVendaVO)
	// {
	// getCarteiraPedidosVendaVOList().add(carteiraPedidosVendaVO);
	// carteiraPedidosVendaVO.setTiposNotasFiscais(this);
	// return carteiraPedidosVendaVO;
	// }
	//
	// public CarteiraPedidosVendaVO removeCarteiraPedidosVendaVO (
	// CarteiraPedidosVendaVO carteiraPedidosVendaVO)
	// {
	// getCarteiraPedidosVendaVOList().remove(carteiraPedidosVendaVO);
	// carteiraPedidosVendaVO.setTiposNotasFiscais(null);
	// return carteiraPedidosVendaVO;
	// }
	//
	// public List<NotasFiscaisVendaVO> getNotasFiscaisVendaVOList ()
	// {
	// return notasFiscaisVendaVOList;
	// }
	//
	// public void setNotasFiscaisVendaVOList (List<NotasFiscaisVendaVO>
	// notasFiscaisVendaVOList)
	// {
	// this.notasFiscaisVendaVOList = notasFiscaisVendaVOList;
	// }
	//
	// public NotasFiscaisVendaVO addNotasFiscaisVendaVO (NotasFiscaisVendaVO
	// notasFiscaisVendaVO)
	// {
	// getNotasFiscaisVendaVOList().add(notasFiscaisVendaVO);
	// notasFiscaisVendaVO.setTiposNotasFiscais(this);
	// return notasFiscaisVendaVO;
	// }
	//
	// public NotasFiscaisVendaVO removeNotasFiscaisVendaVO (NotasFiscaisVendaVO
	// notasFiscaisVendaVO)
	// {
	// getNotasFiscaisVendaVOList().remove(notasFiscaisVendaVO);
	// notasFiscaisVendaVO.setTiposNotasFiscais(null);
	// return notasFiscaisVendaVO;
	// }
}
