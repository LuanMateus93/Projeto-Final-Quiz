package quiz;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.*;
import java.util.ArrayList;

public class JogoDAO {
    
    private Connection conexao;

    public JogoDAO(Connection conexao) {
        this.conexao = conexao;
    }
    
    public ArrayList<Pergunta> recuperarPergunta(){
        
        ArrayList<Pergunta> perguntas = new ArrayList<Pergunta>(); 
        
        try{
            String sql ="select * from perguntas";
            PreparedStatement stmt = conexao.prepareStatement(sql); 
            ResultSet dados =stmt.executeQuery();
            while(dados.next()){
                
            }
            
        }catch(SQLException e){
            
        }
    }
    
}