public class Materia {
    private String nome;
    private String faculdade;
    private int periodo;
    private List<Assunto> assuntos;

    public Materia(String nome, String faculdade, int periodo, List<Assunto> assuntos) {
        this.nome = nome;
        this.faculdade = faculdade;
        this.periodo = periodo;
        this.assuntos = assuntos;
    }

    public String getNome() {
        return nome;
    }

    public String getFaculdade() {
        return faculdade;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public List<Assunto> getAssuntos() {
        return assuntos;
    }

    public void setAssuntos(List<Assunto> assuntos) {
        this.assuntos = assuntos;
    }

}
