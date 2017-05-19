package estudando.Interface1;

/* DICA: Veja o que todas as classes da sua regra de neg�cio tem em comum e
 * crie uma interface para que cada classe possa implementar ela de um jeito
 * No caso ItemRaro foi algo em comum mesmo tendo pre�os diferentes
 * 
 * Se eu n�o tivesse essa interface ItemRaro eu teria que criar um m�todo
 * getPreco pra cada classe
 * 
 * Se voc� tem um metodo que trabalha com itens caros, qualquer coisa na sua 
 * aplica��o que precisa exibir o valor de um item caro, inclusive coisas que
 * possam ser criadas futuramente, poder�o usar aquele metodo de itemCaro
 */

public class Main {
    public static void main(String[] args){
        
        Ferrari ferrari = new Ferrari();
        Rota rota = new Rota();
        rota.ir(ferrari);
        System.out.println("");
        
        /* Se uma classe implementar uma interface, ent�o essa classe � do tipo
         * da interface, ent�o Ferrari � UM Autom�vel
         */
        
        AnelBrilhante anel = new AnelBrilhante();
        Vendendor vendedor = new Vendendor();
        vendedor.mostrarPreco(anel);
        vendedor.mostrarPreco(ferrari);
    }
}
