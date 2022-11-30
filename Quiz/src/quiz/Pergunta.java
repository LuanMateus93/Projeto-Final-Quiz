package quiz;

public class Pergunta {
    
    private int id;
    private String questão;
    private String a;
    private String b;
    private String c;
    private String d;
    private String opcaoCerta;
    private String tema;
    private String dificuldade;

    public Pergunta(int id, String questão, String a, String b, String c, String d, String opcaoCerta, String tema, String dificuldade) {
        this.id = id;
        this.questão = questão;
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

    public String getQuestão() {
        return questão;
    }

    public void setQuestão(String questão) {
        this.questão = questão;
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
}