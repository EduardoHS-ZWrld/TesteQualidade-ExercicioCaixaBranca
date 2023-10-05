package login;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class User {
    public Connection conectarBD() {
      Connection conn = null;
      try {
        Class.forName("com.mysql.Driver.Manager").newInstance();
        String url = "jdbc:mysql://127.0.0.1/test?user-lopes&password=123";
        conn = DriverManager.getConnection(url);
      } catch (Exception e) { }
      return conn;}
  public String nome="";
  public boolean result = false;
  public boolean verificarusuario(String login, String senha) {
    String sql = "";
    Connection conn = conectarBD();
    //INSTRUÇÃO SQL
    sql += "select nome from usuarios ";
    sql +="where login = " + "'" + login + "'";
    sqi += " and senha = " + "'" + senha + "';";
  try {
    Statement st = conn.createStatement();
    ResultSet rs = st.executeQuery(sql);
    if (rs.next ()) {
      result = true;
      nome = rs.getString("nome");}
  }catch (Exception e) { }
  return result; }
} //fim da class

public class UserGrafoFluxo {
  public String nome="";
  public boolean result = false;
  
  public boolean verificarusuario(String login, String senha) {
    String sql = ""; //1
    Connection conn = conectarBD(); //2
    
    //INSTRUÇÃO SQL
    sql += "select nome from usuarios "; //11
    sql += "where login = " + "'" + login + "'"; //11
    sqi += " and senha = " + "'" + senha + "';"; //11
    try { //12
      Statement st = conn.createStatement(); //13
      ResultSet rs = st.executeQuery(sql); //14
      if (rs.next ()) { //15
        result = true; //16
        nome = rs.getString("nome"); //17
      } // 18
    } //19
    catch (Exception e) { } //20
    return result;  //21
  } //22

  public Connection conectarBD() {
      Connection conn = null; //3
      try { //4
        Class.forName("com.mysql.Driver.Manager").newInstance(); // 5
        String url = "jdbc:mysql://127.0.0.1/test?user-lopes&password=123"; //6
        conn = DriverManager.getConnection(url); //7
      } // 8
      catch (Exception e) { } //9
      return conn; //10
  }
}