/**
 * 
 */
package br.com.oappr.teste.action;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

/**
 * @author rabelo
 */
public class OlaMundoAction
{
	@Action(value = "olaMundoStruts", results = {@Result(location = "/jsp/olaMundoStruts.jsp", name = "success")})
	public String execute ()
	{
		// conexao oracle.
		this.getConection();
		System.out.printf("%s%n",
		    "--> Classe OlaMundoAction.java -- Executando a lógica com Struts2");
		// return "ok";
		return com.opensymphony.xwork2.Action.SUCCESS;
	}

	private final void getConection ()
	{
		Statement stm = null;
		ResultSet rs = null;
		Connection conn = null;
		try
		{
			final Context initContext = new InitialContext();
			final Context envContext = (Context)initContext.lookup("java:/comp/env");
			final DataSource ds = (DataSource)envContext.lookup("jdbc/myoracle");
			conn = ds.getConnection();

			if (conn == null)
			{
				System.err.println("conexao oracle nao criada...");
			}
			else
			{
				System.out.println("Conexao criada com sucesso...");
				stm = conn.createStatement();
				rs = stm.executeQuery("SELECT * FROM PARAMETROS_TEMPORARIOS");
				while ((rs != null) && rs.next())
				{
					System.out.println(rs.getObject(1));
					System.out.println(rs.getObject(2));
				}
			}
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
		catch (Throwable th)
		{
			th.printStackTrace();
		}
		finally
		{
			try
			{
				if (rs != null)
				{
					rs.close();
				}
				if (stm != null)
				{
					stm.close();
				}
				if (conn != null)
				{
					conn.close();
				}
			}
			catch (Exception ex)
			{
				ex.printStackTrace();
			}
			rs = null;
			stm = null;
			conn = null;
		}
	}
}
