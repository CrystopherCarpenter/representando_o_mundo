public class Exercicio {
    private String tipo;
    private String prova;
    private String enunciado;
    private String resolucao;

    public Exercicio(String tipo, String prova, String enunciado, String resolucao) {
        this.tipo = tipo;
        this.prova = prova;
        this.enunciado = enunciado;
        this.resolucao = resolucao;
    }

    public String getTipo() {
        return tipo;
    }

    public String getProva() {
        return prova;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public String getResolucao() {
        return resolucao;
    }

    public void setResolucao(String resolucao) {
        this.resolucao = resolucao;
    }
}
