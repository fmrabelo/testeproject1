/**
 * 
 */
package teste.xml.jaxb;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

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
		// criar fones
		ArrayList<Fone> fones = new ArrayList<Fone>();
		for (int x = 0; x < 5; x++)
		{
			fones.add(new Fone("41-3029-900" + x, "Fertipar Cwb Mtz", "Ramal 0" + x));
		}
		Endereco endereco = new Endereco("Rua Moraes", 40, "Centro", "Rio de Janeiro", "20000-000");
		Contato contato = new Contato("Marco Maciel", "M", 34, endereco);
		endereco.setFones(fones);

		JAXBContext context = JAXBContext.newInstance(contato.getClass());

		// saída 1 – console
		Marshaller m = context.createMarshaller();
		m.setProperty(Marshaller.JAXB_ENCODING, new String("UTF-8"));
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		m.marshal(contato, System.out);

		// saída 2 – arquivo
		File f = new File("src/contato.xml");
		Marshaller m2 = context.createMarshaller();
		m2.marshal(contato, new FileOutputStream(f));

		// m2.marshal(contato, new FileWriter("tipoProduto.xml"));
	}

}
