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
         * Item i = define os m�todos que voc� pode enxergar
         * new Moeda() = os metodos q vc executar de i, ter�o os mesmos efeitos
         * que os de Moeda, pois a refer�ncia em mem�ria � de Moeda
         */
        Item i = new Moeda();
        i.pegar();
    }
}
