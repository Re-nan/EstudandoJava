package estudando.Interface;

public class Ferrari implements Carro, ItemCaro{

    @Override
    public void virarParaEsquerda() {
        System.out.println("ferrari virou à ESQUERDA");
    }

    @Override
    public void virarParaDireita() {
        System.out.println("ferrari virou à DIREITA");
    }

    @Override
    public void acelerar() {
        System.out.println("ferrari ACELEROU");
    }

    @Override
    public void abrirPorta() {
        System.out.println("ferrari ABRIU A PORTA");
    }
    
    @Override
    public double getPreco(){
        return 100000;
    }
}
