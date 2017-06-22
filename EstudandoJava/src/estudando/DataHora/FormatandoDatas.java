package estudando.DataHora;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* o java possui 4 classes principais quando o assunto � manupula��o de datas
 * 
 * >> Date <<
 * Do pacote "java.util.Date" representa uma data e hora
 * 
 * >> Calendar << 
 * Do pacote "java.util.Calendar" Possibilita a conver��o e manipula��o de datas e horas, usada
 * sempre que voc� precisa fazer alguma conta sobre datas, manipula��o ou convers�o em cima de uma data
 * 
 * >> DateFormat <<
 * Do pacote "java.text.DateFormat" Formata datas e horas para alguns padr�es espec�ficos
 * 
 * >> Locale << 
 * Do pacote "java.util.Locale" Representa uma localidade. � utilizada com datas para format�-las
 * de acordo com a localidade
 */

/* A partir do java 8 uma nova classe de datas foi adicionado ao java 
 * no pacote java.time
 */

public class FormatandoDatas {
	public static void main(String[] args) {
		
		/* a maioria dos m�todos da classe Date j� est�o com um risco dizendo que est�o depreciados
		 * apenas constamna api para compatibilidade com c�digos anteriores
		 */
		
		/* Obter data e hora atual do sistema(do servidor) */
		Date dataHoraAtual = new Date(); //pega data hora, minuto ano, mes, tudo...
		System.out.println(dataHoraAtual.toString()); //Thu Jun 01 23:44:14 BRT 2017 (Quinta Junho)
		System.out.println(dataHoraAtual.getTime() + "\n"); //Retorna a data em milesegundos
		
		/* Quando estamos trabalhando com sistema muitas vezes precisamos manipular data e para isso precisamos
		 * trbalhar com a classe Calendar
		 */
		Calendar c1 = Calendar.getInstance(); //Com esse construtor pega a data e hora atual do sistema
		c1.set(Calendar.YEAR, 2020); //seto o ano como 2020
		c1.set(Calendar.MONTH, 06); //seto o o m�s como julho, passo o 6 pois os meses no Calendar come�am em zero
		
		/* Para n�o ter que setar um a um na m�o, tem uma sobrecargar do metodo set que seta tudo */
		c1.set(2020, 06, 19, 23, 30, 5); //19 de hulho de 2020 as 23 e 30 minutos e 5 segundos
		
		c1.add(Calendar.YEAR, 1); //Somando 1 ano
		c1.add(Calendar.MINUTE, -5); //Subtraindo 5 minutos, � existe metodo para subtrair, por isso tem que passar nr negativo
		c1.add(Calendar.SECOND, -5); //Subtraindo 5 segundos, � existe metodo para subtrair, por isso tem que passar nr negativo
		
		Date d1 = c1.getTime(); // o getTime() faz essa ponte entre o Calendar e o Date
		System.out.println(d1);
		
		
		
		/* Somar 7 dias da data atual
		 * Por ser uma classe abstrata Calendar n�o � uma classe que eu posso criar uma instance utilizando
		 * o operador new, por isso eu devo chamar o m�todo getInstance()
		 */
		Calendar c2 = Calendar.getInstance(); //c1 possui uma referencia para uma instancia de Calendar
		c2.add(Calendar.DAY_OF_MONTH, 7); //m�todo add recebe qual tipo do campo do Calendario, no caso a data do m�s, e a qtd de dias a somar
		Date d2 = c2.getTime(); //getTime() obtem um novo obj Date com os dias j� somados, ele pega dia e hora
		System.out.println(d2.toString()); // Retornou "Thu Jun 08 23:52:10 BRT 2017" com 7 dias a mais que "Thu Jun 01 23:52:10 BRT 2017"
		
		
		
		/* Formata��o da data atual no padr�o CURTO
		 * 
		 * Date dataAtual = new date() pega a data e hora atual do sistema
		 * 
		 * DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT) Cria e Seta um obj DateFormat no padr�o curto pronto para receber uma
		 * data(getDataInsctance) curta
		 * 
		 * String s = df.format(dataAtualCurto);  o obj df que recebe datas curtas j� recebe essa data deixando ela curta e joga numa string
		 * System.out.println(s);
		 */
		Date dataAtual = new Date();
		DateFormat dataAtualCurto = DateFormat.getDateInstance(DateFormat.SHORT);
		String valorData = dataAtualCurto.format(dataAtual);
		System.out.println(valorData); //Exibe 02/06/17
		
		
		
		/* Formata��o da data atual no padr�o LONGO no padr�o FRANC�S
		 * 
		 * Locale fra = new Locale("fr", "FR");
		 * Cria um obj com as informa��es de um pa�s
		 * 
		 * DateFormat dataAtualLongo = DateFormat.getDateInstance(DateFormat.LONG, fra);
		 * Cria e seta um obj como formato de data pronto para receber datas longas, e j� passando de qual pais vai ser essas datas longas
		 * 
		 * String valorDataFra = dataAtualLongo.format(new Date());
		 * O obj dataAtualLongo no padr�o frances, pronto para formatar a data recebendo a data atual que ir� se adequar ao padr�o frances
		 * 
		 * System.out.println(valorDataFra); // Exibe 2 juin 2017 (2 de junho no idioma franc�s)
		 */
		Locale fra = new Locale("fr", "FR"); //Define um obj com as informa��es de um pa�s
		DateFormat dataAtualLongo = DateFormat.getDateInstance(DateFormat.LONG, fra);//se quiser trabalhar com hora troque por getTimeInstance()
		String valorDataFra = dataAtualLongo.format(new Date());
		System.out.println(valorDataFra); // Exibe 2 juin 2017 (2 de junho no idioma franc�s)
		
		/* padr�o brasileiro */
		Locale bra = new Locale("pt", "BR"); //Define um obj com as informa��es de um pa�s
		DateFormat dataAtualLongoBRA = DateFormat.getDateInstance(DateFormat.LONG, bra);//se quiser trabalhar com hora troque por getTimeInstance()
		String valorDataBRA = dataAtualLongoBRA.format(new Date());
		System.out.println(valorDataBRA);
		
		/* padr�o americano */
		Locale usa = new Locale("en", "US"); //Define um obj com as informa��es de um pa�s
		DateFormat dataAtualLongoUSA = DateFormat.getDateInstance(DateFormat.LONG, usa);//se quiser trabalhar com hora troque por getTimeInstance()
		String valorDataUSA = dataAtualLongoUSA.format(new Date());
		System.out.println(valorDataUSA); 
		
		/* Criando um padr�o pr�prio */
		/* crie um padr�o SimpleDateFormat
		 * cada elemento que compoe essa data e hora tem uma letra associada ex. "yyyy/MM/dd"
		 */
		SimpleDateFormat meuformato = new SimpleDateFormat("dd-MM-yyyy");
		String meuFormatoValor = meuformato.format(new Date());
		System.out.println(meuFormatoValor);	
		
		/* Caminho inverso, a partir de um obj String gerar um obj Date
		 * o m�todo parse pode lan�ar uma exce��o do tipo ParseException porque pode ser que a String de entra pode n�o
		 * estar no padr�o definido ent�o por isso ele pede para fazer um try catch
		 */
		String sd1 = "2030-07-1"; //Quero converter isso pra um Date
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		try{
			Date data1 = sdf1.parse(sd1);
			System.out.println(data1); //Mon Jul 01 00:00:00 BRT 2030
		}catch (ParseException e) {
			e.printStackTrace();
		}
		
		/* Outro exemplo com uma data com dia mes e ano s� que sem nenhum separador
		 * 
		 */
		String sd2 = "01072030"; //01 do 07 de 2030 converter isso pra um Date
		SimpleDateFormat sdf2 = new SimpleDateFormat("ddMMyyyy");
		try{
			Date data2 = sdf2.parse(sd2);
			System.out.println(data2); //Mon Jul 01 00:00:00 BRT 2030
		}catch (ParseException e) {
			e.printStackTrace();
		}
		



	}

}
