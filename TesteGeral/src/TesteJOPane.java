import javax.swing.JOptionPane;

public final class TesteJOPane
{

	/**
	 * @param args
	 */
	public static void main (String[] args)
	{
		show();
	}

	private static final void show ()
	{
		String ent = JOptionPane.showInputDialog("Qual é o seu nome?");
		JOptionPane.showMessageDialog(null, ent);
		System.exit(0);
	}
}
