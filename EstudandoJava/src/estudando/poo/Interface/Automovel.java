package estudando.Interface;

public interface Automovel {

    public void virarParaEsquerda();

    void virarParaDireita();

    public void acelerar();

    /* BONUS DE ESTUDO, tudo isso abaixo compila normalmente, pois o JAVA
     * interpreta que todo atributo em interface � static final mesmo se voc� 
     * n�o declarar explicitamente
     */
    
    int a = 1;

    public int b = 2;

    public static int c = 3;

    public static final int d = 4;

}

