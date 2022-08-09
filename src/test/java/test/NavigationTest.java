package test;

import org.testng.annotations.Test;

import driverManager.Base;

import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class NavigationTest extends Base {
 
  
  @BeforeClass
  public void beforeClass() {
  setUp("chrome", "https://www.facebook.com/");
  
  }
  
  //1. navigation command
  //2.get commands
  //3.locators
  //4. is enabled commands 
  //.click commands
  @Test
  public void navigateto() throws InterruptedException {
	  driver.navigate().to("https://www.youtube.com/");
	  Thread.sleep(3000);
	  driver.navigate().back();
	  Thread.sleep(3000);
	  driver.navigate().refresh();
	
  }
  
  @Test
  public void getcommands() {
	 String actualurl= driver.getCurrentUrl();
	 String expectedUrl="https://www.facebook.com/";
	 String actualtitle = driver.getTitle();
	 String expectedtitle="Facebook - log in or sign up";
	 Assert.assertEquals(actualurl, expectedUrl);
	 Assert.assertTrue(actualtitle.contains(expectedtitle), "Title is not correct" + actualurl);
  System.out.println("I am pushing this fpr demo purposes only");
  
  }
 
  @AfterClass
  public void afterClass() {
	  teardown();
  }

}
