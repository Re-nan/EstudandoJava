package estudando.innerclass.AnonymousInnerClass;

/* Anonymous Inner Class
 * 
 * - São classes que não possuem nome, pois são sempre subclasses de uma classe ou 
 * implementação de uma interface. Vc só vai encontrar classes anônimas se você estiver
 * fazendo a implementação de uma interface que já existe ou se vc estiver declarando a 
 * classe anônima como uma subclasse de uma classe existente
 * 
 * - Ao realizar um desses dois procedimentos, geralmente é para sobreescrever o método
 * de uma classe mãe ou implementar o método de uma interface
 * 
 * - Ao se deparar com uma classe anônima a sua leitura deve ser a de que você está criando
 * uma classeAnonima que é uma subclasse da classe do Tipo onde está sendo criando a Anonima
 * e essa classeAnonima está sobrevendo o método X da classe do Tipo, para ser usado dentro
 * da classe Principal que você está
 * 
 * - Situações de uso: Quando você precisa executar um código que só faz sentido naquele método
 * para não ter que criar outro arquivo de código, porém você não pode compartilhar este código
 * em outros locais, é comum encontrar classes anonimas
 */

public class Main {

	public static void main(String[] args) {

		int x = 10;
		
		Bebida b1 = new Cafe();
		
		// Criando uma classe "semNome" que implementa a interface Bebida
		Bebida b2 = new Bebida() {
			
			@Override
			public void preparar() {
				System.out.println("Preparando bebida não identificada");
				//x = 19; Erro porque o java interpreta o uso do x como final, dentro de uma inner class
			}
			
		}; // Fechando classe "semNome"
		
		x = 19;
		System.out.println(x);
		
		b1.preparar();
		b2.preparar();
		
	}

}
