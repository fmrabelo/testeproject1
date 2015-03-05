/**
 * 
 */
package teste.oap.pdf.merge;

/**
 * @author rabelo
 */
public interface ConfigPath
{
	static final String path = "C:\\dev\\Docs\\OAP\\TESTE_LAUDOS_JASPER\\";
	static final String fileHeader = path + "6_TONOMETRIA.pdf"; // "rel_laudo_teste_1_HEADER.pdf";
	static final String fileContent = path + "text_349747_CONTENT.pdf";// "relatorio-362534_CONTENT.pdf";
	static final String fileMerge = path + System.currentTimeMillis() + "_PDF_Merge.pdf";
}
