package teste.oo;

public abstract class Veiculo
    implements TiposCombustiveis
{
	private String nome;
	private String marca;
	private int velocidadeMax;
	private int nroCv;
	private int nroMarchas;
	private int nroEixos;
	private String cor;
	private String combustivel;
	private int nroCilindros;

	public Veiculo ()
	{

	}

	public Veiculo (String nome, String marca, int velocidadeMax, int nroCv, int nroMarchas,
	    int nroEixos, String cor, int codCombustivel, int nroCilindros)
	{
		super();
		this.nome = nome;
		this.marca = marca;
		this.velocidadeMax = velocidadeMax;
		this.nroCv = nroCv;
		this.nroMarchas = nroMarchas;
		this.nroEixos = nroEixos;
		this.cor = cor;
		this.setCombustivel(codCombustivel);
		this.nroCilindros = nroCilindros;
	}

	public void printDados ()
	{
		System.out.println("Veiculo: " + this.getNome() + " CV: " + this.getNroCv() + ",  COR: "
		    + this.getCor() + ", COMBUSTIVEL: " + this.getCombustivel() + ", EIXOS: "
		    + this.getNroEixos() + ", VELOCIDADE: " + this.getVelocidadeMax());
	}

	public final String getNome ()
	{
		return nome;
	}

	public final void setNome (String nome)
	{
		this.nome = nome;
	}

	public final int getVelocidadeMax ()
	{
		return velocidadeMax;
	}

	public final void setVelocidadeMax (int velocidadeMax)
	{
		this.velocidadeMax = velocidadeMax;
	}

	public final int getNroCv ()
	{
		return nroCv;
	}

	public final void setNroCv (int nroCv)
	{
		this.nroCv = nroCv;
	}

	public final int getNroMarchas ()
	{
		return nroMarchas;
	}

	public final void setNroMarchas (int nroMarchas)
	{
		this.nroMarchas = nroMarchas;
	}

	public final int getNroEixos ()
	{
		return nroEixos;
	}

	public final void setNroEixos (int nroEixos)
	{
		this.nroEixos = nroEixos;
	}

	public final String getCor ()
	{
		return cor;
	}

	public final void setCor (String cor)
	{
		this.cor = cor;
	}

	public final String getCombustivel ()
	{
		return combustivel;
	}

	public final void setCombustivel (int codCombustivel)
	{
		this.combustivel = tiposCombustiveis[codCombustivel];
	}

	public final int getNroCilindros ()
	{
		return nroCilindros;
	}

	public final void setNroCilindros (int nroCilindros)
	{
		this.nroCilindros = nroCilindros;
	}

	public final String getMarca ()
	{
		return marca;
	}

	public final void setMarca (String marca)
	{
		this.marca = marca;
	}
}
