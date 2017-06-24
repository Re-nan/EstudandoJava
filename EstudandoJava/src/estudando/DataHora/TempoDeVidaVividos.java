package estudando.DataHora;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class TempoDeVidaVividos {

	public static void main(String[] args) {
		
		/* Criando uma data de nascimento com data, hora e minuto */
		String dataNascimento = "19/07/1987 22:00";
		
		/* Para calcular temos que converter a data de nascimento para um obj do tipo LocalDateTime
		 * pois ele � um obj que consegue manipular data e hora no tempo
		 */
		
		/* Como quero gerar o obj que est� em uma data String eu chamo o parse passando a data e o formato que essa
		 * data est�
		 */
		LocalDateTime data1 = LocalDateTime.parse(dataNascimento, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
		LocalDateTime data2 = LocalDateTime.now(); //Criando um obj LocalDateTime com a data e hor�rio do sistema
		
		/* Para trabalhar com dura��es de algo eu crio um obj Duration
		 * Com o m�todo between eu j� consifo a dura��o de vida tanto em dias, minutos, horas...
		 * entre uma data e outra
		 */
		Duration duracao = Duration.between(data1, data2);
		
		System.out.println("Horas: " + duracao.toHours());
		System.out.println("Dias: " + duracao.toDays());
		
		/* Pra saber em meses um obj Duration n�o � o mais adequado, para isso usa a classe Period
		 * passando como parametro no metodo between um LocalDate e n�o LocalDateTime, pois o Period
		 * s� leva em considera��o s� a data, as horas ele n�o considera  
		 * ent�o preciso convertar meus dois obj's LocalDateTime em LocalDate
		 */
		Period periodo = Period.between(data1.toLocalDate(), data2.toLocalDate());
		System.out.println("Meses: " + periodo.toTotalMonths());
		
		/* E se eu quiser a tqd de semanas que j� vivi? usa o enum ChromeUnit
		 * 
		 */
		System.out.println("Semanas: " + ChronoUnit.WEEKS.between(data1, data2)); //Aqui aceita obj's LocalDateTime
		System.out.println("Anos: " + ChronoUnit.YEARS.between(data1, data2));


	}

}
