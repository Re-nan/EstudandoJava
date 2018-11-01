package estudando.jdbc;

/* APLICA��ES X BANCO DE DADOS
 * Atualmente no mercado n�s temos um n�mero grande de empresas que desenvolvem seus
 * servidores de banco de dados. O problema � que se eu fosse alterar meu servidor de
 * banco de dados, eu teria que alterar o c�digo da aplica��o tamb�m. Ex. Se eu trocar
 * o bd Oracle pelo SQL Server eu teria que trocar o c�digo que faz a comunica��o com
 * o bd antigo para o novo. E para evitar esse tipo de problema foi criado a API JDBC
 * 
 * API JDBC (Java Database Connectivity)
 * - Surgiu para flexibilizar aplica��es sendo uma camada intermedi�ria entre a aplica��o
 * e o banco de dados(independente de ser Oracle, SQL Server, MySQL...) sendo assim
 * sua aplica��o n�o conversa mais diretamente com o banco de dados, mas sim com o JDBC
 * e ele quem se comunica com o banco de dados espec�fico. Podendo agora altera��o de
 * bd sem trocar o c�digo, por�m isso s� desde que voc� use chamadas SQL padronizadas,
 * por�m cada empresa implementam coisas a mais em chamadas sql, que s�o espec�ficas para
 * aquele servidor de banco de dados. Ex. se vc estiver usando comandos espec�ficos Oracle
 * e for migrar seu banco de ados para MySQL esses comando n�o ir�o existir, obrigando voc�
 * a alterar as queries da sua aplica��o
 * 
 * - Livra o programador da responsabilidade de entender e programar a comunica��o com o
 * banco de dados, pois fica a cargo do jdbc 
 */

/* Interface Connection est� ligada a Interface Statement e PreparedStatement e
 * a interface Statement est� ligada a interface ResultSet e
 * a interface PreparedStatement est� ligada a interface ResultSet tamb�m
 * 
 * DriverManager � tipo um gerenciador de driver, ele est� ligado ao driver espec�fico de 
 * cada bd, ex. pro bd Oracle eu tenho um driver Oracle, pro banco MySQL eu tenho um driver 
 * MySQL, pra um bd ODBC qualquer eu tenho um driver ODBC, o que tem no c�digo dos drivers
 * � exatamente o c�digo que ensina como o JDBC deve fazer para se comunicar com aquele bd
 * especificamente, esses drivers s�o implementado pelas empresas que criam os banco de dados
 * pq ningu�m melhor doq elas sabe como o banco delas funciona, ent�o ela escreve o c�digo
 * do driver dela pro JDBC e um programador importa esse driver e utiliza de forma transparente
 * sem saber como esse driver foi implementado
 */ 
 
/* Todas as classes e interfaces do JDBC est�o dentro do pacote java.sql
 * 
 * CLASSE DRIVER MANAGER � a classe mais importando do JDBC, ela gerencia o driver do bd espec�fico
 * e cria uma conex�o com o bd espec�fico 
 * 
 * INTERFACE Connection representa uma conex�o com o banco de dados
 * 
 * INTERFACE Statement controla e executa uma instru��o SQL, executa a querys como select, update, 
 * insert, delete..
 * 
 * INTERFACE PreparedStatement semelhante ao Statement s� que a instru��o � pr� compilada no BD
 * 
 * INTERFACE ResultSet cont�m o conjunto(as colunas) de dados retornado de uma consulta sql
 * 
 * INTERFACE ResultsetMetaData Trata dos metadados dos dados retornados do ResultSet 
 * 
 * INTERFACE DatabaseMetaData Trata dos metadados do banco de dados
 */

public class Main {

	public static void main(String[] args) {

	}

}
