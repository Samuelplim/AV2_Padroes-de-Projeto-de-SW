package entities;

public class Extraviado extends EstadoEncomenda{
        private static Extraviado instancia;

    protected Extraviado() {
    }

    public static Extraviado instancia() {
        if (Extraviado.instancia == null) {
            Extraviado.instancia = new Extraviado();
        }
        return Extraviado.instancia;
    }

    public boolean devolver(Encomenda encomenda) {
        System.out.println("Ops! sua encomenda foi extraviada, entre em contado com o suporte");
        return false;
    }
    
}
