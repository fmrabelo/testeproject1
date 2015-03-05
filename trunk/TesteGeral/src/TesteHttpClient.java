import java.io.IOException;
import java.net.MalformedURLException;

import org.apache.commons.httpclient.DefaultHttpMethodRetryHandler;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.params.HttpMethodParams;

public class TesteHttpClient
{

	/**
	 * @param args
	 */
	public static void main (String[] args)
	{
		getHttpClient();
	}

	/**
	 * @param HttpClient
	 */
	public final static String getHttpClient ()
	{
		HttpClient client = null;
		GetMethod method = null;
		try
		{

			String myurl = "http://localhost:8888/sisferweb?httpclientloading=xxxxxxxxxxx";
			// String myurl = "http://192.168.141.129:8888/sisferweb/Login.do";
			// String myurl = "http://192.168.141.129:8888/em";
			// String proxy = "192.168.141.250";
			// int port = 3129;
			String parametros = "usuario=fertipar&senha=1234&action=page";

			// Create an instance of HttpClient.
			client = new HttpClient();
			client.getParams().setParameter("httpclientloading", "sisferwebclient");

			// Create a method instance.
			method = new GetMethod(myurl);

			// Provide custom retry handler is necessary
			method.getParams().setParameter(HttpMethodParams.RETRY_HANDLER,
			    new DefaultHttpMethodRetryHandler(3, false));

			// Execute the method.
			int statusCode = client.executeMethod(method);

			if (statusCode != HttpStatus.SC_OK)
			{
				System.err.println("Method failed: " + method.getStatusLine());
			}

			// Read the response body.
			byte[] responseBody = method.getResponseBody();

			// Deal with the response.
			// Use caution: ensure correct character encoding and is not binary
			// data
			System.out.println(new String(responseBody));
			return null;

		}
		catch (MalformedURLException e)
		{
			System.out.println("Erro na url: " + e.getMessage());
		}
		catch (IOException e)
		{
			System.out.println("Erro AIo: " + e.getMessage());
		}
		catch (Throwable e)
		{
			System.out.println("Erro Terminar a Thread: " + e.getMessage());
		}
		finally
		{
			// Release the connection.
			if (method != null)
			{
				method.releaseConnection();
			}
		}
		return null;
	}
}
