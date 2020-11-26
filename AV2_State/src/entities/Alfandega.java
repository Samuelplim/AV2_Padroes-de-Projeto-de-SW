package entities;

public class Alfandega extends EstadoEncomenda{
    private static Alfandega instancia;

    protected Alfandega() {
    }

    public static Alfandega instancia() {
        if (Alfandega.instancia == null) {
            Alfandega.instancia = new Alfandega();
        }
        return Alfandega.instancia;
    }
    
    @Override
    public boolean devolver(Encomenda encomenda) {
        System.out.println("Sua encomenda encontrasse na Alfandega impossivel ser entregue nesse momento");
        return false;
    }
    
}
