package exercicios;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class ExercicioUm {

	public static void main(String[] args) {
		Locale.setDefault(new Locale("pt", "BR"));
		
		Calendar hoje = Calendar.getInstance();
		Date hoje1 = new Date();
		Date data1 = new Date();
		LocalDate datalocal = LocalDate.now();
		
		int dia = hoje.get(Calendar.DAY_OF_MONTH);
		int mes = hoje.get(Calendar.MONTH);
		int ano = hoje.get(Calendar.YEAR);
		mes++;
		
		DateFormat df1 = DateFormat.getDateInstance(DateFormat.SHORT);
		DateFormat df2 = DateFormat.getDateInstance(DateFormat.MEDIUM);
		DateFormat df3 = DateFormat.getDateInstance(DateFormat.LONG);
		DateFormat dfull = DateFormat.getDateInstance(DateFormat.FULL);
	
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/y HH:mm:ss");

		int hora = hoje.get(Calendar.HOUR_OF_DAY);
		int minutos = hoje.get(Calendar.MINUTE);
		String diaSemana = datalocal.getDayOfWeek().getDisplayName(TextStyle.FULL, new Locale("pt", "BR"));
		DateTimeFormatter formatadorMes = DateTimeFormatter.ofPattern("MMMM", new Locale("pt", "BR"));
		String mesPorExtenso = datalocal.format(formatadorMes);

		System.out.println("Data formato padrão do sistema ptBR: " + hoje1);
		System.out.println();

		System.out.println("Data formato SHORT = " + df1.format(data1)+".");
		System.out.println("Data formato MEDIUM = " + df2.format(data1)+".");
		System.out.println("Data formato LONG = " + df3.format(data1)+".");
		System.out.println("Data formato FULL = " + dfull.format(data1)+".");
		
		System.out.println();
	
		System.out.println("Data formato Simples dia/mes/ano = "+sdf1.format(data1)+".");
		System.out.println("Data formato Simples dia/mes/ano hora:minuto:segundo = "+sdf2.format(data1)+".");	

		System.out.println();
		
		String data = dia + "/" + mes + "/" + ano;
		System.out.println("A data de hoje é : " + data);
		String agora = hora + ":" + minutos +".";
		System.out.println("Agora: " + agora+".");
		
		System.out.printf("Hoje é dia %d/%d/%d, são %d horas e %d minutos.", dia, mes, ano, hora, minutos);
		System.out.println();

		String dataPorExtenso = String.format("Hoje é %s, dia %d de %s de %d e agora são %d horas e %d minutos.",
				diaSemana, dia, mesPorExtenso, ano, hora, minutos);
		System.out.println(dataPorExtenso);
	}
}