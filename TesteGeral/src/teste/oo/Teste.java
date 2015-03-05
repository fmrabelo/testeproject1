package teste.oo;

public final class Teste
{
	public static void main (String[] args)
	{
		// Veiculo fusca = new Fusca("VW", 120, 4, 4, 4, "Amarelo",
		// TiposCombustiveis.GASOLINA, 4);
		// fusca.setVelocidadeMax(110);
		// fusca.printDados();
		//
		// Veiculo chart = new charrete("Xarretex", 10, 0, 0, 1, "Vermelha",
		// TiposCombustiveis.NENHUM,
		// 0);
		// fusca.setVelocidadeMax(15);
		// chart.printDados();
		new Teste().teste ();
	}

	void teste ()
	{
		final Double d = (1.65d);
		final Double d1 = (1.65d);
		System.out.println(d == d1);
	}

}
