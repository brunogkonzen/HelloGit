package testesDatas;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class TesteTresFormatarDatasMoedas {

	public static void main(String[] args) {
		
		Locale.setDefault(new Locale("en", "US"));

		DateFormat df1 = DateFormat.getDateInstance(DateFormat.SHORT);
		DateFormat df2 = DateFormat.getDateInstance(DateFormat.MEDIUM);
		DateFormat df3 = DateFormat.getDateInstance(DateFormat.LONG);
		DateFormat dfull = DateFormat.getDateInstance(DateFormat.FULL);
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/y HH:mm:ss");

		Date data1 = new Date();

		System.out.println("Data formato padrão = " + data1);

		System.out.println("Data formato 1 = " + df1.format(data1));
		System.out.println("Data formato 2 = " + df2.format(data1));
		System.out.println("Data formato 3 = " + df3.format(data1));
		System.out.println("Data formato 4 = " + dfull.format(data1));
		
		System.out.println();
	
		System.out.println("Data formato Simples 1 = "+sdf1.format(data1));
		System.out.println("Data formato Simples 2 = "+sdf2.format(data1));	

		System.out.println();
	
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		String formatado = nf.format(100);
		System.out.println(formatado);


	}
}
