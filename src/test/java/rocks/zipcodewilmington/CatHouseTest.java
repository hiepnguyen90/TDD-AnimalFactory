package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.AnimalWarehouse;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    @Test
    public void testAddCat(){
        //given
        Date birthDate = new Date();
        Cat cat = new Cat("Hiep", birthDate, 123);


        //when
        CatHouse.add(cat);
        Cat actual = CatHouse.getCatById(123);

        //then
        Assert.assertEquals(cat, actual);
    }


    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void testRemoveId(){
        //given
        Date birthDate = new Date();
        Cat cat = new Cat("Andre", birthDate, 321);

        //when
        CatHouse.add(cat);
        Cat actual2 = CatHouse.getCatById(321);

        Assert.assertEquals(cat, actual2);

        CatHouse.remove(321);
        Cat actual = CatHouse.getCatById(321);

        //then

        Assert.assertEquals(null, actual);

    }

    // TODO - Create tests for `void remove(Cat cat)`
    @Test
    public void testRemove(){
        //given
        Date birthDate = new Date();
        Cat cat = new Cat("Hiep", birthDate, 321);


        //when
        CatHouse.add(cat);
        Cat actual2 = CatHouse.getCatById(321);
        Assert.assertEquals(cat, actual2);

        CatHouse.remove(cat);
        Cat actual = CatHouse.getCatById(321);

        //then
        Assert.assertEquals(null, actual);

    }

    // TODO - Create tests for `Cat getCatById(Integer id)`
    @Test
    public void testGetCatById(){
        //given
        Date birthDate = new Date();
        Cat cat = new Cat("Hiep", birthDate, 321);

        //when
        CatHouse.add(cat);
        Cat actual = CatHouse.getCatById(321);


        //then
        Assert.assertEquals(cat, actual);
    }

    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void testGetNumberOfCats(){
        //given
        Date birthDate = new Date();
        Cat cat = AnimalFactory.createCat("Hiepberto", birthDate);

        //when
        CatHouse.clear();

        CatHouse.add(cat);
        int actual = CatHouse.getNumberOfCats();


        //then
        Assert.assertEquals(1, actual);

    }
}
