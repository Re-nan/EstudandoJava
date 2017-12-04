package estudando.exceptions.StackTrace;

/* Início main
 * Início m1
 * Início m2
 * 0
 * 2
 * 4
 * 6
 * 8
 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5
 * 		at estudando.exceptions.StackTrace.Main.m2(Main.java:38)
 * 		at estudando.exceptions.StackTrace.Main.m1(Main.java:23)
 * 		at estudando.exceptions.StackTrace.Main.main(Main.java:7)
 * 
 * VAMOS ENTENDER
 * Ocorreu uma exceção do tipo ArrayIndexOutOfBoundsException que foi tentando acessar
 * o indice 5 de um array que só vai até 4, e onde isso ocorreu? veja a linha de baixo
 * diz que foi o método m2 na linha 38 e que por ele não tratar esse erro/exceção com
 * um try catch a JVM lançou a exceção pro metodo que chamou m2 que foi o m1 na linha 
 * 23 e que por ele também não tratar com try catch a JVM lançou a exceção pro método
 * main que foi quem chamou o m1 na linha 7 e que por ninguém tratar ela lançou pra
 * fora da JVM encerrando a aplicação.
 * 
 * Executou o método main e m1 que chamou m2, ao dar a exceção ArrayIndexOutOfBoundsException que
 * é de índice fora do array, a jvm verificou se m2 tratava essa exceção com um
 * try catch e viu que não, então voltou para quem chamou m2 que foi m1 e verificou
 * se m1 tratava essa exceção e viu que não e foi pra quem chamou m1 que foi o main
 * que se não tratar lança a exceção pra fora da aplicação finalizando ela.
 */ 

public class Main {
	public static void main(String[] args) {
		
		System.out.println("Início main");
		m1();
		System.out.println("Fim main");

	}

	
	
	private static void m1() {
		System.out.println("Início m1");
		
		/* Perceba que sempre que cai na exceção ele para exatamente na linha
		 * do erro e volta para o método que o chamou, e se o que chamou não tratar
		 * com um try catch, vai pro próximo da hierarquia que o chamou, até alguém
		 * tratar com um try catch
		 */
		try {
			m2();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Problema encontrado!");
		}
		
		System.out.println("Fim m1");
	}

	
	
	private static void m2() {
		System.out.println("Início m2");
		
		int[] array = new int[5];
			for(int i = 0; i < 6; i++) { 
				array[i] = i * 2;
				System.out.println(array[i]); //Vai dar ArrayIndexOutOfBoundsException aqui e não exibir "Fim m2"
			}
		
		
		System.out.println("Fim m2");
	}

}
