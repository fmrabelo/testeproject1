/**
 * 
 */
package webservice.soap;

import javax.xml.ws.Endpoint;

/**
 * Neste c�digo uso a classe Endpoint que est� dispon�vel na linguagem Java e
 * que permite publicar um servi�o (webservice) em um servidor. Para que
 * possamos usa-la deve-se passar como par�metro o endere�o do servidor e a
 * inst�ncia do SIB do servi�o a ser publicado. Notamos que o servi�o �
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
