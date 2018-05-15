package estudando.poo.Interface;

/* INTERFACE define os m�todos mas os implementa dentro dela, n�o � de
 * responsabilidade dela(com exce��es de m�todos q usam default e static
 * dentro dela)
 * A diferen�a entre um e outro est� na chamada, que um pode ser usado como
 * instancia da classe que implementa a interface  e o outro como statico
 * mesmo "Interface.metodo()"
 * Todos os m�todo em uma interface por padr�o s�o p�blico,mesmo q vc � defina
 * 
 * Interfaces possibilitam mudan�as de implementa��o mais facilmente, pois
 * quem chama o m�todo n�o conhece sua implementa��o
 * 
 * Interfaces n�o possuem atributos, s� constantes
 * Interfaces podem extender outras interfaces
 * 
 * Diferen�a Classe Abstract X Interface
 * a diferen�a � que classe abstrata pode conter atributos sem serem staticos
 * final, e na interface tem que serem staticos e final
 */

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
        
    	/* Se uma classe implementar uma interface, ent�o essa classe � do 
    	 * tipo da interface, ent�o Ferrari � UM Autom�vel
    	 * 
    	 * Automovel � pai de carro que � pai de Ferrari
         * Perceba que o metodo ir pede um Automovel, mas vc ta passando 
         * uma Ferrari, os metodos executados s�o da Ferrari
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
