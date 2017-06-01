package estudando.classe.String;

/* STRING no java n�o � um tipo primitivo, e sim uma classe
 * As strings s�o objetos logo s�o construidas como qualquer
 * outro obj com new()...
 * 
 * Prepare-se para a lavagem cerebral, depois disso voc� ver�
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
		 * A classe String � a unica classe exce��o que voc� pode
		 * criar strings de forma direta, encurtando o comando
		 * para
		 */
		String s3 = "abc";
		
		/* MAS AFINAL, QUAL A DIFEREN�A 
		 * 
		 * DISSO
		 * String s2 = new String("abc");
		 * 
		 * PRA ISSO?
		 * String s3 = "abc";
		 * 
		 * A diferen�a est� na MEM�RIA stack e heap
		 * assim como os parametros de m�todos
		 * VAMOS L�
		 */
		
		String x1 = new String("abc1");
		/* String x1 � cria uma refer�ncia na mem�ria >>STACK<<
		 * new String("abc1") cria um obj "abc1" no >>HEAP<<
		 * o operador "=" faz a atribui��o entre o que est� definido na stack(x1) com o que est� no heap(obj "abc1")
		 * 
		 * Portando x1 � uma refer�ncia para o obj "abc" do tipo String
		 */
		
		// Se eu fizer		 
		String x2 = new String("abc2");
		//e depois
		x1 = x2;
		/* Estou dizendo que x1 recebe o mesmo endere�o de mem�ria que aponta x2
		 * 
		 * Ent�o tanto a referencia x1 como x2 na >>STACK<< passam a apontar
		 * para o mesmo obj do tipo String abc2 na mem�ria >>HEAP<<
		 */
		
		String nome1 = "RENAN";
		String nome2 = "RENAN";
		/* Ao criar uma String sem utilizar o operador new, o que acontece?
		 * Em java as strings podem ser amarmazenadas no que chamamos de "POOL DE STRINGS"
		 * � como se fosse uma banheira, piscina ou afins..
		 * 
		 * Quando sua aplica��o inicia, a JVM sai buscando referencias a essas Strings no teu c�digo
		 * para cada string unica que ela encontrar, ela mesmo quem cria o obj no HEAP e tamb�m cria
		 * um endere�o a essa String no pool(dentro da piscina) 
		 * 
		 * E ai o que acontece? a sua string nome1 passa a ser uma referencia que apontra pro obj "RENAN"
		 * que agora est� dentro do POOL e se a JVM encontrar String nome2 = "RENAN"? ACONTECE A
		 * MESMA COISA! s� que a JVM entrega a referencia do pool pra sua variavel, ent�o tanto nome1 como nome2
		 * v�o apontar pro "RENAN" que ta dentro do pool e "RENAN" que ta dentro do pool � quem aponta pro 
		 * primeiro endere�o na mem�ria de "RENAN" no HEAP que foi criado quando a JVM encontrou a primeira
		 * string contendo "RENAN"
		 * 
		 * OU SEJA voc� tem 2 v�ri�veis/referencias diferentes com o mesmo valor mas que apontam pro mesmo e �nico
		 * endere�o de mem�ria
		 * 
		 * Caso o java encontre uma v�riavel string com um valor que ainda n�o exista, ele faz a mesma coisa
		 * cadastra ela no pool e do pool aponta pra um novo endere�o no HEAP e a string do pool � associada
		 * a variavel 
		 * 
		 * Portando sempre que eu N�O UTILIZO o operador new para criar as strings, eu estou relacionando
		 * a minha variavel com strings que j� est�o dentro do pool
		 */
		
		/* Voc� viu que voc� tem nome1 e nome2 compartilhando o mesmo valor, mesmo endere�o, mesmo obj na mem�ria
		 * ent�o se eu mudar o valor de RENAN pra JO�O isso mudaria o valor de todas as minhas v�ri�veis que apontavam
		 * pro mesmo valor RENAN no pool? SIM, EXATAMENTE, mas isso n�o acontece no JAVA porque Strings s�o IMUT�VEIS,
		 * depois de criada uma string NUNCA TEM SEU VALOR ALTERADO!
		 */
		
		nome2 = "JO�O";
		System.out.println(nome1 + " - " + nome2);
		/* Perceba que mesmo alterando o valor da referencia nome2 que apontava para mesmo endere�o na mem�ria que nome1
		 * o nome1 continua sendo RENAN e nome2 agora assume JO�O sem afetar nome1, por que isso aconteceu? porque Strings
		 * s�o imut�veis, sempre que voc� altera uma string � como se ele criasse uma nova atribui��o para string
		 */
		
		/* Pega RENAN e transforma em renan, mas isso n�o substitui o RENAN original, e sim apenas uma representa��o de
		 * RENAN em letra min�sculas
		 */
		nome1.toLowerCase();
		
		/* Agora sim voc� est� transformando nome1 em letra min�sculas e atribuindo este novo valor a nome1 subtituindo o
		 * valor RENAN que estava l�, na verdade o que a JVM fez foi criar um novo endere�o na mem�ria contendo renan e fez
		 * a referencia nome1 apontar para o novo endere�o(novo valor) que agora cont�m um obj String renan
		 */
		nome1 = nome1.toLowerCase();
		
		/* Para coparar valor de atributos strings devo usar o equal()*/
		System.out.println(nome1.equals("renan")); //true
		
		/* == compara se a referencia nome1 apontar pro mesmo endere�o na mem�ria que "renan" independente deles conterem
		 * o mesmo valor ou n�o
		 */
		System.out.println(nome1 == "renan"); //false
		
		/* Agora a referencia nome2 que aponta para "JO�O" vai passar a apontar tamb�m para "renan" */
		nome2 = nome1;
		System.out.println(nome1 == nome2); //true
		
		
		
		

	}

}
