import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class DriverXCUITest {

    public static void main(String[] args) throws MalformedURLException {

        XCUITestOptions options= new XCUITestOptions();
               options.setApp(System.getProperty("user.dir")+ File.separator + "src"+ File.separator+ "main" +
                               File.separator + "resources" + File.separator+ "UIKitCatalog-iphonesimulator.app").
                setAutomationName("XCUITest").
                setDeviceName("iPhone 15").
                setPlatformName("iOS").
                setUdid("E9ABC21F-DC42-4C5F-8F48-F387444D5D2D");

        AppiumDriver driver= new IOSDriver(new URL("http://127.0.0.1:4723"), options);

        driver.findElement(AppiumBy.accessibilityId("ActivityIndicatorViewController")).click();
    }

}
