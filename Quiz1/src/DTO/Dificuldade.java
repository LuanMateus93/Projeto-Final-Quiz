package DTO;


public class Dificuldade {
    
    private int id;
    private String dificuldades;

    public Dificuldade(int id, String dificuldades) {
        this.id = id;
        this.dificuldades = dificuldades;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDificuldades() {
        return dificuldades;
    }

    public void setDificuldades(String dificuldades) {
        this.dificuldades = dificuldades;
    }
    
}