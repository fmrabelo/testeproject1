/**
 * 
 */
package teste.xml.carteira;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

/**
 * @author desenvolvimento
 */
public class JaxbTeste
{

	/**
	 * @param args
	 */
	public static void main (String[] args) throws JAXBException, FileNotFoundException,
	    IOException
	{
		// criar itens e formulacoes de itens.
		List<Itens> listItens = new ArrayList<Itens>();
		for (int i = 1; i < 7; i++)
		{
			List<Formulacao> listFormula = new ArrayList<Formulacao>();
			Formulacao formulacao = null;
			for (int x = 1; x < 5; x++)
			{
				formulacao = new Formulacao();
				formulacao.setCodProduto(x);
				formulacao.setQuantidade(System.currentTimeMillis() * (x ^ 67));
				formulacao.setDescricaoProdutoSacaria("formulcao do elemento" + x);
				formulacao.setTipoProduto("tipo " + x);
				listFormula.add(formulacao);
			}

			Itens item = new Itens();
			item.setCodProduto(i);
			item.setDescricaoProduto("item produto " + i);
			item.setNaturezaFisica("natureza fisica " + i);
			item.setPrecoUnitarioReal(i * (i ^ 3));
			item.setQuantidadeLiberada(i * (i ^ 7));
			item.setRegistroMAProduto("registro MA " + (i * 6));
			item.setFormulacao(listFormula);
			listItens.add(item);
		}
		Carteira carteira = new Carteira();
		carteira.setAnoSeqPedido(2010);
		carteira.setBairroEntregaCliente("Mossunguê");
		carteira.setCepEntregaCliente("20250-100");
		carteira.setCgcCnpj("00.000.000.00.00-60");
		carteira.setCidadeEntregaCliente("Curitiba");
		carteira.setCodCliente(102L);
		carteira.setEnderecoEntregaCliente("Rua Antonio Viriato, 120, Centro");
		carteira.setInscrEstadualCliente("02154.121.445");
		carteira.setInscrProdutorCliente("9854.1265-45");
		carteira.setNroPedidoFornecimento(1232L);
		carteira.setNroSeqPedido(3234L);
		carteira.setRazaoSocialCliente("Amaggi Importação S/A");
		carteira.setUfEntregaEntrega("PR");
		carteira.setItens(listItens);
		JAXBContext context = JAXBContext.newInstance(carteira.getClass());

		// saída 1 – console
		Marshaller m = context.createMarshaller();
		m.setProperty(Marshaller.JAXB_ENCODING, new String("UTF-8"));
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		m.marshal(carteira, System.out);

		// saída 2 – arquivo
		File file = new File("src/carteira.xml");
		Marshaller m2 = context.createMarshaller();
		m2.marshal(carteira, new FileOutputStream(file));

		// m2.marshal(contato, new FileWriter("tipoProduto.xml"));
	}

}
