package estudando.BlocoStatic;

/* Al�m do tipo static nos atributos O JAVA tem tamb�m um bloco static 
 * pode ou n�o ser declarado dentro de uma classe, uma classe pode ou n�o 
 * ter um bloco static, e se ela tiver, ela s� pode ter um. Esse bloco �
 * sempre executado pela JVM no momento em que ela � referenciada somente
 * PELA PRIMEIRA VEZ. Se voc� criar uma instancia de uma classe que tenha
 * um bloco static, este bloco ser� executado. Nas pr�ximas instancias 
 * desta classe este bloco N�O SER� EXECUTADO! o bloco static � a 1� coisa
 * antes de qualquer outra na classe a ser executada. Um bloco static pode
 * ser utilizado em 2 situa��es. A 1� � para inicializar atributos est�ticos
 * A 2� � executar um c�digo antes que a classe seja utilizada.
 * Ela sempre � executada antes de qualquer inicia��o na classe, ent�o por isso
 * ela s� pode trabalhar com coisas que forem est�ticas/static
 */

public class Pessoa {
    
    static String mensagem;
    private static String nome = "RENAN";
    
    static{
        mensagem = "Instanciando a classe pela 1� vez!";
        System.out.println(mensagem + " " + nome);
    }
}