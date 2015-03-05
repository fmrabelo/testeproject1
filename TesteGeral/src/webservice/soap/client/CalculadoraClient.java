/**
 * 
 */
package webservice.soap.client;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import webservice.soap.CalculadoraServer;

/**
 * @author rabelo
 */
public final class CalculadoraClient
{

	/**
	 * @param args
	 */
	public static void main (String args[]) throws Exception
	{
		URL url = new URL("http://127.0.0.1:9876/webservice.soap?wsdl");

		// O namespace � fornecido pela WSDL do servi�o, e o nome local � a
		// classe SIB acrescida da palava �Service�. O nome local aparece na
		// �ltima se��o do documento WSDL (se��o service).

		// targetNamespace="http://soap.webservice/"
		// name="CalculadoraServerImplService"
		QName qname = new QName("http://soap.webservice/", "CalculadoraServerImplService");

		// retorna refer�ncia a um objeto que pode invocar as opera��es
		// oferecidas pelo servi�o (em portType)
		Service ws = Service.create(url, qname);
		CalculadoraServer calc = ws.getPort(CalculadoraServer.class);

		System.out.println("Soma (5+1): " + calc.soma(5, 1));
		System.out.println("Subtracao (5-1): " + calc.subtracao(5, 1));
		System.out.println("Multiplicacao (5*1): " + calc.multiplicacao(5, 1));
		System.out.println("Divisao (5/1): " + calc.divisao(5, 1));

		System.out.println("imeAsElapsed: " + calc.getTimeAsElapsed());
		System.out.println("TimeAsString: " + calc.getTimeAsString());

	}

}
