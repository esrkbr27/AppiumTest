import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class DriverDesiredCapability {

    public static void main(String[] args) throws MalformedURLException {

        DesiredCapabilities caps= new DesiredCapabilities();
        String appurl= System.getProperty("user.dir") + File.separator + "src" + File.separator +
                "main"+ File.separator + "resources"+ File.separator+  "UIKitCatalog-iphonesimulator.app";
    //    caps.setCapability(MobileCapabilityType.APP, appurl);
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 15");
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ios");
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
        caps.setCapability(MobileCapabilityType.UDID, "E9ABC21F-DC42-4C5F-8F48-F387444D5D2D");
        caps.setCapability("bundleId", "com.example.apple-samplecode.UICatalog");
        caps.setCapability("simulatorStartupTimeout", 18000);

        URL url= new URL("http://127.0.0.1:4723");

        AppiumDriver driver= new IOSDriver(url, caps);
    }
}
