package Tests;

import org.testng.Assert;
import org.testng.annotations.*;
import sk.Singleton;

/**
 * Created by SK on 10.07.2017.
 */

@Listeners(Listener.class)
public class Test_Change_01 {

    @BeforeMethod()
    public void before() { System.out.println("Before");   }

    @DataProvider
    public Object[][] ValidDataProvider() {
        return new Object[][]{
                {25, "Pass"}, {65, "Fail"},
                {15, "Pass"}, {55, "Fail"},
        };
    }

    @Test(dataProvider = "ValidDataProvider")
         public void testChange1(final int numberOfArray, final String trueOrFalse) {
            Singleton x = new Singleton();
            x.populate();
            x.change(numberOfArray, trueOrFalse);
            Assert.assertEquals(trueOrFalse, x.get(numberOfArray));
        }

    @AfterMethod()
    public void after() {
        System.out.println("After");
    }


}
