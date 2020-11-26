
package entities;

public class Encomenda {
    private EstadoEncomenda status;
    
    private String local;

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }
    public void enviarEncomenda(String destinatario){
        this.local = destinatario;
        this.status = Em_transito.instancia();
    }
    public void setStatus(EstadoEncomenda novoStatus){
        System.out.println("Novo status da encomenda: "+ novoStatus);
        this.status = novoStatus;
    }
    
    
}
