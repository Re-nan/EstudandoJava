package estudando.BlocoStatic;

/**
* Além do tipo static nos atributos O JAVA tem também um bloco static 
* pode ou não ser declarado dentro de uma classe, uma classe pode ou não 
* ter um bloco static, e se ela tiver, ela só pode ter um. Esse bloco é
* sempre executado pela JVM no momento em que ela é referenciada somente
* PELA PRIMEIRA VEZ. Se você criar uma instancia de uma classe que tenha
* um bloco static, este bloco será executado. Nas próximas instancias 
* desta classe este bloco NÃO SERÁ EXECUTADO! o bloco static é a 1º coisa
* antes de qualquer outra na classe a ser executada. Um bloco static pode
* ser utilizado em 2 situações. A 1º é para inicializar atributos estáticos
* A 2º é executar um código antes que a classe seja utilizada.
* Ela sempre é executada antes de qualquer iniciação na classe, então por isso
* ela só pode trabalhar com coisas que forem estáticas/static
*/
public class Pessoa {
    
    static String mensagem;
    private static String nome = "RENAN";
    
    static{
        mensagem = "Instanciando a classe pela 1º vez!";
        System.out.println(mensagem + " " + nome);
    }
}