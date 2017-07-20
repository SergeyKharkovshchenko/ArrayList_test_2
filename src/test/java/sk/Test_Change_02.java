package sk;

import org.testng.Assert;
import org.testng.annotations.*;

/**
 * Created by SK on 10.07.2017.
 */

@Listeners(sk.Listener.class)
public class Test_Change_02 {

    @BeforeMethod()
    public void before() { System.out.println("Before");   }

        @Test()
        @Parameters("trueOrFalse2")
        public void testChange2(@Optional("test") final String trueOrFalse2) {
//      public void testChange2(final String trueOrFalse2) {
            Main_sk.Singleton x  = new Main_sk.Singleton();
            x.populate();
            x.change(5, trueOrFalse2);
            Assert.assertEquals(trueOrFalse2, x.get(5));
        }

    @AfterMethod()
    public void after() {
        System.out.println("After");
    }

}
