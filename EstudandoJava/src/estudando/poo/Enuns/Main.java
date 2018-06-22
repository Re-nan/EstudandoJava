package estudando.poo.Enuns;

/* Enums conhecido também como "enumeradores" 
 * 
 * Os enuns são tipos de dados assim como os tipos classes e os tipos primitivos, a diferença é que os 
 * enums permitem restringirem variaveis a valores previamente determinados, portando as variáveis que 
 * são do tipo de enums só podem assumir "aqueles valores X" que foram definidos em sua criação.
 * 
 * Enuns ajudam a reduzir bugs no código pois você pode atribuir á uma variavel do tipo enum somente 
 * aquele valor determinado, são parecidos com váriáveis constantes, mas possuem estruturas e 
 * implementações bem diferentes
 * 
 * Você usa enum em situação onde você tem alguns valores pré definidos e você quer garantir que em tempo
 * de compilação(execução do projeto) váriaveis daquele tipo de enum, vão aceitar apenas valores declaros
 * dentro do enum
 * 
 */

public class Main {
	public static void main(String[] args){
		
		/* Usando enum Volume no codigo
		 * Perceba que eu atribui a constante Alto do enum Volume, para uma variavel do tipo Volume
		 */
		Volume v1 = Volume.ALTO;
		
		
		/* Este código não compila, porque 100 não é uma constante que faz parte do enum Volume
		 * portando este código não compila
		 */
		//Volume v2 = 100;
		
		/* enuns podem serem usados com operadores de comparação == 
		 */
		if(v1 == Volume.ALTO){
			System.out.println("O volume está: " + Volume.ALTO + " ==");
		}
		
		/* enuns podem serem usados com operadores de comparação equals() 
		 */
		if(v1.equals(Volume.ALTO)){
			System.out.println("O volume está: " + Volume.ALTO + " equals()");
		}
		
		System.out.println();
			
		/* Todos os enuns possuem um método chamado values que retorna um array com a
		 * lista de constantes daquele enum, neste caso retornaria um array v cujo os
		 * valores seriam ALTO, MEDIO e BAIXO
		 */
		Volume v[] = Volume.values();
		for(int i = 0; i < v.length; i++){
			System.out.println(v[i]);
		}
		
		
		
		
		/* enum Prioridade 
		 * Um enum vai muito além do que algumas constantes, um enum pode conter PRIORIDADE
		 * cujo os valores podem assumir ALTA, MEDIA ou BAIXA
		 */
		int p = Prioridade.ALTA.getValor();
		System.out.println("\n" + p); //retorna o valor 10 associado a constante ALTO no enum do tipo Prioridade
					
	}

	
	
	

	/* Exemplo de variáveis CONSTANTES */
	public static final int VOLUME_ALTO = 0;
	public static final int VOLUME_MEDIO = 1;
	public static final int VOLUME_BAIXO = 2;
		
	
	
	
	//Criação dos ENUMS
	
	/* Exemplo de Enum
	 * Estou criando um enum do tipo Volume e dizendo que ele pode assumir valores ALTO, MEDIO ou BAIXO
	 * perceba que eu não precisei usar o auxiliar do tipo "int" para o enum, ele já é um tipo de
	 * dado no caso, tipo Volume, e uma var do tipo Volume só pode receber valores ALTO, MEDIO ou BAIXO
	 */
	enum Volume{
		ALTO,
		MEDIO,
		BAIXO
	}
	
	
	
	
	
	
	/* Usando enum Prioridade no codigo
	 * 
	 * Criando enum com prioridade, é parecido como se fosse uma classe
	 * 
	 * Quando você associa as constantes com valores entre parentes, é preciso criar um construtor
	 * com parametro que receba um int
	 * 
	 * O construtor dentro de um enum sempre deve ser privado, se você não indicar que ele é private
	 * durante a construção, ele assume private implicitamente
	 * 
	 * Posso criar váriáveis e métodos dentro de um enum
	 */
	enum Prioridade{
		ALTA(10),
		MEDIA(5),
		BAIXA(1);
		
		private int valor; //vai armazenar o valor da prioridade dentro do enum
		
		private Prioridade(int valor) { //o construtor é chamado no momento em que as contantes são definidas no caso a ALTA, MEDIA e BAIXA
			this.valor = valor;
		}
		
		public int getValor(){
			return valor;
		}
		
	}


	
	
	
	
}
