package estudando.innerclass.AnonymousInnerClass;

/* Anonymous Inner Class
 * 
 * - S�o classes que n�o possuem nome, pois s�o sempre subclasses de uma classe ou 
 * implementa��o de uma interface. Vc s� vai encontrar classes an�nimas se voc� estiver
 * fazendo a implementa��o de uma interface que j� existe ou se vc estiver declarando a 
 * classe an�nima como uma subclasse de uma classe existente
 * 
 * - Ao realizar um desses dois procedimentos, geralmente � para sobreescrever o m�todo
 * de uma classe m�e ou implementar o m�todo de uma interface
 * 
 * - Ao se deparar com uma classe an�nima a sua leitura deve ser a de que voc� est� criando
 * uma classeAnonima que � uma subclasse da classe do Tipo onde est� sendo criando a Anonima
 * e essa classeAnonima est� sobrevendo o m�todo X da classe do Tipo, para ser usado dentro
 * da classe Principal que voc� est�
 * 
 * - Situa��es de uso: Quando voc� precisa executar um c�digo que s� faz sentido naquele m�todo
 * para n�o ter que criar outro arquivo de c�digo, por�m voc� n�o pode compartilhar este c�digo
 * em outros locais, � comum encontrar classes anonimas
 */

public class Main {

	public static void main(String[] args) {

		int x = 10;
		
		Bebida b1 = new Cafe();
		
		// Criando uma classe "semNome" que implementa a interface Bebida
		Bebida b2 = new Bebida() {
			
			@Override
			public void preparar() {
				System.out.println("Preparando bebida n�o identificada");
				//x = 19; Erro porque o java interpreta o uso do x como final, dentro de uma inner class
			}
			
		}; // Fechando classe "semNome"
		
		x = 19;
		System.out.println(x);
		
		b1.preparar();
		b2.preparar();
		
	}

}
