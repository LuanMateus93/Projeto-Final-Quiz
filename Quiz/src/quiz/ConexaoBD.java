package quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {
        
    private static String driver = "com.mysql.cj.jdbc.Driver";
    private static String url = "jdbc:mysql://localhost/quiz";
    private static String usuario = "root";
    private static String senha = "1234";
    
    public static Connection conectar(){
        Connection con = null;
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, usuario, senha); 
        } catch (ClassNotFoundException ex) {
            System.out.println("Erro no driver de conex√£o");
        } catch(SQLException e){
            System.out.println("Erro na conex„o com o servidor");
        }
       
        return con;
    }
}