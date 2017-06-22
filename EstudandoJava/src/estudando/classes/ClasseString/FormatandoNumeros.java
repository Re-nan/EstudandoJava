package estudando.classes.ClasseString;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

/* Quando falamos de formatar números no java, estamos falando da classe NumberFormat
 * ela é a principal utilizada para formatação de números, essa classe também possui
 * suporte a localização, então eu posso formatar números utilizando diversas
 * localidades do mundo de países e linguá
 */
public class FormatandoNumeros {
	public static void main(String[] args) {
		
		/* Formatação de número no padrão BRASILEIRO considerando separadores de milhar e casas decimais */
		NumberFormat nf1 = NumberFormat.getInstance(); //Criando uma instancia de NumberFormat com getIntance pois ela é uma classe abstrata
		String s1 = nf1.format(1000.5); //com o obj NumberFormat eu consigo chamar o metodo format() e passar o numero a ser formatado
		System.out.println(s1); // 1.000,5 Retorna o numero formatado com as casas de milhar e casas decimais corretamente
		
		/* Formatação de número no padrão AMERICANO */
		Locale usa = new Locale("en", "US"); //Locale passando a linguá e depois o país
		NumberFormat nf2 = NumberFormat.getInstance(usa); // Criando um obj NumberFormat que utiliza como Locale o padrão americano
		String s2 = nf2.format(1000.5); //passo o número que eu quero para o padrão que já foi configurado como americano
		System.out.println(s2); //1,000.5 Retorna como a semapação de casas de milhar por virgula e de casa decimais por ponto
		
		
		
		/* Formatação em dinheiro no padrão BRASILEIRO */
		Locale bra = new Locale("pt", "BR"); //Locale passando a linguá e depois o país
		NumberFormat nf3 = NumberFormat.getCurrencyInstance(bra); // Criando um NumberFormat que utiliza como Locale o padrão brasileiro
		String s3 = nf3.format(1000.5); //passo o número que eu quero para o padrão que já foi configurado como brasileiro
		System.out.println(s3); //R$ 1.000,50 Por passar o método getCurrencyInstance ele passa como valor de moeda do país(do locale)
		
		/* Formatação em dinheiro no padrão AMERICANO */
		Locale usa2 = new Locale("en", "US"); //Locale passando a linguá e depois o país
		NumberFormat nf4 = NumberFormat.getCurrencyInstance(usa2); // Criando um NumberFormat que utiliza como Locale o padrão americano
		String s4 = nf4.format(1000.5); //passo o número que eu quero para o padrão que já foi configurado como americano
		System.out.println(s4); //R$ 1.000,50 Por passar o método getCurrencyInstance ele passa como valor de moeda do país(do locale)
		
		/* Formatação no padrão ITALIANO */
		Locale ita = new Locale("it", "IT"); //Locale passando a linguá e depois o país
		NumberFormat nf5 = NumberFormat.getCurrencyInstance(ita); // Criando um NumberFormat que utiliza como Locale o padrão italiano
		String s5 = nf5.format(1000.5); //passo o número que eu quero para o padrão que já foi configurado como americano
		System.out.println(s5); //€ 1.000,50 Por passar o método getCurrencyInstance ele passa como valor de moeda do país(do locale)
		
		
		/* vamos supor que eu quero que exibia um número com 5 casas na parte inteira, e 3 casas na parte decimal */
		DecimalFormat df1 = new DecimalFormat("00000.000");
		String s6 = df1.format(1000.5);
		System.out.println(s6); //01000,500 ele completa a esquerda e direita com zeros
		
		/* Agora vamos supor que você não quer que venha com aquela vírgula e ao invés da vírgula venha um sinal de ifem
		 * Você cria um obj DecimalFormatSymbols e dentro dele você formata a aparência 
		 */
		DecimalFormat df2 = new DecimalFormat("00000.000");
		DecimalFormatSymbols dfs = new DecimalFormatSymbols(); //Cria um obj que aceita um separador
		dfs.setDecimalSeparator('-'); //seta o separador no obj
		df2.setDecimalFormatSymbols(dfs); //Atrela o obj DecimalFormat ao separador do tipo DecimalFormatSymbols
		String s7 = df2.format(1000.5);
		System.out.println(s7); //01000-500
		
		
		
		

	}

}
