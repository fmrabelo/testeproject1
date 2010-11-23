package test.de.laliluna.library;

import de.laliluna.library.session.BookTestBeanRemote;
import de.laliluna.library.session.SessionFactory;
import de.laliluna.library.session.bean.BookTestBean;

public class FirstEJB3TutorialClient
{
	// referencia jndi para acesso interface local.

	/**
	 * @param args
	 */
	public static void main (String[] args)
	{
		FirstEJB3TutorialClient teste = new FirstEJB3TutorialClient();
		teste.doTeste();
		System.exit(0);
	}

	public void doTeste ()
	{
		// InitialContext context;
		// BookTestBeanRemote session = null;
		try
		{
			// context = new InitialContext();
			// usando lookup direto para recuperar objeto via JNDI
			// System.out.println("Acesso ao session bean remote, executando em
			// outra JVM...");
			// session =
			// (BookTestBeanRemote)context.lookup(BookTestBean.RemoteJNDIName);
			// System.out.println("saida bean Local: " + session.somaRemote(2,
			// 9));
			// session.update(null);

			// usando session factory para recuperar objeto via JNDI
			BookTestBeanRemote newSession = (BookTestBeanRemote)SessionFactory.getInstance().getSession(
			    BookTestBean.class);
			newSession.test();

			// InitialContext context = new InitialContext();
			// DataSource ds = null;// (DataSource)context.lookup("OracleDS");
			// ds = (DataSource)context.lookup("java:OracleDS");

			// System.out.println("Acesso ao session bean Local, executando na
			// mesma JVM....");
			// BookTestBeanLocal bookTestLocal =
			// (BookTestBeanLocal)context.lookup("localref");
			// System.out.println("saida bean Local: " +
			// bookTestLocal.somaLocal(3, 7));

		}
		// catch (NamingException e)
		// {
		// e.printStackTrace();
		// throw new RuntimeException(e);
		// }
		catch (Exception e)
		{
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		finally
		{
			// session = null;
		}
	}
}
