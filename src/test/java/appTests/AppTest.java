package appTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import login.App;

public class AppTest {
  @Test(enabled =true,description ="Login with valid Details")
  public void loginTest1() throws Exception {
	  App ap = new App();
	  boolean status = ap.userLogin("userdemo", "password");
	  Assert.assertTrue(status);
	  
  }
  @Test(enabled =true,description ="Login with Invalid Details")
  public void loginTest2() throws Exception {
	  App ap = new App();
	  boolean status = ap.userLogin("userdemo", "password123");
	  Assert.assertFalse(status);
	  
  }
}
