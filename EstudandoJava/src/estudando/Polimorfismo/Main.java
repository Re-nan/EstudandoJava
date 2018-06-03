package estudando.Polimorfismo;

/* POLIMORFISMO � a capacidade que um m�todo tem  de agir de diferentes formas
 * dependendo do objeto sobre o qual  est� sendo chamado.
 * 
 * Quando a chamada de um m�todo, a JVM decide qual m�todo invocar dependendo do
 * obj instanciado na mem�ria
 * 
 * Lembre-se: A SUBCLASSE � sempre do tipo da SUPERCLASSE, ent�o um Cachorro sempre
 * ser� um Animal, assim como um Gato ou Vaca sempre ser�o um Animal. Ent�o essas
 * classes sempre poder�o executar os mesmo m�todos  
 */

/* Refer�ncia = � o que ta na esquerda  Instancia = � o que ta na direita(� o obj na mem�ria)
 *
 * No polimofismo o tipo da variavel(que � uma referencia) que fica na esquerda
 * � quem define os m�todos que eu posso enxergar vindo da instancia(new AlgumaCoisa)
 * da direita, o tipo da vari�vel(tipo da refer�ncia) s� enxerga o que ela tem em
 * comum com a instancia
 * 
 * Quem define o m�todo que vai ser chamado � sempre quem ta no new AlgumaCoisa 
 * Ou seja SEMPRE de quem ta na mem�ria do heap e NUNCA de quem ta na stack(referencia)
 * 
 * Do lado esquerdo sempre fica uma classe m�e sobre a classe filha na direita no new
 * 		Animal az = new Cachorro(); //Funciona pq um Cachorro na Memoria pode fazer tudo de Animal
 * 		Cachorro cz = new Animal(); //Da erro pq um Animal na memoria n�o pode fazer tudo de um Cachorro
 */

public class Main {

	public static void main(String[] args) {
		Cachorro c = new Cachorro(); // Criando uma refencia c para um obj na mem�ria do tipo Cachorro
		Animal a = new Animal(); // Criando uma refencia a para um obj na mem�ria do tipo Animal

		a.falar(); // Animal falando...
		a = (Animal) c; 
		/* Mesmo transformando a referencia c em Animal ela continua apontando na mem�ria para um obj Cachorro, portando ela
		 * usa o que enxerga em comum com o que est� na mem�ria
		 */
		a.falar(); // AuAu porque agora 'a' aponta pra um obj na memoria do tipo Cachorro
		System.out.print("\n" + a.getClass() + "\n"); //class estudando.Polimorfismo.Cachorro

		//a.morder(); //da erro porque morder s� tem na classe filha Cachorro, e 'a' � um referencia Animal que aponta pra Cachorro
		c = (Cachorro) a;
		c.morder();

		/* Enquanto seu obj for Animal voc� s� pode enxergar o que for comum
		 * entre Animal e a classe que herdou de Animal
		 */
		System.out.println("");

		
		Animal a2 = new Cachorro();
		//a2.morder(); 
		// Da erro porque morder() � um m�todo s� da classe Cachorro, um Animal � gen�rico, ele n�o pode morder() sen�o todos que herdassem de Animal teriam que morder() tamb�m
		
		
		
		/* Estou perguntando a2 � uma variavel que aponta na memoria para um obj
		 * do tipo cachorro? Se sim, eu posso converter um tipo a para o tipo 
		 * cachorro, ent�o nesse caso � seguro fazer o cast
		 */
		if (a2 instanceof Cachorro) { //assim como a2 instanceof Animal seria true pq cachorro tb � UM Animal
			Cachorro c2 = (Cachorro) a2;
			/* Fazendo cast expl�cito transformando a referencia(na stack) do tipo Animal para tipo Cachorro, perceba que voc�
			 * continua com uma refer�ncia na mem�ria(no heap) do tipo Cachorro, uma vez criado como um Cachorro, ele ser�
			 * sempre um Cachorro, o que pode mudar s�o as formas que voc� vai referenciar na stack este Cachorro, ele pode ser 
			 * referenciado como Cachorro ou como Animal, ou at� mesmo como Object, que na vdd � a superclasse de Animal
			 */
			c2.morder(); //Agora voc� consegue utilizar o m�todo morder() da classe Cachorro
			System.out.println(a2.getClass()); //Tanto a2 como c2 s�o do tipo Cachorro 
		}

		System.out.println("");

		/* Qual a vantagens de eu referenciar um determinado obj por um tipo de
		 * uma superclasse dele se eu n�o tenho acesso aos metodos especificos?
		 * Ex. Animal a = new Cachorro(); Animal � a superclasse de Cachorro A
		 * vantagem � que eu consigo trabalhar com tipos mais gen�ricos o que
		 * faz que eu n�o tenha dependencia de tipos espec�ficos e possa
		 * extender futuramente a minha aplica��o
		 */

		Cachorro c3 = new Cachorro(); //ou Animal c3 = new Cachorro();
		Gato g3 = new Gato();     	  //ou Animal g3 = new Gato();
		falar(c3);
		falar(g3);

		
	} //fim main

	
	/* Com um m�todo mais gener�cico eu posso reutilizar ele com v�rios objetos
	 * de tipos diferentes. Hoje � um Gato e Cachorro, amanh� podem ter outros
	 * animais, e a chamada j� estar� pronta. Com polimorfismo voc� consegue com
	 * que durante a execu��o os m�todos que vc chama se comportem de forma
	 * diferente de acordo com o obj que est� instanciado na mem�ria. Quando voc�
	 * usa polimorfismo voc� consegue preparar sua aplica��o com coisas que ir�o
	 * acontecer depois
	 */
	private static void falar(Animal a) {
		a.falar();
	}

}