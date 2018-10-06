package estudando.innerclass.MethodLocalInnerClass;

/* Method-local Inner Class
 * 
 * - � declarada dentro de um m�todo, apenas o m�todo enxerga a inner class, s� pode
 * ser acessada dentro do m�todo onde foi criada.
 * - A inner class pode acessar var locais que foram declaradas dentro do m�todo em que
 * ela foi criada, desde que, essa var seja final(n�o pode ser alterada) se vc omitir a
 * a palavra final na cria��o da var, o c�digo vai compilar normal mas se vc tentar alterar
 * o valor o compilador vai reclamar, resumindo: vc n�o pode mexer no valor de uma var
 * que voc� usa dentro de uma inner class
 * - Dificilmente � usado na pr�tica
 */

public class Main {

	public static void main(String[] args) {
		
		// var local
		String t2 = "Vari�vel do m�todo";
		
		// A inner class foi definida dentro do m�todo main
		class Texto {
			private String t;
			
			public Texto(String t) {
				this.t = t;
			}
			
			public void imprimir() {
				System.out.println(t);
			}
			
			public void imprimir2() {
				//t2 = "novo valor"; Erro porque t2 � interpretada como final, � pode alterar valor
				System.out.println(t2);
			}
		}
		
		Texto txt = new Texto("meu texto");
		txt.imprimir();
		txt.imprimir2();
	}
}
