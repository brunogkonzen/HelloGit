package testesDatas;

import java.util.Calendar;
import java.util.Date;

public class TesteUm {

	public static void main(String[] args) {
		Date hoje1 = new Date();
		System.out.println(hoje1);
		Calendar hoje2 = Calendar.getInstance();
		System.out.println(hoje2);
		int dia = hoje1.get(Calendar.DAY_OF_MONTH);
		int mes = hoje1.get(Calendar.MONTH);
		int ano = hoje1.get(Calendar.YEAR);
		System.out.println(dia);
		System.out.println(mes);
		System.out.println(ano);
	}

}
