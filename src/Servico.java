public class Servico {
    private String nome;
    private String tempo;
    private double valor;
    private String categoria;

    public Servico(String nome, String tempo, double valor, String categoria){
        this.setNome(nome);
        this.setTempo(tempo);
        this.setValor(valor);
        this.setCategoria(categoria);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTempo() {
        return tempo;
    }

    public void setTempo(String tempo) {
        this.tempo = tempo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
