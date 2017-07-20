//import org.testng.TestNG;

package Runners;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;
import Tests.Listener;
import Tests.Test_Change_02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by SK on 17.07.2017.
 */

public class Runner_Test_Change_02 {
    private TestNG tng;
    private XmlSuite suite;
    private XmlTest test;
    private Listener tl;

    public Runner_Test_Change_02() {
        suite = new XmlSuite();
        suite.setName("Suite");

        test = new XmlTest(suite);
        test.setName("Test");

        List<XmlClass> classes = new ArrayList<XmlClass>();
        XmlClass getTest = new XmlClass(Test_Change_02.class);

        HashMap<String,String> parameters = new HashMap<String,String>();
        parameters.put("trueOrFalse2", "True");
        getTest.setParameters(parameters);

        classes.add(getTest);
        test.setXmlClasses(classes);

        List<XmlSuite> suites = new ArrayList<XmlSuite>();
        suites.add(suite);
        tng = new TestNG();
        tng.setXmlSuites(suites);
        //   <parameter name="trueOrFalse2" value="Pass"/>
    }

    public TestNG getTestNG() {
        return tng;
    }

    public Listener getListener() {
        return tl;
    }
}
