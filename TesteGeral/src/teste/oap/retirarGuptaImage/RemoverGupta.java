/**
 * 
 */
package teste.oap.retirarGuptaImage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import sun.misc.BASE64Encoder;

/**
 * @author rabelo
 */
public final class RemoverGupta
{
	private static final String path = "c://temp//img_oap//";
	private static final String filePathIn = path + "vicenteDestro_sem_gupta.jpg";
	private static final String filePathOut = path + "vicenteDestro_sem_gupta2.jpg";

	/**
	 * @param args
	 */
	public static void main (String[] args)
	{
		new RemoverGupta().lerArquivo();
		System.exit(0);
	}

	private final void testeLerTxt1 ()
	{
		try
		{
			File newFile = new File(filePathIn);
			byte[] fileData = new byte[(int)newFile.length()];
			InputStream inStream = new FileInputStream(newFile);
			inStream.read(fileData);
			inStream.close();
			String tempFileData = new String(fileData);
			System.out.println("tempFileData: " + tempFileData);
			String imageString = new BASE64Encoder().encode(fileData);
			System.out.println("imageString: " + imageString);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	private final void lerArquivo ()
	{
		// GUPTA:
		// BMP ICON WMF TIFF PCX GIF NuVEQ JPEG JPG PNG
		try
		{
			final File imagem = new File(filePathIn);
			final FileOutputStream fos = new FileOutputStream(filePathOut);
			if (imagem.exists())
			{
				InputStream ios = null;
				try
				{
					byte[] buffer = new byte[4096];
					ios = new FileInputStream(imagem);
					int read = 0;
					while ((read = ios.read(buffer)) != -1)
					{
						final String string = new String(buffer);
						System.out.println(string);
						if ((string != null) && string.startsWith("GUPTA:"))
						{
							String gupta = new String(buffer);
							int idx = gupta.indexOf("ÿØÿà");
							gupta = gupta.substring(idx);
							// gupta = gupta.replace(exp, "ÿØÿà");
							buffer = gupta.getBytes();
							read = buffer.length;
						}
						fos.write(buffer, 0, read);
					}
				}
				finally
				{
					try
					{
						if (fos != null)
						{
							fos.flush();
							fos.close();
						}
					}
					catch (IOException e)
					{
						e.printStackTrace();
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
				// final FileInputStream is = new FileInputStream(imagem);
			}
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	private final void gravarArquivo ()
	{
		try
		{
			final String output = path + "vicenteDestro.jpg";
			File f = new File(output);
			final FileOutputStream fos = new FileOutputStream(f);
			InputStream in = null;// list.get(0).getImages().getBinaryStream();
			int length = 0;// (int)laudo.getImages().length();
			int bufferSize = 1024;
			byte[] buffer = new byte[bufferSize];
			while ((length = in.read(buffer)) != -1)
			{
				fos.write(buffer, 0, length);
			}
			in.close();
			fos.flush();
			fos.close();
			f = null;

		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
	}
}
