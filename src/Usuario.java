public class Usuario {
    private String nome;
    private String email;
    private String telefone;
    private Curso curso;
    private Plano plano;

    public Usuario(String nome, String email, String telefone, Curso curso, Plano plano) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.curso = curso;
        this.plano = plano;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Plano getPlano() {
        return plano;
    }

    public void setPlano(Plano plano) {
        this.plano = plano;
    }
}
