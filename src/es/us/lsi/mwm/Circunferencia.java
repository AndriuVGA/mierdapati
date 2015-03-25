package es.us.lsi.mwm;

public class Circunferencia {
    public void setCentro(Punto2D centro) {
        this.centro = centro;
    }

    public Punto2D getCentro() {
        return centro;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }
    private Punto2D centro;
    private float radio;
    
    public Circunferencia() {
        super();
    }
}
