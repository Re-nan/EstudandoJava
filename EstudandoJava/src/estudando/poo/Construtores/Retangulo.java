package estudando.poo.Construtores;

public class Retangulo {

    double largura;
    double altura;

    /* Construtor padr�o = instancia os atributos da classe com valores padr�o
     * Construtor com parametros = for�a a instancia��o da classe com valores
     * 
     * Ele poder ter uma l�gica como se fosse um m�todo, pode validar parametros
     * inclusive pode chamar outros m�todos da pr�pria classe, instanciar outros
     * objetos, ele pode de tudo, a diferen�a dele pra um m�todo � que ele �
     * chamado na hora em que o objeto � criado, e o m�todo � chamado 
     * esplicitamente pelo usu�rio
     */
    
    /* O this chama o outro construtor da mesma classe, o this tem que ser a 
     * primeira coisa a ser chamada em um construtor que implementa outro
     * 
     * Se chama o construtor padr�o, fica sendo como se tivesse chamado o outro
     * tamb�m.
     * 
     * N�o confunda o this() do construtor com o this. de atribui��o de atributos
     * s�o coisas totalmente diferentes. O this() invoca o outro construtor da
     * mesma classe
     */
    
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
