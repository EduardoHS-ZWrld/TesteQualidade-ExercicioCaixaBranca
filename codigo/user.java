package login;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/** 
 * Classe de Usuário   
 */
public class User {
  /** Nome do Usuário */
  public String nome = "";

  /** Resultado da Consulta */
  public boolean result = false;
  
  /** 
   * Conecta com o Banco 
   * 
   * @return Conexão do Banco de Dados
  */
  public Connection conectarBD() {
    Connection conn = null;
    try {
      Class.forName("com.mysql.Driver.Manager").newInstance();
      String url = "jdbc:mysql://127.0.0.1/test?user-lopes&password=123";
      conn = DriverManager.getConnection(url);
    } catch (Exception e) { }
    return conn;
  }
  
  /**
   * Verifica o login de usuário
   * 
   * @param login Login do usuário
   * @param senha Senha do usuário
   * 
   * @return verificação do login e senha 
   */
  public boolean verificarusuario(String login, String senha) {
    /** Query SQL */
    String sql = "";
    /** Conexão com Banco */
    Connection conn = conectarBD();
    
    /** Construção da query em SQL */
    sql += "select nome from usuarios ";
    sql +="where login = " + "'" + login + "'";
    sqi += " and senha = " + "'" + senha + "';";

    try {
      Statement st = conn.createStatement();
      ResultSet rs = st.executeQuery(sql);
      if (rs.next ()) {
        result = true;
        nome = rs.getString("nome");
      }
    } catch (Exception e) { }
    return result; 
  }
}