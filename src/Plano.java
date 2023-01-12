public class Plano {
    private String nome;
    private String vantagens;
    private Double valor;
    private String pagamento;
    private String inicio;
    private String fim;

    public Plano(String nome, String vantagens, Double valor, String pagamento, String inicio, String fim) {
        this.nome = nome;
        this.vantagens = vantagens;
        this.valor = valor;
        this.pagamento = pagamento;
        this.inicio = inicio;
        this.fim = fim;
    }

    public String getNome() {
        return nome;
    }

    public String getVantagens() {
        return vantagens;
    }

    public Double getValor() {
        return valor;
    }

    public String getPagamento() {
        return pagamento;
    }

    public void setPagamento(String pagamento) {
        this.pagamento = pagamento;
    }

    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public String getFim() {
        return fim;
    }

    public void setFim(String fim) {
        this.fim = fim;
    }

}
