package estudando.Abstract;

/* Classes abstratas são utilizadas quando não faz sentido termos instancias
 * de determinadas classes, se por algum motivo vc quer barrar a criação de
 * instancias de uma classe que você escreveu? ela deve ser uma classe abstrata
 * isso permite manter a consistência do código.
 * Ex.
 * Não compila 
 * Animal a = new Animal() pois Animal é uma classe abstrata
 * Porém, compila
 * animal a = new Cachorro() pois a instancia no caso não é de Animal, mas sim
 * de Cachorro, Animal é apenas o tipo da variavel que aponta pro obj na memória
 * do tipo Cachorro
 */ 
 
/* Método abstratos são utilizados quando não faz sentido termos a implementação
 * do método em determinada classe. 
 * Não são implementados public abstract void pegar();
 */

/* Classes abstratas não precisam obrigatoriamente ter métodos abstratos, a classe
 * pode conter métodos abstratos(os sem implementação) como também métodos normais
 * (com implmentação)
 * PORÉM... métodos abstratos SÓ PODEM existir em classes abstratas, pois não tem
 * como eu ter um método abstract(sem implementação) em uma classe que pode ser
 * instanciada
 */

public class Main {
    public static void main(String[] args){
        
        //Instancia de Moeda e utilizando do seu jeito o metodo herdado da classe abstract
        Moeda moeda = new Moeda();
        moeda.pegar();
        
        //Instancia de Moeda e utilizando do seu jeito o metodo herdado da classe abstract
        Cogumelo cogumelo = new Cogumelo();
        cogumelo.pegar();
        
        /* Aqui ocorre um ex de polimorfismo
         * Item i = define os métodos que você pode enxergar
         * new Moeda() = os metodos q vc executar de i, terão os mesmos efeitos
         * que os de Moeda, pois a referência em memória é de Moeda
         */
        Item i = new Moeda();
        i.pegar();
    }
}
