import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

import javax.swing.JOptionPane;

public final class Teste
{
	public static void main (String arg[])
	{
		// String vlr = "1.234.567.890";
		// vlr = vlr.replace(".", "").trim();
		// Double d = new Double(vlr);
		// System.out.println(d);
		// printf_();
		// fmtDb();

		// new Teste().contains();
		new Teste().flush();
		System.exit(0);
	}

	void flush ()
	{
		Integer[] f = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		List<Integer> t = Arrays.asList(f);
		Collections.shuffle(t);
		System.out.print(t);
		StringBuilder ret = new StringBuilder("");
		for (int x = t.size() - 1; x > 3; x--)
		{
			ret.append(t.get(x));
		}
		System.out.println(": > " + ret);
	}

	void contains ()
	{
		String nome[] = {"wewer CERATOSCOPIA  wer COMPUTADORIZADA wer",
		    "MICROSCOPIA ESPECULAR DE CÓRNEA", "OCT RETINA", "CAMPIMETRIA",
		    "CURVA TENSIONAL DIÁRIA", "CERATOSCOPIA COMPUTADORIZADA",
		    "MICROSCOPIA ESPECULAR DE CÓRNEA", "MICROSCOPIA ESPECULAR DE CÓRNEA CERATOSCOPIA wsd",
		    " asd CERATOSCOPIA COMPUTADORIZADA",
		    "wewewwewe   CERATOSCOPIA we we CERATOSCOPIA COMPUTADORIZADA",
		    " ew MICROSCOPIA  w ESPECULAR DE  wew CÓRNEA", "v xMaster as", "xoaf Master as",
		    "CERATOSCOPIA COMPUTADORIZADA"};
		String contain[] = {"ceratoscopia", "campimetria", "Iol Master"};
		for (String x : nome)
		{
			for (String z : contain)
			{
				if (x.toLowerCase().contains(z.toString().toLowerCase()))
				{
					System.out.println(x + " > " + z);
				}
			}
		}
		// JOptionPane.showMessageDialog(null, str);
	}

	void teste ()
	{
		String str = "A casa da praia está em reforma.";
		str.replace("a", "");
		System.out.println(str);
		JOptionPane.showMessageDialog(null, str);
	}

	void teste1 ()
	{
		final Double d = (1.65d);
		final Double d1 = (1.65d);
		System.out.println(d == d1);
		System.out.println(d.compareTo(d1));
	}

	public static void printf_ ()
	{
		// Sempre que usar o System.out.printf deve-se utilizar ou %d para
		// inteiro, %s para String e %.2f para double.
		String a = "Teste";
		double b = 459882701;
		int c = 898899801;
		System.out.printf("%s - %.2f - %d \n", a, b, c);

		System.out.print("carregando printf_() ... ");
		long tempo = System.currentTimeMillis();
		System.out.printf("Ok. Tempo carga: %s %s ", (System.currentTimeMillis() - tempo), "ms");

		System.out.println(" teste 2: " + (a + " teste 3"));
	}

	public static void mod ()
	{
		for (int x = 1; x < 12; x++)
		{
			System.out.println("pagina: " + x + " quebrar=> " + ((x % 2) == 0 ? true : false));
		}
	}

	public static void fmtDb ()
	{
		// double db = 10368.125d;
		// Why this is Happening.0.125,0.145,0.165,0.185 all are comming wrong
		// but 0.135,0.115,0.155,0.175,0.195 rounding properly.
		double db[] = new double[]{33720.962D, 33720.963D, 33720.964D, 33720.965D, 33720.966D,
		    33720.967D, 1000.125D, 6000.145D, 1000D, 120, 00D, 1501, 001D, 356618.125d, 0.181d,
		    0.112d, 0.113d, 0.121d, 0.126, 0.135d, 0.145d, 0.115d, 0.125d, 0.135d, 0.145d, 0.155d,
		    0.165d, 0.175d, 0.185d, 0.195d};

		for (double xx : db)
		{
			System.out.println("____________________________________________");
			DecimalFormat df = new DecimalFormat("###.##");
			System.out.println(xx + " ###.## = " + df.format(xx));

			BigDecimal bigValue = new BigDecimal(xx);
			BigDecimal result = bigValue.multiply(new BigDecimal("1"));

			int precision = 2;

			result = result.setScale(precision, BigDecimal.ROUND_HALF_DOWN);
			System.out.println(xx + " ROUND_HALF_DOWN = " + result.doubleValue());

			result = result.setScale(precision, BigDecimal.ROUND_HALF_EVEN);
			System.out.println(xx + " ROUND_HALF_EVEN = " + result.doubleValue());

			result = result.setScale(precision, BigDecimal.ROUND_HALF_UP);
			System.out.println(xx + " ROUND_HALF_UP = " + result.doubleValue());

			System.out.println(" round() " + round(xx, precision));
			// result = result.setScale(precision, BigDecimal.ROUND_DOWN);
			// System.out.println(xx + " ROUND_DOWN = " + result.doubleValue());
			//
			// result = result.setScale(precision, BigDecimal.ROUND_FLOOR);
			// System.out.println(xx + " ROUND_FLOOR = " +
			// result.doubleValue());
			//
			// result = result.setScale(precision, BigDecimal.ROUND_HALF_DOWN);
			// System.out.println(xx + " ROUND_HALF_DOWN = " +
			// result.doubleValue());
			//
			// result = result.setScale(precision, BigDecimal.ROUND_HALF_UP);
			// System.out.println(xx + " ROUND_HALF_UP = " +
			// result.doubleValue());
			//
			// result = result.setScale(precision,
			// BigDecimal.ROUND_UNNECESSARY);
			// System.out.println(xx + " ROUND_UNNECESSARY = " +
			// result.doubleValue());
			//
			// result = result.setScale(precision, BigDecimal.ROUND_UP);
			// System.out.println(xx + " ROUND_UP = " + result.doubleValue());
		}
		System.exit(0);
	}

	// positive value only.
	public static double round (double value, int decimalPlace)
	{
		double power_of_ten = 1;
		// floating point arithmetic can be very tricky.
		// that's why I introduce a "fudge factor"
		double fudge_factor = 0.05;
		while (decimalPlace-- > 0)
		{
			power_of_ten *= 10.0d;
			fudge_factor /= 10.0d;
		}
		return Math.round((value + fudge_factor) * power_of_ten) / power_of_ten;
	}

	public static void exp ()
	{
		String args = "15#150.20#1#0.12#4#0";
		StringTokenizer st = new StringTokenizer(args, "#");
		while (st.hasMoreTokens())
		{
			System.out.print(st.nextToken());
			System.out.print(" : ");
			System.out.println(st.nextToken());
		}
	}

	public static final Double zeroToNull (Double db)
	{
		db = (db != null) && (db.doubleValue() == 0) ? null : db;
		return db;
	}
}
