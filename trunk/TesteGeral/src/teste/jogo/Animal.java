package teste.jogo;

public abstract class Animal
{
	private String nome;
	private String observacao;

	public Animal ()
	{
	}

	public String montarObservacao (String animal)
	{
		System.out.println("Um(a) " + this.getNome() + "__________ mas " + animal + " não");
		return "";
	}

	public Animal (String nome, String observacao)
	{
		super();
		this.nome = nome;
		this.observacao = observacao;
	}

	public final String getNome ()
	{
		return nome;
	}

	public final void setNome (String nome)
	{
		this.nome = nome;
	}

	public final String getObservacao ()
	{
		return observacao;
	}

	public final void setObservacao (String observacao)
	{
		this.observacao = observacao;
	}

	@Override
	public int hashCode ()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((observacao == null) ? 0 : observacao.hashCode());
		return result;
	}

	@Override
	public boolean equals (Object obj)
	{
		if (this == obj) return true;
		if (obj == null) return false;
		if (!(obj instanceof Animal)) return false;
		final Animal other = (Animal)obj;
		if (nome == null)
		{
			if (other.nome != null) return false;
		}
		else if (!nome.equals(other.nome)) return false;
		if (observacao == null)
		{
			if (other.observacao != null) return false;
		}
		else if (!observacao.equals(other.observacao)) return false;
		return true;
	}
}
