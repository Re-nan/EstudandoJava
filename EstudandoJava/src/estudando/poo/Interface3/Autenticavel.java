package estudando.poo.Interface3;

/* Interfaces representam uma barreira no aprendizado do Java: parece que estamos escrevendo um código que não serve
 * pra nada, já que teremos essa linha (a assinatura do método) escrita nas nossas classes implementadoras. Essa é uma
 * maneira errada de se pensar. O objetivo do uso de uma interface é deixar seu código mais flexível e possibilitar a 
 * mudança de implementação sem maiores traumas. Não é apenas um código de prototipação, um cabeçalho!
 * Os mais radicais dizem que toda classe deve ser "interfaceada", isto é, só devemos nos referir a objetos através de
 * suas interfaces. Se determinada classe não tem uma interface, ela deveria ter. Os autores deste material acham tal 
 * medida radical demais, porém o uso de interfaces em vez de herança é amplamente aconselhado. Você pode encontrar mais
 * informações sobre o assunto nos livros ::Design Patterns::, ::Refactoring:: e ::Effective Java::.
 * 
 * No livro Design Patterns, logo no início, os autores citam 2 regras "de ouro". Uma é "evite herança, prefira 
 * composição" e a outra, "programe voltado a interface e não à implementação".
 */

public interface Autenticavel {
	
	boolean autenticar(String senha);

}
