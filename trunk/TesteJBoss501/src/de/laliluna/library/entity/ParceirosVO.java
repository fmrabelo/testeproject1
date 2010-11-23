package de.laliluna.library.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQuery(name = "ParceirosVO.findAll", query = "select o from ParceirosVO o")
@Table(name = "PARCEIROS")
public class ParceirosVO
    implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7173951692580603234L;

	@Id
	@Column(name = "COD_PARCEIRO", nullable = false)
	private Long codParceiro;

	private String agencia;
	@Column(name = "BAIRRO_COBRANCA")
	private String bairroCobranca;
	@Column(name = "BAIRRO_ENTREGA")
	private String bairroEntrega;
	private String banco;
	@Column(name = "CEP_COBRANCA")
	private Long cepCobranca;
	@Column(name = "CEP_ENTREGA")
	private Long cepEntrega;
	@Column(nullable = false)
	private String cgc;
	@Column(name = "CIDADE_COBRANCA", nullable = false)
	private String cidadeCobranca;
	@Column(name = "CIDADE_ENTREGA", nullable = false)
	private String cidadeEntrega;
	@Column(name = "CLIENTE_FORNEC")
	private String clienteFornec;
	private String cnae;
	@Column(name = "CODIGO_CIDADE_COBRANCA")
	private Long codigoCidadeCobranca;
	@Column(name = "CODIGO_CIDADE_ENTREGA")
	private Long codigoCidadeEntrega;
	@Column(name = "CODIGO_PAIS_COBRANCA")
	private Long codigoPaisCobranca;
	@Column(name = "CODIGO_PAIS_ENTREGA")
	private Long codigoPaisEntrega;
	@Column(name = "COD_ANTIGO")
	private String codAntigo;
	@Column(name = "COD_BANCO_COBRANCA")
	private Long codBancoCobranca;
	@Column(name = "COD_MUNICIPIO_DFC")
	private Long codMunicipioDfc;

	@Column(name = "COD_TIPO_PARCEIRO", nullable = false)
	private Long codTipoParceiro;
	@Column(name = "COD_VALIDADE")
	private Long codValidade;
	@Column(name = "COMPLEMENTO_COBRANCA")
	private String complementoCobranca;
	@Column(name = "COMPLEMENTO_ENTREGA")
	private String complementoEntrega;
	private String contato;
	@Column(name = "CONTA_CORRENTE")
	private String contaCorrente;
	@Column(name = "CONTA_CREDITO_CLIENTE")
	private Long contaCreditoCliente;
	@Column(name = "CONTA_CREDITO_FORNECEDOR")
	private Long contaCreditoFornecedor;
	@Column(name = "CONTA_DEBITO_CLIENTE")
	private Long contaDebitoCliente;
	@Column(name = "CONTA_DEBITO_FORNECEDOR")
	private Long contaDebitoFornecedor;
	@Column(name = "DATA_INC_CRM")
	private Timestamp dataIncCrm;
	@Column(name = "DDD_COBRANCA")
	private Long dddCobranca;
	@Column(name = "DDD_ENTREGA")
	private Long dddEntrega;
	private String email;
	@Column(name = "ENDERECO_COBRANCA", nullable = false)
	private String enderecoCobranca;
	@Column(name = "ENDERECO_ENTREGA", nullable = false)
	private String enderecoEntrega;
	private String ep;
	@Column(name = "FAX_ENTREGA")
	private String faxEntrega;
	@Column(name = "FLAG_ATIVO", nullable = false)
	private String flagAtivo;
	@Column(name = "FONE_COBRANCA")
	private Long foneCobranca;
	@Column(name = "FONE_ENTREGA")
	private Long foneEntrega;
	@Column(name = "INSCR_ESTADUAL")
	private String inscrEstadual;
	@Column(name = "INSCR_PRODUTOR")
	private String inscrProdutor;
	@Column(name = "INSC_MUNICIPAL")
	private String inscMunicipal;
	@Column(name = "INSS_PIS")
	private String inssPis;
	@Column(name = "NOME_FANTASIA")
	private String nomeFantasia;
	@Column(name = "NUMERO_COBRANCA")
	private String numeroCobranca;
	@Column(name = "NUMERO_ENTREGA")
	private String numeroEntrega;
	@Column(name = "RAZAO_SOCIAL", nullable = false)
	private String razaoSocial;
	@Column(name = "ROTEIRO_ENTREGA")
	private String roteiroEntrega;
	@Column(name = "ROWID_MTZ")
	private String rowidMtz;
	private String ruc;
	private String senave;
	@Column(name = "TIPO_PESSOA", nullable = false)
	private String tipoPessoa;
	@Column(name = "UF_COBRANCA", nullable = false)
	private String ufCobranca;
	@Column(name = "UF_ENTREGA", nullable = false)
	private String ufEntrega;
	@Column(name = "VLR_LIMITE_CREDITO")
	private Double vlrLimiteCredito;

	@ManyToOne
	@JoinColumn(name = "COD_FILIAL", referencedColumnName = "COD_FILIAL")
	private FiliaisVO filiaisVO;

	@ManyToOne
	@JoinColumn(name = "COD_FILIAL_EP", referencedColumnName = "COD_FILIAL")
	private FiliaisVO filiaisEpVO;

	// @OneToMany(mappedBy = "parceirosVO")
	// private List<NotasFiscaisVendaVO> notasFiscaisVendaVOList;
	// @OneToMany(mappedBy = "parceirosVO")
	// private List<AgentesVendaVO> agentesVendaVOList;
	// @OneToMany(mappedBy = "parceirosVO1")
	// private List<NotasFiscaisVendaVO> notasFiscaisVendaVOList1;
	// @OneToMany(mappedBy = "parceirosVO2")
	// private List<NotasFiscaisVendaVO> notasFiscaisVendaVOList2;
	// @OneToMany(mappedBy = "parceirosVO")
	// private List<CarteiraPedidosVendaVO> carteiraPedidosVendaVOList;
	// @OneToMany(mappedBy = "parceirosVO")
	// private List<OrdemDeProducaoVO> ordemDeProducaoVOList;

	// @OneToMany(mappedBy = "parceirosVO1")
	// private List<OrdemDeProducaoVO> ordemDeProducaoVOList1;
	// @OneToMany(mappedBy = "parceirosVO2")
	// private List<OrdemDeProducaoVO> ordemDeProducaoVOList2;
	// @OneToMany(mappedBy = "parceirosVO3")
	// private List<OrdemDeProducaoVO> ordemDeProducaoVOList3;
	// @OneToMany(mappedBy = "parceirosVO3")
	// private List<NotasFiscaisVendaVO> notasFiscaisVendaVOList3;
	// @OneToMany(mappedBy = "parceirosVO1")
	// private List<CarteiraPedidosVendaVO> carteiraPedidosVendaVOList1;
	// @OneToMany(mappedBy = "parceirosVO4")
	// private List<OrdemDeProducaoVO> ordemDeProducaoVOList4;
	// @OneToMany(mappedBy = "parceirosVO2")
	// private List<CarteiraPedidosVendaVO> carteiraPedidosVendaVOList2;

	public ParceirosVO ()
	{
	}

	public String getAgencia ()
	{
		return agencia;
	}

	public void setAgencia (String agencia)
	{
		this.agencia = agencia;
	}

	public String getBairroCobranca ()
	{
		return bairroCobranca;
	}

	public void setBairroCobranca (String bairroCobranca)
	{
		this.bairroCobranca = bairroCobranca;
	}

	public String getBairroEntrega ()
	{
		return bairroEntrega;
	}

	public void setBairroEntrega (String bairroEntrega)
	{
		this.bairroEntrega = bairroEntrega;
	}

	public String getBanco ()
	{
		return banco;
	}

	public void setBanco (String banco)
	{
		this.banco = banco;
	}

	public Long getCepCobranca ()
	{
		return cepCobranca;
	}

	public void setCepCobranca (Long cepCobranca)
	{
		this.cepCobranca = cepCobranca;
	}

	public Long getCepEntrega ()
	{
		return cepEntrega;
	}

	public void setCepEntrega (Long cepEntrega)
	{
		this.cepEntrega = cepEntrega;
	}

	public String getCgc ()
	{
		return cgc;
	}

	public void setCgc (String cgc)
	{
		this.cgc = cgc;
	}

	public String getCidadeCobranca ()
	{
		return cidadeCobranca;
	}

	public void setCidadeCobranca (String cidadeCobranca)
	{
		this.cidadeCobranca = cidadeCobranca;
	}

	public String getCidadeEntrega ()
	{
		return cidadeEntrega;
	}

	public void setCidadeEntrega (String cidadeEntrega)
	{
		this.cidadeEntrega = cidadeEntrega;
	}

	public String getClienteFornec ()
	{
		return clienteFornec;
	}

	public void setClienteFornec (String clienteFornec)
	{
		this.clienteFornec = clienteFornec;
	}

	public String getCnae ()
	{
		return cnae;
	}

	public void setCnae (String cnae)
	{
		this.cnae = cnae;
	}

	public Long getCodigoCidadeCobranca ()
	{
		return codigoCidadeCobranca;
	}

	public void setCodigoCidadeCobranca (Long codigoCidadeCobranca)
	{
		this.codigoCidadeCobranca = codigoCidadeCobranca;
	}

	public Long getCodigoCidadeEntrega ()
	{
		return codigoCidadeEntrega;
	}

	public void setCodigoCidadeEntrega (Long codigoCidadeEntrega)
	{
		this.codigoCidadeEntrega = codigoCidadeEntrega;
	}

	public Long getCodigoPaisCobranca ()
	{
		return codigoPaisCobranca;
	}

	public void setCodigoPaisCobranca (Long codigoPaisCobranca)
	{
		this.codigoPaisCobranca = codigoPaisCobranca;
	}

	public Long getCodigoPaisEntrega ()
	{
		return codigoPaisEntrega;
	}

	public void setCodigoPaisEntrega (Long codigoPaisEntrega)
	{
		this.codigoPaisEntrega = codigoPaisEntrega;
	}

	public String getCodAntigo ()
	{
		return codAntigo;
	}

	public void setCodAntigo (String codAntigo)
	{
		this.codAntigo = codAntigo;
	}

	public Long getCodBancoCobranca ()
	{
		return codBancoCobranca;
	}

	public void setCodBancoCobranca (Long codBancoCobranca)
	{
		this.codBancoCobranca = codBancoCobranca;
	}

	public Long getCodMunicipioDfc ()
	{
		return codMunicipioDfc;
	}

	public void setCodMunicipioDfc (Long codMunicipioDfc)
	{
		this.codMunicipioDfc = codMunicipioDfc;
	}

	public Long getCodParceiro ()
	{
		return codParceiro;
	}

	public void setCodParceiro (Long codParceiro)
	{
		this.codParceiro = codParceiro;
	}

	public Long getCodTipoParceiro ()
	{
		return codTipoParceiro;
	}

	public void setCodTipoParceiro (Long codTipoParceiro)
	{
		this.codTipoParceiro = codTipoParceiro;
	}

	public Long getCodValidade ()
	{
		return codValidade;
	}

	public void setCodValidade (Long codValidade)
	{
		this.codValidade = codValidade;
	}

	public String getComplementoCobranca ()
	{
		return complementoCobranca;
	}

	public void setComplementoCobranca (String complementoCobranca)
	{
		this.complementoCobranca = complementoCobranca;
	}

	public String getComplementoEntrega ()
	{
		return complementoEntrega;
	}

	public void setComplementoEntrega (String complementoEntrega)
	{
		this.complementoEntrega = complementoEntrega;
	}

	public String getContato ()
	{
		return contato;
	}

	public void setContato (String contato)
	{
		this.contato = contato;
	}

	public String getContaCorrente ()
	{
		return contaCorrente;
	}

	public void setContaCorrente (String contaCorrente)
	{
		this.contaCorrente = contaCorrente;
	}

	public Long getContaCreditoCliente ()
	{
		return contaCreditoCliente;
	}

	public void setContaCreditoCliente (Long contaCreditoCliente)
	{
		this.contaCreditoCliente = contaCreditoCliente;
	}

	public Long getContaCreditoFornecedor ()
	{
		return contaCreditoFornecedor;
	}

	public void setContaCreditoFornecedor (Long contaCreditoFornecedor)
	{
		this.contaCreditoFornecedor = contaCreditoFornecedor;
	}

	public Long getContaDebitoCliente ()
	{
		return contaDebitoCliente;
	}

	public void setContaDebitoCliente (Long contaDebitoCliente)
	{
		this.contaDebitoCliente = contaDebitoCliente;
	}

	public Long getContaDebitoFornecedor ()
	{
		return contaDebitoFornecedor;
	}

	public void setContaDebitoFornecedor (Long contaDebitoFornecedor)
	{
		this.contaDebitoFornecedor = contaDebitoFornecedor;
	}

	public Timestamp getDataIncCrm ()
	{
		return dataIncCrm;
	}

	public void setDataIncCrm (Timestamp dataIncCrm)
	{
		this.dataIncCrm = dataIncCrm;
	}

	public Long getDddCobranca ()
	{
		return dddCobranca;
	}

	public void setDddCobranca (Long dddCobranca)
	{
		this.dddCobranca = dddCobranca;
	}

	public Long getDddEntrega ()
	{
		return dddEntrega;
	}

	public void setDddEntrega (Long dddEntrega)
	{
		this.dddEntrega = dddEntrega;
	}

	public String getEmail ()
	{
		return email;
	}

	public void setEmail (String email)
	{
		this.email = email;
	}

	public String getEnderecoCobranca ()
	{
		return enderecoCobranca;
	}

	public void setEnderecoCobranca (String enderecoCobranca)
	{
		this.enderecoCobranca = enderecoCobranca;
	}

	public String getEnderecoEntrega ()
	{
		return enderecoEntrega;
	}

	public void setEnderecoEntrega (String enderecoEntrega)
	{
		this.enderecoEntrega = enderecoEntrega;
	}

	public String getEp ()
	{
		return ep;
	}

	public void setEp (String ep)
	{
		this.ep = ep;
	}

	public String getFaxEntrega ()
	{
		return faxEntrega;
	}

	public void setFaxEntrega (String faxEntrega)
	{
		this.faxEntrega = faxEntrega;
	}

	public String getFlagAtivo ()
	{
		return flagAtivo;
	}

	public void setFlagAtivo (String flagAtivo)
	{
		this.flagAtivo = flagAtivo;
	}

	public Long getFoneCobranca ()
	{
		return foneCobranca;
	}

	public void setFoneCobranca (Long foneCobranca)
	{
		this.foneCobranca = foneCobranca;
	}

	public Long getFoneEntrega ()
	{
		return foneEntrega;
	}

	public void setFoneEntrega (Long foneEntrega)
	{
		this.foneEntrega = foneEntrega;
	}

	public String getInscrEstadual ()
	{
		return inscrEstadual;
	}

	public void setInscrEstadual (String inscrEstadual)
	{
		this.inscrEstadual = inscrEstadual;
	}

	public String getInscrProdutor ()
	{
		return inscrProdutor;
	}

	public void setInscrProdutor (String inscrProdutor)
	{
		this.inscrProdutor = inscrProdutor;
	}

	public String getInscMunicipal ()
	{
		return inscMunicipal;
	}

	public void setInscMunicipal (String inscMunicipal)
	{
		this.inscMunicipal = inscMunicipal;
	}

	public String getInssPis ()
	{
		return inssPis;
	}

	public void setInssPis (String inssPis)
	{
		this.inssPis = inssPis;
	}

	public String getNomeFantasia ()
	{
		return nomeFantasia;
	}

	public void setNomeFantasia (String nomeFantasia)
	{
		this.nomeFantasia = nomeFantasia;
	}

	public String getNumeroCobranca ()
	{
		return numeroCobranca;
	}

	public void setNumeroCobranca (String numeroCobranca)
	{
		this.numeroCobranca = numeroCobranca;
	}

	public String getNumeroEntrega ()
	{
		return numeroEntrega;
	}

	public void setNumeroEntrega (String numeroEntrega)
	{
		this.numeroEntrega = numeroEntrega;
	}

	public String getRazaoSocial ()
	{
		return razaoSocial;
	}

	public void setRazaoSocial (String razaoSocial)
	{
		this.razaoSocial = razaoSocial;
	}

	public String getRoteiroEntrega ()
	{
		return roteiroEntrega;
	}

	public void setRoteiroEntrega (String roteiroEntrega)
	{
		this.roteiroEntrega = roteiroEntrega;
	}

	public String getRowidMtz ()
	{
		return rowidMtz;
	}

	public void setRowidMtz (String rowidMtz)
	{
		this.rowidMtz = rowidMtz;
	}

	public String getRuc ()
	{
		return ruc;
	}

	public void setRuc (String ruc)
	{
		this.ruc = ruc;
	}

	public String getSenave ()
	{
		return senave;
	}

	public void setSenave (String senave)
	{
		this.senave = senave;
	}

	public String getTipoPessoa ()
	{
		return tipoPessoa;
	}

	public void setTipoPessoa (String tipoPessoa)
	{
		this.tipoPessoa = tipoPessoa;
	}

	public String getUfCobranca ()
	{
		return ufCobranca;
	}

	public void setUfCobranca (String ufCobranca)
	{
		this.ufCobranca = ufCobranca;
	}

	public String getUfEntrega ()
	{
		return ufEntrega;
	}

	public void setUfEntrega (String ufEntrega)
	{
		this.ufEntrega = ufEntrega;
	}

	public Double getVlrLimiteCredito ()
	{
		return vlrLimiteCredito;
	}

	public void setVlrLimiteCredito (Double vlrLimiteCredito)
	{
		this.vlrLimiteCredito = vlrLimiteCredito;
	}

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
	// notasFiscaisVendaVO.setParceirosVO(this);
	// return notasFiscaisVendaVO;
	// }
	//
	// public NotasFiscaisVendaVO removeNotasFiscaisVendaVO (NotasFiscaisVendaVO
	// notasFiscaisVendaVO)
	// {
	// getNotasFiscaisVendaVOList().remove(notasFiscaisVendaVO);
	// notasFiscaisVendaVO.setParceirosVO(null);
	// return notasFiscaisVendaVO;
	// }
	//
	// public List<AgentesVendaVO> getAgentesVendaVOList ()
	// {
	// return agentesVendaVOList;
	// }
	//
	// public void setAgentesVendaVOList (List<AgentesVendaVO>
	// agentesVendaVOList)
	// {
	// this.agentesVendaVOList = agentesVendaVOList;
	// }
	//
	// public AgentesVendaVO addAgentesVendaVO (AgentesVendaVO agentesVendaVO)
	// {
	// getAgentesVendaVOList().add(agentesVendaVO);
	// agentesVendaVO.setParceirosVO(this);
	// return agentesVendaVO;
	// }
	//
	// public AgentesVendaVO removeAgentesVendaVO (AgentesVendaVO
	// agentesVendaVO)
	// {
	// getAgentesVendaVOList().remove(agentesVendaVO);
	// agentesVendaVO.setParceirosVO(null);
	// return agentesVendaVO;
	// }
	//
	// public List<NotasFiscaisVendaVO> getNotasFiscaisVendaVOList1 ()
	// {
	// return notasFiscaisVendaVOList1;
	// }
	//
	// public void setNotasFiscaisVendaVOList1 (List<NotasFiscaisVendaVO>
	// notasFiscaisVendaVOList1)
	// {
	// this.notasFiscaisVendaVOList1 = notasFiscaisVendaVOList1;
	// }
	//
	// public NotasFiscaisVendaVO addNotasFiscaisVendaVO1 (NotasFiscaisVendaVO
	// notasFiscaisVendaVO)
	// {
	// getNotasFiscaisVendaVOList1().add(notasFiscaisVendaVO);
	// notasFiscaisVendaVO.setParceirosVO1(this);
	// return notasFiscaisVendaVO;
	// }
	//
	// public NotasFiscaisVendaVO removeNotasFiscaisVendaVO1
	// (NotasFiscaisVendaVO notasFiscaisVendaVO)
	// {
	// getNotasFiscaisVendaVOList1().remove(notasFiscaisVendaVO);
	// notasFiscaisVendaVO.setParceirosVO1(null);
	// return notasFiscaisVendaVO;
	// }
	//
	// public List<NotasFiscaisVendaVO> getNotasFiscaisVendaVOList2 ()
	// {
	// return notasFiscaisVendaVOList2;
	// }
	//
	// public void setNotasFiscaisVendaVOList2 (List<NotasFiscaisVendaVO>
	// notasFiscaisVendaVOList2)
	// {
	// this.notasFiscaisVendaVOList2 = notasFiscaisVendaVOList2;
	// }
	//
	// public NotasFiscaisVendaVO addNotasFiscaisVendaVO2 (NotasFiscaisVendaVO
	// notasFiscaisVendaVO)
	// {
	// getNotasFiscaisVendaVOList2().add(notasFiscaisVendaVO);
	// notasFiscaisVendaVO.setParceirosVO2(this);
	// return notasFiscaisVendaVO;
	// }
	//
	// public NotasFiscaisVendaVO removeNotasFiscaisVendaVO2
	// (NotasFiscaisVendaVO notasFiscaisVendaVO)
	// {
	// getNotasFiscaisVendaVOList2().remove(notasFiscaisVendaVO);
	// notasFiscaisVendaVO.setParceirosVO2(null);
	// return notasFiscaisVendaVO;
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
	// carteiraPedidosVendaVO.setParceirosVO(this);
	// return carteiraPedidosVendaVO;
	// }
	//
	// public CarteiraPedidosVendaVO removeCarteiraPedidosVendaVO (
	// CarteiraPedidosVendaVO carteiraPedidosVendaVO)
	// {
	// getCarteiraPedidosVendaVOList().remove(carteiraPedidosVendaVO);
	// carteiraPedidosVendaVO.setParceirosVO(null);
	// return carteiraPedidosVendaVO;
	// }
	//
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
	// ordemDeProducaoVO.setParceirosVO(this);
	// return ordemDeProducaoVO;
	// }
	//
	// public OrdemDeProducaoVO removeOrdemDeProducaoVO (OrdemDeProducaoVO
	// ordemDeProducaoVO)
	// {
	// getOrdemDeProducaoVOList().remove(ordemDeProducaoVO);
	// ordemDeProducaoVO.setParceirosVO(null);
	// return ordemDeProducaoVO;
	// }

	// public List<OrdemDeProducaoVO> getOrdemDeProducaoVOList1 ()
	// {
	// return ordemDeProducaoVOList1;
	// }
	//
	// public void setOrdemDeProducaoVOList1 (List<OrdemDeProducaoVO>
	// ordemDeProducaoVOList1)
	// {
	// this.ordemDeProducaoVOList1 = ordemDeProducaoVOList1;
	// }
	//
	// public OrdemDeProducaoVO addOrdemDeProducaoVO1 (OrdemDeProducaoVO
	// ordemDeProducaoVO)
	// {
	// getOrdemDeProducaoVOList1().add(ordemDeProducaoVO);
	// ordemDeProducaoVO.setParceirosVO1(this);
	// return ordemDeProducaoVO;
	// }
	//
	// public OrdemDeProducaoVO removeOrdemDeProducaoVO1 (OrdemDeProducaoVO
	// ordemDeProducaoVO)
	// {
	// getOrdemDeProducaoVOList1().remove(ordemDeProducaoVO);
	// ordemDeProducaoVO.setParceirosVO1(null);
	// return ordemDeProducaoVO;
	// }
	//
	// public List<OrdemDeProducaoVO> getOrdemDeProducaoVOList2 ()
	// {
	// return ordemDeProducaoVOList2;
	// }
	//
	// public void setOrdemDeProducaoVOList2 (List<OrdemDeProducaoVO>
	// ordemDeProducaoVOList2)
	// {
	// this.ordemDeProducaoVOList2 = ordemDeProducaoVOList2;
	// }
	//
	// public OrdemDeProducaoVO addOrdemDeProducaoVO2 (OrdemDeProducaoVO
	// ordemDeProducaoVO)
	// {
	// getOrdemDeProducaoVOList2().add(ordemDeProducaoVO);
	// ordemDeProducaoVO.setParceirosVO2(this);
	// return ordemDeProducaoVO;
	// }
	//
	// public OrdemDeProducaoVO removeOrdemDeProducaoVO2 (OrdemDeProducaoVO
	// ordemDeProducaoVO)
	// {
	// getOrdemDeProducaoVOList2().remove(ordemDeProducaoVO);
	// ordemDeProducaoVO.setParceirosVO2(null);
	// return ordemDeProducaoVO;
	// }
	//
	// public List<OrdemDeProducaoVO> getOrdemDeProducaoVOList3 ()
	// {
	// return ordemDeProducaoVOList3;
	// }
	//
	// public void setOrdemDeProducaoVOList3 (List<OrdemDeProducaoVO>
	// ordemDeProducaoVOList3)
	// {
	// this.ordemDeProducaoVOList3 = ordemDeProducaoVOList3;
	// }
	//
	// public OrdemDeProducaoVO addOrdemDeProducaoVO3 (OrdemDeProducaoVO
	// ordemDeProducaoVO)
	// {
	// getOrdemDeProducaoVOList3().add(ordemDeProducaoVO);
	// ordemDeProducaoVO.setParceirosVO3(this);
	// return ordemDeProducaoVO;
	// }
	//
	// public OrdemDeProducaoVO removeOrdemDeProducaoVO3 (OrdemDeProducaoVO
	// ordemDeProducaoVO)
	// {
	// getOrdemDeProducaoVOList3().remove(ordemDeProducaoVO);
	// ordemDeProducaoVO.setParceirosVO3(null);
	// return ordemDeProducaoVO;
	// }
	//
	// public List<NotasFiscaisVendaVO> getNotasFiscaisVendaVOList3 ()
	// {
	// return notasFiscaisVendaVOList3;
	// }
	//
	// public void setNotasFiscaisVendaVOList3 (List<NotasFiscaisVendaVO>
	// notasFiscaisVendaVOList3)
	// {
	// this.notasFiscaisVendaVOList3 = notasFiscaisVendaVOList3;
	// }
	//
	// public NotasFiscaisVendaVO addNotasFiscaisVendaVO3 (NotasFiscaisVendaVO
	// notasFiscaisVendaVO)
	// {
	// getNotasFiscaisVendaVOList3().add(notasFiscaisVendaVO);
	// notasFiscaisVendaVO.setParceirosVO3(this);
	// return notasFiscaisVendaVO;
	// }
	//
	// public NotasFiscaisVendaVO removeNotasFiscaisVendaVO3
	// (NotasFiscaisVendaVO notasFiscaisVendaVO)
	// {
	// getNotasFiscaisVendaVOList3().remove(notasFiscaisVendaVO);
	// notasFiscaisVendaVO.setParceirosVO3(null);
	// return notasFiscaisVendaVO;
	// }
	//
	// public List<CarteiraPedidosVendaVO> getCarteiraPedidosVendaVOList1 ()
	// {
	// return carteiraPedidosVendaVOList1;
	// }
	//
	// public void setCarteiraPedidosVendaVOList1 (
	// List<CarteiraPedidosVendaVO> carteiraPedidosVendaVOList1)
	// {
	// this.carteiraPedidosVendaVOList1 = carteiraPedidosVendaVOList1;
	// }
	//
	// public CarteiraPedidosVendaVO addCarteiraPedidosVendaVO1 (
	// CarteiraPedidosVendaVO carteiraPedidosVendaVO)
	// {
	// getCarteiraPedidosVendaVOList1().add(carteiraPedidosVendaVO);
	// carteiraPedidosVendaVO.setParceirosVO1(this);
	// return carteiraPedidosVendaVO;
	// }
	//
	// public CarteiraPedidosVendaVO removeCarteiraPedidosVendaVO1 (
	// CarteiraPedidosVendaVO carteiraPedidosVendaVO)
	// {
	// getCarteiraPedidosVendaVOList1().remove(carteiraPedidosVendaVO);
	// carteiraPedidosVendaVO.setParceirosVO1(null);
	// return carteiraPedidosVendaVO;
	// }
	//
	// public List<OrdemDeProducaoVO> getOrdemDeProducaoVOList4 ()
	// {
	// return ordemDeProducaoVOList4;
	// }
	//
	// public void setOrdemDeProducaoVOList4 (List<OrdemDeProducaoVO>
	// ordemDeProducaoVOList4)
	// {
	// this.ordemDeProducaoVOList4 = ordemDeProducaoVOList4;
	// }
	//
	// public OrdemDeProducaoVO addOrdemDeProducaoVO4 (OrdemDeProducaoVO
	// ordemDeProducaoVO)
	// {
	// getOrdemDeProducaoVOList4().add(ordemDeProducaoVO);
	// ordemDeProducaoVO.setParceirosVO4(this);
	// return ordemDeProducaoVO;
	// }
	//
	// public OrdemDeProducaoVO removeOrdemDeProducaoVO4 (OrdemDeProducaoVO
	// ordemDeProducaoVO)
	// {
	// getOrdemDeProducaoVOList4().remove(ordemDeProducaoVO);
	// ordemDeProducaoVO.setParceirosVO4(null);
	// return ordemDeProducaoVO;
	// }
	//
	// public List<CarteiraPedidosVendaVO> getCarteiraPedidosVendaVOList2 ()
	// {
	// return carteiraPedidosVendaVOList2;
	// }
	//
	// public void setCarteiraPedidosVendaVOList2 (
	// List<CarteiraPedidosVendaVO> carteiraPedidosVendaVOList2)
	// {
	// this.carteiraPedidosVendaVOList2 = carteiraPedidosVendaVOList2;
	// }
	//
	// public CarteiraPedidosVendaVO addCarteiraPedidosVendaVO2 (
	// CarteiraPedidosVendaVO carteiraPedidosVendaVO)
	// {
	// getCarteiraPedidosVendaVOList2().add(carteiraPedidosVendaVO);
	// carteiraPedidosVendaVO.setParceirosVO2(this);
	// return carteiraPedidosVendaVO;
	// }
	//
	// public CarteiraPedidosVendaVO removeCarteiraPedidosVendaVO2 (
	// CarteiraPedidosVendaVO carteiraPedidosVendaVO)
	// {
	// getCarteiraPedidosVendaVOList2().remove(carteiraPedidosVendaVO);
	// carteiraPedidosVendaVO.setParceirosVO2(null);
	// return carteiraPedidosVendaVO;
	// }

	public FiliaisVO getFiliaisEpVO ()
	{
		return filiaisEpVO;
	}

	public void setFiliaisEpVO (FiliaisVO filiaisEpVO)
	{
		this.filiaisEpVO = filiaisEpVO;
	}
}
