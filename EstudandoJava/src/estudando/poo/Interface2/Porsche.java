package estudando.poo.Interface2;

public class Porsche implements Automovel {

    @Override
    public void virarParaEsquerda() {
        System.out.println("Porsche virou � ESQUERDA");
    }

    @Override
    public void virarParaDireita() {
        System.out.println("Porsche virou � DIREITA");
    }

    @Override
    public void acelerar() {
        System.out.println("Porsche ACELEROU");
    }

    @Override
    public void frear() {
        System.out.println("Porsche FREOU");
    }

    
}