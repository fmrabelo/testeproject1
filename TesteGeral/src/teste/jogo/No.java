package teste.jogo;

public final class No<T>
{
	private T animal;
	private No<T> direito, esquerdo;

	public No (T animal, No<T> direito, No<T> esquerdo)
	{
		super();
		this.animal = animal;
		this.direito = direito;
		this.esquerdo = esquerdo;
	}

	/**
	 * @param animal the animal to set
	 */
	public void setAnimal (T animal)
	{
		this.animal = animal;
	}

	/**
	 * @param direito the direito to set
	 */
	public void setDireito (No<T> direito)
	{
		this.direito = direito;
	}

	/**
	 * @param esquerdo the esquerdo to set
	 */
	public void setEsquerdo (No<T> esquerdo)
	{
		this.esquerdo = esquerdo;
	}

	/**
	 * @return
	 */
	public final T getAnimal ()
	{
		return animal;
	}

	/**
	 * M�todo que retorna a refer�ncia para o filho direito deste n�.
	 * @return
	 */
	public final No<T> getDireito ()
	{
		return direito;
	}

	/**
	 * M�todo de acesso para obter os dados a partir do n� mais � direita da
	 * �rvore abaixo deste n�.
	 */
	public T getProximoDireito ()
	{
		if (this.direito == null)
		{
			return animal;
		}
		else
		{
			return direito.getProximoDireito();
		}
	}

	/**
	 * M�todo que retorna a refer�ncia para o filho esquerdo deste n�.
	 * @return
	 */
	public final No<T> getEsquerdo ()
	{
		return esquerdo;
	}

	/**
	 * M�todo de acesso para obter os dados a partir do n� mais � esquerda da
	 * �rvore abaixo deste n�.
	 */
	public T getProximoEsquerdo ()
	{
		if (this.esquerdo == null)
		{
			return animal;
		}
		else
		{
			return esquerdo.getProximoEsquerdo();
		}
	}
}
