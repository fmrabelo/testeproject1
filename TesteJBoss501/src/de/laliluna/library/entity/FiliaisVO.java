package de.laliluna.library.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@NamedQuery(name = "FiliaisVO.findAll", query = "select o from FiliaisVO o")
@Table(name = "FILIAIS")
public class FiliaisVO
    implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2047062879629355200L;

	@Id
	@Column(name = "COD_FILIAL", nullable = false)
	private Long codFilial;

	@Column(name = "ATIV_ECONOMICA")
	private Long ativEconomica;
	private String bairro;
	@Column(name = "CAIXA_POSTAL")
	private Long caixaPostal;
	private String cep;
	private String cgc;
	private String cidade;
	@Column(name = "DATA_FECHAMENTO_ICMS")
	private Timestamp dataFechamentoIcms;
	private Long ddd;
	@Column(name = "DT_REGISTRO_JUNTA")
	private Timestamp dtRegistroJunta;
	private String ec;
	private String email;
	@Column(name = "EMBUTE_FRETE", nullable = false)
	private String embuteFrete;
	private String endereco;
	private String ep;
	private String fax;
	@Column(name = "FLAG_FILTRO_LOCAL")
	private String flagFiltroLocal;
	private String fone;
	@Column(name = "INSCR_ESTADUAL")
	private String inscrEstadual;
	@Column(name = "INSCR_MUNICIPAL")
	private String inscrMunicipal;
	@Column(name = "NOME_ABREV")
	private String nomeAbrev;
	@Column(name = "NOME_FANTASIA")
	private String nomeFantasia;
	private String observacao;
	@Column(name = "RAZAO_SOCIAL")
	private String razaoSocial;
	@Column(name = "REG_DECEX")
	private String regDecex;
	@Column(name = "REG_JUNTA_COMERCIAL")
	private String regJuntaComercial;
	private String uf;

	@OneToMany(mappedBy = "filiaisVO")
	private List<ParceirosVO> parceirosVOList;

	@OneToMany(mappedBy = "filiaisEpVO")
	private List<ParceirosVO> parceirosVOListFilialEp;

	@OneToMany(mappedBy = "filiaisVO")
	private List<OrdemDeProducaoVO> ordemDeProducaoVOList;

	@OneToMany(mappedBy = "filiaisVO")
	private List<NotasFiscaisVendaVO> notasFiscaisVendaVOList;

	@OneToMany(mappedBy = "filiaisFreteVO")
	private List<NotasFiscaisVendaVO> notasFiscaisVendaVOfiliaisFreteVOList1;

	@OneToMany(mappedBy = "filiaisVO")
	private List<CarteiraPedidosVendaVO> carteiraPedidosVendaVOList;

	public FiliaisVO ()
	{
	}

	public Long getAtivEconomica ()
	{
		return ativEconomica;
	}

	public void setAtivEconomica (Long ativEconomica)
	{
		this.ativEconomica = ativEconomica;
	}

	public String getBairro ()
	{
		return bairro;
	}

	public void setBairro (String bairro)
	{
		this.bairro = bairro;
	}

	public Long getCaixaPostal ()
	{
		return caixaPostal;
	}

	public void setCaixaPostal (Long caixaPostal)
	{
		this.caixaPostal = caixaPostal;
	}

	public String getCep ()
	{
		return cep;
	}

	public void setCep (String cep)
	{
		this.cep = cep;
	}

	public String getCgc ()
	{
		return cgc;
	}

	public void setCgc (String cgc)
	{
		this.cgc = cgc;
	}

	public String getCidade ()
	{
		return cidade;
	}

	public void setCidade (String cidade)
	{
		this.cidade = cidade;
	}

	public Long getCodFilial ()
	{
		return codFilial;
	}

	public void setCodFilial (Long codFilial)
	{
		this.codFilial = codFilial;
	}

	public Timestamp getDataFechamentoIcms ()
	{
		return dataFechamentoIcms;
	}

	public void setDataFechamentoIcms (Timestamp dataFechamentoIcms)
	{
		this.dataFechamentoIcms = dataFechamentoIcms;
	}

	public Long getDdd ()
	{
		return ddd;
	}

	public void setDdd (Long ddd)
	{
		this.ddd = ddd;
	}

	public Timestamp getDtRegistroJunta ()
	{
		return dtRegistroJunta;
	}

	public void setDtRegistroJunta (Timestamp dtRegistroJunta)
	{
		this.dtRegistroJunta = dtRegistroJunta;
	}

	public String getEc ()
	{
		return ec;
	}

	public void setEc (String ec)
	{
		this.ec = ec;
	}

	public String getEmail ()
	{
		return email;
	}

	public void setEmail (String email)
	{
		this.email = email;
	}

	public String getEmbuteFrete ()
	{
		return embuteFrete;
	}

	public void setEmbuteFrete (String embuteFrete)
	{
		this.embuteFrete = embuteFrete;
	}

	public String getEndereco ()
	{
		return endereco;
	}

	public void setEndereco (String endereco)
	{
		this.endereco = endereco;
	}

	public String getEp ()
	{
		return ep;
	}

	public void setEp (String ep)
	{
		this.ep = ep;
	}

	public String getFax ()
	{
		return fax;
	}

	public void setFax (String fax)
	{
		this.fax = fax;
	}

	public String getFlagFiltroLocal ()
	{
		return flagFiltroLocal;
	}

	public void setFlagFiltroLocal (String flagFiltroLocal)
	{
		this.flagFiltroLocal = flagFiltroLocal;
	}

	public String getFone ()
	{
		return fone;
	}

	public void setFone (String fone)
	{
		this.fone = fone;
	}

	public String getInscrEstadual ()
	{
		return inscrEstadual;
	}

	public void setInscrEstadual (String inscrEstadual)
	{
		this.inscrEstadual = inscrEstadual;
	}

	public String getInscrMunicipal ()
	{
		return inscrMunicipal;
	}

	public void setInscrMunicipal (String inscrMunicipal)
	{
		this.inscrMunicipal = inscrMunicipal;
	}

	public String getNomeAbrev ()
	{
		return nomeAbrev;
	}

	public void setNomeAbrev (String nomeAbrev)
	{
		this.nomeAbrev = nomeAbrev;
	}

	public String getNomeFantasia ()
	{
		return nomeFantasia;
	}

	public void setNomeFantasia (String nomeFantasia)
	{
		this.nomeFantasia = nomeFantasia;
	}

	public String getObservacao ()
	{
		return observacao;
	}

	public void setObservacao (String observacao)
	{
		this.observacao = observacao;
	}

	public String getRazaoSocial ()
	{
		return razaoSocial;
	}

	public void setRazaoSocial (String razaoSocial)
	{
		this.razaoSocial = razaoSocial;
	}

	public String getRegDecex ()
	{
		return regDecex;
	}

	public void setRegDecex (String regDecex)
	{
		this.regDecex = regDecex;
	}

	public String getRegJuntaComercial ()
	{
		return regJuntaComercial;
	}

	public void setRegJuntaComercial (String regJuntaComercial)
	{
		this.regJuntaComercial = regJuntaComercial;
	}

	public String getUf ()
	{
		return uf;
	}

	public void setUf (String uf)
	{
		this.uf = uf;
	}

	public List<NotasFiscaisVendaVO> getNotasFiscaisVendaVOList ()
	{
		return notasFiscaisVendaVOList;
	}

	public void setNotasFiscaisVendaVOList (List<NotasFiscaisVendaVO> notasFiscaisVendaVOList)
	{
		this.notasFiscaisVendaVOList = notasFiscaisVendaVOList;
	}

	// public NotasFiscaisVendaVO addNotasFiscaisVendaVO(NotasFiscaisVendaVO
	// notasFiscaisVendaVO) {
	// getNotasFiscaisVendaVOList().add(notasFiscaisVendaVO);
	// notasFiscaisVendaVO.setFiliaisVO(this);
	// return notasFiscaisVendaVO;
	// }
	//
	// public NotasFiscaisVendaVO removeNotasFiscaisVendaVO(NotasFiscaisVendaVO
	// notasFiscaisVendaVO) {
	// getNotasFiscaisVendaVOList().remove(notasFiscaisVendaVO);
	// notasFiscaisVendaVO.setFiliaisVO(null);
	// return notasFiscaisVendaVO;
	// }
	//
	public List<ParceirosVO> getParceirosVOList ()
	{
		return parceirosVOList;
	}

	public void setParceirosVOList (List<ParceirosVO> parceirosVOList)
	{
		this.parceirosVOList = parceirosVOList;
	}

	// public ParceirosVO addParceirosVO(ParceirosVO parceirosVO) {
	// getParceirosVOList().add(parceirosVO);
	// parceirosVO.setFiliaisVO(this);
	// return parceirosVO;
	// }
	//
	// public ParceirosVO removeParceirosVO(ParceirosVO parceirosVO) {
	// getParceirosVOList().remove(parceirosVO);
	// parceirosVO.setFiliaisVO(null);
	// return parceirosVO;
	// }
	//
	// public List<NotasFiscaisVendaVO> getNotasFiscaisVendaVOList1() {
	// return notasFiscaisVendaVOList1;
	// }
	//
	// public void setNotasFiscaisVendaVOList1(List<NotasFiscaisVendaVO>
	// notasFiscaisVendaVOList1) {
	// this.notasFiscaisVendaVOList1 = notasFiscaisVendaVOList1;
	// }
	//
	// public NotasFiscaisVendaVO addNotasFiscaisVendaVO1(NotasFiscaisVendaVO
	// notasFiscaisVendaVO) {
	// getNotasFiscaisVendaVOList1().add(notasFiscaisVendaVO);
	// notasFiscaisVendaVO.setFiliaisVO1(this);
	// return notasFiscaisVendaVO;
	// }
	//
	// public NotasFiscaisVendaVO removeNotasFiscaisVendaVO1(NotasFiscaisVendaVO
	// notasFiscaisVendaVO) {
	// getNotasFiscaisVendaVOList1().remove(notasFiscaisVendaVO);
	// notasFiscaisVendaVO.setFiliaisVO1(null);
	// return notasFiscaisVendaVO;
	// }
	//
	// public ParceirosVO addParceirosVO1(ParceirosVO parceirosVO) {
	// getParceirosVOList1().add(parceirosVO);
	// parceirosVO.setFiliaisVO1(this);
	// return parceirosVO;
	// }
	//
	// public ParceirosVO removeParceirosVO1(ParceirosVO parceirosVO) {
	// getParceirosVOList1().remove(parceirosVO);
	// parceirosVO.setFiliaisVO1(null);
	// return parceirosVO;
	// }

	public List<CarteiraPedidosVendaVO> getCarteiraPedidosVendaVOList ()
	{
		return carteiraPedidosVendaVOList;
	}

	public void setCarteiraPedidosVendaVOList (
	    List<CarteiraPedidosVendaVO> carteiraPedidosVendaVOList)
	{
		this.carteiraPedidosVendaVOList = carteiraPedidosVendaVOList;
	}

	//
	// public CarteiraPedidosVendaVO
	// addCarteiraPedidosVendaVO(CarteiraPedidosVendaVO carteiraPedidosVendaVO)
	// {
	// getCarteiraPedidosVendaVOList().add(carteiraPedidosVendaVO);
	// carteiraPedidosVendaVO.setFiliaisVO(this);
	// return carteiraPedidosVendaVO;
	// }
	//
	// public CarteiraPedidosVendaVO
	// removeCarteiraPedidosVendaVO(CarteiraPedidosVendaVO
	// carteiraPedidosVendaVO) {
	// getCarteiraPedidosVendaVOList().remove(carteiraPedidosVendaVO);
	// carteiraPedidosVendaVO.setFiliaisVO(null);
	// return carteiraPedidosVendaVO;
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

	//
	// public OrdemDeProducaoVO addOrdemDeProducaoVO(OrdemDeProducaoVO
	// ordemDeProducaoVO) {
	// getOrdemDeProducaoVOList().add(ordemDeProducaoVO);
	// ordemDeProducaoVO.setFiliaisVO(this);
	// return ordemDeProducaoVO;
	// }
	//
	// public OrdemDeProducaoVO removeOrdemDeProducaoVO(OrdemDeProducaoVO
	// ordemDeProducaoVO) {
	// getOrdemDeProducaoVOList().remove(ordemDeProducaoVO);
	// ordemDeProducaoVO.setFiliaisVO(null);
	// return ordemDeProducaoVO;
	// }

	public List<NotasFiscaisVendaVO> getNotasFiscaisVendaVOfiliaisFreteVOList1 ()
	{
		return notasFiscaisVendaVOfiliaisFreteVOList1;
	}

	public void setNotasFiscaisVendaVOfiliaisFreteVOList1 (
	    List<NotasFiscaisVendaVO> notasFiscaisVendaVOfiliaisFreteVOList1)
	{
		this.notasFiscaisVendaVOfiliaisFreteVOList1 = notasFiscaisVendaVOfiliaisFreteVOList1;
	}

	public List<ParceirosVO> getParceirosVOListFilialEp ()
	{
		return parceirosVOListFilialEp;
	}

	public void setParceirosVOListFilialEp (List<ParceirosVO> parceirosVOListFilialEp)
	{
		this.parceirosVOListFilialEp = parceirosVOListFilialEp;
	}
}
