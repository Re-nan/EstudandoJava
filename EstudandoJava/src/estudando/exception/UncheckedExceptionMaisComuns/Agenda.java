package estudando.exception.UncheckedExceptionMaisComuns;

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
    	
        System.out.println(a.getContato1().getNome());

        if (a.getContato2() != null) {
            System.out.println(a.getContato2().getNome());
        }

        if (a.getContato3() != null) {
            System.out.println(a.getContato3().getNome());
        }
    }

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