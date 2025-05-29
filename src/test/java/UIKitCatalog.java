import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.Point;
import org.openqa.selenium.devtools.v85.input.model.TouchPoint;

import java.io.IOException;
import java.net.MalformedURLException;

public class UIKitCatalog {



    public static void main(String[] args) throws IOException {
        AppiumDriver driver=Driver.initilazeDriver();
        Gestures.tap(driver,0,185);

    }
}
