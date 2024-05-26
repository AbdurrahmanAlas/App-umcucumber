package stepDefinitions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.ArabamComPage;
import utils.Driver;
import utils.ResuableMethods;

import java.time.Duration;

public class ArabamcomHASARSORGULA {

    AndroidDriver<AndroidElement> driver = Driver.getAndroidDriver();
    TouchAction action = new TouchAction<>(driver);

    ArabamComPage arabamComPage = new ArabamComPage();

    @Given("Plakayi gir ve sorgula butonuna tikla")
    public void plakayi_gir_ve_sorgula_butonuna_tikla() {

        arabamComPage.plakayi_girin.sendKeys("38 LY 562");
        ResuableMethods.scrollWithUiScrollable("Sorgula");


    }


    @Given("{string} ve {string} ye tikla ve adresi ekle")
    public void ve_ye_tikla_ve_adresi_ekle(String adres_Ekle, String kaydet) throws InterruptedException {

        ResuableMethods.scrollWithUiScrollable(adres_Ekle);

        arabamComPage.adres_yaz.sendKeys("Zümrüt mahallesi");
        arabamComPage.adres_ilsec.click();
        ResuableMethods.wait(5);

        for (int i = 0; i < 4; i++) {

            action.press(PointOption.point(827, 2211)).
                    waitAction(WaitOptions.waitOptions(Duration.ofMillis(500))).
                    moveTo(PointOption.point(827, 900)).release().perform();

        }


      driver.navigate().back();

        //       ResuableMethods.ekranKaydirmaMethodu(851, 2211, 10, 851, 662);

//851 2211    // 662 2211

        arabamComPage.tckimlikno.sendKeys("12345678012");
        arabamComPage.vergidairesi.sendKeys("Gevher");
        arabamComPage.vergiNo.sendKeys("123456");


        ResuableMethods.wait(2);
        ResuableMethods.scrollWithUiScrollable("Kredi Kartı");

        arabamComPage.kredikarti_no.click();
        ResuableMethods.wait(2);
        arabamComPage.kredikarti_no.sendKeys("1234123412341234");

        ResuableMethods.wait(1);

        ResuableMethods.ekranSagaKaydirma(4);

        arabamComPage.kredikarti_adSoyad.sendKeys("Abdurrahman Alas");

        ResuableMethods.ekranSagaKaydirma(3);
        ResuableMethods.wait(1);
        arabamComPage.kredikarti_tarih.click();
        ResuableMethods.wait(2);

        arabamComPage.kredikarti_tarih.sendKeys("1225");

        ResuableMethods.ekranSagaKaydirma(5);
        arabamComPage.kredikarti_guvenlikkod.sendKeys("356");
        arabamComPage.kredikarti_guvenlikkod.click();
        ResuableMethods.ekranSagaKaydirma(4);








//        arabamComPage.kredikarti_guvenlikkod.sendKeys("345");
//        ResuableMethods.wait(2);
//        arabamComPage.kredikarti_guvenlikkod.click();


        ResuableMethods.wait(2);
        //762 2066


        ResuableMethods.scrollWithUiScrollable("Devam");

//        ResuableMethods.scrollWithUiScrollable("Ankara");
//        arabamComPage.adres_ilcesec.click();
//        ResuableMethods.wait(2);
//        ResuableMethods.scrollWithUiScrollable("Bala");
//        arabamComPage.adres_semtsec.click();
//        ResuableMethods.wait(2);
//        ResuableMethods.scrollWithUiScrollable("Abazlı Mahallesi");
//        arabamComPage.adres_postakodusec.sendKeys("38020");


    }


    @Given("Telefon E-Posta* TC Kimlik Numarası Vergi Dairesi Vergi No Kredi Kartı na tikla ve islemleri yap ve yapildigini dogrula")
    public void telefon_e_posta_tc_kimlik_numarası_vergi_dairesi_vergi_no_kredi_kartı_na_tikla_ve_islemleri_yap_ve_yapildigini_dogrula() {

        arabamComPage.eposta.clear();
        ResuableMethods.wait(2);
        arabamComPage.eposta.sendKeys("serkan11aydin@gmail.com");
        arabamComPage.tckimlikno.sendKeys("12345678910");
        arabamComPage.vergidairesi.sendKeys("GevherNesibe");
        arabamComPage.vergiNo.sendKeys("12345678910");

        ResuableMethods.wait(2);
        ResuableMethods.scrollWithUiScrollable("Kredi Kartı");






    }


