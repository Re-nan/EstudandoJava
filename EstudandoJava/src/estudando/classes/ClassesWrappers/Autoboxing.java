package estudando.classes.ClassesWrappers;

/* O Autoboxing faz as convers�es entre os tipos primitivos e seus wrappers de forma
 * autom�tica. Ele facilita muito para voc� o processo de conver��o entre tipos
 */

public class Autoboxing {
	public static void main(String[] args) {
		
		/* SEM autoboxing */
		Integer i1 = 20; //Criado Wrapper com valor 20
		int t = i1.intValue(); //Criado int que recebe 20 do Wrapper como um int
		t = t + 2; //Recebe ele mesmo somando mais 2
		i1 = new Integer(t); //Agora i1 contem o valor 22
		System.out.println(i1);
		
		/* COM autoboxing */
		Integer i2 = 20;
		i2 = i2 + 2;
		System.out.println(i2);
		
		/* Resumo, os tipos primitivos continuam sendo IMUTAVEIS, o que acontece � que o java faz
		 * esse embrulho e desembrulho internamente sem que voc� veja, para facilitar a vida do
		 * programador
		 */
		
	}

}
