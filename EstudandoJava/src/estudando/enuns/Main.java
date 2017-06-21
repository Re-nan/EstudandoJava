package estudando.enuns;

/* Enums conhecido tamb�m como "enumeradores" 
 * 
 * Os enuns s�o tipos de dados assim como classes e os tipos primitivos, a diferen�a � que os enums
 * permitem restringirem variaveis a valores previamente determinados, portando as vari�veis que s�o
 * do tipo de enums s� podem assumir "aqueles valores X" que foram definidos em sua cria��o.
 * 
 * Enuns ajudam a reduzir bugs no c�digo pois voc� pode atribuir � uma variavel do tipo enum aquele
 * valor determinado, s�o parecidos com v�ri�veis constantes, mas possuem estruturas e implementa��es
 * bem diferentes
 * 
 */

public class Main {
	public static void main(String[] args){
		
		/* Usando enum Volume no codigo
		 * Perceba que eu atribui a constante Alto do enum Volume, para uma variavel do tipo Volume
		 */
		Volume v1 = Volume.ALTO;
		
		
		/* Este c�digo n�o compila, porque 100 n�o � uma constante que faz parte do enum Volume
		 * portando este c�digo n�o compila
		 */
		//Volume v2 = 100;
		
		/* enuns podem serem usados com operadores de compara��o == 
		 */
		if(v1 == Volume.ALTO){
			System.out.println("O volume est�: " + Volume.ALTO + " ==");
		}
		
		/* enuns podem serem usados com operadores de compara��o equals() 
		 */
		if(v1.equals(Volume.ALTO)){
			System.out.println("O volume est�: " + Volume.ALTO + " equals()");
		}
		
		System.out.println();
			
		/* Todos os enuns possuem um m�todo chamado values que retorna um array com a
		 * lista de constantes daquele enum, neste caso retornaria um array v cujo os
		 * valores seriam ALTO, MEDIO e BAIXO
		 */
		Volume v[] = Volume.values();
		for(int i = 0; i < v.length; i++){
			System.out.println(v[i]);
		}
		
		
		
		
		/* enum Prioridade 
		 * Um enum vai muito al�m do que algumas constantes, um enum pode conter PRIORIDADE
		 * cujo os valores podem assumi ALTA, MEDIA ou BAIXA
		 */
		int p = Prioridade.ALTA.getValor();
		System.out.println("\n" + p); //retorna o valor 10 associado a constante ALTO no enum do tipo Prioridade
					
	}

	//Cria��o dos ENUMS
		
			/* Exemplo de vari�veis CONSTANTES */
			public static final int VOLUME_ALTO = 0;
			public static final int VOLUME_MEDIO = 1;
			public static final int VOLUME_BAIXO = 2;
		

	/* Exemplo de Enum
	 * Estou criando um enum do tipo Volume e dizendo que ele pode assumir ALTO, MEDIO ou BAIXO
	 * perceba que eu n�o precisei usar o auxiliar do tipo "int" para o enum, ele j� � um tipo de
	 * dado no caso, tipo Volume.
	 */
	enum Volume{
		ALTO,
		MEDIO,
		BAIXO
	}
	
	
	/* Usando enum Prioridade no codigo
	 * 
	 * Criando enum com prioridade, � parecido como se fosse uma classe
	 * 
	 * Quando voc� associa as constantes com valores entre parentes, � preciso criar um construtor
	 * com parametro que receba um int
	 * 
	 * O construtor dentro de um enum sempre deve ser privado, se voc� n�o indicar que ele � private
	 * durante a constru��o, ele assume private implicitamente
	 * 
	 * Posso criar v�ri�veis e m�todos dentro de um enum
	 */
	enum Prioridade{
		ALTA(10),
		MEDIA(5),
		BAIXA(1);
		
		private int valor; //vai armazenar o valor da prioridade dentro do enum
		
		private Prioridade(int valor) { //o construtor � chamado no momento em que as contantes s�o definidas no caso a ALTA, MEDIA e BAIXA
			this.valor = valor;
		}
		
		public int getValor(){
			return valor;
		}
		
	}


	
}
