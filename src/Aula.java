public class Aula {
    private Int sequencia;
    private String titulo;
    private String teoria;
    private List<Exercicio> exercicios;

    public Aula(Int sequencia, String titulo, String teoria, List<Exercicio> exercicios) {
        this.sequencia = sequencia;
        this.titulo = titulo;
        this.teoria = teoria;
        this.exercicios = exercicios;
    }

    public Int getSequencia() {
        return sequencia;
    }

    public void setSequencia(Int sequencia) {
        this.sequencia = sequencia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTeoria() {
        return teoria;
    }

    public void setTeoria(String teoria) {
        this.teoria = teoria;
    }

    public List<Exercicio> getExercicios() {
        return exercicios;
    }

    public void setExercicios(List<Exercicio> exercicios) {
        this.exercicios = exercicios;
    }
}
