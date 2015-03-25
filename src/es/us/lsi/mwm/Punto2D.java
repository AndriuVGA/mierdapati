package es.us.lsi.mwm;

public class Punto2D {
    private float x;
    private float y;

    public void setX(float x) {
        this.x = x ;
    }

    public float getX() {
        return x;
    }

    public void setY(float y) {
        this.y = y;
    }
    
    
    public void moverX(float desplazamientoX){
        this.x+=desplazamientoX;
    }
    
    public void moverY(float desplazamientoY){
        this.y+=desplazamientoY;
    }

    public float getY() {
        return y;
    }

    public Punto2D() {
        super();
    }
}
