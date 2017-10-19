package estudando.classes.ClasseMath;

import java.util.Random;

public class NumerosRandomicos {
	public static void main(String[] args) {
		
		/* Gerar 5 n�meros aleat�rio entre 0 e 99 */
		Random r1 = new Random(); //Cemente gerada de forma aleat�ria, obt�m n�mero aleat�rios
		
		for(int i = 0; i < 5; i++){
			
			int n = r1.nextInt(5); //passo 100 pois o ultimo n�mero nunca � sorteado
			
			System.out.println((i+1) + " => " + n); 
		}
		
		System.out.println();
		
		/* Gerar 5 n�meros aleat�rio entre 0 e 99 */
		Random r2 = new Random(5431); //Cemente gerada de forma definida, obt�m sempre os mesmo n�mero aleat�rios
		
		for(int i = 0; i < 5; i++){
			
			int n = r2.nextInt(100); //passo 100 pois o ultimo n�mero nunca � sorteado
			
			System.out.println((i+1) + " => " + n);
		}
		
		System.out.println();
		
		/* Gerar 5 n�meros aleat�rio entre 1 e 50
		 * O java n�o tem esse m�todo de forma nativa, voc� precisa criar este m�todo 
		 */
		for(int i = 0; i < 5; i++){
			System.out.println(i+1 + " => " + gerarInt(1, 3)); //Continio com o numero final nunca sendo sorteado
		}
			

	}
	
	
	/* 1. Calcula o intervalo entre o n�mero maior menos o menor
	 * 2. Com o intervalo vc tem a qtd de quantos n�meros est�o nessa faixa entre inicio e fim
	 * 3. Com o Math.random gero n�meros double entre 0 e 0.999... ent�o eu multiplico esse n�mero pelo intervalo
	 * isso gera um n�mero pra mim com uma parte inteira e outra decimal, ex 0.5679
	 * 
	 * 4. Para descartar a parte decimal eu fa�o o cast pondo (int) antes do n�mero ficando s� o 0
	 * esse n�mero gerado � como base no inicio 0
	 * 
	 * 5. Mas eu n�o quero utilizar o inicio 0, eu quero deslocar a minha base para o m�nimo
	 * ent�o eu somo esse resultado com o valor inicial
	 * Com isso vc vai ter a gera��o com os elementos que voc� deseja dentro da faixa desejada
	 * 
	 */
	static int gerarInt(int inicio, int fim){
		int intervalo = fim - inicio;
		int n = (int)(Math.random() * intervalo) + inicio;
		return n;
	}
	

}
