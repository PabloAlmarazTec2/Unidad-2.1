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
        Caballo cHorse = new Caballo();
        cHorse.movimiento();
        cHorse.comer();
    }
    
}
class Avestruz extends Animal
{

    @Override
    public void movimiento() {
        System.out.println("corre a madre");
    }

    @Override
    public void comer() {
        System.out.println("tusistas en el serengueti");      
    
    }

}
class Caballo extends Animal
{

    @Override
    public void movimiento() {
        System.out.println("Galopar");   
    }

    @Override
    public void comer() {
        System.out.println("pasto");    
    }


}
 abstract class Animal {
abstract public void movimiento();
abstract public void comer();


}