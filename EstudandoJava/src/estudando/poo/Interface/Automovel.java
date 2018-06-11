package estudando.poo.Interface;

public interface Automovel {

	/* Todo m�todo por padr�o dentro de uma interface s�o p�blicos, usar o 
	 * modificador explicito � opcional
	 */
	
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

