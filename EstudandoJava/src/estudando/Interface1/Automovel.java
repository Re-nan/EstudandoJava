package estudando.Interface1;

public interface Automovel {

    public  void virarParaEsquerda();

    void virarParaDireita();

    public void acelerar();

    /**
     * BONUS DE ESTUDO, tudo isos abaixo compila normalmente, posi o JAVA
     * interpreta que todo atributo em interface � staic final mas se voc� 
     * n�o declarar explicitamente
     */
    
    int a = 1;

    public int b = 2;

    public static int c = 3;

    public static final int d = 4;

}

