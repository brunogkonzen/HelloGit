package exercicios;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class ExercicioUm {

	public static void main(String[] args) {
		LocalDateTime dataAtual = LocalDateTime.now();
		LocalDate data = dataAtual.toLocalDate();
		int dia = data.getDayOfMonth();
		String nomeDia = data.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault());
		String mes = data.getMonth().getDisplayName(TextStyle.FULL, Locale.getDefault());
		int ano = data.getYear();
		int hora = dataAtual.getHour();
		int minuto = dataAtual.getMinute();

		String dataPorExtenso = String.format("Hoje é %s, dia %d de %s de %d e agora são %d horas e %d minutos.",
				nomeDia, dia, mes, ano, hora, minuto);
		System.out.println(dataPorExtenso);
	}
}