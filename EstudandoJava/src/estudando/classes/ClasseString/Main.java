package estudando.classes.ClasseString;

/* STRING no java não é um tipo primitivo, e sim uma classe
 * As strings são objetos logo são construidas como qualquer
 * outro obj com new()...
 * 
 * Prepare-se para a lavagem cerebral, depois disso você verá
 * que sua vida foi uma mentira
 */

public class Main {
	public static void main(String[] args) {
		
		// Criando uma string vazia
		String s1 = new String();
		
		// Criando uma string e inicializando ela com texto
		String s2 = new String("abc");
		
		/* Criando uma string e inicializando ela com texto
		 * 
		 * A classe String é a unica classe exceção que você pode
		 * criar strings de forma direta, encurtando o comando
		 * para
		 */
		String s3 = "abc";
				
		/* MAS AFINAL, QUAL A DIFERENÇA 
		 * 
		 * DISSO
		 * String s2 = new String("abc");
		 * 
		 * PRA ISSO?
		 * String s3 = "abc";
		 * 
		 * A diferença está na MEMÓRIA stack e heap
		 * assim como os parametros de métodos
		 * VAMOS LÁ
		 */
		
		String x1 = new String("abc1");
		/* String x1 cria uma referência na memória >>STACK<<
		 * new String("abc1") cria um obj "abc1" no >>HEAP<<
		 * o operador "=" faz a atribuição entre o que está definido na stack(x1) com o que está no heap(obj "abc1")
		 * 
		 * Portando x1 é uma referência para o obj "abc" do tipo String
		 */
		
		// Se eu fizer		 
		String x2 = new String("abc2");
		//e depois
		x1 = x2;
		/* Estou dizendo que x1 recebe o mesmo endereço de memória que aponta x2
		 * 
		 * Então tanto a referencia x1 como x2 na >>STACK<< passam a apontar
		 * para o mesmo obj do tipo String abc2 na memória >>HEAP<<
		 */
		

		/* Vamos estudar o Pool de String */
		String nome1 = "RENAN";
		String nome2 = "RENAN";
		/* Ao criar uma String sem utilizar o operador new, o que acontece?
		 * Em java as strings podem ser amarmazenadas no que chamamos de "POOL DE STRINGS"
		 * é como se fosse uma banheira, piscina ou afins..
		 * 
		 * Quando sua aplicação inicia, a JVM sai buscando referencias a essas Strings no teu código
		 * para cada string unica que ela encontrar, ela mesmo quem cria o obj no HEAP e também cria
		 * um endereço a essa String no pool(dentro da piscina) 
		 * 
		 * E ai o que acontece? a sua string nome1 passa a ser uma referencia que apontra pro obj "RENAN"
		 * que agora está dentro do POOL e se a JVM encontrar String nome2 = "RENAN"? ACONTECE A
		 * MESMA COISA! só que a JVM entrega a referencia do pool pra sua variavel, então tanto nome1 como nome2
		 * vão apontar pro "RENAN" que ta dentro do pool e "RENAN" que ta dentro do pool é quem aponta pro 
		 * primeiro endereço na memória de "RENAN" no HEAP que foi criado quando a JVM encontrou a primeira
		 * string contendo "RENAN"
		 * 
		 * OU SEJA você tem 2 váriáveis/referencias diferentes com o mesmo valor mas que apontam pro mesmo e único
		 * endereço de memória
		 * 
		 * Caso o java encontre uma váriavel string com um valor que ainda não exista, ele faz a mesma coisa
		 * cadastra ela no pool e do pool aponta pra um novo endereço no HEAP e a string do pool é associada
		 * a variavel 
		 * 
		 * Portando sempre que eu NÃO UTILIZO o operador new para criar as strings, eu estou relacionando
		 * a minha variavel com strings que já estão dentro do pool usando um único endereço de memória, podendo ter
		 * 10 mil variáveis strings com o mesmo valor que ainda assime staria usando um único endereço no heap
		 */
		
		/* Você viu que você tem nome1 e nome2 compartilhando o mesmo valor, mesmo endereço, mesmo obj na memória
		 * então se eu mudar o valor de RENAN pra JOÃO isso mudaria o valor de todas as minhas váriáveis que apontavam
		 * pro mesmo valor RENAN no pool? SIM, EXATAMENTE, mas isso não acontece no JAVA porque Strings são IMUTÁVEIS,
		 * depois de criada uma string NUNCA TEM SEU VALOR ALTERADO!
		 */
		
		nome2 = "JOÃO";
		System.out.println(nome1 + " - " + nome2);
		/* Perceba que mesmo alterando o valor da referencia nome2 que apontava para mesmo endereço na memória que nome1
		 * o nome1 continua sendo RENAN e nome2 agora assume JOÃO sem afetar nome1, por que isso aconteceu? porque Strings
		 * são imutáveis, sempre que você altera uma string é como se ele criasse uma nova atribuição para string
		 */
		
		/* Pega RENAN e transforma em renan, mas isso não substitui o RENAN original, e sim apenas uma representação de
		 * RENAN em letra minúsculas
		 */
		nome1.toLowerCase();
		
		/* Agora sim você está transformando nome1 em letra minúsculas e atribuindo este novo valor a nome1 subtituindo o
		 * valor RENAN que estava lá, na verdade o que a JVM fez foi criar um novo endereço na memória contendo renan e fez
		 * a referencia nome1 apontar para o novo endereço(novo valor) que agora contém um obj String renan
		 */
		nome1 = nome1.toLowerCase();
		
		/* Para comparar valor de atributos strings devo usar o equal()*/
		System.out.println(nome1.equals("renan")); //true
		
		/* == compara se a referencia nome1 apontar pro mesmo endereço na memória que "renan" independente deles conterem
		 * o mesmo valor ou não
		 */
		System.out.println(nome1 == "renan"); //false
		
		/* Agora a referencia nome2 que aponta para "JOÃO" vai passar a apontar também para "renan" */
		nome2 = nome1;
		System.out.println(nome1 == nome2); //true
		
		
		/* Outro caso mostrando o pool de strings */
		String p1 = new String("Roger");
		String p2 = "Roger";
		String p3 = "Roger";
		
		System.out.println("p1 == p2: " + (p1 == p2)); 
		/* False pois cada uma aponta pra um enderço de memória diferente, independente do conteúdo */
		System.out.println("p2 == p3: " + (p2 == p3)); 
		/* True pois por utilizazem o mesmo valor do pool de strings,logo apontam pro mesmo obj em memória */

	}

}
