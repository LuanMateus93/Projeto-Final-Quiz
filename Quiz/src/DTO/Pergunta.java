package DTO;

public class Pergunta {
    
    private int id;
    private String questao;
    private String a;
    private String b;
    private String c;
    private String d;
    private String opcaoCerta;
    private String tema;
    private String dificuldade;
    private int cod_tema;
    private int cod_dificuldade;

    public Pergunta(int id, String questao, String a, String b, String c, String d, String opcaoCerta, String tema, String dificuldade) {
        this.id = id;
        this.questao = questao;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.opcaoCerta = opcaoCerta;
        this.tema = tema;
        this.dificuldade = dificuldade;
    }

    public Pergunta() {
        
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestao() {
        return questao;
    }

    public void setQuestao(String questao) {
        this.questao = questao;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }

    public String getOpcaoCerta() {
        return opcaoCerta;
    }

    public void setOpcaoCerta(String opcaoCerta) {
        this.opcaoCerta = opcaoCerta;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

    public int getCod_tema() {
        return cod_tema;
    }

    public void setCod_tema(int cod_tema) {
        this.cod_tema = cod_tema;
    }

    public int getCod_dificuldade() {
        return cod_dificuldade;
    }

    public void setCod_dificuldade(int cod_dificuldade) {
        this.cod_dificuldade = cod_dificuldade;
    }
   
}