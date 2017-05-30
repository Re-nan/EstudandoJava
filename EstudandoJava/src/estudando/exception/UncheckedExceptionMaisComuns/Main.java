package estudando.exception.UncheckedExceptionMaisComuns;

public class Main {
    public static void main(String[] args) {

        ContatoPF c1 = new ContatoPF();
        ContatoPJ c2 = new ContatoPJ();

        c1.setNome("RENAN");
        c1.setCpf("999.999.999-99");
        c1.getEndereco().setRua("Rua do Vale do Silício");//
        c1.getEndereco().setNumero("256");
        c1.getEndereco().setCidade("São Paulo");
        c1.getEndereco().setEstado("SP");
        
        Agenda agendaPessoaFisica = new Agenda();
        agendaPessoaFisica.setContato1(c1);
        agendaPessoaFisica.imprimirNomes(agendaPessoaFisica);
        agendaPessoaFisica.imprimirCNPJ(agendaPessoaFisica);
           
        c2.setNome("RENAN PJ");
        c2.setCnpj("22.222.222/2222-22");
        
        Agenda agendaPessoaJuridica = new Agenda();
        agendaPessoaJuridica.setContato1(c2);
        agendaPessoaJuridica.imprimirNomes(agendaPessoaJuridica);
        agendaPessoaJuridica.imprimirCNPJ(agendaPessoaJuridica);
        

    }
}
