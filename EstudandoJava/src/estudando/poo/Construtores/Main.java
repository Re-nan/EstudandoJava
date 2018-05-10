package estudando.Construtores;

public class Main {

    public static void main(String[] args) {

        System.out.println("Contrutor()");
        Retangulo r1 = new Retangulo(); //mesmo chamando o vazio é como se tivesse chamando o parametrizado
        System.out.println(r1.calcularArea());

        System.out.println("");

        System.out.println("Construtor(double, double)");
        Retangulo r2 = new Retangulo(6, 2);
        System.out.println(r2.calcularArea());
        
    }
}
