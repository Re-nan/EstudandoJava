package estudando.DataHora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class EnumChronoUnit {
	public static void main(String[] args) {
		
		/* Intervalo de meses 
		 * ChronoUnit � um enum, e ele possui uma s�rie de m�todos
		 */
		LocalDate d1 = LocalDate.of(2000, Month.JANUARY, 1);
		LocalDate d2 = LocalDate.of(2100, Month.DECEMBER, 31);
		long qtdMeses = ChronoUnit.MONTHS.between(d1, d2); 
		System.out.println("A qtd de meses �: " + qtdMeses);
		
		/* Intervalo de nanosegundo */
		LocalTime t1 = LocalTime.of(8, 0); // significa 8 horas e 0 minutos
		LocalTime t2 = LocalTime.now();
		long interNanos = ChronoUnit.NANOS.between(t1, t2);
		System.out.println("O intervalo de nanosegundos �: " + interNanos);
		
		
		
		
		
		/* Classe Instant representa um instante no tempo com preci��o de nanosegundo
		 * Pega o hor�rio(o instante) instant exato do sistema pro instanteInicio e pro instanteFim
		 * e faz o instervalo entre eles
		 */
		Instant instanteInicio = Instant.now(); //Obert o instant atual do sistema, ele retorna a data e hora em nano segundos, bem preciso
		//... alguns c�digos, para ter um tempo de atraso entre a execu��o de um instante pro outro
		Instant instanteFim = Instant.now();
		
		Duration duracao = Duration.between(instanteInicio, instanteFim);
		long segundos = duracao.getSeconds();
		System.out.println("O intervalo entre instantes �: " + segundos);

	}

}
