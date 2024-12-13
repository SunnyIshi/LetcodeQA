package LeetcodeOperation;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {"C:\\Users\\GCOM\\eclipse-workspace\\LeetcodeDemo\\src\\test\\resources\\features\\WorlspaceletcodeWaits.feature"},
		glue= {"LeetcodeOperation"},
		plugin= {"pretty","html:target/leetcodedemo.html"})


public class testRunner extends AbstractTestNGCucumberTests {

}
