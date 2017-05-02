
/**
 * Write a description of class Cerdo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cerdo extends Animal
{
    
    /**
     * Constructor for objects of class Cerdo
     */
    public Cerdo()
    {
        super(100 , 15 , "Oink! Oink!");
    }
    
    public void comer(){
        peso = peso + 2;
        puntosDeVida = puntosDeVida - 10;
    }
    
    public void emitirSonidoCaracteristico(){
        System.out.println(sonidoCaracteristico);
    }
    
    public int getPeso(){
        return peso;
    }
    
    public int getPuntosDeVida(){
        return puntosDeVida;
    }
    
    public void vacunar(){
        puntosDeVida = puntosDeVida + 20;
    }
}