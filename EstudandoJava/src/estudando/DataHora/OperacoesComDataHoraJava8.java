package estudando.DataHora;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/* Como LocalDate e LocalTime são imútaveis, o retorno de cada método É SEMPRE UM NOVO 
 * obj de LocalDate ou LocalTime
 */

public class OperacoesComDataHoraJava8 {
	public static void main(String[] args) {
		
		System.out.println("Operações com Data\n");
		
		//Chamando data atual
		LocalDate dataAtual = LocalDate.now();
		System.out.println("dataAtual: " + dataAtual);
		
		//Somando 5 dias a data atual
		LocalDate dataAtualMais5Dias = dataAtual.plusDays(5);
		System.out.println("dataAtualMais5Dias: " + dataAtualMais5Dias);
		
		//Diminuindo 1 semana da data de dataAtual
		LocalDate dataAtualMenos1Semana = dataAtual.minus(1,ChronoUnit.WEEKS);
		System.out.println("dataMenos1Semana: " + dataAtualMenos1Semana);
		
		
		System.out.println("\n\nOperações com Tempo\n");
		
		
		//Diminuindo 1 HORA da hora horaAtual
		LocalTime horaAtual = LocalTime.now();
		LocalTime HoraAtualMenos1Hora = horaAtual.minus(1, ChronoUnit.HOURS); 
		System.out.println("HoraAtual: " + horaAtual);
		System.out.println("HoraAtualMenos1Hora: " + HoraAtualMenos1Hora);
		
		System.out.println();
		
		
		LocalTime horaAtual2 = LocalTime.now();
		LocalTime horaAtual2Mais2HorasE30Minutos = horaAtual2.plusHours(2).plusMinutes(30);
		/* LocalTime Mais2HorasE30Minutos = horaAtual2.plusHours(2).plusMinutes(30);
		 * horaAtual2 retorna um novo obj LocalTime com 2 horas a mais, e nesse obj retornado é adicionado
		 * 30 minutos a mais gerando um novo obj então com a adição de 2 horas e 30 minutos 
		 */
		
		/* Subtraindo menos 100 milisegundos do obj horaAtual2 */
		LocalTime horaAtual2Menos100Milesegundos = horaAtual2.minus(100, ChronoUnit.MILLIS);
		System.out.println("horaAtual2: " + horaAtual2);
		System.out.println("horaAtual2Mais2HorasE30Minutos: " + horaAtual2Mais2HorasE30Minutos);
		System.out.println("horaAtual2Menos100Milesegundos: " + horaAtual2Menos100Milesegundos);
		

		System.out.println("\n\nOperações com Data e Tempo\n");
		
		
		LocalDateTime dataHoraAtual = LocalDateTime.now();
		LocalDateTime dataHoraAtualMais2Dias30Horas = dataHoraAtual.plusDays(2).plusHours(30);
		System.out.println("dataHoraAtual: " + dataHoraAtual);
		System.out.println("dataHoraAtualMais2Dias30Horas: " + dataHoraAtualMais2Dias30Horas);
		
		
		
		
		
		
	}

}
