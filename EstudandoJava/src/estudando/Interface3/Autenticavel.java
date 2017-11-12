package estudando.Interface3;

/* Interfaces representam uma barreira no aprendizado do Java: parece que estamos escrevendo um c�digo que n�o serve
 * pra nada, j� que teremos essa linha (a assinatura do m�todo) escrita nas nossas classes implementadoras. Essa � uma
 * maneira errada de se pensar. O objetivo do uso de uma interface � deixar seu c�digo mais flex�vel e possibilitar a 
 * mudan�a de implementa��o sem maiores traumas. N�o � apenas um c�digo de prototipa��o, um cabe�alho!
 * Os mais radicais dizem que toda classe deve ser "interfaceada", isto �, s� devemos nos referir a objetos atrav�s de
 * suas interfaces. Se determinada classe n�o tem uma interface, ela deveria ter. Os autores deste material acham tal 
 * medida radical demais, por�m o uso de interfaces em vez de heran�a � amplamente aconselhado. Voc� pode encontrar mais
 * informa��es sobre o assunto nos livros ::Design Patterns::, ::Refactoring:: e ::Effective Java::.
 * 
 * No livro Design Patterns, logo no in�cio, os autores citam 2 regras "de ouro". Uma � "evite heran�a, prefira 
 * composi��o" e a outra, "programe voltado a interface e n�o � implementa��o".
 */

public interface Autenticavel {
	
	boolean autenticar(String senha);

}
