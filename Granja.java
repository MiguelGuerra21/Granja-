
/**
 * Write a description of class Granja here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Granja
{

    /**
     * Constructor for objects of class Granja
     */
    public Granja()
    {

    }

    public void alimentar(Animal animalAAlimentar){
        Animal animal = animalAAlimentar;
        animal.comer();
    }

    public void vacunarAnimal(Animal animalAVacunar){
        Animal animal = animalAVacunar;
        if(animalAVacunar instanceof Pato){
            System.out.println("Un pato no se puede vacunar");
        }
        else{
            animal.vacunar();
        }
    }

    public void hacerEmitirSonidoCaracteristico(Animal animalQueChille){
        Animal animal = animalQueChille;
        animal.emitirSonidoCaracteristico();
    }
}
