package estudando.colecoes.Arrays;

/* Arrays são utilizados para agrupar dados do mesmo tipo, todos os elementos
 * que vão dentro de um Array DEVEM serem do MESMO tipo
 * 
 * Não posso criar arrays com valores negativos
 * int[] array = new int[-5]
 * 
 * Arrays podem conter tamanho Zero, mas ele seria inútil, não?
 * int[] array = new int[0]
 * 
 * 
 * Suas DESVANTAGENS, depois de criado não é possível modificar o tamanho do
 * array, ou seja se você crar um de tamanho 5, ele só poderá conter 5 valores
 * e nada mais
 * 
 * é difícil encontrar elementos dentro de um array quando o indice não é conhecido
 * neste caso tem que sempre varrer o array até encontrar o indice esperado, isso
 * exige performance dependendo do tamanho do array
 * 
 * Ao remover elementos do array, sobram buracos no array, afinal ele não não pode
 * ser redimensionado
 * 
 */
public class Main {
	public static void main(String[] args) {
		
		/* Existem várias formas de se criar um Array */
		
		/* Criando um array com as [] no tipo */
		int[] a1;
		a1 = new int[5];
		
		/* Também pode ser criado assim com as [] no nome da var */
		int a2[];
		a2 = new int[5];
		
		/* Também pode ser criado tudo na mesma linha */
		int[] a3 = new int[5];
		
		/* Também pode ser criado já com valores já definindo seu tamanho */
		int[] a4 = {1, 2, 3, 4, 5};
		
		/* Também pode ser criado de uma forma bem chata */
		int[] a5 = new int[] {1, 2, 3, 4, 5};
		
		/* Lembrando que você está criando uma referencia(um ponteiro) a1
		 * na memória stack que aponta pra um obj que ocupa um espaço na
		 * memória heap, esse obj tem espaço para 5 valores com index de 
		 * 0 a 4, se não for especificado os valores durante a sua criação
		 * o array é criado no heap com valores padrões dependendo do tipo
		 * que ele foi criado, se for String cria o array no heap com todos
		 * os espaços com valores null(afinal String é um tipo referencia, 
		 * e não primitivo) se for int ou double, cria o array no heap com
		 * todos os espaços com valores 0
		 */
		
		/* Criando um for clássico */
		for (int i = 0; i < a1.length; i++) {
			System.out.println("for " + a1[i]);
		}
		
		/* Criando um foreach(conhecido também como enhanced-for) que lê se:
		 * para cada elemento int em a1 faça tal coisa...
		 */
		for(int elemento : a2){
			System.out.println("foreach " + elemento); //exibe tudo 0, afinal está vazio
		}
		
		
		
		
		/* Além de tipos primitivos como int, double, char e etc... arrays podem
		 * guardar também tipos Referencia como String, ou alguma classe especifica
		 * que você criar ex. Pessoa, Animal, e etc...
		 * Cadeira[] cadeiras = new Cadeira[5]
		 */
		
		
		System.out.println();
		 
		/* Posso ter um array de Objects que aceita diversas referencias, afinal
		 * todas herdam de Object
		 * 
		 * para atribuir cada tipo em uma variavel você tem que fazer cast explicito
		 * int n = a6[1];
		 */
		Object[] a6 = new Object[5];
		a6[0] = "RENAN";
		a6[1] = new Integer(19);
		a6[2] = 'R';
		a6[3] = 10; //Oq acontece aqui é que o java ta empacotando um tipo primitivo pra um tipo referencia
		a6[4] = new int[3]; //Um indice recebendo um array de 3 indices
		
		
		
		
		
		
		
	}

}
