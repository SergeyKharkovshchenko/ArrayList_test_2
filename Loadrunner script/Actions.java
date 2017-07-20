/*
 * LoadRunner Java script. (Build: 3020)
 * 
 * Script Description: 
 *                     
 */

import lrapi.lr;
import sk.*; 
import Runners.*; 
import Tests.*; 
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

        lr.start_transaction("Runner_Test_Get");
		get1.getTestNG().run();
		 if (get1.getTestNG().hasFailure()) {
        lr.end_transaction("Runner_Test_Get",lr.FAIL);			
		} else {
        lr.end_transaction("Runner_Test_Get", lr.PASS);			
		}

		lr.start_transaction("Runner_Test_Change_01");
		get2.getTestNG().run();
		 if (get2.getTestNG().hasFailure()) {
        lr.end_transaction("Runner_Test_Change_01",lr.FAIL);			
		} else {
        lr.end_transaction("Runner_Test_Change_01", lr.PASS);			
		}
		
		lr.start_transaction("Runner_Test_Change_02");
		get3.getTestNG().run();
		if (get3.getTestNG().hasFailure()) {
        lr.end_transaction("Runner_Test_Change_02",lr.FAIL);			
		} else {
        lr.end_transaction("Runner_Test_Change_02", lr.PASS);			
		}
               
		return 0;
	}//end of action

	public int end() throws Throwable {
		return 0;
	}//end of end
}
