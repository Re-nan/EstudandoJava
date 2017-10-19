package estudando.classes.ClasseMath;

import java.util.Random;

/* O java � capaz de gerar n�mero rand�micos, que na versade s�o pseudo-rand�micos
 * 
 * O que voc� precisa saber � que quando trabalhamos com n�meros rand�micos � que uma sequ�ncia
 * de n�meros rand�micos sempre tem origem no que chamamos de cemente, uma cemente(n�mero x) � um n�mero do tipo
 * long e esse n�mero � utilizado em um algoritimo que gera a sequ�ncia de n�meros rand�micos distribu�dos no intervalo que voc� precisa
 * 
 * Se eu tiver uma cemente de n�mero Y, e colocar este n�mero no gerador de n�meros rand�micos ele ir� gerar uma nova sequ�ncia
 * 
 * AGORA saiba que se voc� voltar a usar o mesmo n�mero X voc� ter� de volta a mesma sequ�ncia do n�mero X anterior, por isso chamamos
 * de "pseudo rand�micos"
 * 
 * Somente n�meros cementes iguais geram sequ�ncia iguais
 */

public class Metodos {
	public static void main(String[] args) {
		
		/* Classe Random tem o poder de gerar n�meros rand�micos 
		 * Quando voc� faz um new Random() esse obj � capaz de gerar n�meros rand�micos
		 * 
		 * Quando voc� utiliza o construtor vazio, voc� n�o precisa se preocupar com a semente, o java vai garantir que a cemente
		 * utilizada seja diferente de um obj Random anterior, para evitar que a sequ�ncia gerada seja a mesma de alguma gera��o anterior
		 * 
		 * Mas tamb�m � poss�vel definir a cemente no construtor
		 */
		
		/* nextDouble()
		 * Cria um obj double e atribui a ele o pr�ximo n�mero da sequencia(� poss�vel gerar n�meros de outros tipos(float, int...))
		 * Sempre que voc� usa o nexDouble ele gera um n�mero entre 0 e 1 mas esse n�mero nunca chega a ser 1, ent�o ele vai de 0 a 1,99999...
		 */
		
		/* nextInt(10)
		 * Nele � poss�vel passar como parametro um valor m�ximo de gera��o, no exemplo eu iria querer um n�mero entre 0 e 9
		 * Veja que se eu passo 10 o ultimo n�mero poss�vel de ser gerado na sequ�ncia � SEMPRE um antes, ou seja o 9
		 * Portanto o nextInt possui essa flexibilidade, podendo definir o n�mero limite para gera��o 
		 */
		
		Random random1 = new Random();
		Double numeroGerado1 = random1.nextDouble();
		System.out.println("N1: " + numeroGerado1);
		
		int numeroGerado2 = random1.nextInt(10);
		System.out.println("N2: " + numeroGerado2);

		/* Math.random()
		 * Al�m da classe Random, outra forma que voc� tem � usar o m�todo est�tico random()
		 * � mais utilizado por ser mais eficiente para o que as pessoas precisam
		 * 
		 * Math.random() sempre ger� n�meros do tipo double, ou seja de 0 a 0.99999... pois internamente ele instancia e chama
		 * o m�todo NextDouble da classe Random
		 */
		double numeroGerado3 = Math.random();
		System.out.println("N3: " + numeroGerado3);
		
		/* Mas ent�o como gerar um m�todo que gera um n�mero entre um e outro?
		 * 
		 * Voc� precisa criar este m�todo, que � bastante simples
		 * Criando um intervalo que chama n�mero entre um e outro
		 
		  int gerarInt(int inicio, int fim){
			int intervalo = fim - inicio;
			int n = (int)(Math.random() * intervalo) + inicio;
			return n;
		  }
		  
		 * 1. Calcula o intervalo entre os n�meros
		 * 2. Gera um double rand�mico entre 0 e 0.9999...
		 * 3. Multiplica o valor pelo intervalo, se vc teve um random de 0.123, a multiplica��o deixa como 123.5468
		 * 4. Trunca as casas decimais com o cast expl�cito(int) para deixar o 123.5468 como 123
		 * 5. Soma o resultado com o in�cio do intervalo  Soma o 123 com o inicio para ficar dentro do intervalo que voc� quer
		 */
		int numeroGerado4 = gerarInt(1, 10);
		System.out.println("N4: " + numeroGerado4);
		
		/* Classe Math possu� uma s�rie de m�todos est�ticos voltados para opera��es
		 * matem�ticas comuns, como potencia, raiz e etc...
		 */
		System.out.println("\nClasse Math");
		
		System.out.println("abs()");
		System.out.println(Math.abs(-10)); //10 Retorna o valor absoluto, ou seja sem sinal
		
		System.out.println("\nmax()");
		System.out.println(Math.max(10, 5)); //10 Retorna o valor m�ximo entre dois valores
		
		System.out.println("\nmin()");
		System.out.println(Math.min(10, 5)); //5 Retorna o valor m�nimo entre dois valores
		
		System.out.println("\nceil()");
		System.out.println(Math.ceil(10.1)); //11.0 Retorna o valor arredondado para cima
		
		System.out.println("\nfloor()");
		System.out.println(Math.floor(10.1)); //10.0 Retorna o valor arredondado para baixo
		
		System.out.println("\nround()");
		System.out.println(Math.round(10.4)); //10.0 Retorna o valor arredondado para cima ou baixo(10.4 � pra baixo, j� 10.5 arredonda pra cima)
		
		System.out.println("\nsqrt()");
		System.out.println(Math.sqrt(81)); //9.0 Retorna a raiz quadrade de um numero
		
		System.out.println("\nspow()");
		System.out.println(Math.pow(5, 2)); //25.0 retorna a potencia de 5 elevado a 2
		
		System.out.println("\ntoDegrees()");
		System.out.println(Math.toDegrees(2)); //Coverte um angulo de Radianos pra Graus
		
		System.out.println("\ntoRadians()");
		System.out.println(Math.toRadians(2)); //Coverte um angulo de Graus pra Radianos
		
		//entre outros m�todos...
	}

	static int gerarInt(int inicio, int fim){
		int intervalo = fim - inicio;
		int n = (int)(Math.random() * intervalo) + inicio;
		return n;
	}
}
