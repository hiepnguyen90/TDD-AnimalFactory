package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    @Test
    public void  testNewDog() {
        String givenName = "Bella";
        Date getBirthDate = new Date();
        Integer givenId = 123;

        Dog dog = new Dog(givenName, getBirthDate, givenId);

        Assert.assertEquals(dog.getName(),getBirthDate, givenId);
    }

    // TODO - Create tests for `speak`
    @Test
    public void testSpeak(){

       //given
        Dog dog = AnimalFactory.createDog(null, null);

        //when
        dog.speak();

        //then

        Assert.assertEquals("bark!", dog.speak());
    }
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void testBirthDate(){
       //given
        Date birthDate = new Date(1990, 8, 29);
        Dog dog = AnimalFactory.createDog(null, null);


        //when
        dog.setBirthDate(birthDate);


        //then
        Assert.assertEquals(birthDate, dog.getBirthDate());


    }
    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void foodTest(){
        //given
        Dog dog = AnimalFactory.createDog(null,null);

        //when
        dog.eat(new Food());
        dog.eat(new Food());

        int expected = 2;
        int actual = dog.getNumberOfMealsEaten();

        //then
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `Integer getId()`
    @Test
        public void testIntegerId() {
        String givenName = "Bella";
        Date getBirthDate = new Date();
        Integer givenId = 123;

        Dog dog = new Dog(givenName, getBirthDate, givenId);
        Assert.assertEquals(dog.getId(), givenId);

    }

    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void testAnimalInheritance(){
        Dog dog = AnimalFactory.createDog(null, null);
        Assert.assertTrue(dog instanceof Animal);
    }

    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void testMammalInheritance() {
        Dog dog = AnimalFactory.createDog(null, null);
        Assert.assertTrue(dog instanceof Mammal);
    }

    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
}
