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
		String tz = "America/Sao_Paulo";
		Calendar calen = Calendar.getInstance(new Locale("pt", "BR"));

		System.out.println(" TimeZone Default: " + TimeZone.getDefault());
		// TimeZone.setDefault(TimeZone.getTimeZone(tz));
		// System.out.println(" TimeZone : " + TimeZone.getDefault());

		calen.set(2010, Calendar.OCTOBER, 15, 0, 0, 0);
		System.out.println("Data 15/10/2010 : " + new Date(calen.getTimeInMillis()));

		calen.set(2010, Calendar.OCTOBER, 16, 0, 0, 0);
		System.out.println("Data 16/10/2010 : " + new Date(calen.getTimeInMillis()));

		calen.set(2010, Calendar.OCTOBER, 17, 0, 0, 0);
		System.out.println("Data 17/10/2010 : " + new Date(calen.getTimeInMillis()));

		calen.set(2010, Calendar.OCTOBER, 18, 0, 0, 0);
		System.out.println("Data 18/10/2010 : " + new Date(calen.getTimeInMillis()));
	}
}
