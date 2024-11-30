package runners;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty",
                "json:target/cucumber.json"},
        features = {"src/test/resources/features"},
        glue ="stepDefinitions",
        tags = "@FACEBOOK",
        dryRun =true
        /* eger dry run degerimiz true ise bu adim bize features bulanan tag ait olan kisimdaki eksik adimlari yani tanimlanmayan
        adimlari bize soyler. Eger adimlar tanimlanmissa tekrar calistirildigin testimiz passed olur ama bu adimlarda eksik adim olmadigini
        gosterir yani aslinda testimizin passed oldugun gostermez

        Eger false olursa artik eksik adimlarin tamamlanmasinin ardindan tanimlanan adimlar testler uzerinde kosturlamaya baslar
         */

)

public class TestRunner {
}

    //    ,"html:target/cucumber-reports1.html"