package estudando.poo.Interface4;

/* Por padr�o Interfaces podem conter atributos static final e m�todos sem assinatura
 * por�m no Java 8 foram adicionado novas features para Interfaces 
 * 
 * default
 * Interfaces podem implementar m�todos dentro delas mesmo sem obrigar que o m�todo seja
 * s� a assinatura, isso foi feito a fim de permitir o suporte � express�es lambda em 
 * interfaces j� existentes sem quebrar todo o c�digo que j� existe na API e assim n�o 
 * terem que criar uma API nova
 * 
 * static
 * Tnterfaces podem usar m�todos est�ticos, assim como nos m�todos est�ticos normais, os 
 * m�todos static de Interface s�o acessados diretamente pela Interface 
 * ex. nomeInterface.nomeMetodo();
 * 
 * private
 * Por�m o uso dessas features trouxe um problema pro java, o de como agrupar a l�gica comum
 * desses m�todos? Um problema que foi percebido na pr�tica, pois as vezes voc� tem m�todos
 * que precisam compartilhar uma l�gica comum, e  ai vc tinha que duplicar ou fazer de outra 
 * forma, a solu��o foi introduzir os m�todos privados a partir do Java 9, os m�todos privados
 * permitem que voc� agrupem essa l�gica comum e assim voc� n�o precisa replicar c�digo
 */

public class Main {

	public static void main(String[] args) {
		
		double x = 0;	
		MyCalculator mc = new MyCalculator();
		
		x = mc.calculatePow(10, 2);
		System.out.println(x);
		
		x = Calculator.calculatePow2(10, 2);
		System.out.println(x);
	}

}
