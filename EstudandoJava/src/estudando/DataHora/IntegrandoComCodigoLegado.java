package estudando.DataHora;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

/* integrar a API nova do java8 com os api de Data e Hora antigas
 * 
 * A classe Data e Calendar ganharam métodos para converter a sua representação para um objeto Instant
 */
public class IntegrandoComCodigoLegado {
	public static void main(String[] args) {
		
		/* Transformar um tipo Date para um LocalDateTime 
		 *
		 * o instant é equivalente ao Date
		 * Nem o Date e o Instant carregam o fuso horário, para isso usasse o
		 * ZoneId.systemDefault() que pega o fuso horário do sistema
		 */
		Date data1 = new Date();
		Instant instante1 = data1.toInstant();
		LocalDateTime localDataTempo1 = LocalDateTime.ofInstant(instante1, ZoneId.systemDefault());// passa o instante e o fusohorario
		System.out.println(localDataTempo1); //2017-06-06T10:22:44.122
		
		
		/* Agora o caminho inverso, de LocalDatetime para Date
		 * 
		 */
		LocalDateTime localDataTempo2 = LocalDateTime.now();
		Instant instante2 = localDataTempo2.atZone(ZoneId.systemDefault()).toInstant();
		Date data2 = Date.from(instante2);// método criado na api antiga que recebe um obj Instant
		System.out.println(data2); //Tue Jun 06 10:27:09 BRT 2017
		
		
		
		
		
		
		
		
		/* De Calendar para LocalDateTime 
		 * Cria um obj Calendar que presenta a Data e Hora atual do systema
		 * e transforma esse obj e um obj Instant com toInstant()
		 */
		Calendar calendario1 = Calendar.getInstance();
		Instant instante3 = calendario1.toInstant();
		LocalDateTime localDataTempo3 = LocalDateTime.ofInstant(instante3, ZoneId.systemDefault());
		System.out.println(localDataTempo3);
		
		
		/* Agora o caminho inverso, de LocalDatetime para Date
		 * Convert o obj LocalDateTime para Instance passando os horarios
		 * Cria um obj Calendar e nesse obj você chama o setTime e diz para 
		 * ele representar uma Data com Date.from()
		 */
		LocalDateTime localDataTempo4 = LocalDateTime.now();
		Instant instante4 = localDataTempo4.atZone(ZoneId.systemDefault()).toInstant();
		Calendar calendario2 = Calendar.getInstance();
		calendario2.setTime(Date.from(instante4));
		System.out.println(localDataTempo4);
		
		
		

	}

}
