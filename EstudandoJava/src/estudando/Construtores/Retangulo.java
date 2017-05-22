package estudando.Construtores;

public class Retangulo {

    double largura;
    double altura;

    public Retangulo() {
        this(4, 3);

        //largura = 4;
        //altura = 2;
    }

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double calcularArea() {
        return largura * altura;
    }
}
