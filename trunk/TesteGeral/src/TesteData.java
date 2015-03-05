import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class TesteData
{

	/**
	 * @param args
	 */
	public static void main (String[] args)
	{
		Calendar calen = Calendar.getInstance(new Locale("pt", "BR"));

		System.out.println(" TimeZone Default: " + TimeZone.getDefault());
		// TimeZone.setDefault(TimeZone.getTimeZone(tz));
		// System.out.println(" TimeZone : " + TimeZone.getDefault());

		// calen.set(2010, Calendar.OCTOBER, 15, 0, 0, 0);
		// System.out.println("Data 15/10/2010 : " + new
		// Date(calen.getTimeInMillis()));
		//
		// calen.set(2010, Calendar.OCTOBER, 16, 0, 0, 0);
		// System.out.println("Data 16/10/2010 : " + new
		// Date(calen.getTimeInMillis()));
		//
		// calen.set(2010, Calendar.OCTOBER, 17, 0, 0, 0);
		// System.out.println("Data 17/10/2010 : " + new
		// Date(calen.getTimeInMillis()));
		//
		// calen.set(2010, Calendar.OCTOBER, 18, 0, 0, 0);
		// System.out.println("Data 18/10/2010 : " + new
		// Date(calen.getTimeInMillis()));

		// Símbolo Significado Apresentação Exemplo
		// G era designator (Text) AD
		// y year (Number) 1996
		// M month in year (Text & Number) July & 07
		// d day in month (Number) 10
		// h hour in am/pm (1~12) (Number) 12
		// H hour in day (0~23) (Number) 0
		// m minute in hour (Number) 30
		// s second in minute (Number) 55
		// S millisecond (Number) 978
		// E day in week (Text) Tuesday
		// D day in year (Number) 189
		// F day of week in month (Number) 2 (2nd Wed in July)
		// w week in year (Number) 27
		// W week in month (Number) 2
		// a am/pm marker (Text) PM
		// k hour in day (1~24) (Number) 24
		// K hour in am/pm (0~11) (Number) 0
		// z time zone (Text) Pacific Standard Time

		Locale brasil = new Locale("pt", "br");
		Date hoje = new Date("09/01/2011");
		String formatoBR = "dd' de 'MMMM' de 'yyyy";
		SimpleDateFormat sdf = new SimpleDateFormat(formatoBR, brasil);
		System.out.println(sdf.format(hoje));

	}
}
