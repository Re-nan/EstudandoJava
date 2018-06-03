package estudando.Polimorfismo;

/* POLIMORFISMO é a capacidade que um método tem  de agir de diferentes formas
 * dependendo do objeto sobre o qual  está sendo chamado.
 * 
 * Quando a chamada de um método, a JVM decide qual método invocar dependendo do
 * obj instanciado na memória
 * 
 * Lembre-se: A SUBCLASSE é sempre do tipo da SUPERCLASSE, então um Cachorro sempre
 * será um Animal, assim como um Gato ou Vaca sempre serão um Animal. Então essas
 * classes sempre poderão executar os mesmo métodos  
 */

/* Referência = é o que ta na esquerda  Instancia = é o que ta na direita(é o obj na memória)
 *
 * No polimofismo o tipo da variavel(que é uma referencia) que fica na esquerda
 * é quem define os métodos que eu posso enxergar vindo da instancia(new AlgumaCoisa)
 * da direita, o tipo da variável(tipo da referência) só enxerga o que ela tem em
 * comum com a instancia
 * 
 * Quem define o método que vai ser chamado é sempre quem ta no new AlgumaCoisa 
 * Ou seja SEMPRE de quem ta na memória do heap e NUNCA de quem ta na stack(referencia)
 * 
 * Do lado esquerdo sempre fica uma classe mãe sobre a classe filha na direita no new
 * 		Animal az = new Cachorro(); //Funciona pq um Cachorro na Memoria pode fazer tudo de Animal
 * 		Cachorro cz = new Animal(); //Da erro pq um Animal na memoria não pode fazer tudo de um Cachorro
 */

public class Main {

	public static void main(String[] args) {
		Cachorro c = new Cachorro(); // Criando uma refencia c para um obj na memória do tipo Cachorro
		Animal a = new Animal(); // Criando uma refencia a para um obj na memória do tipo Animal

		a.falar(); // Animal falando...
		a = (Animal) c; 
		/* Mesmo transformando a referencia c em Animal ela continua apontando na memória para um obj Cachorro, portando ela
		 * usa o que enxerga em comum com o que está na memória
		 */
		a.falar(); // AuAu porque agora 'a' aponta pra um obj na memoria do tipo Cachorro
		System.out.print("\n" + a.getClass() + "\n"); //class estudando.Polimorfismo.Cachorro

		//a.morder(); //da erro porque morder só tem na classe filha Cachorro, e 'a' é um referencia Animal que aponta pra Cachorro
		c = (Cachorro) a;
		c.morder();

		/* Enquanto seu obj for Animal você só pode enxergar o que for comum
		 * entre Animal e a classe que herdou de Animal
		 */
		System.out.println("");

		
		Animal a2 = new Cachorro();
		//a2.morder(); 
		// Da erro porque morder() é um método só da classe Cachorro, um Animal é genérico, ele não pode morder() senão todos que herdassem de Animal teriam que morder() também
		
		
		
		/* Estou perguntando a2 é uma variavel que aponta na memoria para um obj
		 * do tipo cachorro? Se sim, eu posso converter um tipo a para o tipo 
		 * cachorro, então nesse caso é seguro fazer o cast
		 */
		if (a2 instanceof Cachorro) { //assim como a2 instanceof Animal seria true pq cachorro tb É UM Animal
			Cachorro c2 = (Cachorro) a2;
			/* Fazendo cast explícito transformando a referencia(na stack) do tipo Animal para tipo Cachorro, perceba que você
			 * continua com uma referência na memória(no heap) do tipo Cachorro, uma vez criado como um Cachorro, ele será
			 * sempre um Cachorro, o que pode mudar são as formas que você vai referenciar na stack este Cachorro, ele pode ser 
			 * referenciado como Cachorro ou como Animal, ou até mesmo como Object, que na vdd é a superclasse de Animal
			 */
			c2.morder(); //Agora você consegue utilizar o método morder() da classe Cachorro
			System.out.println(a2.getClass()); //Tanto a2 como c2 são do tipo Cachorro 
		}

		System.out.println("");

		/* Qual a vantagens de eu referenciar um determinado obj por um tipo de
		 * uma superclasse dele se eu não tenho acesso aos metodos especificos?
		 * Ex. Animal a = new Cachorro(); Animal é a superclasse de Cachorro A
		 * vantagem é que eu consigo trabalhar com tipos mais genéricos o que
		 * faz que eu não tenha dependencia de tipos específicos e possa
		 * extender futuramente a minha aplicação
		 */

		Cachorro c3 = new Cachorro(); //ou Animal c3 = new Cachorro();
		Gato g3 = new Gato();     	  //ou Animal g3 = new Gato();
		falar(c3);
		falar(g3);

		
	} //fim main

	
	/* Com um método mais generécico eu posso reutilizar ele com vários objetos
	 * de tipos diferentes. Hoje é um Gato e Cachorro, amanhã podem ter outros
	 * animais, e a chamada já estará pronta. Com polimorfismo você consegue com
	 * que durante a execução os métodos que vc chama se comportem de forma
	 * diferente de acordo com o obj que está instanciado na memória. Quando você
	 * usa polimorfismo você consegue preparar sua aplicação com coisas que irão
	 * acontecer depois
	 */
	private static void falar(Animal a) {
		a.falar();
	}

}