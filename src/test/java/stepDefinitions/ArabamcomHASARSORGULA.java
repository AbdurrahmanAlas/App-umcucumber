package stepDefinitions;

import io.cucumber.java.en.Given;
import pages.ArabamComPage;
import utils.ResuableMethods;

public class ArabamcomHASARSORGULA {

    ArabamComPage arabamComPage=new ArabamComPage();

    @Given("Plakayi gir ve sorgula butonuna tikla")
    public void plakayi_gir_ve_sorgula_butonuna_tikla() {

arabamComPage.plakayi_girin.sendKeys("38 LY 562");
ResuableMethods.scrollWithUiScrollable("Sorgula");


    }


    @Given("{string} ve {string} ye tikla ve adresi ekle")
    public void ve_ye_tikla_ve_adresi_ekle(String adres_Ekle, String kaydet) {

   ResuableMethods.scrollWithUiScrollable(adres_Ekle);

   arabamComPage.adres_yaz.sendKeys("Kayseri Zümrüt mahallesi");
   arabamComPage.adres_ilsec.click();
   ResuableMethods.wait(3);
   ResuableMethods.scrollWithUiScrollable("Kayseri");
   arabamComPage.adres_ilcesec.click();
   ResuableMethods.wait(3);
   ResuableMethods.scrollWithUiScrollable("Kocasinan");
   arabamComPage.adres_semtsec.click();
   ResuableMethods.wait(3);
   ResuableMethods.scrollWithUiScrollable("Zümrüt mahallesi");
arabamComPage.adres_postakodusec.sendKeys("38020");
   ResuableMethods.scrollWithUiScrollable(kaydet);

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

}
