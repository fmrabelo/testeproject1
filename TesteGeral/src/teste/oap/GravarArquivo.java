/**
 * 
 */
package teste.oap;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author rabelo
 */
public class GravarArquivo
{
	private final void gravarArquivo () throws IOException
	{ // gravar arquivo
		final String PATH = "c://temp//img_oap//ceratoscopia_04082012.jpg";
		final File imagem = new File(PATH);
		if (imagem.exists())
		{
			ByteArrayOutputStream ous = null;
			InputStream ios = null;
			try
			{
				byte[] buffer = new byte[4096];
				ous = new ByteArrayOutputStream();
				ios = new FileInputStream(imagem);
				int read = 0;
				while ((read = ios.read(buffer)) != -1)
				{
					ous.write(buffer, 0, read);
				}
			}
			finally
			{
				try
				{
					if (ous != null)
					{
						ous.close();
					}
				}
				catch (IOException e)
				{
					// swallow, since not that important
				}
				try
				{
					if (ios != null)
					{
						ios.close();
					}
				}
				catch (IOException e)
				{
					// swallow, since not that important
				}
			}
			final FileInputStream is = new FileInputStream(imagem);
			// DaoFactory.getInstance().gravaImagem(imagem);
		}
	}
}