package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    @Test
    public void testAdd() {
        //given
        Date birthDate = new Date(1990, 8, 29);
        Dog dog = new Dog("hiep", birthDate, 123);

        //when
        DogHouse.add(dog);
        Dog actual = DogHouse.getDogById(123);


        //then
        Assert.assertEquals(dog, actual);
    }

    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void testRemoveId(){
        //given
        Date birthDate = new Date(1990, 8, 29);
        Dog dog = new Dog("hiep", birthDate, 123);

        DogHouse.add(dog);
        Dog expected2 = DogHouse.getDogById(123);

        Assert.assertEquals(expected2,dog);

        DogHouse.remove(123);
        Dog expected = DogHouse.getDogById(123);

        Assert.assertEquals(null,expected);

    }

    // TODO - Create tests for `void remove(Dog dog)`
    @Test
    public void testRemoveDogId(){
        //given
        Date birthDate = new Date(1990, 8, 29);
        Dog dog = new Dog("hiep", birthDate, 123);

        DogHouse.add(dog);
        Dog expected2 = DogHouse.getDogById(123);

        Assert.assertEquals(expected2,dog);

        DogHouse.remove(dog);
        Dog expected = DogHouse.getDogById(123);

        Assert.assertEquals(null,expected);
    }


    @Test
    public void testRemoveDog() {
        //given
        Date birthDate = new Date(1990, 8, 29);
        Dog dog = new Dog("hiep", birthDate, 123);

        //when
        DogHouse.add(dog);
        DogHouse.getDogById(123);

        DogHouse.remove(dog);
        Dog actual = DogHouse.getDogById(123);

        //then
        Assert.assertEquals(null,actual);
    }


    // TODO - Create tests for `Dog getDogById(Integer id)`
    @Test
    public void testGetDogById(){
        //given
        Date birthDate = new Date(1990, 8, 29);
        Dog dog = new Dog("hiep", birthDate, 123);

        //when

        //then

    }

    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }
}
