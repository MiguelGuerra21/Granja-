
/**
 * Write a description of class Vaca here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vaca extends Animal
{
    
    /**
     * Constructor for objects of class Vaca
     */
    public Vaca()
    {
        super(100 , 25 , "Muuuuu!");
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
        puntosDeVida = puntosDeVida + 30;
    }
}