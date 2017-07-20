package sk;

import org.testng.Assert;
import org.testng.annotations.*;

/**
 * Created by SK on 10.07.2017.
 */

public class Test_Get {

    @BeforeMethod()
    public void before() { System.out.println("Before");   }

    @Test()
    public void testGet2() {
        Main_sk.Singleton x  = new Main_sk.Singleton();
        x.populate();
        Assert.assertTrue(x.get().matches(".*a.*"));
    }

    @AfterMethod()
    public void after() {
        System.out.println("After");
    }

}
