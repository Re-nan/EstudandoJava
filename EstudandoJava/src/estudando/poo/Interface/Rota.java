package estudando.Interface;

public class Rota {

    public void ir(Automovel a) {

        a.acelerar();
        a.virarParaDireita();
        a.virarParaEsquerda();
        a.virarParaDireita();
    }
}