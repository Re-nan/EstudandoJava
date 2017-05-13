package estudando.polimorfismo1;

/**
 * Variavel = é o que ta na esquerda Referência = é o que ta na direita
 *
 * No polimofismo o tipo da variavel que fica na esquerda é quem define os
 * métodos que eu posso enxergar vindo da referência(new AlgumaCoisa) da
 * direita, o tipo da varariável só enxerga o que ela tem em comum com a
 * referencia
 * 
 * Quem define o método que vai ser chamado é sempre quem ta no new AlgumaCoisa
 * Ou seja sempre quem ta na memória do heap
 */
public class Main {

	public static void main(String[] args) {
		Cachorro c = new Cachorro();
		Animal a = new Animal();

		/**
		 * por mais que faça o cast, continua chamando o método da referencia c
		 * de Cachorro.
		 */
		a.falar(); // Animal falando...
		a = (Animal) c;
		a.falar(); // AuAu

		// a.morder(); da erro porque morder é só da classe filha Cachorro
		c = (Cachorro) a;
		c.morder();

		/**
		 * Enquanto seu obj for Animal você só pode enxergar o que for comum
		 * entre Animal e a classe que herdou de Animal
		 */
		System.out.println("");

		/**
		 * Estou perguntando a2 é uma variavel que aponta na memoria para um obj
		 * do tipo cachorro? Se sim, eu posso converter um tipo a para o tipo 
		 * cachorro, então nesse caso é seguro fazer o cast
		 */
		Animal a2 = new Cachorro();
		if (a2 instanceof Cachorro) {
			Cachorro c2 = (Cachorro) a2;
			c2.morder();
		}

		System.out.println("");

		/**
		 * Qual a vantagens de eu referenciar um determinado obj por um tipo de
		 * uma superclasse dele se eu não tenho acesso aos metodos especificos?
		 * Ex. Animal a = new Cachorro(); Animal é a superclasse de Cachorro A
		 * vantagem é que eu consigo trabalhar com tipos mais genéricos o que
		 * faz que eu não tenha dependencia de tipos específicos e possa
		 * extender futuramente a minha aplicação
		 */

		Cachorro c3 = new Cachorro();
		Gato g3 = new Gato();
		falar(c3);
		falar(g3);

	}

	/**
	 * Com um método mais generécico eu posso reutilizar ele com vários objetos
	 * de tipos diferentes. Hoje é um Gato e Cachorro, amanhã podem ter outros
	 * animais, e a chamada já estará pronta. Com polimorfismo você consegue com
	 * que durante a execução os mátodos que vc chama se comportem de forma
	 * diferente de acordo com o obj que está anteciados na memória. Quando você
	 * us apolimorfismo você consegue preparar sua aplicação com coisas que irão
	 * acontecer depois
	 */
	private static void falar(Animal a) {
		a.falar();
	}

}