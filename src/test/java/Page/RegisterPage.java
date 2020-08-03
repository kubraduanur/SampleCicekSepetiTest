package Page;

import Base.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends BasePage {


    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public void ControlRegister() {
        driver.navigate().refresh();
        Assert.assertEquals("Cicek Siparisi, Online Cicek Gonder , CicekSepeti.com", driver.getTitle());

    }

    public void RegisterIncorrect(String kadi, String email, String sifre) {

        setById("NameIndivual", kadi);
        setById("EmailIndivual", email);
        setById("PasswordIndivual", sifre);
        clickxpath("//*[@id=\"newMemberFormIndividual\"]/div[10]/button");

    }

    public void RegisterIncomplete(String kadi, String email, String sifre) {

        setById("NameIndivual", kadi);
        setById("EmailIndivual", email);
        setById("PasswordIndivual", sifre);
        clickxpath("//*[@id=\"newMemberFormIndividual\"]/div[10]/button");

    }


    public void RegisterIncomplete2() throws InterruptedException {
        Thread.sleep(4000);
        clickxpath("//*[@id=\"modalBox\"]/div/div/div[3]/button");
        Thread.sleep(4000);
        clickxpath("//*[@id=\"newMemberFormIndividual\"]/div[8]/label/a");
        Thread.sleep(4000);
        clickxpath("//*[@id=\"customModalBox\"]/div/div/div[3]/button");

    }

    public void RegisterSame() throws InterruptedException {

        Thread.sleep(4000);
        clickxpath("//*[@id=\"newMemberFormIndividual\"]/div[9]/label/a[2]");
        Thread.sleep(4000);
        clickxpath("//*[@id=\"modalBox\"]/div/div/div[3]/button");
        Thread.sleep(4000);
        clickxpath("//*[@id=\"newMemberFormIndividual\"]/div[10]/button");
        Thread.sleep(4000);
        clickxpath(" //*[@id=\"modalBox\"]/div/div/div[3]/button");

    }

    public void RegisterCorrect(String kadi, String email, String sifre) throws InterruptedException {
        Thread.sleep(4000);
        setById("NameIndivual", kadi);
        setById("EmailIndivual", email);
        setById("PasswordIndivual", sifre);
        Thread.sleep(4000);
        clickxpath("//*[@id=\"newMemberFormIndividual\"]/div[10]/button");


    }

    public void EntryControlOut() throws InterruptedException {

        Thread.sleep(4000);
        clickxpath("/html/body/div[4]/div[1]/div/div[2]/div[2]/nav/ul/li[3]/a/span[2]");
        Thread.sleep(4000);
        clickxpath("/html/body/main/div/div/div[1]/ul/li[3]/a/span[2]");
        Thread.sleep(4000);
        Assert.assertEquals((driver.findElement(By.id("Email")).getAttribute("value")), "7youssef-slami-2c@kukuka.org");
        Thread.sleep(4000);
        clickxpath(" /html/body/div[4]/div[1]/div/div[2]/div[2]/nav/ul/li[4]/a");


    }
}