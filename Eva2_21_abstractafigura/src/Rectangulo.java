
import fg.Figura;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pablo Aaron Almaraz Avalos
 */
public class Rectangulo extends Figura {
    //caclula area
    //retunr base*altura;
    //dibujar
   
    public void dibujar()
    {
    Punto esqInfIzq, esqSupDer, esqInfDer;
    esqInfIzq = new punto();
    esqSupDer = new punto();
    esqInfDer = new punto();

    esqInfIzq.setX(getEsqSupIz().getX());
    esqInfIzq.setY(getEsqSupIz().getY()- altura);
 
     esqInfDer.setX(getEsqSupIz().getX+base());
    esqInfDer.setX(getEsqSupIz().getY()+base);
    esqInfDer.setX(getEsqSupIz().getY());
    
    
    //imprimimr mensajes
    }

    @Override
    public int caculaArea() {
        
    }
    
    
}
