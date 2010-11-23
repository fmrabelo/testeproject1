package de.laliluna.library.session.bean;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;
import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

import de.laliluna.library.entity.FiliaisVO;
import de.laliluna.library.entity.OrdemDeProducaoVO;
import de.laliluna.library.entity.UsuariosVO;
import de.laliluna.library.entity.pk.OrdemDeProducaoVOPK;
import de.laliluna.library.session.BookTestBeanLocal;
import de.laliluna.library.session.BookTestBeanRemote;
import de.laliluna.library.session.SessionFactory;

@Stateless(name = "BookTestBean")
public class BookTestBean
    implements BookTestBeanLocal, BookTestBeanRemote
{
	// @PersistenceContext(unitName = "unitNameTeste-db1", type =
	// PersistenceContextType.TRANSACTION)
	// private EntityManager em1;

	@PersistenceContext(unitName = "unitJbossTeste")
	EntityManager em;

	// public static final String RemoteJNDIName =
	// BookTestBean.class.getSimpleName() + "/remote";
	public static final String RemoteJNDIName = "BookTestBean/remote";
	public static final String LocalJNDIName = BookTestBean.class.getSimpleName() + "/local";

	public int somaLocal (int x, int y)
	{
		System.out.println("SessionBean Stateless acessado via Interface LOCAL....");
		return x + y;
	}

	public int somaRemote (int x, int y)
	{
		System.out.println("SessionBean Stateless acessado via Interface JNDI REMOTE....");

		return x + y;
	}

	@SuppressWarnings("unchecked")
	public final void test ()
	{
		try
		{
			long tempo = 0;
			// 2: listar todas filiais
			tempo = System.currentTimeMillis();
			System.out.print("listar FiliaisVO.findAll > ");
			List lista = em.createNamedQuery("FiliaisVO.findAll").getResultList();
			for (Iterator iter = lista.iterator(); iter.hasNext();)
			{
				FiliaisVO element = (FiliaisVO)iter.next();
				System.out.println("> " + element.getRazaoSocial());
				// parceiros
				// if (element.getParceirosVOList() != null)
				// {
				// for (ParceirosVO p : element.getParceirosVOList())
				// {
				// System.out.println(" --> " + p.getRazaoSocial() + " ["
				// + p.getFiliaisVO().getRazaoSocial() + "]");
				// }
				// }
				// // OP
				// if (element.getOrdemDeProducaoVOList() != null)
				// {
				// System.out.println("OP: " +
				// element.getOrdemDeProducaoVOList().size());
				// }
			}

			System.out.print(" Qtd: " + lista.size());
			System.out.println(" Ok: " + (System.currentTimeMillis() - tempo) + "ms");
			try
			{
				tempo = System.currentTimeMillis();
				System.out.print("pesquisa OrdemDeProducaoVO createNamedQuery findById >			 ");
				OrdemDeProducaoVO element = em.find(OrdemDeProducaoVO.class,
				    new OrdemDeProducaoVOPK(3L, 473055L));
				if (element != null)
				{
					System.out.println(element.getDispositivoLegal());
					if (element.getCarteiraPedidosVendaVO() != null)
					{
						System.out.println("carteira: "
						    + element.getCarteiraPedidosVendaVO().getNroPedidoFornecimento() + "/"
						    + element.getCarteiraPedidosVendaVO().getAnoPedido());
					}
				}
				System.out.println(" Ok: " + (System.currentTimeMillis() - tempo) + "ms");
			}
			catch (NoResultException re)
			{
				re.printStackTrace();
			}
			/*
			 * try { tempo = System.currentTimeMillis();
			 * System.out.print("pesquisa UsuariosVO createNamedQuery findById >
			 * "); UsuariosVO element =
			 * (UsuariosVO)em.createNamedQuery("UsuariosVO.findById").setParameter(
			 * "username", "ABYARACAMPINA").getSingleResult(); if (element !=
			 * null) System.out.println(element.getUsername());
			 * System.out.println(" Ok: " + (System.currentTimeMillis() - tempo) +
			 * "ms"); } catch (NoResultException re) { re.printStackTrace(); }
			 */
			//			
			// List allUsuariosVOs = null;
			// 3: listar todos usuarios createquery
			// tempo = System.currentTimeMillis();
			// System.out.print("List all UsuariosVOs com createQuery > ");
			// allUsuariosVOs = em.createQuery("from
			// UsuariosVO").getResultList();
			// for (Iterator iter = allUsuariosVOs.iterator(); iter.hasNext();)
			// {
			// UsuariosVO element = (UsuariosVO)iter.next();
			// // System.out.println(element);
			// }
			// System.out.print(" Qtd: " + allUsuariosVOs.size());
			// System.out.println(" Ok: " + (System.currentTimeMillis() - tempo)
			// + "ms");
			// 5: listar todos usuarios namedquery
			// tempo = System.currentTimeMillis();
			// System.out.print("List all UsuariosVOs com createNamedQuery
			// findAll > ");
			// allUsuariosVOs =
			// em.createNamedQuery("UsuariosVO.findAll").getResultList();
			// for (Iterator iter = allUsuariosVOs.iterator(); iter.hasNext();)
			// {
			// UsuariosVO element = (UsuariosVO)iter.next();
			// }
			// System.out.print(" Qtd: " + allUsuariosVOs.size());
			// System.out.println(" Ok: " + (System.currentTimeMillis() - tempo)
			// + "ms");
		}
		catch (NoResultException e)
		{
			e.printStackTrace();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public UsuariosVO update (UsuariosVO vo) throws Exception
	{
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		try
		{
			con = SessionFactory.getInstance().getConnection();
			stmt = con.createStatement();

			StringBuffer sql = new StringBuffer();
			sql.append(" SELECT cod_filial, razao_social       			");
			sql.append(" FROM MASTER.filiais                   			");
			sql.append(" WHERE cod_filial IN                   			");
			sql.append("    (SELECT DISTINCT cod_filial_centr  			");
			sql.append("     FROM MASTER.filial_centralizadora_fluxo) 	");
			sql.append(" ORDER BY nome_fantasia, cod_filial    			");

			rs = stmt.executeQuery(sql.toString());
			sql = null;
			while (rs.next())
			{
				System.out.println(new Long(rs.getLong("COD_FILIAL")));
				System.out.println(rs.getString("RAZAO_SOCIAL"));
			}
		}
		catch (SQLException sqle)
		{
			throw new Exception(sqle);
		}
		finally
		{
			try
			{
				if (rs != null)
				{
					rs.close();
				}
				if (stmt != null)
				{
					stmt.close();
				}
				if (con != null)
				{
					con.close();
				}
			}
			catch (Exception ex)
			{
			}
			finally
			{
				rs = null;
				stmt = null;
				con = null;
			}
		}
		return vo;
	}
}
