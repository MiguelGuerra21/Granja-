
/**
 * Write a description of class Pollo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pollo extends Animal
{
    
    /**
     * Constructor for objects of class Pollo
     */
    public Pollo()
    {
        super(100 , 1 , "Pio! Pio!");
    }
    
    public void comer(){
        peso = peso + 1;
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
        puntosDeVida = puntosDeVida + 10;
    }
}
