//import org.testng.TestNG;

package sk;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SK on 17.07.2017.
 */


public class Runner_Test_Get {
    private TestNG tng;
    private XmlSuite suite;
    private XmlTest test;
    private Listener tl;

    public Runner_Test_Get() {
        suite = new XmlSuite();
        suite.setName("Suite");

        test = new XmlTest(suite);
        test.setName("Test");

        List<XmlClass> classes = new ArrayList<XmlClass>();
        XmlClass getTest = new XmlClass(Test_Get.class);

        classes.add(getTest);
        test.setXmlClasses(classes);

        List<XmlSuite> suites = new ArrayList<XmlSuite>();
        suites.add(suite);
        tng = new TestNG();
        tng.setXmlSuites(suites);
    }

    public TestNG getTestNG() {
        return tng;
    }

    public Listener getListener() {
        return tl;
    }
}