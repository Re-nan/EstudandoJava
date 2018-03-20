package estudando.Sobrecarga;

public class Main {

	public static void main(String[] args) {

		Sobrecarga p1 = new Sobrecarga();
		int resultado = p1.somar(10, 20);
		System.out.println(resultado);
		
		System.out.println();
		
		double resultado2 = p1.somar(2, 3.0); //o java converte o 2 do tipo int pra 2 do tipo double
		System.out.println(resultado2);
		
		
		//Tanto faz se eu passar o nome ou a idade primeiro
		String nomeIdade = p1.exibirNomeIdade("Fulano", 12);
		System.out.println(nomeIdade);

	}

}
