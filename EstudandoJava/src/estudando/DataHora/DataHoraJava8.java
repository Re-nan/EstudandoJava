package estudando.DataHora;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

/* A partir do java 8 uma nova classe de datas foi adicionado ao java
 * API de Data e Hora do pacote java.time
 * 
 *  Ela trouxe diversas classes IMUT�VEIS para representar diferentes conceitos, por serem im�teveis
 *  para alterar um obj voc� deve criar outro obj
 *  
 *  Com ela voc� pode trabalhar em ambiente mult thread sem se preocupar com sincronismo, coisa que n�o
 *  acontecia quando se utiliza as classes padr�es de data e hora
 */

/* ---- Principais classes que comp�e est� api ----
 *  
 * LocalDate
 * Uma data(com dia, m�s e ano)
 * 
 * LocalTime
 * Uma hora(com hora, minuto, segundo e milessegundo)
 * 
 * LocalDateTime
 * Uma data e hora
 * 
 * Period
 * Um per�odo de tempo(em anos, meses, dias, semanas), usado em per�odos longos
 * 
 * Duration
 * Uma dura��o de tempo(em dias, horas, minutos, segundos), usado em per�odos curtos
 * 
 * MonthDay
 * Um par de m�s e dia(Ex. dia de anivers�rio)
 * 
 * YearMonth
 * Um par de ano e m�s(Ex. data de validade do cart�o de cr�dito)
 * 
 * Instant
 * Um instante no tempo, com precis�o de nanossegundos
 */

/* ENUM que comp�e est� api
 * 
 * ChronoUnit
 * Unidades de tempo(dias, meses, anos, horas, minutos, etc.)
 * � uma lista com elementos espec�ficos, ent�o tem elementos que representam dias
 * meses e etc.. s�o tipos de dados pr� definidos
 */

public class DataHoraJava8 {
	public static void main(String[] args) {

		/* Data atual do sistema(do servidor) */
		LocalDate dataAtual = LocalDate.now(); //Veja chamada a metodos est�ticos
		System.out.println(dataAtual); //2017-06-02
		
		/* Hora atual do sistema(do servidor) */
		LocalTime horaAtual = LocalTime.now(); 
		System.out.println(horaAtual); //03:24:32.579
		
		
		
		
		/* Data e Hora juntando as partes(os peda�os que comp�e a data e a hora
		 * o m�todo of tem essas caractrer�stica de montar o obj conforme as partes
		 * OU SEJA, j� monto um obj de data ou hora j� pr� definido
		 * 
		 * Quando voc� trabalhava com a Classe Calendar os meses come�avam em 0 at� 11
		 * Aqui no LocalDate n�o existe mais isso, vai de 1 at� 12
		 * 
		 * Tanto faz passar o n�mero direto ou o ENUM para m�s
		 * LocalDate montandoData = LocalDate.of(2017, 07, 19);
		 * LocalDate montandoData = LocalDate.of(2017, Month.JULY, 19);
		 */
		LocalDate montandoData = LocalDate.of(2017, Month.JULY, 19);
		System.out.println(montandoData); //2017-07-19
		
		LocalTime montandoHora = LocalTime.of(18, 30, 0); 
		System.out.println(montandoHora); //18:30
		
		
		
		
		/* Data atrav�s de Parse
		 * Passa string que representa a data, e o segundo parametro � um DateTimeFormater com
		 * o m�todo ofPattern que recebe um formato de data, convertendo a string para este padr�o de data
		 */
		LocalDate montandoDataParse = LocalDate.parse("19/07/2017", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println(montandoDataParse); //2017-07-19
		System.out.println(montandoDataParse.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))); //19/07/1987
		
		/* Data atrav�s de Parse
		 * Passa string que representa a data, e o segundo parametro � um DateTimeFormater com
		 * o m�todo ofPattern que recebe um formato de data, convertendo a string para este padr�o de data
		 */
		LocalTime montandoHoraParse = LocalTime.parse("16:00", DateTimeFormatter.ofPattern("HH:mm"));
		System.out.println(montandoHoraParse); //16:00
		
		

		
		

	}

}
