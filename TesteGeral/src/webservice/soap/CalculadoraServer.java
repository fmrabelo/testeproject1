/**
 * 
 */
package webservice.soap;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

/**
 * Interface para o servi�o de calculadora.
 * http://www.linhadecodigo.com.br/artigo
 * /3654/desenvolvendo-e-usando-web-services-em-java.aspx
 * @author rabelo
 */
@WebService
@SOAPBinding(style = Style.RPC)
// @SOAPBinding : Indica que o servi�o utilizar� a abordagem SOAP e n�o Rest que
// � a outra abordagem suportada.
public interface CalculadoraServer
{
	@WebMethod
	float soma (float num1, float num2);

	@WebMethod
	float subtracao (float num1, float num2);

	@WebMethod
	float multiplicacao (float num1, float num2);

	@WebMethod
	float divisao (float num1, float num2);

	@WebMethod
	String getTimeAsString ();

	@WebMethod
	long getTimeAsElapsed ();
}
