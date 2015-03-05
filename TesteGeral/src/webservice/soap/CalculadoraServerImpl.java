/**
 * 
 */
package webservice.soap;

import java.util.Date;

import javax.jws.WebService;

/**
 * http://www.linhadecodigo.com.br/artigo/3654/desenvolvendo-e-usando-web-
 * services-em-java.aspx
 * @author rabelo
 */

// Essa propriedade faz com que a classe atual, a SIB, ligue-se com a SEI
// CalculadoraServer especificada anteriormente
// (webservice.soap.CalculadoraServer).
@WebService(endpointInterface = "webservice.soap.CalculadoraServer")
public class CalculadoraServerImpl
    implements CalculadoraServer
{

	public float soma (float num1, float num2)
	{
		this.ln("soma");
		return num1 + num2;
	}

	public float subtracao (float num1, float num2)
	{
		this.ln("subtracao");
		return num1 - num2;
	}

	public float multiplicacao (float num1, float num2)
	{
		this.ln("multiplicacao");
		return num1 * num2;
	}

	public float divisao (float num1, float num2)
	{
		this.ln("divisao");
		return num1 / num2;
	}

	public String getTimeAsString ()
	{
		this.ln("getTimeAsString");
		return new Date().toString();
	}

	public long getTimeAsElapsed ()
	{
		this.ln("getTimeAsElapsed");
		return new Date().getTime();
	}

	private final void ln (String t)
	{
		System.out.println("> @WebService : " + t);
	}
}
