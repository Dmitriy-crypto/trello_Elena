import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;

public class TestBase {
  AppiumDriver driver;

  @BeforeMethod
  public void setUp() throws MalformedURLException {
    DesiredCapabilities capabilities = new DesiredCapabilities();
    capabilities.setCapability("platformName", "Android");
    capabilities.setCapability("deviceName", "qa21");
    capabilities.setCapability( "platformVersion", "8.0");
    capabilities.setCapability("automationName", "Appium");
    capabilities.setCapability( "appPackage", "com.trello");
    capabilities.setCapability("appActivity",".home.HomeActivity");
    capabilities.setCapability("app",
            "C:/Users/Elena/Dropbox/Tel-ran/Mobile/apk/Trello_new.apk");

driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
  }

  @AfterMethod
  public void tearDown(){

  }
}
