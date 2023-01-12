import java.sql.Date;

public class Curso {
    private String nome;
    private String faculdade;
    private String admissao;
    private String estado;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFaculdade() {
        return faculdade;
    }

    public void setFaculdade(String faculdade) {
        this.faculdade = faculdade;
    }

    public String getAdmissao() {
        return admissao;
    }

    public void setAdmissao(String admissao) {
        this.admissao = admissao;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
