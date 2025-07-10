import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class DigitalTagRegister {

    public static void main(String[] args) throws IOException {

        XCUITestOptions options= new XCUITestOptions();
        options.setApp(System.getProperty("user.dir")+ File.separator + "src"+ File.separator+ "main" +
                        File.separator + "resources" + File.separator+ "DigitalTag.app").
                setAutomationName("XCUITest").
                setDeviceName("iPhone 15").
                setPlatformName("iOS").
                setUdid("E9ABC21F-DC42-4C5F-8F48-F387444D5D2D");

        //Uygulama açılır
        AppiumDriver driver= new IOSDriver(new URL("http://127.0.0.1:4723"), options);

        //Kayıt ekranında bayi kodu girilir
        driver.findElement(AppiumBy.className("XCUIElementTypeTextField")).sendKeys("003100");
        Gestures.wait(3);
        //Klavyede "Git" butonuna tıklanır
        driver.findElement(AppiumBy.accessibilityId("Go")).click();

         Gestures.tap(driver,30,621);

    }


}
