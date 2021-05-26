package  com.itestlistener;

import java.io.IOException;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.testbase.TestBase;
import com.testbase.TestBase;

public class CustomListener extends TestBase implements ITestListener {
	
	    public void onTestStart(ITestResult result) {
	        // TODO Auto-generated method stub
	        
	    }
	    
	    public void onTestSuccess(ITestResult result) {
	        // TODO Auto-generated method stub
	        
	    }

	 

	    public void onTestFailure(ITestResult result) {
	        System.out.println("FAILED Test");
	        failed(result.getMethod().getMethodName());
	        
	    }

	 

	    public void onTestSkipped(ITestResult result) {
	        // TODO Auto-generated method stub
	        
	    }

	 

	    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	        // TODO Auto-generated method stub
	        
	    }

	 

	    public void onTestFailedWithTimeout(ITestResult result) {
	        // TODO Auto-generated method stub
	        
	    }

	 

	    public void onStart(ITestContext context) {
	        // TODO Auto-generated method stub
	        
	    }

	 

	    public void onFinish(ITestContext context) {
	        // TODO Auto-generated method stub
	        
	    }
}