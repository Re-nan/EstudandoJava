package estudando.poo.Interface;

public interface Automovel {

	/* Todo método por padrão dentro de uma interface são públicos, usar o 
	 * modificador explicito é opcional
	 */
	
    public void virarParaEsquerda();

    void virarParaDireita();

    public void acelerar();
    

    /* BONUS DE ESTUDO, tudo isso abaixo compila normalmente, pois o JAVA
     * interpreta que todo atributo em interface é static final mesmo se você 
     * não declarar explicitamente
     */
    
    int a = 1;

    public int b = 2;

    public static int c = 3;

    public static final int d = 4;

}

