/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pablo Aaron Almaraz Avalos
 */
public class Principala {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        hijo hObj = new hijo();
        hObj.AlgoMas();
        hObj.mensaje();
        hObj.otromensaje();
    }
    
}
class hijo extends Padre implements Accerorio, AlgoMas
{

    @Override
    public void otromensaje() {
          }


}
class Padre
{
public void mensaje()
{
    System.out.println("mensaje de la clase");

}

}
interface Accesorio
{
public void mensaje();

}
interface AlgoMas
{
public void otromensaje();

}