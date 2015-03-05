/**
 * 
 */
package teste.oap.rtf.templete;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Vector;

/**
 * @author rabelo
 */
public final class TstConcatenate2
{

	private final static String PATH = "C:\\dev\\Docs\\OAP\\testes_RTF\\";
	private final static String FILE_HEADER = PATH.concat("template_HEADER.rtf");
	private final static String FILE_CONTENT = PATH.concat("text_349747_CONTENT.rtf");
	private final static String FILE_DEST = PATH.concat("DESTINO.RTF");

	/**
	 * @param args
	 */
	public static void main (String[] args)
	{
		try
		{
			PrintWriter os = new PrintWriter(new File(FILE_DEST));

			Vector<String> vFiles = new Vector<String>();
			vFiles.add(FILE_HEADER);
			vFiles.add(FILE_CONTENT);

			// Writes the first line of the first file
			BufferedReader file = new BufferedReader(new FileReader(vFiles.get(0)));
			String firstLine = file.readLine();

			os.println(firstLine);
			file.close();

			String lastLine = TstConcatenate2.concatenate2(os, vFiles);

			// Writes the last line of the last file
			os.println(lastLine);

			os.close();

		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

	}

	public static String concatenate2 (PrintWriter oos, Vector<String> vFiles)
	{
		String fileName = null;
		String lastLine = "";
		BufferedReader file = null;
		String line = null;
		String sNewPage = "\\page";

		try
		{
			for (int i = 0; i < vFiles.size(); i++)
			{
				file = new BufferedReader(new FileReader(vFiles.get(i)));

				file.readLine();

				Vector<String> lines = new Vector<String>();
				while ((line = file.readLine()) != null)
				{
					if ((line != null) && (line.trim().length() > 0))
					{
						lines.add(line);
					}
				}

				if (i > 0)
				{
					oos.println(sNewPage);
				}

				int iSize = lines.size();
				for (int iIdx = 0; iIdx < iSize - 1; iIdx++)
				{
					line = lines.elementAt(iIdx);
					oos.println(line);
				}
				lastLine = lines.elementAt(lines.size() - 1);

			}

		}
		catch (FileNotFoundException fnf)
		{
			System.err.println("File: " + fileName + " not found.");
		}
		catch (Exception e)
		{
			System.err.println(e.toString());
		}
		finally
		{
			if (file != null)
			{
				try
				{
					file.close();
				}
				catch (IOException io)
				{
				}
			}
		}

		return lastLine;
	}
}
