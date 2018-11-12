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
    }
    
}
class Caballo extends Animal{
@Override
public void movimiento()
{
    super.movimiento();
    System.out.println("Galopar");

}


}
class AnimalTrabajo
{


}
abstract class Animal
{
    public void respirar()
{
    System.out.println("El animal esta respirando");

}
public void movimiento(){

    System.out.println("algun movimiento");
    
}


}
