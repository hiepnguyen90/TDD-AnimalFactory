package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    @Test
            public void testSetName() {
        //given
        Cat cat = AnimalFactory.createCat(null, null);
        String name = "Zula";
        //when
        cat.setName(name);
        //then
        Assert.assertEquals(name,cat.getName());
    }


    // TODO - Create tests for `speak`
    @Test
    public void testSpeak(){
        //given
        Cat cat = AnimalFactory.createCat(null, null);

        //when
        cat.speak();

        //then

        Assert.assertEquals("meow!", cat.speak());

    }
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void testSetBirthDate(){
    //given
        Cat cat = AnimalFactory.createCat(null, null);
        Date birthDate = new Date(1990, 8, 29);

    //when
        cat.getBirthDate();

    //then

        Assert.assertEquals(birthDate, cat.getBirthDate());
    }

    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void testEat() {
        //given
        Cat cat = AnimalFactory.createCat(null, null);

        //when
        cat.eat(new Food());
        int expected = 1;
        int actual = cat.getNumberOfMealsEaten();

        //then

        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `Integer getId()`

    @Test
    public void getIntegerGetId(){
        //given
        Cat cat = AnimalFactory.createCat(null, null);
        Integer givenId = 0;


        //when
        cat.getId();


        //then
        Assert.assertEquals(givenId,cat.getId());
    }



    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void testInheritance(){
        Cat cat = AnimalFactory.createCat(null, null);
        Assert.assertTrue(cat instanceof Animal);
    }



    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void testMammalInheritance(){
        Cat cat = AnimalFactory.createCat(null, null);
        Assert.assertTrue(cat instanceof Mammal);
    }


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);



    }

}
