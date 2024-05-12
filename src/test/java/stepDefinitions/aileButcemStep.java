package stepDefinitions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.Given;
import pages.AppPage.AileButcemPage;
import utils.ConfigReader;
import utils.Driver;
import utils.ResuableMethods;

import java.time.Duration;

public class aileButcemStep {

    AndroidDriver<AndroidElement> driver = Driver.getAndroidDriver();
    TouchAction action = new TouchAction<>(driver);

    AileButcemPage aileButcemPage=new AileButcemPage();


    @Given("kullanıcı kurulumları tamamlar")
    public void kullanıcı_kurulumları_tamamlar() {

        Driver.getAndroidDriver();
    }


    @Given("ilk ekran ayarlarini yapin {string} a tiklayin ve ardindan login sayfasina ulasin")
    public void ilk_ekran_ayarlarini_yapin_a_tiklayin_ve_ardindan_login_sayfasina_ulasin(String girisyap) {

        ResuableMethods.wait(5);
        for (int i = 0; i < 6; i++) {

            action.press(PointOption.point(858, 968)).
                    waitAction(WaitOptions.waitOptions(Duration.ofMillis(500))).
                    moveTo(PointOption.point(128, 968)).release().perform();
        }


        ResuableMethods.wait(3);
        ResuableMethods.scrollWithUiScrollable(girisyap);
    }



    @Given("{string} ve {string} bilgilerini girerek kullanici bilgileriyle {string} a tikla")
    public void ve_bilgilerini_girerek_kullanici_bilgileriyle_a_tikla(String mail, String password, String girisyap) {
        ResuableMethods.wait(10);
        aileButcemPage.emailAdres.sendKeys(ConfigReader.getProperty(mail));
        aileButcemPage.password.sendKeys(ConfigReader.getProperty(password));
        ResuableMethods.scrollWithUiScrollable(girisyap);
    }

    @Given("uygulamaya kullanici bilgileriyle giris yapildigini dogrulayin")
    public void uygulamaya_kullanici_bilgileriyle_giris_yapildigini_dogrulayin() {

        aileButcemPage.girisBasariliMethodu();


    }




    @Given("sol kisimdaki menuden {string} bolumune gidin")
    public void sol_kisimdaki_menuden_bolumune_gidin(String hesabım) {
        ResuableMethods.wait(7);
        aileButcemPage.solustmenu.click();
        ResuableMethods.scrollWithUiScrollable(hesabım);

    }


    @Given("hesabim sayfasindaki bilgileri {string} {string} {string} {string} {string} degistirerek degisikleri kaydedin")
    public void hesabim_sayfasindaki_bilgileri_degistirerek_degisikleri_kaydedin(String isim, String soyisim, String sehir, String yas, String meslek) {

        aileButcemPage.HesabımBilgiDegisikligi(isim,soyisim,sehir,yas,meslek,"Kaydet");

    }



    @Given("ardindan degisiklerin yapildigini dogrulayin")
    public void ardindan_degisiklerin_yapildigini_dogrulayin() {

    aileButcemPage.HesabımBilgiDegisikligiAssert();

    }

}
