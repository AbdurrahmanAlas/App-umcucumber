package stepDefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.ArabamComPage;
import utils.ResuableMethods;

public class ArabamcomMESAJLARStepdefinitions {

    ArabamComPage arabamComPage=new ArabamComPage();

    @Given("{string} a tiklaa")
    public void a_tiklaa(String mesajlar) {

        ResuableMethods.scrollWithUiScrollable(mesajlar);


    }
    @Given("Son gelen mesaja tikla mesajı yaz gonder")
    public void son_gelen_mesaja_tikla_mesajı_yaz_gonder() {

        arabamComPage.mesajlar_SON.click();
        arabamComPage.mesajlar_mesajyaz.sendKeys("Merhaba aracımız hala satılıktır.");

        ResuableMethods.scrollWithUiScrollable("Gönder");

        String expectedKelime="Merhaba aracımız hala satılıktır.";
        String actualKelime=arabamComPage.mesajlar_Mesajyazıldımıkontrol.getText();

        Assert.assertTrue(actualKelime.contains(expectedKelime));

    }


    @Given("Son gelen mesaja tikla")
    public void son_gelen_mesaja_tikla() {

        arabamComPage.mesajlar_SON.click();


    }
    @Given("{string} linkine tikla")
    public void linkine_tikla(String tum_ilanlari_goster) {

        ResuableMethods.scrollWithUiScrollable("Tüm İlanlarını Göster");

        ResuableMethods.wait(3);
        Assert.assertTrue(arabamComPage.mesajlar_TumIlanlarGeldimi.isDisplayed());


    }
    @Given("Üc noktayaa tikla")
    public void üc_noktayaa_tikla() {

        arabamComPage.mesajlar_ucnokta.click();


    }
    @Given("{string} butonuna tikla ve dogrula")
    public void butonuna_tikla_ve_dogrula(String vazgec) {


        ResuableMethods.scrollWithUiScrollable(vazgec);

        Assert.assertTrue(arabamComPage.mesajlar_ucnokta.isDisplayed());


    }



}
