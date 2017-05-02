
/**
 * Write a description of class Pato here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pato extends Animal
{
    
    /**
     * Constructor for objects of class Pato
     */
    public Pato()
    {
        super(100 , 2 , "Cuak! Cuak!");
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
    }
}