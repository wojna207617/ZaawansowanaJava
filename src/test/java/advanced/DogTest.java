package advanced;

import junit.framework.TestCase;

/**
 * Created by Scy on 07/03/2017.
 */
public class DogTest extends TestCase {
    Dog dog=null;
    public void setUp() throws Exception {
        super.setUp();
        dog=new Dog();

    }

    public void testBark() throws Exception {
        assertEquals(dog.Bark(), "Bark! Bark!");
    }

}