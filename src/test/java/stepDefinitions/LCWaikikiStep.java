package stepDefinitions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.LCWPage;
import utils.Driver;
import utils.ResuableMethods;

public class LCWaikikiStep {

    LCWPage lcwPage=new LCWPage();
    AndroidDriver<AndroidElement> driver = Driver.getAndroidDriver();

    @Given("{string} kismina tikla")
    public void kismina_tikla(String kategoriler) {

        ResuableMethods.scrollWithUiScrollable(kategoriler);


    }
    @Given("Kategoriler bolumunden {string} linkine tikla")
    public void kategoriler_bolumunden_linkine_tikla(String erkek) {

        ResuableMethods.scrollWithUiScrollable(erkek);

    }
    @Given("Erkek kismından {string} ya tikla")
    public void erkek_kismından_ya_tikla(String ayakkabi) {


        Actions actions = new Actions(driver);
        for (int i = 0; i < 2; i++) { // 5 kez kaydırır
            actions.sendKeys(org.openqa.selenium.Keys.PAGE_DOWN).perform();
        }
        ResuableMethods.wait(3);
        ResuableMethods.scrollWithUiScrollable(ayakkabi);




    }
    @Given("Ayakkabı bolumunden {string} a tikla")
    public void ayakkabı_bolumunden_a_tikla(String bot) {


        ResuableMethods.scrollWithUiScrollable(bot);
    }


    @Given("{string}  butonuna tikla")
    public void butonuna_tikla(String beden) {

        ResuableMethods.scrollWithUiScrollable(beden);

    }
    @Given("{string} kismina tikla ve arama kismina ilgili bedeni\\({int}) yaz gelen kutucugu isaretle")
    public void kismina_tikla_ve_arama_kismina_ilgili_bedeni_yaz_gelen_kutucugu_isaretle(String beden, Integer int1) throws InterruptedException {

        ResuableMethods.scrollWithUiScrollable(beden);
        ResuableMethods.wait(3);

        lcwPage.searchbox.sendKeys("42");


        ResuableMethods.wait(2);
        ResuableMethods.koordinatTiklamaMethodu(74,329,3);


    }
    @Given("{string} kismina tiklaa")
    public void kismina_tiklaa(String uygula) {

ResuableMethods.scrollWithUiScrollable(uygula);

    }
    @Given("{string} yi tikla ve arama kismina bot yaz ve ara gelen kutucugu isaretle")
    public void yi_tikla_ve_arama_kismina_bot_yaz_ve_ara_gelen_kutucugu_isaretle(String uruntipi) throws InterruptedException {

        ResuableMethods.scrollWithUiScrollable(uruntipi);

        lcwPage.searchbox.sendKeys("Bot");
        ResuableMethods.wait(3);

        ResuableMethods.koordinatTiklamaMethodu(74,329,3);
        ResuableMethods.scrollWithUiScrollable("Uygula");

    }
    @Given("{string} i tikla ve {string} sec ve {string} ya tikla")
    public void i_tikla_ve_sec_ve_ya_tikla(String bot, String siyah, String uygula) {

        ResuableMethods.scrollWithUiScrollable(bot);
        ResuableMethods.wait(2);

        lcwPage.searchbox.sendKeys("Siyah");

        // Beklenen kelime
        String expectedKelime = "Siyah";

       String actualKelime=lcwPage.gelenkelime.getText();

       Assert.assertTrue(actualKelime.contains(expectedKelime));

    }
}
