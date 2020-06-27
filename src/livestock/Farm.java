package livestock;

import java.util.ArrayList;
import java.util.List;

import livestock.Animal.Species;

public class Farm {

    List<Animal> animalList = new ArrayList<Animal>();
    //Animal animalList[] = new Animal[2];
    interface AnimalComparator {

    }

    public void addAnimal(Species species, int age, char sex) {
        //animalList.add(a);
        animalList.add(new Animal(species,age,sex));
        System.out.println("we have now "+animalList.size()+ " animals");
    }

    public void killAnimal(Species species, int age, char sex) {
        for(int i=0; i < animalList.size(); i++) {
            if(animalList.get(i).species == species && animalList.get(i).age == age && animalList.get(i).sex == sex) {
                System.out.println("animal identified on position " + i);
                for(int j=i; j < animalList.size() - 1; j++){
                    animalList.set(j,animalList.get(j+1));
                } 
                animalList.remove(animalList.get(animalList.size()-1));
            }
        }
        System.out.println("we have now "+animalList.size()+ " animals");
    }

    int countAnimal(char sex) {
        int countHorse=0,countPig=0,countSheep=0;
        for(int i=0; i < animalList.size(); i++) {
            if( animalList.get(i).sex == sex) {
                if(animalList.get(i).species == Animal.Species.Horse) {
                    countHorse++;
                }
                if(animalList.get(i).species == Animal.Species.Pig) {
                    countPig++;
                }
                if(animalList.get(i).species == Animal.Species.Sheep) {
                    countSheep++;
                }
            }
        }
        return 1;
    }

    public void browseAnimal(Species species, int age) {

    }

    private void searchAnimal(AnimalComparator ac){

    }
 
}