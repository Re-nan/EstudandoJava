package estudando.innerclass.MethodLocalInnerClass;

/* Method-local Inner Class
 * 
 * - É declarada dentro de um método, apenas o método enxerga a inner class, só pode
 * ser acessada dentro do método onde foi criada.
 * - A inner class pode acessar var locais que foram declaradas dentro do método em que
 * ela foi criada, desde que, essa var seja final(não pode ser alterada) se vc omitir a
 * a palavra final na criação da var, o código vai compilar normal mas se vc tentar alterar
 * o valor o compilador vai reclamar, resumindo: vc não pode mexer no valor de uma var
 * que você usa dentro de uma inner class
 * - Dificilmente é usado na prática.
 */

public class Main {

	public static void main(String[] args) {
		
		// var local
		String t2 = "Variável do método";
		
		// A inner class foi definida dentro do método main
		class Texto {
			private String t;
			
			public Texto(String t) {
				this.t = t;
			}
			
			public void imprimir() {
				System.out.println(t);
			}
			
			public void imprimir2() {
				//t2 = "novo valor"; Erro porque t2 é interpretada como final, ñ pode alterar valor
				System.out.println(t2);
			}
		}
		
		Texto txt = new Texto("meu texto");
		txt.imprimir();
		txt.imprimir2();
	}
}
