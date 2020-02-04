package tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.URL;

public class Base {

    AppiumDriver<MobileElement> driver;

    @BeforeTest
    public void setup(){

        try {
            DesiredCapabilities decaps = new DesiredCapabilities();

            decaps.setCapability("deviceName","SM-G950F");
            decaps.setCapability("udid","ce041714521ee4690d");
            decaps.setCapability("platformName","Android");
            decaps.setCapability("platformVersion","9");
            decaps.setCapability("appPackage","com.example.android.uamp");
            decaps.setCapability("appActivity","com.example.android.uamp.ui.MusicPlayerActivity");

            URL url = new URL("http://127.0.0.1:4723/wd/hub");

            driver = new AppiumDriver<MobileElement>(url, decaps);

        }catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    @AfterTest
    public void teardown(){
        driver.close();
        driver.quit();
    }
}
