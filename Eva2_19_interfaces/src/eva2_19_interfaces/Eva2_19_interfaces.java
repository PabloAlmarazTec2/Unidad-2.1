/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_19_interfaces;

/**
 *
 * @author Pablo Aaron Almaraz Avalos
 */
public class Eva2_19_interfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    }
    
}
class Caballo implements ComportamientoAnimal
{

    @Override
    public void movimiento() {
        System.out.println("Galopar");

    }

    @Override
    public void comer() {
        System.out.println("comer pasto");
    
    }

    @Override
    public void respirar() {
          }

}
interface ComportamientoAnimal
{
public void movimiento();
public void comer();
public void respirar();


}