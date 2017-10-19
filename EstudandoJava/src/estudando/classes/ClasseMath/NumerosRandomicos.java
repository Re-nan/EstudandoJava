package estudando.classes.ClasseMath;

import java.util.Random;

public class NumerosRandomicos {
	public static void main(String[] args) {
		
		/* Gerar 5 números aleatório entre 0 e 99 */
		Random r1 = new Random(); //Cemente gerada de forma aleatória, obtém número aleatórios
		
		for(int i = 0; i < 5; i++){
			
			int n = r1.nextInt(5); //passo 100 pois o ultimo número nunca é sorteado
			
			System.out.println((i+1) + " => " + n); 
		}
		
		System.out.println();
		
		/* Gerar 5 números aleatório entre 0 e 99 */
		Random r2 = new Random(5431); //Cemente gerada de forma definida, obtém sempre os mesmo número aleatórios
		
		for(int i = 0; i < 5; i++){
			
			int n = r2.nextInt(100); //passo 100 pois o ultimo número nunca é sorteado
			
			System.out.println((i+1) + " => " + n);
		}
		
		System.out.println();
		
		/* Gerar 5 números aleatório entre 1 e 50
		 * O java não tem esse método de forma nativa, você precisa criar este método 
		 */
		for(int i = 0; i < 5; i++){
			System.out.println(i+1 + " => " + gerarInt(1, 3)); //Continio com o numero final nunca sendo sorteado
		}
			

	}
	
	
	/* 1. Calcula o intervalo entre o número maior menos o menor
	 * 2. Com o intervalo vc tem a qtd de quantos números estão nessa faixa entre inicio e fim
	 * 3. Com o Math.random gero números double entre 0 e 0.999... então eu multiplico esse número pelo intervalo
	 * isso gera um número pra mim com uma parte inteira e outra decimal, ex 0.5679
	 * 
	 * 4. Para descartar a parte decimal eu faço o cast pondo (int) antes do número ficando só o 0
	 * esse número gerado é como base no inicio 0
	 * 
	 * 5. Mas eu não quero utilizar o inicio 0, eu quero deslocar a minha base para o mínimo
	 * então eu somo esse resultado com o valor inicial
	 * Com isso vc vai ter a geração com os elementos que você deseja dentro da faixa desejada
	 * 
	 */
	static int gerarInt(int inicio, int fim){
		int intervalo = fim - inicio;
		int n = (int)(Math.random() * intervalo) + inicio;
		return n;
	}
	

}
