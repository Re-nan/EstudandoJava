package estudando.Constantes;

/* Usando atribudos staticos no JAVA você pode criar constantes. Uma constante 
 * normalmente é PÚBLICA para que ela possa ser acessada fora da classe, ela é
 * FINAL pra evitar que o valor seja alterado, e por ser um elemento stático
 * você chama ela direto na classe
 * 
 * Você é obrigado inicializar ela com um valor, esse valor pode ser definido
 * na hora de criação, ou deixar que um bloco static o atribua
 * 
 * static{
 *  MEDIA_DA_PROVA = 7.0;
 * }
 */

public class Main {
    public static void main(String[] args){
        
        //Constantes.MEDIA_DA_PROVA = 8.0; Erro, vc não pode atribuir um valor p uma constante
        System.out.println("Média da prova: " + Constantes.MEDIA_FINAL);
    }
    
}