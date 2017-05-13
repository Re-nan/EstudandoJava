package estudando.polimorfismo1;

/**
 * Variavel = � o que ta na esquerda Refer�ncia = � o que ta na direita
 *
 * No polimofismo o tipo da variavel que fica na esquerda � quem define os
 * m�todos que eu posso enxergar vindo da refer�ncia(new AlgumaCoisa) da
 * direita, o tipo da varari�vel s� enxerga o que ela tem em comum com a
 * referencia
 * 
 * Quem define o m�todo que vai ser chamado � sempre quem ta no new AlgumaCoisa
 * Ou seja sempre quem ta na mem�ria do heap
 */
public class Main {

	public static void main(String[] args) {
		Cachorro c = new Cachorro();
		Animal a = new Animal();

		/**
		 * por mais que fa�a o cast, continua chamando o m�todo da referencia c
		 * de Cachorro.
		 */
		a.falar(); // Animal falando...
		a = (Animal) c;
		a.falar(); // AuAu

		// a.morder(); da erro porque morder � s� da classe filha Cachorro
		c = (Cachorro) a;
		c.morder();

		/**
		 * Enquanto seu obj for Animal voc� s� pode enxergar o que for comum
		 * entre Animal e a classe que herdou de Animal
		 */
		System.out.println("");

		/**
		 * Estou perguntando a2 � uma variavel que aponta na memoria para um obj
		 * do tipo cachorro? Se sim, eu posso converter um tipo a para o tipo 
		 * cachorro, ent�o nesse caso � seguro fazer o cast
		 */
		Animal a2 = new Cachorro();
		if (a2 instanceof Cachorro) {
			Cachorro c2 = (Cachorro) a2;
			c2.morder();
		}

		System.out.println("");

		/**
		 * Qual a vantagens de eu referenciar um determinado obj por um tipo de
		 * uma superclasse dele se eu n�o tenho acesso aos metodos especificos?
		 * Ex. Animal a = new Cachorro(); Animal � a superclasse de Cachorro A
		 * vantagem � que eu consigo trabalhar com tipos mais gen�ricos o que
		 * faz que eu n�o tenha dependencia de tipos espec�ficos e possa
		 * extender futuramente a minha aplica��o
		 */

		Cachorro c3 = new Cachorro();
		Gato g3 = new Gato();
		falar(c3);
		falar(g3);

	}

	/**
	 * Com um m�todo mais gener�cico eu posso reutilizar ele com v�rios objetos
	 * de tipos diferentes. Hoje � um Gato e Cachorro, amanh� podem ter outros
	 * animais, e a chamada j� estar� pronta. Com polimorfismo voc� consegue com
	 * que durante a execu��o os m�todos que vc chama se comportem de forma
	 * diferente de acordo com o obj que est� anteciados na mem�ria. Quando voc�
	 * us apolimorfismo voc� consegue preparar sua aplica��o com coisas que ir�o
	 * acontecer depois
	 */
	private static void falar(Animal a) {
		a.falar();
	}

}