import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Driver {

    private Driver(){

    }
    private static AppiumDriver driver;
    private static  XCUITestOptions options= new XCUITestOptions();
    private static UiAutomator2Options options1= new UiAutomator2Options();
    public static  AppiumDriver  initilazeDriver() throws MalformedURLException {

        if (driver==null) {
            switch (ConfigReader.getProperty("platformName")) {
                case "Android":
                    options1 = new UiAutomator2Options();
                    options1.setPlatformName("Android").setAutomationName("UiAutomator2");
                    //options.setApp("C:\\Users\\Ceren\\Desktop\\Salı_Zip_Elif_Kese_MobileQueryCard\\src\\test\\java\\Apps\\querycart2006.apk");
                    //options.setApp("C:\\Users\\elifk\\IdeaProjects\\MobileQueryCard-main\\src\\test\\java\\Apps\\Apk Bilgisi_2.3.4_apkcombo.com.apk");
                    options1.setAppPackage("com.wise.querycart");
                    options1.setAppActivity("com.wise.querycart.MainActivity");
                    options1.setUdid("emulator-5554");
                    options1.setNoReset(false);
                    options1.autoGrantPermissions();
                    options1.setNewCommandTimeout(Duration.ofMinutes(30));
                    try {
                        driver = new AndroidDriver(
                                new URL("http://0.0.0.0:4723"), options1
                        );
                    } catch (MalformedURLException e) {
                        throw new RuntimeException(e);
                    }

                    break;
                case "iOS":

                    String appUrl=(System.getProperty("user.dir")+ File.separator + "src"+ File.separator+ "main" +
                            File.separator + "resources" + File.separator+ "UIKitCatalog-iphonesimulator.app");
                    options.setApp(appUrl)
                            .setAutomationName("XCUITest")
                            .setDeviceName("iPhone 15")
                            .setPlatformName("ios")
                            .setUdid("E9ABC21F-DC42-4C5F-8F48-F387444D5D2D");

                    driver= new IOSDriver(new URL("http://127.0.0.1:4723"), options);
                    break;

            }

        }

        return driver;
    }


    }




