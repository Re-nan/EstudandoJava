package estudando.exceptions.StackTrace;

/* In�cio main
 * In�cio m1
 * In�cio m2
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
 * Ocorreu uma exce��o do tipo ArrayIndexOutOfBoundsException que foi tentando acessar
 * o indice 5 de um array que s� vai at� 4, e onde isso ocorreu? veja a linha de baixo
 * diz que foi o m�todo m2 na linha 38 e que por ele n�o tratar esse erro/exce��o com
 * um try catch a JVM lan�ou a exce��o pro metodo que chamou m2 que foi o m1 na linha 
 * 23 e que por ele tamb�m n�o tratar com try catch a JVM lan�ou a exce��o pro m�todo
 * main que foi quem chamou o m1 na linha 7 e que por ningu�m tratar ela lan�ou pra
 * fora da JVM encerrando a aplica��o.
 * 
 * Executou o m�todo main e m1 que chamou m2, ao dar a exce��o ArrayIndexOutOfBoundsException que
 * � de �ndice fora do array, a jvm verificou se m2 tratava essa exce��o com um
 * try catch e viu que n�o, ent�o voltou para quem chamou m2 que foi m1 e verificou
 * se m1 tratava essa exce��o e viu que n�o e foi pra quem chamou m1 que foi o main
 * que se n�o tratar lan�a a exce��o pra fora da aplica��o finalizando ela.
 */ 

public class Main {
	public static void main(String[] args) {
		
		System.out.println("In�cio main");
		m1();
		System.out.println("Fim main");

	}

	
	
	private static void m1() {
		System.out.println("In�cio m1");
		
		/* Perceba que sempre que cai na exce��o ele para exatamente na linha
		 * do erro e volta para o m�todo que o chamou, e se o que chamou n�o tratar
		 * com um try catch, vai pro pr�ximo da hierarquia que o chamou, at� algu�m
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
		System.out.println("In�cio m2");
		
		int[] array = new int[5];
			for(int i = 0; i < 6; i++) { 
				array[i] = i * 2;
				System.out.println(array[i]); //Vai dar ArrayIndexOutOfBoundsException aqui e n�o exibir "Fim m2"
			}
		
		
		System.out.println("Fim m2");
	}

}
