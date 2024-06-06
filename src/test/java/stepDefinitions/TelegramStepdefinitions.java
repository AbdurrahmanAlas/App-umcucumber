package stepDefinitions;

import io.cucumber.java.en.Given;
import pages.AppPage.TelegramPage;
import utils.ResuableMethods;

public class TelegramStepdefinitions {

    TelegramPage telegramPage=new TelegramPage();

    @Given("{string} butonuna tiklar")
    public void butonuna_tiklar(String startmessagging) {

        ResuableMethods.scrollWithUiScrollable(startmessagging);
    }
    @Given("Ulke secme textine tikla ve Turkiye sec")
    public void ulke_secme_textine_tikla_ve_turkiye_sec() {

       telegramPage.USA.click();
        ResuableMethods.wait(1);
        ResuableMethods.scrollWithUiScrollable("+90");
        ResuableMethods.wait(4);


    }

    @Given("Telefon numarasını gir ve Ok a bas")
    public void telefon_numarasını_gir_ve_ok_a_bas() {


        telegramPage.phone.clear();
        ResuableMethods.wait(3);
        telegramPage.phone.sendKeys("5454081442");
        ResuableMethods.wait(2);
        telegramPage.sağokButton.click();

    }




}
