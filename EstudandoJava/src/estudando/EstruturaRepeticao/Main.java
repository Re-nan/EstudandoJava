package estudando.EstruturaRepeticao;

public class Main {
	public static void main(String[] args) {
		
		// for convencional
		System.out.println("FOR CONVENCIONAL");
		for (int i = 0; i < 5; i++) {
			System.out.println("O valor de i é: " + (i + 1));
		}

				
		System.out.println("\nFOR CONVENCIONAL COM INCREMENTO E DECREMENTO");
		/*
		 * Não posso declarar i e j dentro da assinatura do for, porém posso
		 * declarar fora e utilizar as duas var dentro
		 */
		int i;
		int j;
		for (i = 0, j = 5; i <= 5; i++, j--) {
			System.out.println(i + " --- " + j);

		}
		
		
		System.out.println("\nFOR EACH em uma String");
		//FOREACH NO JAVA
		String nome = "RENAN";
		for(char letra : nome.toCharArray()){
			System.out.println(letra);
		}
		
		
		//WHILE
		System.out.println("\nWHILE");
		int i2 = 0;
		while(i2 < 5){
			System.out.println("i2 vale = " + i2);
			i2++;
		}
		
		
		//DO WHILE
		System.out.println("\nDO WHILE");
		int i3 = 0;
		do{
			System.out.println("i3 vale = " + i3);
			i3++;
		}while(i3 < 5);
		

	}
}