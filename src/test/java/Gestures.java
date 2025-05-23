import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumDriver;

import java.net.MalformedURLException;

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

}
