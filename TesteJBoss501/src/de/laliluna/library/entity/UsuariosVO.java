/**
 * 
 */
package de.laliluna.library.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * @author rabelo
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "UsuariosVO.findAll", query = "select o from UsuariosVO o"),
    @NamedQuery(name = "UsuariosVO.findByLoginPassword", query = "select o from UsuariosVO o where o.username=:username and o.password=:password"),
    @NamedQuery(name = "UsuariosVO.findById", query = "select p from UsuariosVO p where p.username=:username")})
@Table(name = "USUARIOS")
public class UsuariosVO
    implements Serializable
{
	private static final long serialVersionUID = 1L;

	@Id
	@Column(nullable = false)
	private String username;

	@Column(nullable = false)
	private String password;

	@Column(name = "COD_CLIENTE_VENDEDOR")
	private Long codClienteVendedor;
	@Column(name = "COD_SUPERVISOR", nullable = false)
	private Long codSupervisor;
	@Column(name = "COD_TEMPLATE")
	private Long codTemplate;
	@Column(name = "DATABASE_ALIAS")
	private String databaseAlias;
	@Column(name = "EXPIRE_PASSWORD", nullable = false)
	private Timestamp expirePassword;
	@Column(name = "NIVEL_TABELA_PRECO", nullable = false)
	private Long nivelTabelaPreco;
	@Column(name = "SENHA_PRIVILEGIADA")
	private String senhaPrivilegiada;
	@Column(name = "FLAG_BALANCA")
	private String flagBalanca;
	@Column(name = "FLAG_USUARIO_INTERNO")
	private String flagUsuarioInterno;


	/**
	 * 
	 */
	public UsuariosVO ()
	{
		super();
	}

	/**
	 * @param username
	 * @param password
	 * @param codClienteVendedor
	 * @param codSupervisor
	 * @param codTemplate
	 * @param databaseAlias
	 * @param expirePassword
	 * @param nivelTabelaPreco
	 * @param senhaPrivilegiada
	 * @param flagBalanca
	 * @param flagUsuarioInterno
	 * @param userAddr
	 */
	public UsuariosVO (String username, String password, Long codClienteVendedor,
	    Long codSupervisor, Long codTemplate, String databaseAlias, Timestamp expirePassword,
	    Long nivelTabelaPreco, String senhaPrivilegiada, String flagBalanca,
	    String flagUsuarioInterno)
	{
		super();
		this.username = username;
		this.password = password;
		this.codClienteVendedor = codClienteVendedor;
		this.codSupervisor = codSupervisor;
		this.codTemplate = codTemplate;
		this.databaseAlias = databaseAlias;
		this.expirePassword = expirePassword;
		this.nivelTabelaPreco = nivelTabelaPreco;
		this.senhaPrivilegiada = senhaPrivilegiada;
		this.flagBalanca = flagBalanca;
		this.flagUsuarioInterno = flagUsuarioInterno;
	}

	/**
	 * @return the username
	 */
	public String getUsername ()
	{
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername (String username)
	{
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword ()
	{
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword (String password)
	{
		this.password = password;
	}

	/**
	 * @return the codClienteVendedor
	 */
	public Long getCodClienteVendedor ()
	{
		return codClienteVendedor;
	}

	/**
	 * @param codClienteVendedor the codClienteVendedor to set
	 */
	public void setCodClienteVendedor (Long codClienteVendedor)
	{
		this.codClienteVendedor = codClienteVendedor;
	}

	/**
	 * @return the codSupervisor
	 */
	public Long getCodSupervisor ()
	{
		return codSupervisor;
	}

	/**
	 * @param codSupervisor the codSupervisor to set
	 */
	public void setCodSupervisor (Long codSupervisor)
	{
		this.codSupervisor = codSupervisor;
	}

	/**
	 * @return the codTemplate
	 */
	public Long getCodTemplate ()
	{
		return codTemplate;
	}

	/**
	 * @param codTemplate the codTemplate to set
	 */
	public void setCodTemplate (Long codTemplate)
	{
		this.codTemplate = codTemplate;
	}

	/**
	 * @return the databaseAlias
	 */
	public String getDatabaseAlias ()
	{
		return databaseAlias;
	}

	/**
	 * @param databaseAlias the databaseAlias to set
	 */
	public void setDatabaseAlias (String databaseAlias)
	{
		this.databaseAlias = databaseAlias;
	}

	/**
	 * @return the expirePassword
	 */
	public Timestamp getExpirePassword ()
	{
		return expirePassword;
	}

	/**
	 * @param expirePassword the expirePassword to set
	 */
	public void setExpirePassword (Timestamp expirePassword)
	{
		this.expirePassword = expirePassword;
	}

	/**
	 * @return the nivelTabelaPreco
	 */
	public Long getNivelTabelaPreco ()
	{
		return nivelTabelaPreco;
	}

	/**
	 * @param nivelTabelaPreco the nivelTabelaPreco to set
	 */
	public void setNivelTabelaPreco (Long nivelTabelaPreco)
	{
		this.nivelTabelaPreco = nivelTabelaPreco;
	}

	/**
	 * @return the senhaPrivilegiada
	 */
	public String getSenhaPrivilegiada ()
	{
		return senhaPrivilegiada;
	}

	/**
	 * @param senhaPrivilegiada the senhaPrivilegiada to set
	 */
	public void setSenhaPrivilegiada (String senhaPrivilegiada)
	{
		this.senhaPrivilegiada = senhaPrivilegiada;
	}

	/**
	 * @return the flagBalanca
	 */
	public String getFlagBalanca ()
	{
		return flagBalanca;
	}

	/**
	 * @param flagBalanca the flagBalanca to set
	 */
	public void setFlagBalanca (String flagBalanca)
	{
		this.flagBalanca = flagBalanca;
	}

	/**
	 * @return the flagUsuarioInterno
	 */
	public String getFlagUsuarioInterno ()
	{
		return flagUsuarioInterno;
	}

	/**
	 * @param flagUsuarioInterno the flagUsuarioInterno to set
	 */
	public void setFlagUsuarioInterno (String flagUsuarioInterno)
	{
		this.flagUsuarioInterno = flagUsuarioInterno;
	}
}
