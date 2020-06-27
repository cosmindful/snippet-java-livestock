import livestock.*;
public class Test {
    public static void main(String[] args) {
        System.out.println("Warming up...");
        Farm farm  = new Farm();
        farm.addAnimal(Animal.Species.Sheep,4,'f');
        farm.addAnimal(Animal.Species.Horse,1,'f');
        farm.addAnimal(Animal.Species.Pig,3,'m');

        farm.killAnimal(Animal.Species.Pig,3,'m');

        farm.countAnimal(Animal.Species.Horse,'f');

    }
}