package entities;

public class Entregue extends EstadoEncomenda {
    private static Entregue instancia;

    protected Entregue() {
    }

    public static Entregue instancia() {
        if (Entregue.instancia == null) {
            Entregue.instancia = new Entregue();
        }
        return Entregue.instancia;
    }

    public boolean devolver(Encomenda encomenda) {
        System.out.println("Ok, enviaremos de volta para o remetente");
        return true;
    }
    
}
