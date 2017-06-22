package estudando.classes.ClasseString;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

/* Quando falamos de formatar n�meros no java, estamos falando da classe NumberFormat
 * ela � a principal utilizada para formata��o de n�meros, essa classe tamb�m possui
 * suporte a localiza��o, ent�o eu posso formatar n�meros utilizando diversas
 * localidades do mundo de pa�ses e lingu�
 */
public class FormatandoNumeros {
	public static void main(String[] args) {
		
		/* Formata��o de n�mero no padr�o BRASILEIRO considerando separadores de milhar e casas decimais */
		NumberFormat nf1 = NumberFormat.getInstance(); //Criando uma instancia de NumberFormat com getIntance pois ela � uma classe abstrata
		String s1 = nf1.format(1000.5); //com o obj NumberFormat eu consigo chamar o metodo format() e passar o numero a ser formatado
		System.out.println(s1); // 1.000,5 Retorna o numero formatado com as casas de milhar e casas decimais corretamente
		
		/* Formata��o de n�mero no padr�o AMERICANO */
		Locale usa = new Locale("en", "US"); //Locale passando a lingu� e depois o pa�s
		NumberFormat nf2 = NumberFormat.getInstance(usa); // Criando um obj NumberFormat que utiliza como Locale o padr�o americano
		String s2 = nf2.format(1000.5); //passo o n�mero que eu quero para o padr�o que j� foi configurado como americano
		System.out.println(s2); //1,000.5 Retorna como a semapa��o de casas de milhar por virgula e de casa decimais por ponto
		
		
		
		/* Formata��o em dinheiro no padr�o BRASILEIRO */
		Locale bra = new Locale("pt", "BR"); //Locale passando a lingu� e depois o pa�s
		NumberFormat nf3 = NumberFormat.getCurrencyInstance(bra); // Criando um NumberFormat que utiliza como Locale o padr�o brasileiro
		String s3 = nf3.format(1000.5); //passo o n�mero que eu quero para o padr�o que j� foi configurado como brasileiro
		System.out.println(s3); //R$ 1.000,50 Por passar o m�todo getCurrencyInstance ele passa como valor de moeda do pa�s(do locale)
		
		/* Formata��o em dinheiro no padr�o AMERICANO */
		Locale usa2 = new Locale("en", "US"); //Locale passando a lingu� e depois o pa�s
		NumberFormat nf4 = NumberFormat.getCurrencyInstance(usa2); // Criando um NumberFormat que utiliza como Locale o padr�o americano
		String s4 = nf4.format(1000.5); //passo o n�mero que eu quero para o padr�o que j� foi configurado como americano
		System.out.println(s4); //R$ 1.000,50 Por passar o m�todo getCurrencyInstance ele passa como valor de moeda do pa�s(do locale)
		
		/* Formata��o no padr�o ITALIANO */
		Locale ita = new Locale("it", "IT"); //Locale passando a lingu� e depois o pa�s
		NumberFormat nf5 = NumberFormat.getCurrencyInstance(ita); // Criando um NumberFormat que utiliza como Locale o padr�o italiano
		String s5 = nf5.format(1000.5); //passo o n�mero que eu quero para o padr�o que j� foi configurado como americano
		System.out.println(s5); //� 1.000,50 Por passar o m�todo getCurrencyInstance ele passa como valor de moeda do pa�s(do locale)
		
		
		/* vamos supor que eu quero que exibia um n�mero com 5 casas na parte inteira, e 3 casas na parte decimal */
		DecimalFormat df1 = new DecimalFormat("00000.000");
		String s6 = df1.format(1000.5);
		System.out.println(s6); //01000,500 ele completa a esquerda e direita com zeros
		
		/* Agora vamos supor que voc� n�o quer que venha com aquela v�rgula e ao inv�s da v�rgula venha um sinal de ifem
		 * Voc� cria um obj DecimalFormatSymbols e dentro dele voc� formata a apar�ncia 
		 */
		DecimalFormat df2 = new DecimalFormat("00000.000");
		DecimalFormatSymbols dfs = new DecimalFormatSymbols(); //Cria um obj que aceita um separador
		dfs.setDecimalSeparator('-'); //seta o separador no obj
		df2.setDecimalFormatSymbols(dfs); //Atrela o obj DecimalFormat ao separador do tipo DecimalFormatSymbols
		String s7 = df2.format(1000.5);
		System.out.println(s7); //01000-500
		
		
		
		

	}

}
