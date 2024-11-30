package stepDefinitions;

import io.cucumber.java.en.Given;
import pages.FacebookPage;
import utils.ResuableMethods;

public class FacebookILANVERMEStepdefinitions {

    FacebookPage facebookPage=new FacebookPage();
    @Given("{string} butona tikla")
    public void butona_tikla(String login) {

        ResuableMethods.wait(15);

        ResuableMethods.scrollWithUiScrollable(login);

    }
    @Given("Arama kismina tikla ve gruba git")
    public void arama_kismina_tikla_ve_gruba_git() {

    facebookPage.facesearchbox.sendKeys("KAYSERİ SAHİBİNDEN SATILIK/KİRALIK");
ResuableMethods.wait(2);

    }
    @Given("Uc noktaya tikla")
    public void uc_noktaya_tikla() {
  facebookPage.ucnokta.click();



    }
    @Given("Manage your content e tikla")
    public void manage_your_content_e_tikla() throws InterruptedException {

facebookPage.manageryourcontent.click();
ResuableMethods.koordinatTiklamaMethodu(234,890,2);

    }
}
