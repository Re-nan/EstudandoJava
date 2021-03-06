package estudando.poo.Abstract;

/* Classes abstratas s�o utilizadas quando n�o faz sentido termos instancias
 * de determinadas classes, se por algum motivo vc quer barrar a cria��o de
 * instancias de uma classe que voc� escreveu? ela deve ser uma classe abstrata
 * isso permite manter a consist�ncia do c�digo.
 * Ex.
 * N�o compila 
 * Animal a = new Animal() pois Animal � uma classe abstrata
 * Por�m, compila
 * animal a = new Cachorro() pois a instancia no caso n�o � de Animal, mas sim
 * de Cachorro, Animal � apenas o tipo da variavel que aponta pro obj na mem�ria
 * do tipo Cachorro
 */ 
 
/* M�todo abstratos s�o utilizados quando n�o faz sentido termos a implementa��o
 * do m�todo em determinada classe abstrata. 
 * Ficam implementados como: public abstract void pegar();
 * e quem herda essa classe abstract tem por obriga��o implementar este m�todo
 * Aten��o: Se eu quiser extender uma classe abstrata E N�O QUISER implementar o
 * m�todo abstrato dela, ent�o essa minha classe que herda de abstract tem que 
 * tamb�m ser abstrata e a� sim quem herdar essa minha segunda classe abstrata �
 * quem vai implementar os m�todos abstratos da minha primeira classe abstrata
 */

/* Classes abstratas n�o precisam obrigatoriamente ter m�todos abstratos, a classe
 * pode conter m�todos abstratos(os sem implementa��o) como tamb�m m�todos normais
 * (com implementa��o)
 * POR�M... m�todos abstratos S� PODEM existir em classes abstratas, pois n�o tem
 * como eu ter um m�todo abstract(sem implementa��o) em uma classe que pode ser
 * instanciada
 */

public class Main {
    public static void main(String[] args){
        
        //Instancia de Moeda e utilizando do seu jeito o metodo herdado da classe abstract
        Moeda moeda = new Moeda();
        moeda.pegar();
        
        //Instancia de Cogumelo e utilizando do seu jeito o metodo herdado da classe abstract
        Cogumelo cogumelo = new Cogumelo();
        cogumelo.pegar();
        
        /* Aqui ocorre um ex de polimorfismo
         * Item i = define os m�todos que voc� pode enxergar
         * new Moeda() = os metodos q vc executar de i, ter�o os mesmos efeitos
         * que os de Moeda, pois a refer�ncia em mem�ria � de Moeda
         */
        Item i = new Moeda();
        i.pegar();
    }
}
