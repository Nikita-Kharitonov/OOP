package HW6.views;

import HW6.models.animals.base.Animal;

import java.util.List;

public interface AnimalProcesser {

    public void PrintAnimal(Animal animal);

    public void PrintAnimals(List<Animal> animals);

    public void SoundAnimal(Animal animal);

    public void SoundAnimals(List<Animal> animals);

    public void FlyAnimal(Animal animal);

    public void PetAnimal(Animal animal);

    public void TrainAnimal(Animal animal);
}