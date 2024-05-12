package utils;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class ResuableMethods {


    public static void koordinatTiklamaMethodu(int xKoordinati,int yKoordinati,int beklemeSuresi ) throws InterruptedException {
        TouchAction action=new TouchAction<>(Driver.getAndroidDriver());
        action.press(PointOption.point(xKoordinati,yKoordinati))
                .release()
                .perform();
        Thread.sleep(beklemeSuresi);
    }

    public static void ekranAssagiKaydirma(int waitAction){
        TouchAction action=new TouchAction<>(Driver.getAndroidDriver());
        action.press(PointOption.point(500,1500))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(waitAction)))
                .moveTo(PointOption.point(500,285))
                .release()
                .perform();
    }

    public static void ekranYukariKaydirma(int waitAction){
        TouchAction action=new TouchAction<>(Driver.getAndroidDriver());
        action.press(PointOption.point(500,285))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(waitAction)))
                .moveTo(PointOption.point(500,1500))
                .release()
                .perform();
    }

    public static void scrollScreenMethod(int xKoordtinati,int yKoordinati,int bekleme,int mXKoordinati,int mYKoordinati,int threadSleep) throws InterruptedException {
        TouchAction action=new TouchAction<>(Driver.getAndroidDriver());
        action.press(PointOption.point(xKoordtinati,yKoordinati))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(bekleme)))
                .moveTo(PointOption.point(mXKoordinati,mYKoordinati))
                .release()
                .perform();
        Thread.sleep(threadSleep);

    }

    public static void scrollWithUiScrollable(String elementText) {
        //burdaki browserda BrowserDriver.getBrowserDriver kullanılır
        // Driver.getAndroidDriver kullanılır.
        AndroidDriver driver = (AndroidDriver) Driver.getAndroidDriver();
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"" + elementText + "\"))");
        driver.findElementByXPath("//*[@text='" + elementText + "']").click();

    }

    public static String getScreenshot(String name) throws IOException {
        // naming the screenshot with the current date to avoid duplication
        String date = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        // TakesScreenshot is an interface of selenium that takes the screenshot
        TakesScreenshot ts = (TakesScreenshot)Driver.getAndroidDriver();

        File source = ts.getScreenshotAs(OutputType.FILE);
        // full path to the screenshot location
        String target = System.getProperty("user.dir") + "/target/Screenshots/" + name + date + ".png";
        File finalDestination = new File(target);
        // save the screenshot to the path given
        FileUtils.copyFile(source, finalDestination);
        return target;
    }

    public static void wait(int saniye) {
        try {
            Thread.sleep(saniye * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}