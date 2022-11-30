package quiz;

import java.util.Date;
import quiz.JogosSalvos;
import quiz.Usuario;

public class Historico {
    
    private int id;
    private Usuario usuario;
    private JogosSalvos jogoSalvo;
    private int acertos;
    private int erros;
    private Date data;

    public Historico(int id, Usuario usuario, JogosSalvos jogoSalvo, int acertos, int erros, Date data) {
        this.id = id;
        this.usuario = usuario;
        this.jogoSalvo = jogoSalvo;
        this.acertos = acertos;
        this.erros = erros;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public JogosSalvos getJogoSalvo() {
        return jogoSalvo;
    }

    public void setJogoSalvo(JogosSalvos jogoSalvo) {
        this.jogoSalvo = jogoSalvo;
    }

    public int getAcertos() {
        return acertos;
    }

    public void setAcertos(int acertos) {
        this.acertos = acertos;
    }

    public int getErros() {
        return erros;
    }

    public void setErros(int erros) {
        this.erros = erros;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}