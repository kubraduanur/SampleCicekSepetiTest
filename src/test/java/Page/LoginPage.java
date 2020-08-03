package Page;

import Base.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void Entry() throws InterruptedException {
        Thread.sleep(4000);
     clickxpath("/html/body/div[4]/div[1]/div/div[2]/div[2]/nav/ul/li[2]/a/span[2]");
        Thread.sleep(4000);
        clickxpath("/html/body/div[4]/div[1]/div/div[2]/div[2]/nav/ul/li[2]/div/div/ul/li[1]/a");

    }

         public void LoginEmpty(String email, String sifre){

            setById("EmailLogin",email);
            setById("Password",sifre);
            clickxpath("//*[@id=\"userLogin\"]/div[6]/button");

         }

    public void LoginIncorrect(String email, String sifre) throws InterruptedException {

        setById("EmailLogin",email);
        setById("Password",sifre);
        clickxpath("//*[@id=\"userLogin\"]/div[6]/button");
        Thread.sleep(4000);
        clickxpath("//*[@id=\"modalBox\"]/div/div/div[3]/button");

    }
    public void LoginCorrect(String email, String sifre){

        setById("EmailLogin",email);
        setById("Password",sifre);
        clickxpath("//*[@id=\"userLogin\"]/div[6]/button");

    }

    public void EntryControl() throws InterruptedException {

        Thread.sleep(4000);
        clickxpath("/html/body/div[4]/div[1]/div/div[2]/div[2]/nav/ul/li[3]/a/span[2]");
        Thread.sleep(4000);
        clickxpath("/html/body/main/div/div/div[1]/ul/li[3]/a/span[2]");
        Thread.sleep(4000);
        Assert.assertEquals((driver.findElement(By.id("Email")).getAttribute("value")), "7youssef-slami-2c@kukuka.org");
    }


}
