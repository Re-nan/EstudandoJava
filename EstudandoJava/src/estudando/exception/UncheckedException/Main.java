package estudando.exception.UncheckedException;

/* UncheckExceptions herdam em algum momento da sua hierarquia de
 * RuntimeException, e por tabela tamb�m herdam de Exception que �
 * a classe m�e das Exce��es
 */

/* UncheckExceptions n�o s�o exce��es do tipo que voc� trata com try catch, 
 * mas sim aquelas que voc� corrige no c�digo
 */

public class Main {
    public static void main(String[] args){
        
        Object o1 = new Object();
        Object o2 = new Object();
        
        /* metodo que compara se a referencia de o1 � a mesma que de o2
         * Daria erro Exception in thread "main" java.lang.NullPointerException
         * caso passasse null no lugar de um dos parametros, mas como o metodo
         * TRATA a entrade de obj null
         */
        System.out.println("Tratando no m�todo");
        boolean iguais = Comparador.comparar(o1, o2);
        System.out.println(iguais);
        
        
        System.out.println();
        /* acima foi tratado no m�todo
         * OU poderia usar o try catch convencional
         */
        
        
        System.out.println("Tratando no try catch");
        try {
        	boolean iguais2 = Comparador.comparar2(null, o2);
            System.out.println(iguais2);
		} catch (Exception e) {
			System.out.println("O objeto � nulo ");
		}
        
        
    }
}