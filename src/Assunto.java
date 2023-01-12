import java.util.List;

public class Assunto {
    private int sequencia;
    private String nome;
    private List<Aula> aulas;

    public Assunto(int sequencia, String nome, List<Aula> aulas) {
        this.sequencia = sequencia;
        this.nome = nome;
        this.aulas = aulas;
    }

    public int getSequencia() {
        return sequencia;
    }

    public void setSequencia(int sequencia) {
        this.sequencia = sequencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Aula> getAulas() {
        return aulas;
    }

    public void setAulas(List<Aula> aulas) {
        this.aulas = aulas;
    }

}
