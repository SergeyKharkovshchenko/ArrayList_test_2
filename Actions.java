/*
 * LoadRunner Java script. (Build: 3020)
 * 
 * Script Description: 
 *                     
 */

import lrapi.lr;
import sk.*; 
import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

public class Actions
{
		Runner_Test_Get get1 = new Runner_Test_Get();    
		Runner_Test_Change_01 get2 = new Runner_Test_Change_01();    
		Runner_Test_Change_02 get3 = new Runner_Test_Change_02();  
	
	public int init() throws Throwable {
		
		  
		return 0;
	}//end of init


	public int action() throws Throwable {

		get1.getTestNG().run();
		get2.getTestNG().run();
        get3.getTestNG().run();
                
		return 0;
	}//end of action


	public int end() throws Throwable {
		return 0;
	}//end of end
}
