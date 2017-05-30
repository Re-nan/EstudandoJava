package estudando.exception.UncheckedExceptionMaisComuns;

//Está classe serve para agrupar os contatos que você cria
public class Agenda {

    private Contato contato1;
    private Contato contato2;
    private Contato contato3;

    public Contato getContato1() {
        return contato1;
    }

    public Contato getContato2() {
        return contato2;
    }

    public Contato getContato3() {
        return contato3;
    }

    public void setContato1(Contato contato1) {
        this.contato1 = contato1;
    }

    public void setContato2(Contato contato2) {
        this.contato2 = contato2;
    }

    public void setContato3(Contato contato3) {
        this.contato3 = contato3;
    }

    public void imprimirNomes(Agenda a) {
        //imprime pq já foi atribuido no main
        System.out.println(a.getContato1().getNome());

        //se contato 2 for diferente de null, ele ignora, com isso vc protege
        //seu condigo de NullpointerException
        if (a.getContato2() != null) {
            System.out.println(a.getContato2().getNome());
        }

        if (a.getContato3() != null) {
            System.out.println(a.getContato3().getNome());
        }
    }

/* Exceção java.lang.ClassCastException
 * estudando.exception.UncheckedExceptionMaisComuns.ContatoPF
 * cannot be cast to 
 * estudando.exception.UncheckedExceptionMaisComuns.ContatoPessoaJuridica
 * 
 * Significa que vc tentou fazer um cast para um tipo que não é suportado,
 * Afinal você não pode fazer um cast de um ContatoPF para um tipo ContatoPJ
 * isso ocorre pq o contato1 é uma instancia de ContatoPF
 * Solução: antes de fazer o cast vc tem que verificar se vc pode fazer o cast
 * e como você verifica? usando o operador instanceOf que verifica se uma
 * determinada variavel/referencia que aponta pra um endereço na memoria é do tipo q eu
 * quero testar, no caso: "se a var do tipo Contato PJ é do tipo ContatoPJ", se for:
 * eu faço o cast, se não, fica como ContatoPF mesmo
 */
    public void imprimirCNPJ(Agenda a) {
        
        if (a.getContato1() != null && a.getContato1() instanceof ContatoPJ) {
            ContatoPJ c = (ContatoPJ) a.getContato1();
            System.out.println(c.getCnpj());
        }
        
        if (a.getContato2() != null && a.getContato1() instanceof ContatoPJ) {
            ContatoPJ c = (ContatoPJ) a.getContato1();
            System.out.println(c.getCnpj());
        }
        
        if (a.getContato3() != null && a.getContato1() instanceof ContatoPJ) {
            ContatoPJ c = (ContatoPJ) a.getContato1();
            System.out.println(c.getCnpj());
        }
    }
}