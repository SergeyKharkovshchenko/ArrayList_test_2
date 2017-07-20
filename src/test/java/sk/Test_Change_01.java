package sk;

import org.testng.Assert;
import org.testng.annotations.*;

/**
 * Created by SK on 10.07.2017.
 */

@Listeners(sk.Listener.class)
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
            Main_sk.Singleton x = new Main_sk.Singleton();
            x.populate();
            x.change(numberOfArray, trueOrFalse);
            Assert.assertEquals(trueOrFalse, x.get(numberOfArray));
        }

    public static void main (String[] args) {
        System.out.println("Hello World");
    }

    @AfterMethod()
    public void after() {
        System.out.println("After");
    }


}
