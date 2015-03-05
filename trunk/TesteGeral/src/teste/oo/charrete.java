package teste.oo;

public class charrete
    extends Veiculo
{

	public charrete ()
	{
	}

	public charrete (String marca, int velocidadeMax, int nroCv, int nroMarchas, int nroEixos,
	    String cor, int codCombustivel, int nroCilindros)
	{
		super("Charrete", marca, velocidadeMax, nroCv, nroMarchas, nroEixos, cor, codCombustivel,
		    nroCilindros);
	}

}
