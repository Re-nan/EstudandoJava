package estudando.DataHora;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class PeriodDuration {
	public static void main(String[] args) {
				
		System.out.println("Periodo");
		/* Criando um periodo de 0 anos, 1 mês e 7 dias e somando esse periodo a
		 * data atual do sistema
		 */	
		Period periodo = Period.of(0, 1, 7);
		LocalDate data = LocalDate.now().plus(periodo);
		System.out.println(data);
		
		
		
		System.out.println("\nDuração");	
		/* Criando uma duração de 15 minutos
		 * e subtraindo no tempo atual do sistema 
		 */
		Duration duracao = Duration.ofMinutes(15);
		LocalTime tempo = LocalTime.now().minus(duracao);
		System.out.println(tempo);
		
		
		
		
		
		System.out.println("\nPeriodo entre datas");
		/* Tenho 2 datas e quero o periodo entre elas */
		LocalDate d1 = LocalDate.now();
		LocalDate d2 = LocalDate.parse("2000-01-05");
		
		Period p = Period.between(d2, d1); //Passa a data com anos menor e depois o maior
		int anos = p.getYears();
		int meses = p.getMonths();
		int dias = p.getDays();
		
		System.out.println("Periodo: " + p); //P1 xY xM xD
		System.out.println("Anos: " + anos);
		System.out.println("Meses: " + meses);
		System.out.println("Dias: " + dias);
		
		
		
		
		
		System.out.println("\nDuração entre horas");
		/* Tenho 2 horarios e quero a duração entre elas */
		LocalTime t1 = LocalTime.now();
		LocalTime t2 = LocalTime.parse("04:30:00");
		
		Duration d = Duration.between(t2, t1);
		long segundos = d.getSeconds();
		
		System.out.println("Duração em segundos: " + segundos);
		
		


	}

}
