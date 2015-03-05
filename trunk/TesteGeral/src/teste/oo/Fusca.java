package teste.oo;

public class Fusca
    extends Veiculo
{
	public Fusca ()
	{

	}

	public Fusca (String marca, int velocidadeMax, int nroCv, int nroMarchas, int nroEixos,
	    String cor, int combustivel, int nroCilindros)
	{
		super("Fusca", marca, velocidadeMax, nroCv, nroMarchas, nroEixos, cor, combustivel,
		    nroCilindros);
	}
}
