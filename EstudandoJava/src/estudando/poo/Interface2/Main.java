package estudando.poo.Interface2;

public class Main {
    public static void main(String[] args){
        
        Ferrari ferrari = new Ferrari();
        Porsche porsche = new Porsche();
        
        ferrari.derrapar();
        System.out.println("");
        porsche.derrapar();
        
        System.out.println("");
        
        System.out.println(Automovel.getVelocidadeMaxima());
    }
    
}