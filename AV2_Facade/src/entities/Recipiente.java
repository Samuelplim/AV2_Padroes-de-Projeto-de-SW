package entities;

public class Recipiente {
    private Copo copo;
    private Casca casca;
    private Barca barca;

    public Recipiente() {
    }

    public Recipiente(Copo copo) {
        this.copo = copo;
    }

    public Recipiente(Casca casca) {
        this.casca = casca;
    }

    public Recipiente(Barca barca) {
        this.barca = barca;
    }

    public Copo getCopo() {
        return copo;
    }

    public void setCopo(Copo copo) {
        this.copo = copo;
    }

    public Casca getCasca() {
        return casca;
    }

    public void setCasca(Casca casca) {
        this.casca = casca;
    }

    public Barca getBarca() {
        return barca;
    }

    public void setBarca(Barca barca) {
        this.barca = barca;
    }

    @Override
    public String toString() {
        if(this.barca!= null){
            return ""+this.barca.getTamanho();
        }else if(this.casca != null) {
            return ""+this.casca.getTamanho();
        }else if(this.copo!= null){
            return ""+this.copo.getMl();
        }
        return "";
    }
    
}
