/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fg;

/**
 *
 * @author Pablo Aaron Almaraz Avalos
 */
public abstract class Figura {
    private Punto EsqsupIz;
    public String color;
    private int anchoLinea;

    public Punto getEsqsupIz() {
        return EsqsupIz;
    }

    public void setEsqsupIz(Punto EsqsupIz) {
        this.EsqsupIz = EsqsupIz;
    }

    public int getAnchoLinea() {
        return anchoLinea;
    }

    public void setAnchoLinea(int anchoLinea) {
        this.anchoLinea = anchoLinea;
    //AREa de una figrua 2D
    public abstract int caculaArea();
    //simula dibujar la figura 2d
    public abstract void dibujar();
    
}
   /* private int X;
        private int Y;
    public Figura()
    {
    color = "rojo";
    X = 10;
    Y = 10;
    
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getX() {
        return X;
    }

    public void setX(int X) {
        this.X = X;
    }

    public int getY() {
        return Y;
    }

    public void setY(int Y) {
        this.Y = Y;
    }

  
}*/