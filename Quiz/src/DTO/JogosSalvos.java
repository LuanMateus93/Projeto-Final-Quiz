package DTO;

import java.util.ArrayList;
import DTO.Pergunta;

public class JogosSalvos {
 
    private int id;
    private String nome;
    private int acertos;
    private int erros;
    
    private ArrayList<Pergunta> perguntas; 

    public JogosSalvos(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.acertos = 0;
        this.erros = 0;
        this.perguntas = new ArrayList();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public ArrayList<Pergunta> getPerguntas() {
        return perguntas;
    }

    public void setPerguntas(ArrayList<Pergunta> perguntas) {
        this.perguntas = perguntas;
    }
    
    public void setPerguntas (Pergunta pergunta){
        this.perguntas.add(pergunta);
    }
}