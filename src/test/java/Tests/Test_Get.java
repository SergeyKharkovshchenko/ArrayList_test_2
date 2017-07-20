package Tests;

import org.testng.Assert;
import org.testng.annotations.*;
import sk.Singleton;

/**
 * Created by SK on 10.07.2017.
 */

@Listeners(Listener.class)
public class Test_Get {

    @BeforeMethod()
    public void before() { System.out.println("Before");   }

    @Test()
    public void testGet2() {
        Singleton x  = new Singleton();
        x.populate();
        Assert.assertTrue(x.get().matches(".*a.*"));
    }

    @AfterMethod()
    public void after() {
        System.out.println("After");
    }

}
