package estudando.classes.ClasseString;

/* A formata��o de strings pode ser feita facilmente atrav�s dos m�todos format()
 * e printf() da classe PrintStream, esses 2 m�todos funcionam da mesma forma ent�o
 * tanto faz usar um ou outro
 */

/* PrintStream � uma classe do java do pacote java.io, quando voc� quer exibir alguma
 * coisa no console voc� usa o System.out.print() ou System.out.println(), s� que como
 * System.out � um PrintStream � poss�vel formatar a sa�da para o console com 
 * System.out.format() ou System.out.printf()
 * 
 * Outra op��o � o m�todo est�tico da classe String
 * String.format()
 */

public class FormatandoStrings {

	public static void main(String[] args) {
		
		//Vejamos alguns padr�es de formata��o
		
		/* o % indica que ser� passado um dos argumentos da sequ�ncia
		 * o d indica que este n�mero deve ser formatado como um n�mero inteiro
		 * o f indica que est� n�mero deve ser formatado como um n�mero decimal
		 */
		System.out.printf("%d, %f", 245, 100.0); //245, 100,000000
		
		
		/* % indica que ser� passado um dos argumentos da sequ�ncia que � p 100.0
		 * .df indica que este n�mero dever� ser formatado com apenas 2 casas decimais 
		 */
		System.out.printf("\n" + "%.2f", 100.0); //100,00
		
		
		/* > Continua sendo o sinal de maior
		 * % substitui pelo primeiro argumento que no caso � o 2000
		 * 7 indica o tamanho da string de sa�da, ou seja que 2000 deve ter o tamanho 7 na sa�da portando ser� preenchido com espa�os em branco a esquerda
		 * d indica que o n�mero deve ser impresso como um inteiro
		 * \n quebra de linha
		 * > Continua sendo o sinal de maior
		 * % substitui pelo primeiro argumento que no caso � o "abc"
		 * 7 indica o tamanho da string de sa�da, ou seja que abc deve ter o tamanho 7 na sa�da portando ser� preenchido com espa�os em branco a esquerda
		 * s indica o tipo de dado, como abc � uma String eu coloco o s
		 */
		System.out.printf("\n" + ">%7d<\n>%7s<", 2000, "abc"); //>   2000<
															   //>    abc<
		
		/* % substitui pelo primeiro argumento que no caso � o 25
		 * 0 indica que eu devo preencher com 0 a esquerda at� o tamanho que eu estou querendo
		 * 5 � o tamanho que eu estou querendo
		 * d indica que � um numero inteiro
		 */
		System.out.printf("\n" + "%05d", 25); //00025
		


	}

}
