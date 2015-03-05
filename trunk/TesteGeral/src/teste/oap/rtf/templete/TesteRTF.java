/**
 * 
 */
package teste.oap.rtf.templete;

import java.io.File;

import net.sourceforge.rtf.RTFTemplate;
import net.sourceforge.rtf.helper.RTFTemplateBuilder;

/**
 * @author rabelo
 */
public final class TesteRTF
{

	/**
	 * @param args
	 */
	public static void main (String[] args)
	{
		teste();
	}

	private static final void teste ()
	{
		String rtfSource = "DocumentoModelo.rtf";
		String rtfTarget = "DocumentoFinal.rtf";
		try
		{
			// 1. Get default RTFtemplateBuilder
			RTFTemplateBuilder builder = RTFTemplateBuilder.newRTFTemplateBuilder();

			// 2. Get RTFtemplate with default Implementation of template engine
			// (Velocity)
			RTFTemplate rtfTemplate = builder.newRTFTemplate();

			// 3. Set the RTF model source
			rtfTemplate.setTemplate(new File(rtfSource));

			// 4. AKI ALTERA AS VARIAVEIS
			rtfTemplate.put("project", "Jakarta Velocity project");

			// 5. AKI GRAVA O DOCUMENTO FINAL
			rtfTemplate.merge(rtfTarget);
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
	}

}