    @Given("{string} e tiklaa")
    public void e_tiklaa(String ekspertiz) {

        ResuableMethods.scrollWithUiScrollable(ekspertiz);

        ResuableMethods.wait(4);
        ResuableMethods.scrollWithUiScrollable("Şubeleri incele");


    }

    @Given("Ekspertiz sayfasinin acildigini dogrula")
    public void ekspertiz_sayfasinin_acildigini_dogrula() {

        String expectedKelime = "Ekspertiz";
        String actualKelime = arabamComPage.ekspertizsayfasigeldimi.getText();

        Assert.assertTrue(actualKelime.contains(expectedKelime));

    }


    @Given("{string} linke tikla")
    public void linke_tikla(String subeleri_incele) {

        ResuableMethods.wait(2);
        ResuableMethods.scrollWithUiScrollable(subeleri_incele);


    }

    @Given("{string} dropdowna tikla ve {string} sec ve {string} a bas")
    public void dropdowna_tikla_ve_sec_ve_a_bas(String seciniz, String kayseri, String tamam) {

        ResuableMethods.scrollWithUiScrollable(seciniz);
        ResuableMethods.wait(3);
        ResuableMethods.scrollWithUiScrollable(kayseri);
        ResuableMethods.scrollWithUiScrollable(tamam);


        String expectedKelime = "Ankara";
        String actualKelime = arabamComPage.adres_geldimi.getText();
        Assert.assertTrue(actualKelime.contains(expectedKelime));


    }


    @Given("Şubeleri incele linke tikla")
    public void şubeleri_incele_linke_tikla() {

    }


    @Given("{string} a bas {string} , {string} , {string} ,{string} , tıkla acılıyormu kontrol et")
    public void a_bas_tıkla_acılıyormu_kontrol_et(String avantaj, String motor_e, String mekanik_e, String kaporta_E, String obd_e) {

        ResuableMethods.scrollWithUiScrollable(avantaj);
        ResuableMethods.wait(1);
        ResuableMethods.scrollWithUiScrollable(motor_e);
        arabamComPage.expertiz_Carpı.click();
        ResuableMethods.wait(1);
        ResuableMethods.scrollWithUiScrollable(mekanik_e);
        arabamComPage.expertiz_Carpı.click();
        ResuableMethods.wait(1);
        ResuableMethods.scrollWithUiScrollable(kaporta_E);
        arabamComPage.expertiz_Carpı.click();
        ResuableMethods.wait(1);
        ResuableMethods.scrollWithUiScrollable(obd_e);
        arabamComPage.expertiz_Carpı.click();
        ResuableMethods.wait(1);


    }

    @Given("{string} a bas {string} , {string} , {string} ve dogrulayin")
    public void a_bas_ve_dogrulayin(String start, String motor_e, String mekanik_e, String kaporta_e) {

        ResuableMethods.scrollWithUiScrollable(start);
        ResuableMethods.wait(2);
        ResuableMethods.scrollWithUiScrollable(motor_e);
        Assert.assertTrue(arabamComPage.expertiz_Carpı.isDisplayed());
        ResuableMethods.wait(1);
        arabamComPage.expertiz_Carpı.click();

        ResuableMethods.scrollWithUiScrollable(mekanik_e);
        Assert.assertTrue(arabamComPage.expertiz_Carpı.isDisplayed());
        ResuableMethods.wait(1);
        arabamComPage.expertiz_Carpı.click();
        ResuableMethods.wait(1);
        ResuableMethods.scrollWithUiScrollable(kaporta_e);
        Assert.assertTrue(arabamComPage.expertiz_Carpı.isDisplayed());
        ResuableMethods.wait(1);
        arabamComPage.expertiz_Carpı.click();
        ResuableMethods.wait(3);

        Assert.assertTrue(arabamComPage.basliklargorunuyormu.isDisplayed());


    }


    @Given("{string} de {string} ye tiklaa")
    public void de_ye_tiklaa(String expertiz, String paketleri_incele) {

        ResuableMethods.scrollWithUiScrollable(expertiz);
        ResuableMethods.scrollWithUiScrollable(paketleri_incele);


    }

    @Given("{string} a butonuna tikla")
    public void a_butonuna_tikla(String satin_al) {

        ResuableMethods.scrollWithUiScrollable(satin_al);

        ResuableMethods.wait(3);
    }
    @Given("Fatura bilgileri ekranın geldigini dogrula")
    public void fatura_bilgileri_ekranın_geldigini_dogrula() {


     String expectedKelime="Fatura Bilgileri";
     String actualKelime=arabamComPage.Fatura_bilgilerigeldiginidogrula.getText();

     Assert.assertTrue(actualKelime.contains(expectedKelime));


    }


}
