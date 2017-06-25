package estudando.DataHora;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

/* A partir do java 8 uma nova classe de datas foi adicionado ao java
 * API de Data e Hora do pacote java.time
 * 
 *  Ela trouxe diversas classes IMUTÁVEIS para representar diferentes conceitos, por serem imúteveis
 *  para alterar um obj você deve criar outro obj
 *  
 *  Com ela você pode trabalhar em ambiente mult thread sem se preocupar com sincronismo, coisa que não
 *  acontecia quando se utiliza as classes padrões de data e hora
 */

/* ---- Principais classes que compõe está api ----
 *  
 * LocalDate
 * Uma data(com dia, mês e ano)
 * 
 * LocalTime
 * Uma hora(com hora, minuto, segundo e milessegundo)
 * 
 * LocalDateTime
 * Uma data e hora
 * 
 * Period
 * Um período de tempo(em anos, meses, dias, semanas), usado em períodos longos
 * 
 * Duration
 * Uma duração de tempo(em dias, horas, minutos, segundos), usado em períodos curtos
 * 
 * MonthDay
 * Um par de mês e dia(Ex. dia de aniversário)
 * 
 * YearMonth
 * Um par de ano e mês(Ex. data de validade do cartão de crédito)
 * 
 * Instant
 * Um instante no tempo, com precisão de nanossegundos
 */

/* ENUM que compõe está api
 * 
 * ChronoUnit
 * Unidades de tempo(dias, meses, anos, horas, minutos, etc.)
 * é uma lista com elementos específicos, então tem elementos que representam dias
 * meses e etc.. são tipos de dados pré definidos
 */

public class DataHoraJava8 {
	public static void main(String[] args) {

		/* Data atual do sistema(do servidor) */
		LocalDate dataAtual = LocalDate.now(); //Veja chamada a metodos estáticos
		System.out.println(dataAtual); //2017-06-02
		
		/* Hora atual do sistema(do servidor) */
		LocalTime horaAtual = LocalTime.now(); 
		System.out.println(horaAtual); //03:24:32.579
		
		
		
		
		/* Data e Hora juntando as partes(os pedaços que compõe a data e a hora
		 * o método of tem essas caractrerística de montar o obj conforme as partes
		 * OU SEJA, já monto um obj de data ou hora já pré definido
		 * 
		 * Quando você trabalhava com a Classe Calendar os meses começavam em 0 até 11
		 * Aqui no LocalDate não existe mais isso, vai de 1 até 12
		 * 
		 * Tanto faz passar o número direto ou o ENUM para mês
		 * LocalDate montandoData = LocalDate.of(2017, 07, 19);
		 * LocalDate montandoData = LocalDate.of(2017, Month.JULY, 19);
		 */
		LocalDate montandoData = LocalDate.of(2017, Month.JULY, 19);
		System.out.println(montandoData); //2017-07-19
		
		LocalTime montandoHora = LocalTime.of(18, 30, 0); 
		System.out.println(montandoHora); //18:30
		
		
		
		
		/* Data através de Parse
		 * Passa string que representa a data, e o segundo parametro é um DateTimeFormater com
		 * o método ofPattern que recebe um formato de data, convertendo a string para este padrão de data
		 */
		LocalDate montandoDataParse = LocalDate.parse("19/07/2017", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println(montandoDataParse); //2017-07-19
		System.out.println(montandoDataParse.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))); //19/07/1987
		
		/* Data através de Parse
		 * Passa string que representa a data, e o segundo parametro é um DateTimeFormater com
		 * o método ofPattern que recebe um formato de data, convertendo a string para este padrão de data
		 */
		LocalTime montandoHoraParse = LocalTime.parse("16:00", DateTimeFormatter.ofPattern("HH:mm"));
		System.out.println(montandoHoraParse); //16:00
		
		

		
		

	}

}
