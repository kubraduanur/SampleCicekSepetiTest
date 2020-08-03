package Page;

import Base.BasePage;
import org.openqa.selenium.WebDriver;

public class CiceksepetiScenario extends BasePage {


    public CiceksepetiScenario(WebDriver driver) {
        super(driver);
    }

    public void ScenarioHomeEnty() throws InterruptedException {
        new HomePage(driver).ControlHome();
        Thread.sleep(4000);
        new HomePage(driver).MemberEntry();


    }

    public void ScenarioRegister() throws InterruptedException {
        Thread.sleep(4000);
        new RegisterPage(driver).ControlRegister();
        Thread.sleep(4000);
        new RegisterPage(driver).RegisterIncorrect("fvfv", "xffv", "fgdvfx");
        Thread.sleep(4000);
        new RegisterPage(driver).RegisterIncomplete("kubraduanur", "kubraduanur898@gmail.com", "kbrmsl1841");
        Thread.sleep(4000);
        new RegisterPage(driver).RegisterIncomplete2();
        Thread.sleep(4000);
        new RegisterPage(driver).RegisterSame();
        Thread.sleep(4000);
        new RegisterPage(driver).RegisterCorrect("kübra muslu", "7youssef-slami-2c@kukuka.org", "kbrmsl1841");
        Thread.sleep(4000);
        new RegisterPage(driver).EntryControlOut();
    }

    public void LoginScenario() throws InterruptedException {
        Thread.sleep(4000);
        new LoginPage(driver).Entry();
        Thread.sleep(4000);
        new LoginPage(driver).LoginEmpty("  "," ");
        Thread.sleep(4000);
        new LoginPage(driver).LoginIncorrect("kubraduanur898@gmail.com","kbrmsl1841");
        Thread.sleep(4000);
        new LoginPage(driver).LoginCorrect("7youssef-slami-2c@kukuka.org","kbrmsl1841");
        Thread.sleep(4000);
        new LoginPage(driver).EntryControl();

    }

    public void ScenarioHomeSearch() throws InterruptedException {

        Thread.sleep(4000);
        new HomePage(driver).SearchEmpty("    ");
        Thread.sleep(4000);
        new HomePage(driver).SearchCorrect("çiçek","istanbul");

    }

    public void ScenarioBasketPage() throws InterruptedException {
        Thread.sleep(4000);
        new BasketPage(driver).Order();
        Thread.sleep(4000);
        new BasketPage(driver).EnterInformation("kübra muslu","05445671390","Akmescit mahallesi hepkebirler sokak Kastamonu","ktü","05556812543");
        Thread.sleep(4000);
        new BasketPage(driver).BlankCardInformation();
        Thread.sleep(4000);
        new BasketPage(driver).IncorrectCardInformation("777");


    }




}