package DTO;

public class Ranking {
    
    private int id;
    private Usuario usuario;
    private int pontosTotais;

    public Ranking(int id, Usuario usuario, int pontosTotais) {
        this.id = id;
        this.usuario = usuario;
        this.pontosTotais = pontosTotais;
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

    public int getPontosTotais() {
        return pontosTotais;
    }

    public void setPontosTotais(int pontosTotais) {
        this.pontosTotais = pontosTotais;
    }
    
    
}
