package teste.jogo;

import javax.swing.JOptionPane;

public final class RunMain
    extends Tela
{
	private No<Animal> arvore = null;

	public RunMain ()
	{
		super();
		final Animal aquatico = new Aquatico("Tubarão", null);
		final Animal terrestre = new Terrestre("Macaco", null);
		final No<Animal> noDir = new No<Animal>(terrestre, null, null);
		final No<Animal> noEsq = new No<Animal>(aquatico, null, null);
		arvore = new No<Animal>(null, null, null);
		arvore.setDireito(noDir);
		arvore.setEsquerdo(noEsq);
	}

	/**
	 * @param args
	 */
	public static void main (String[] args)
	{
		RunMain r = new RunMain();
		r.init();
		System.exit(0);
	}

	public final void init ()
	{
		// this.getPilhaAquatico().push(new Aquatico("tubarao", null));
		boolean exit = false;
		while (!exit)
		{
			// showMsgDialog("Pense em um Animal");
			JOptionPane.showMessageDialog(null, "Pense em um Animal");
			int aquatico = showOption("vive na água");
			// Animal Aquatico
			if (aquatico == 0)
			{
				int testaOpcao = showOption(arvore.getEsquerdo().getAnimal().getNome());
				if (testaOpcao == 0)
				{
					showMsgDialog("Acertei de novo!");
				}
				else
				{
					final String nomeNovoAguatico = JOptionPane.showInputDialog(null,
					    "Qual o animal que você pensou?");
					final String obsAquatico = JOptionPane.showInputDialog("Um(a) ?1______ mas um(a) ?2 não.".replace(
					    "?1", nomeNovoAguatico).replace("?2",
					    arvore.getEsquerdo().getAnimal().getNome()));

					final No<Animal> noEsq = new No<Animal>(new Aquatico(null, null), null, null);
					noEsq.getAnimal().setNome(nomeNovoAguatico);
					noEsq.getAnimal().setObservacao(obsAquatico);
					arvore.setEsquerdo(noEsq);
				}
			}
			// }else {
			//	                  
			// int resp = JOptionPane.showOptionDialog(null, "O animal que você
			// pensou é " +
			// aux_caracteristica+ "?",
			// "Confirme",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,
			// null, str
			// , str[0]);
			// if (resp == 1) {
			// int agua = JOptionPane.showOptionDialog(null, "O animal que você
			// pensou é
			// Tubarão ?",
			// "Confirme",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,
			// null, str
			// , str[0]);
			// if (agua == 0) {
			// JOptionPane.showMessageDialog(null,"Acertei de novo!");
			// }else {
			// animalAgua = JOptionPane.showInputDialog(null, "Qual o animal que
			// você
			// pensou?");
			// caracteristica = JOptionPane.showInputDialog("Um(a) " +
			// animalAgua + "______
			// mas um(a) Tubarão não." );
			//	                                  
			// }
			// }
		}
	}

}
