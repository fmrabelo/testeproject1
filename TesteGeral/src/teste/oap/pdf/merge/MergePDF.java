/**
 * 
 */
package teste.oap.pdf.merge;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.lowagie.text.Document;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.HeaderFooter;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.Rectangle;
import com.lowagie.text.pdf.BaseFont;
import com.lowagie.text.pdf.PdfContentByte;
import com.lowagie.text.pdf.PdfImportedPage;
import com.lowagie.text.pdf.PdfReader;
import com.lowagie.text.pdf.PdfWriter;

/**
 * @author rabelo
 */
public final class MergePDF
    implements ConfigPath, Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1986565212142125521L;

	/**
	 * @param args
	 */
	public static void main (String[] args)
	{
		try
		{
			// exemploByteArrayOutput();

			final List<InputStream> pdfs = new ArrayList<InputStream>();
			pdfs.add(new FileInputStream(fileHeader));
			pdfs.add(new FileInputStream(fileContent));
			MergePDF.concatPDFs(pdfs, true);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	/**
	 * @param streamOfPDFFiles
	 * @param outputStream
	 * @param paginate
	 */
	public static final void concatPDFs (final List<InputStream> streamOfPDFFiles, boolean paginate)
	{
		Document document = null;
		PdfImportedPage page = null;
		// teste com arquivo gravado em disco.
		// final OutputStream outputStream = new FileOutputStream(fileMerge);
		// teste em memoria.
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		try
		{
			final BaseFont bf_courier = BaseFont.createFont(BaseFont.HELVETICA, "Cp1252", false);
			final List<InputStream> pdfs = streamOfPDFFiles;
			final List<PdfReader> readers = new ArrayList<PdfReader>();
			int totalPages = -1; // descontar o cabeçalho.
			final Iterator<InputStream> iteratorPDFs = pdfs.iterator();

			// Create Readers for the pdfs.
			while (iteratorPDFs.hasNext())
			{
				final InputStream pdf = iteratorPDFs.next();
				final PdfReader pdfReader = new PdfReader(pdf);
				readers.add(pdfReader);
				totalPages += pdfReader.getNumberOfPages();
			}

			// calculo para altura.
			// Rectangle psize = readers.get(1).getPageSize(1);
			// float width = psize.getHeight();
			// float height = psize.getWidth();
			// document = new Document(new Rectangle(width, height));
			document = new Document();
			// Create a writer for the outputstream
			final PdfWriter writer = PdfWriter.getInstance(document, outputStream);

			// headers and footers must be added before the document is opened
			final HeaderFooter footer = new HeaderFooter(
			    new Phrase(
			        "Rua Emiliano Perneta, 297  2º andar  cj 22 / 24 - Centro - Curitiba - PR - CEP: 80010-050 \n Fone: (41) 3225-7303          oap@oappr.com.br           www.oappr.com.br",
			        new Font(bf_courier, 10)), false);

			// Rua Emiliano Perneta, 297 2º andar cj 22 / 24 - Centro - Curitiba
			// - PR - CEP:
			// 80010-050
			// Fone: (41) 3225-7303 oap@oappr.com.br www.oappr.com.br

			footer.setBorder(Rectangle.NO_BORDER);
			footer.setAlignment(Element.ALIGN_CENTER);
			document.setFooter(footer);
			// open document.
			document.open();

			// teste
			document.add(new Paragraph("Hello world!"));

			final BaseFont bf = BaseFont.createFont(BaseFont.HELVETICA, BaseFont.CP1252,
			    BaseFont.NOT_EMBEDDED);
			// Holds the PDF data
			final PdfContentByte cb = writer.getDirectContent();

			int currentPageNumber = 0;
			int pageOfCurrentReaderPDF = 0;
			final Iterator<PdfReader> iteratorPDFReader = readers.iterator();

			// Loop through the PDF files and add to the output.
			while (iteratorPDFReader.hasNext())
			{
				final PdfReader pdfReader = iteratorPDFReader.next();
				// Create a new page in the target for each source page.
				while (pageOfCurrentReaderPDF < pdfReader.getNumberOfPages())
				{
					if (currentPageNumber > 1)
					{
						document.newPage();
					}
					pageOfCurrentReaderPDF++;
					currentPageNumber++;
					page = writer.getImportedPage(pdfReader, pageOfCurrentReaderPDF);
					if (currentPageNumber >= 2)
					{
						// cb.addTemplate(page, 1, 0, 0, .5f, 0, 0);
						cb.addTemplate(page, 1, 0, 0, 1, -40, -50);
					}
					else
					{
						cb.addTemplate(page, 0, 0);
					}
					// Code for pagination.
					if (paginate && (currentPageNumber > 1))
					{
						cb.beginText();
						cb.setFontAndSize(bf, 9);
						cb.showTextAligned(PdfContentByte.ALIGN_RIGHT, "Pág. "
						    + (currentPageNumber - 1) + " de " + totalPages, 520, 5, 0);
						cb.endText();
					}
				}
				pageOfCurrentReaderPDF = 0;
			}
			document.close();
			outputStream.flush();
			byte[] bytes = outputStream.toByteArray();
			System.out.println(bytes);
			System.out.println(outputStream.size());
			String bt = outputStream.toString();
			System.out.println(bt);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			if ((document != null) && document.isOpen())
			{
				document.close();
			}
			try
			{
				if (outputStream != null)
				{
					outputStream.close();
					outputStream = null;
				}
			}
			catch (IOException ioe)
			{
				ioe.printStackTrace();
			}
			document = null;
			page = null;
		}
	}

	/**
	 * private static final void simpleMerge () { try { PdfReader reader1 = new
	 * PdfReader(fileHeader); PdfReader reader2 = new PdfReader(fileContent);
	 * PdfCopyFields copy = new PdfCopyFields(new FileOutputStream(fileMerge));
	 * copy.addDocument(reader1); copy.addDocument(reader2); copy.close(); }
	 * catch (Exception e) { e.printStackTrace(); } } private final static void
	 * mergeStamp () { try { PdfReader reader = new PdfReader(fileHeader);
	 * PdfStamper stamp = new PdfStamper(reader, new
	 * FileOutputStream(fileMerge)); PdfContentByte under; PdfReader reader2 =
	 * new PdfReader(fileContent); under = stamp.getUnderContent(1);
	 * under.addTemplate(stamp.getImportedPage(reader2, 1), 1, 0, 0, 1, 0, 0);
	 * stamp.close(); } catch (Exception de) { de.printStackTrace(); } }
	 */

	private static final void exemploByteArrayOutput ()
	{
		ByteArrayOutputStream outputStream = null;
		try
		{
			// now write the PDF content to the output stream
			outputStream = new ByteArrayOutputStream();

			// step 1
			Document document = new Document();
			// step 2
			PdfWriter.getInstance(document, outputStream);
			// step 3
			document.open();
			// step 4
			document.add(new Paragraph("Hello world!"));
			// step 5
			document.close();

			byte[] bytes = outputStream.toByteArray();
			System.out.println(bytes);
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			// clean off
			if (null != outputStream)
			{
				try
				{
					outputStream.close();
					outputStream = null;
				}
				catch (Exception ex)
				{
				}
			}
		}
	}

}
