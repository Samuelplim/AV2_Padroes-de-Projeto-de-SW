package entities;

public class FacadeSorvete {
    private Sorvete sorvete;
    private Recipiente recipiente;
    private Decoracao decoracao;

    public FacadeSorvete() {
    }
    
    public FacadeSorvete(Sorvete sorvete, Recipiente recipiente, Decoracao decoracao) {
        this.sorvete = sorvete;
        this.recipiente = recipiente;
        this.decoracao = decoracao;
    }

    public Sorvete getSorvete() {
        return sorvete;
    }

    public void setSorvete(Sorvete sorvete) {
        this.sorvete = sorvete;
    }

    public Recipiente getRecipiente() {
        return recipiente;
    }

    public void setRecipiente(Recipiente recipiente) {
        this.recipiente = recipiente;
    }

    public Decoracao getDecoracao() {
        return decoracao;
    }

    public void setDecoracao(Decoracao decoracao) {
        this.decoracao = decoracao;
    }
    public String encomendarSorvete(){
        if(this.sorvete!=null&&this.decoracao!=null&&this.recipiente!=null){
            return "Sorvete encomendado "+sorvete.getSabor()+" Recibiente: "+recipiente.toString()+ " Decoracao: "+decoracao.getNome();
        }
        return "Erro ao encomendar";
    }
    
}
