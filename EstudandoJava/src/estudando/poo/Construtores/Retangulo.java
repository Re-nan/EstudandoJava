package estudando.poo.Construtores;

public class Retangulo {

    double largura;
    double altura;

    /* Construtor padrão = instancia os atributos da classe com valores padrão
     * Construtor com parametros = força a instanciação da classe com valores
     * 
     * Ele poder ter uma lógica como se fosse um método, pode validar parametros
     * inclusive pode chamar outros métodos da própria classe, instanciar outros
     * objetos, ele pode de tudo, a diferença dele pra um método é que ele é
     * chamado na hora em que o objeto é criado, e o método é chamado 
     * esplicitamente pelo usuário
     */
    
    /* O this chama o outro construtor da mesma classe, o this tem que ser a 
     * primeira coisa a ser chamada em um construtor que implementa outro
     * 
     * Se chama o construtor padrão, fica sendo como se tivesse chamado o outro
     * também.
     * 
     * Não confunda o this() do construtor com o this. de atribuição de atributos
     * são coisas totalmente diferentes. O this() invoca o outro construtor da
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
