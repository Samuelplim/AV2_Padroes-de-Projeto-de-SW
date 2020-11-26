package entities;

public class Decoracao {
    private String tipo;
    private int quantidade;
    private String nome;

    public Decoracao() {
    }

    public Decoracao(String tipo, int quantidade, String nome) {
        this.tipo = tipo;
        this.quantidade = quantidade;
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
