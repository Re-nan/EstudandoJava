package estudando.Interface2;

public class Ferrari implements Automovel {

    @Override
    public void virarParaEsquerda() {
        System.out.println("Ferrari virou à ESQUERDA");
    }

    @Override
    public void virarParaDireita() {
        System.out.println("Ferrari virou à DIREITA");
    }

    @Override
    public void acelerar() {
        System.out.println("Ferrari ACELEROU");
    }

    @Override
    public void frear() {
        System.out.println("Ferrari FREOU");
    } 

}