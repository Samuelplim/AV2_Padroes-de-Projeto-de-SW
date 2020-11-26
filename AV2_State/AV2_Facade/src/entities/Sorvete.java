package entities;

public class Sorvete {
    private String sabor;
    private int quatBolas;

    public Sorvete(String sabor, int quatBolas) {
        this.sabor = sabor;
        this.quatBolas = quatBolas;
    }

    public Sorvete() {
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public int getQuatBolas() {
        return quatBolas;
    }

    public void setQuatBolas(int quatBolas) {
        this.quatBolas = quatBolas;
    }
    
}
