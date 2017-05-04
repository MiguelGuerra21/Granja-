
/**
 * Write a description of class Animal here.
 * 
 * @author (Miguel RG).
 * @version (02/05/2017).
 */
public abstract class Animal
{
    //Atributos
    private int puntosDeVida;
    private int peso;
    private String sonidoCaracteristico;

    /**
     * Constructor for objects of class Animal.
     * @param puntosVida puntos de vida del animal.
     * @param kg kilogramos que pesa el animal.
     * @param sonido sonido caracteristico del animal.
     */
    public Animal(int puntosVida , int kg, String sonido)
    {
        puntosDeVida = puntosVida;
        peso = kg;
        sonidoCaracteristico = sonido;
    }
    
    public abstract void comer();
    
    public abstract void emitirSonidoCaracteristico();
    
    public abstract int getPeso();
    
    public abstract int getPuntosDeVida();
    
    public abstract void vacunar();
}
