package estudando.Constantes;

/* Usando atribudos staticos no JAVA voc� pode criar constantes. Uma constante 
 * normalmente � P�BLICA para que ela possa ser acessada fora da classe, ela �
 * FINAL pra evitar que o valor seja alterado, e por ser um elemento st�tico
 * voc� chama ela direto na classe
 * 
 * Voc� � obrigado inicializar ela com um valor, esse valor pode ser definido
 * na hora de cria��o, ou deixar que um bloco static o atribua
 * 
 * static{
 *  MEDIA_DA_PROVA = 7.0;
 * }
 */

public class Main {
    public static void main(String[] args){
        
        //Constantes.MEDIA_DA_PROVA = 8.0; Erro, vc n�o pode atribuir um valor p uma constante
        System.out.println("M�dia da prova: " + Constantes.MEDIA_FINAL);
    }
    
}