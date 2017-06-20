package estudando.classes.ClasseString;

/* A formatação de strings pode ser feita facilmente através dos métodos format()
 * e printf() da classe PrintStream, esses 2 métodos funcionam da mesma forma então
 * tanto faz usar um ou outro
 */

/* PrintStream é uma classe do java do pacote java.io, quando você quer exibir alguma
 * coisa no console você usa o System.out.print() ou System.out.println(), só que como
 * System.out é um PrintStream é possível formatar a saída para o console com 
 * System.out.format() ou System.out.printf()
 * 
 * Outra opção é o método estático da classe String
 * String.format()
 */

public class FormatandoStrings {

	public static void main(String[] args) {
		
		//Vejamos alguns padrões de formatação
		
		/* o % indica que será passado um dos argumentos da sequência
		 * o d indica que este número deve ser formatado como um número inteiro
		 * o f indica que esté número deve ser formatado como um número decimal
		 */
		System.out.printf("%d, %f", 245, 100.0); //245, 100,000000
		
		
		/* % indica que será passado um dos argumentos da sequência que é p 100.0
		 * .df indica que este número deverá ser formatado com apenas 2 casas decimais 
		 */
		System.out.printf("\n" + "%.2f", 100.0); //100,00
		
		
		/* > Continua sendo o sinal de maior
		 * % substitui pelo primeiro argumento que no caso é o 2000
		 * 7 indica o tamanho da string de saída, ou seja que 2000 deve ter o tamanho 7 na saída portando será preenchido com espaços em branco a esquerda
		 * d indica que o número deve ser impresso como um inteiro
		 * \n quebra de linha
		 * > Continua sendo o sinal de maior
		 * % substitui pelo primeiro argumento que no caso é o "abc"
		 * 7 indica o tamanho da string de saída, ou seja que abc deve ter o tamanho 7 na saída portando será preenchido com espaços em branco a esquerda
		 * s indica o tipo de dado, como abc é uma String eu coloco o s
		 */
		System.out.printf("\n" + ">%7d<\n>%7s<", 2000, "abc"); //>   2000<
															   //>    abc<
		
		/* % substitui pelo primeiro argumento que no caso é o 25
		 * 0 indica que eu devo preencher com 0 a esquerda até o tamanho que eu estou querendo
		 * 5 é o tamanho que eu estou querendo
		 * d indica que é um numero inteiro
		 */
		System.out.printf("\n" + "%05d", 25); //00025
		


	}

}
