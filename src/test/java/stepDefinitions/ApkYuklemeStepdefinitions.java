package stepDefinitions;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.java.en.Given;
import org.openqa.selenium.remote.DesiredCapabilities;
import utils.ConfigReader;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class ApkYuklemeStepdefinitions {


    @Given("Kullanici gerekli path degerlini girerek apk yukleme {string} islemi gerceklestirir")
    public void kullanici_gerekli_path_degerlini_girerek_apk_yukleme_islemi_gerceklestirir(String apkDosyaYolu) throws MalformedURLException {

        AndroidDriver<AndroidElement> driver;

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "PIXEL");// capabilities.setCapability("deviceName","Pixel 2");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        capabilities.setCapability(MobileCapabilityType.APP, ConfigReader.getProperty(apkDosyaYolu));
        // UiAutomator 2 otomasyon ismi sadece android 6 dan yuksek olan android sistemleri icin calisir
        // UiAutomator otomasyon ismi sadece android 6 ve 6 dan dusuk olan android sistemleri icin calisir
        driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);


    }


}

