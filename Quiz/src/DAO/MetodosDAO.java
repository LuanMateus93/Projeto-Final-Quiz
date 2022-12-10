package DAO;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;

public class MetodosDAO {

    private Connection con;

    public MetodosDAO() {
        con = new ConexaoBD().conectar();
    }

    public ResultSet autenticacaoUsuario(String nome, String senha) {

        try {
            String sql = "select * from usuario where nome = ? and senha = ?";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, nome);
            pstm.setString(2, senha);

            ResultSet rs = pstm.executeQuery();
            return rs;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Usuario: " + erro);
            return null;
        }
    }

    public boolean cadastrarUsuario(String nome, String senha, String tipo) {

        try {
            String sql = "insert into usuario (nome, senha, tipo) values (?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, nome);
            stmt.setString(2, senha);
            stmt.setString(3, tipo);

            return !stmt.execute();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "CadastroUsuario: " + erro);
        }
        return false;
    }

    public boolean criarPergunta(String questao, String a, String b, String c, String d, String opcaoCerta, int tema, int dificuldade) {
        try {
            String sql = "insert into perguntas (Questão, A, B, C, D, OpçãoCerta, Tema, Dificuldade) values (?,?,?,?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, questao);
            stmt.setString(2, a);
            stmt.setString(3, b);
            stmt.setString(4, c);
            stmt.setString(5, d);
            stmt.setString(6, opcaoCerta);
            stmt.setInt(7, tema);
            stmt.setInt(8, dificuldade);

            return !stmt.execute();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "CriarPergunta: " + erro);
        }
        return false;
    }

    public boolean editarQuestão(String questao, String a, String b, String c, String d, String opcaoCerta, String tema, String dificuldade) {
        try {
            String sql = "select * from produto";
            PreparedStatement stmt = con.prepareStatement(sql);

            return stmt.execute();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "EditarPergunta: " + erro);
        }
        return false;
    }

    public ResultSet listarDificuldade() {

        con = new ConexaoBD().conectar();
        String sql = "SELECT * FROM dificuldades ORDER BY dificuldade;";

        PreparedStatement pstm;

        try {

            pstm = con.prepareStatement(sql);
            return pstm.executeQuery();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ListarDificuldade: " + erro);
            return null;
        }
    }

    public ResultSet listarTema() {

        con = new ConexaoBD().conectar();
        String sql = "SELECT * FROM temas ORDER BY tema;";

        PreparedStatement pstm;

        try {

            pstm = con.prepareStatement(sql);
            return pstm.executeQuery();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ListarTema: " + erro);
            return null;
        }
    }

    public ResultSet buscaTema(String nome_tema) {
        
        try {

            String sql = "SELECT * FROM temas Where tema = ?;";
            
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, nome_tema);
            

            ResultSet rs = pstm.executeQuery();
            return rs;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "BuscaTema " + erro);
            return null;
        }
    }
    
    public boolean inserirTema(String tema ) {
        try {
            String sql = "insert into temas (tema) values (?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, tema);

            return !stmt.execute();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "InserirTema " + erro);
        }
        return false;
    }
    
    public ResultSet buscaDificuldade(String nome_dificuldade) {
        
        try {

            String sql = "SELECT * FROM dificuldades Where dificuldade = ?;";
            
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, nome_dificuldade);
            

            ResultSet rs = pstm.executeQuery();
            return rs;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "BuscaDificuldade " + erro);
            return null;
        }
    }
    
    public boolean inserirDificuldade(String dificuldade ) {
        try {
            String sql = "insert into dificuldades (dificuldade) values (?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, dificuldade);

            return !stmt.execute();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "InserirDificuldade " + erro);
        }
        return false;
    }
}
