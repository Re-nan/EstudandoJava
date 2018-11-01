package estudando.jdbc;

/* APLICAÇÕES X BANCO DE DADOS
 * Atualmente no mercado nós temos um número grande de empresas que desenvolvem seus
 * servidores de banco de dados. O problema é que se eu fosse alterar meu servidor de
 * banco de dados, eu teria que alterar o código da aplicação também. Ex. Se eu trocar
 * o bd Oracle pelo SQL Server eu teria que trocar o código que faz a comunicação com
 * o bd antigo para o novo. E para evitar esse tipo de problema foi criado a API JDBC
 * 
 * API JDBC (Java Database Connectivity)
 * - Surgiu para flexibilizar aplicações sendo uma camada intermediária entre a aplicação
 * e o banco de dados(independente de ser Oracle, SQL Server, MySQL...) sendo assim
 * sua aplicação não conversa mais diretamente com o banco de dados, mas sim com o JDBC
 * e ele quem se comunica com o banco de dados específico. Podendo agora alteração de
 * bd sem trocar o código, porém isso só desde que você use chamadas SQL padronizadas,
 * porém cada empresa implementam coisas a mais em chamadas sql, que são específicas para
 * aquele servidor de banco de dados. Ex. se vc estiver usando comandos específicos Oracle
 * e for migrar seu banco de ados para MySQL esses comando não irão existir, obrigando você
 * a alterar as queries da sua aplicação
 * 
 * - Livra o programador da responsabilidade de entender e programar a comunicação com o
 * banco de dados, pois fica a cargo do jdbc 
 */

/* Interface Connection está ligada a Interface Statement e PreparedStatement e
 * a interface Statement está ligada a interface ResultSet e
 * a interface PreparedStatement está ligada a interface ResultSet também
 * 
 * DriverManager é tipo um gerenciador de driver, ele está ligado ao driver específico de 
 * cada bd, ex. pro bd Oracle eu tenho um driver Oracle, pro banco MySQL eu tenho um driver 
 * MySQL, pra um bd ODBC qualquer eu tenho um driver ODBC, o que tem no código dos drivers
 * é exatamente o código que ensina como o JDBC deve fazer para se comunicar com aquele bd
 * especificamente, esses drivers são implementado pelas empresas que criam os banco de dados
 * pq ninguém melhor doq elas sabe como o banco delas funciona, então ela escreve o código
 * do driver dela pro JDBC e um programador importa esse driver e utiliza de forma transparente
 * sem saber como esse driver foi implementado
 */ 
 
/* Todas as classes e interfaces do JDBC estão dentro do pacote java.sql
 * 
 * CLASSE DRIVER MANAGER é a classe mais importando do JDBC, ela gerencia o driver do bd específico
 * e cria uma conexão com o bd específico 
 * 
 * INTERFACE Connection representa uma conexão com o banco de dados
 * 
 * INTERFACE Statement controla e executa uma instrução SQL, executa a querys como select, update, 
 * insert, delete..
 * 
 * INTERFACE PreparedStatement semelhante ao Statement só que a instrução é pré compilada no BD
 * 
 * INTERFACE ResultSet contém o conjunto(as colunas) de dados retornado de uma consulta sql
 * 
 * INTERFACE ResultsetMetaData Trata dos metadados dos dados retornados do ResultSet 
 * 
 * INTERFACE DatabaseMetaData Trata dos metadados do banco de dados
 */

public class Main {

	public static void main(String[] args) {

	}

}
