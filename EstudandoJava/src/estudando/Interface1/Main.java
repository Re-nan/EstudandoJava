package estudando.Interface1;

/* DICA: Veja o que todas as classes da sua regra de negócio tem em comum e
 * crie uma interface para que cada classe possa implementar ela de um jeito
 * No caso ItemRaro foi algo em comum mesmo tendo preços diferentes
 * 
 * Se eu não tivesse essa interface ItemRaro eu teria que criar um método
 * getPreco pra cada classe
 * 
 * Se você tem um metodo que trabalha com itens caros, qualquer coisa na sua 
 * aplicação que precisa exibir o valor de um item caro, inclusive coisas que
 * possam ser criadas futuramente, poderão usar aquele metodo de itemCaro
 */

public class Main {
    public static void main(String[] args){
        
        Ferrari ferrari = new Ferrari();
        Rota rota = new Rota();
        rota.ir(ferrari);
        System.out.println("");
        
        /* Se uma classe implementar uma interface, então essa classe é do tipo
         * da interface, então Ferrari É UM Automóvel
         */
        
        AnelBrilhante anel = new AnelBrilhante();
        Vendendor vendedor = new Vendendor();
        vendedor.mostrarPreco(anel);
        vendedor.mostrarPreco(ferrari);
    }
}
