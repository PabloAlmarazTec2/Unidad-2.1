
import fg.Figura;
import java.awt.BorderLayout;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pablo Aaron Almaraz Avalos
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Rectangulo rRect = new Rectangulo();
     Scanner input = new Scanner(System.in);
        System.out.println("base");
        int iBase = input.nextInt();
        System.out.println("Altura");
        int iAltura = input.nextInt();
        Punto pIini = new Punto();
        pIini.setY(0);
        pIini.setX(0);
        rRect.setEsqSupIz(pIni);
         rRect.setBase(iBase);
          rRect.setAltura(iAltura);
          rRect.dibujar();
          System.out.println("area ");
         
    }
}

/*class Rectangulo extends Figuras
{

        @Override
        public void X() {
                }

        @Override
        public void Y() {
                }

        @Override
        public void color() {
            
        }

        @Override
        public void Area() {
        
        }

 
    

  

}
class Circulo extends Figuras
{

        @Override
        public void X() {
            System.out.println("las coordenadas son ");
            
                 }

        @Override
        public void Y() {
        
        }

        @Override
        public void color() {
                
        
        }

        @Override
        public void Area() {
            
             }
        
}

   

}




abstract class Figuras {
abstract public void X();
abstract public void Y();
abstract public void color();
abstract public void Area();


}
abstract class Circulo{
   
    public void Radio()
    {
    }
    




}
abstract class Rectangulo
{
public void Base(){



}
public void Altura()
{


}
}*/
