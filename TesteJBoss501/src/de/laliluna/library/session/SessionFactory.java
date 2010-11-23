package de.laliluna.library.session;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;


/**
 * Classe Factory que trabalha como interface aos session Beans da camada Core
 * de negócio.
 * @author Fertipar
 */
public final class SessionFactory
    implements Serializable
{
	private static final long serialVersionUID = 1684584130338296210L;
	private static SessionFactory instance = null;
	private static Context context = null;
	// DATASOURCE
	private final static String DATASOURCENAME = "java:/ORAFERTIDS";

	private SessionFactory ()
	{
	}

	private synchronized static void createInstance () throws NamingException
	{
		instance = new SessionFactory();
		// Remote Session bean
		context = new InitialContext();
	}

	public static final SessionFactory getInstance ()
	{
		if (instance == null)
		{
			try
			{
				createInstance();
			}
			catch (NamingException ne)
			{
				ne.printStackTrace();
			}
		}
		return instance;
	}
	@SuppressWarnings("unchecked")
	public final Object getSession (Class klass)
	{
		return this.lookupRemote(klass);
	}
	/**
	 * @param jndiName
	 * @return
	 */
	@SuppressWarnings("unchecked")
	private final Object lookupRemote (Class klass)
	{
		if (klass == null)
		{
			return null;
		}
		Object poji = null;
		try
		{
			poji = (Object)context.lookup(klass.getSimpleName()+"/remote");
		}
		catch (NamingException ne)
		{
			ne.printStackTrace();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return poji;
	}


	/**
	 * @return
	 */
	public final Connection getConnection ()
	{
		try
		{
			DataSource ds = (DataSource)context.lookup(DATASOURCENAME);
			if (ds != null)
			{
				return ds.getConnection();
			}
		}
		catch (NamingException ne)
		{
			ne.printStackTrace();
		}
		catch (SQLException sqle)
		{
			sqle.printStackTrace();
		}

		return null;
	}
}
