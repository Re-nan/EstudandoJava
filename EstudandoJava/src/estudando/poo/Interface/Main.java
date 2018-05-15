package estudando.poo.Interface;

/* INTERFACE define os métodos mas os implementa dentro dela, não é de
 * responsabilidade dela(com exceções de métodos q usam default e static
 * dentro dela)
 * A diferença entre um e outro está na chamada, que um pode ser usado como
 * instancia da classe que implementa a interface  e o outro como statico
 * mesmo "Interface.metodo()"
 * Todos os método em uma interface por padrão são público,mesmo q vc ñ defina
 * 
 * Interfaces possibilitam mudanças de implementação mais facilmente, pois
 * quem chama o método não conhece sua implementação
 * 
 * Interfaces não possuem atributos, só constantes
 * Interfaces podem extender outras interfaces
 * 
 * Diferença Classe Abstract X Interface
 * a diferença é que classe abstrata pode conter atributos sem serem staticos
 * final, e na interface tem que serem staticos e final
 */

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
        
    	/* Se uma classe implementar uma interface, então essa classe é do 
    	 * tipo da interface, então Ferrari É UM Automóvel
    	 * 
    	 * Automovel é pai de carro que é pai de Ferrari
         * Perceba que o metodo ir pede um Automovel, mas vc ta passando 
         * uma Ferrari, os metodos executados são da Ferrari
         */
        Ferrari ferrari = new Ferrari();
        Rota rota = new Rota();
        rota.ir(ferrari);
        System.out.println("");
        
        
        
        AnelBrilhante anel = new AnelBrilhante();
        Vendedor vendedor = new Vendedor();
        vendedor.mostrarPreco(anel);
        vendedor.mostrarPreco(ferrari);
    }
}
