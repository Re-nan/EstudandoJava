package estudando.Abstract;

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
