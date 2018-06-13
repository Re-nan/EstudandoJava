package estudando.poo.Interface4;

/* Por padrão Interfaces podem conter atributos static final e métodos sem assinatura
 * porém no Java 8 foram adicionado novas features para Interfaces 
 * 
 * default
 * Interfaces podem implementar métodos dentro delas mesmo sem obrigar que o método seja
 * só a assinatura, isso foi feito a fim de permitir o suporte à expressões lambda em 
 * interfaces já existentes sem quebrar todo o código que já existe na API e assim não 
 * terem que criar uma API nova
 * 
 * static
 * Tnterfaces podem usar métodos estáticos, assim como nos métodos estáticos normais, os 
 * métodos static de Interface são acessados diretamente pela Interface 
 * ex. nomeInterface.nomeMetodo();
 * 
 * private
 * Porém o uso dessas features trouxe um problema pro java, o de como agrupar a lógica comum
 * desses métodos? Um problema que foi percebido na prática, pois as vezes você tem métodos
 * que precisam compartilhar uma lógica comum, e  ai vc tinha que duplicar ou fazer de outra 
 * forma, a solução foi introduzir os métodos privados a partir do Java 9, os métodos privados
 * permitem que você agrupem essa lógica comum e assim você não precisa replicar código
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
