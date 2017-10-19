package estudando.classes.ClasseMath;

import java.util.Random;

/* O java é capaz de gerar número randômicos, que na versade são pseudo-randômicos
 * 
 * O que você precisa saber é que quando trabalhamos com números randômicos é que uma sequência
 * de números randômicos sempre tem origem no que chamamos de cemente, uma cemente(número x) é um número do tipo
 * long e esse número é utilizado em um algoritimo que gera a sequência de números randômicos distribuídos no intervalo que você precisa
 * 
 * Se eu tiver uma cemente de número Y, e colocar este número no gerador de números randômicos ele irá gerar uma nova sequência
 * 
 * AGORA saiba que se você voltar a usar o mesmo número X você terá de volta a mesma sequência do número X anterior, por isso chamamos
 * de "pseudo randômicos"
 * 
 * Somente números cementes iguais geram sequência iguais
 */

public class Metodos {
	public static void main(String[] args) {
		
		/* Classe Random tem o poder de gerar números randômicos 
		 * Quando você faz um new Random() esse obj é capaz de gerar números randômicos
		 * 
		 * Quando você utiliza o construtor vazio, você não precisa se preocupar com a semente, o java vai garantir que a cemente
		 * utilizada seja diferente de um obj Random anterior, para evitar que a sequência gerada seja a mesma de alguma geração anterior
		 * 
		 * Mas também é possível definir a cemente no construtor
		 */
		
		/* nextDouble()
		 * Cria um obj double e atribui a ele o próximo número da sequencia(é possível gerar números de outros tipos(float, int...))
		 * Sempre que você usa o nexDouble ele gera um número entre 0 e 1 mas esse número nunca chega a ser 1, então ele vai de 0 a 1,99999...
		 */
		
		/* nextInt(10)
		 * Nele é possível passar como parametro um valor máximo de geração, no exemplo eu iria querer um número entre 0 e 9
		 * Veja que se eu passo 10 o ultimo número possível de ser gerado na sequência é SEMPRE um antes, ou seja o 9
		 * Portanto o nextInt possui essa flexibilidade, podendo definir o número limite para geração 
		 */
		
		Random random1 = new Random();
		Double numeroGerado1 = random1.nextDouble();
		System.out.println("N1: " + numeroGerado1);
		
		int numeroGerado2 = random1.nextInt(10);
		System.out.println("N2: " + numeroGerado2);

		/* Math.random()
		 * Além da classe Random, outra forma que você tem é usar o método estático random()
		 * é mais utilizado por ser mais eficiente para o que as pessoas precisam
		 * 
		 * Math.random() sempre gerá números do tipo double, ou seja de 0 a 0.99999... pois internamente ele instancia e chama
		 * o método NextDouble da classe Random
		 */
		double numeroGerado3 = Math.random();
		System.out.println("N3: " + numeroGerado3);
		
		/* Mas então como gerar um método que gera um número entre um e outro?
		 * 
		 * Você precisa criar este método, que é bastante simples
		 * Criando um intervalo que chama número entre um e outro
		 
		  int gerarInt(int inicio, int fim){
			int intervalo = fim - inicio;
			int n = (int)(Math.random() * intervalo) + inicio;
			return n;
		  }
		  
		 * 1. Calcula o intervalo entre os números
		 * 2. Gera um double randômico entre 0 e 0.9999...
		 * 3. Multiplica o valor pelo intervalo, se vc teve um random de 0.123, a multiplicação deixa como 123.5468
		 * 4. Trunca as casas decimais com o cast explícito(int) para deixar o 123.5468 como 123
		 * 5. Soma o resultado com o início do intervalo  Soma o 123 com o inicio para ficar dentro do intervalo que você quer
		 */
		int numeroGerado4 = gerarInt(1, 10);
		System.out.println("N4: " + numeroGerado4);
		
		/* Classe Math possuí uma série de métodos estáticos voltados para operações
		 * matemáticas comuns, como potencia, raiz e etc...
		 */
		System.out.println("\nClasse Math");
		
		System.out.println("abs()");
		System.out.println(Math.abs(-10)); //10 Retorna o valor absoluto, ou seja sem sinal
		
		System.out.println("\nmax()");
		System.out.println(Math.max(10, 5)); //10 Retorna o valor máximo entre dois valores
		
		System.out.println("\nmin()");
		System.out.println(Math.min(10, 5)); //5 Retorna o valor mínimo entre dois valores
		
		System.out.println("\nceil()");
		System.out.println(Math.ceil(10.1)); //11.0 Retorna o valor arredondado para cima
		
		System.out.println("\nfloor()");
		System.out.println(Math.floor(10.1)); //10.0 Retorna o valor arredondado para baixo
		
		System.out.println("\nround()");
		System.out.println(Math.round(10.4)); //10.0 Retorna o valor arredondado para cima ou baixo(10.4 é pra baixo, já 10.5 arredonda pra cima)
		
		System.out.println("\nsqrt()");
		System.out.println(Math.sqrt(81)); //9.0 Retorna a raiz quadrade de um numero
		
		System.out.println("\nspow()");
		System.out.println(Math.pow(5, 2)); //25.0 retorna a potencia de 5 elevado a 2
		
		System.out.println("\ntoDegrees()");
		System.out.println(Math.toDegrees(2)); //Coverte um angulo de Radianos pra Graus
		
		System.out.println("\ntoRadians()");
		System.out.println(Math.toRadians(2)); //Coverte um angulo de Graus pra Radianos
		
		//entre outros métodos...
	}

	static int gerarInt(int inicio, int fim){
		int intervalo = fim - inicio;
		int n = (int)(Math.random() * intervalo) + inicio;
		return n;
	}
}
