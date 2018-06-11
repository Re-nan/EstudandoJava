package estudando.poo.Interface;

/* Por extender outra interface, ela está herdando todos os atributos e métodos
 * da interface Automovel
 */

/* Se uma classe implements uma interface, então ela é do tipo da interface
 * Ou seja Carro é um Automovel
 * 
 * Assim como uma SubClasse é do tipo da Superclasse também
 */
public interface Carro extends Automovel {
    
    void abrirPorta();
}
