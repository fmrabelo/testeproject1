/**
 * 
 */
package webservice.soap;

import javax.xml.ws.Endpoint;

/**
 * Neste código uso a classe Endpoint que está disponível na linguagem Java e
 * que permite publicar um serviço (webservice) em um servidor. Para que
 * possamos usa-la deve-se passar como parâmetro o endereço do servidor e a
 * instância do SIB do serviço a ser publicado. Notamos que o serviço é
 * publicado na porta 9876.
 * http://www.linhadecodigo.com.br/artigo/3654/desenvolvendo
 * -e-usando-web-services-em-java.aspx
 * @author rabelo
 */
public class CalculadoraServerPublisher
{
	public static void main (String[] args)
	{
		Endpoint.publish("http://127.0.0.1:9876/webservice.soap", new CalculadoraServerImpl());
	}

}
