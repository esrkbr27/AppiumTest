import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Gestures {
    AppiumDriver driver=Driver.initilazeDriver();

    public Gestures() throws MalformedURLException {
    }

    public static void swipeGestures(AppiumDriver driver){
     //   RemoteWebElement e = (RemoteWebElement) driver.findElement(AppiumBy.accessibilityId("target element"));
        driver.executeScript("mobile: swipe", ImmutableMap.of(
        //        "velocity", 2500,
                "direction", "down"));
        //        "elementId", e.getId() ));
    }

    public static void scrollGesture(AppiumDriver driver){

        driver.executeScript("mobile: scroll", ImmutableMap.of(
                "direction", "down"
        ));
    }


    public static void tap(AppiumDriver driver){
      //  RemoteWebElement e = (RemoteWebElement) driver.findElement(AppiumBy.accessibilityId("Picker View"));
        driver.executeScript("mobile: tap", ImmutableMap.of(
       //         "elementId", e.getId(),
                "x", 19,
                "y", 366
        ));
    }

    public static void clickElement(AppiumDriver driver){
        driver.findElement(AppiumBy.iOSNsPredicateString("name == \"Image View\"")).click();
    }

    public static void takeScreenShot(AppiumDriver driver) throws IOException {
        String date= new SimpleDateFormat("yyyyMMhhdd").format(new Date());
        TakesScreenshot ts= Driver.initilazeDriver();

        File source= ts.getScreenshotAs(OutputType.FILE);

        String target= System.getProperty("user.dir")+ "/target/Screenshots/"+ source.getName() + date + ".png";
        File finaldestination= new File(target);
        FileUtils.copyFile(source, finaldestination);

    }

}
