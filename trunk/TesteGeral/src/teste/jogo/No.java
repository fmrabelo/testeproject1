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
	 * Método que retorna a referência para o filho direito deste nó.
	 * @return
	 */
	public final No<T> getDireito ()
	{
		return direito;
	}

	/**
	 * Método de acesso para obter os dados a partir do nó mais à direita da
	 * árvore abaixo deste nó.
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
	 * Método que retorna a referência para o filho esquerdo deste nó.
	 * @return
	 */
	public final No<T> getEsquerdo ()
	{
		return esquerdo;
	}

	/**
	 * Método de acesso para obter os dados a partir do nó mais à esquerda da
	 * árvore abaixo deste nó.
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
