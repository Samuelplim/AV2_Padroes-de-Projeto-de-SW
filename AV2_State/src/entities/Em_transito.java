package entities;

public class Em_transito extends EstadoEncomenda {
    private static Em_transito instancia;

    protected Em_transito() {
    }

    public static Em_transito instancia() {
        if (Em_transito.instancia == null) {
            Em_transito.instancia = new Em_transito();
        }
        return Em_transito.instancia;
    }
    
    public boolean devolver(Encomenda encomenda) {
        System.out.println("Ops! sua encomenda já está em transito, espere a Entrega ser efetuada");
        return false;
    }

}
