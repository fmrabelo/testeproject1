package teste.jogo;

import javax.swing.JOptionPane;

public abstract class Tela
{
	static final String str[] = {"Sim", "Não"};

	public Tela ()
	{
	}

	public static int showOption (final String msg)
	{
		return JOptionPane.showOptionDialog(null,
		    "O animal que você pensou %s ?".replace("%s", msg), "Confirme",
		    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, str, str[0]);
	}

	public static void showMsgDialog (final String msg)
	{
		JOptionPane.showMessageDialog(null, msg);
	}
}
