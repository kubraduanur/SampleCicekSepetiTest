package Page;

import Base.BasePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
        driver.get("https://www.ciceksepeti.com/");
    }

    public void ControlHome(){
        driver.navigate().refresh();
        Assert.assertEquals("ÇiçekSepeti - Online Çiçek & Hediye Sitesi",driver.getTitle());
    }


   public void MemberEntry(){

       clickxpath("/html/body/div[4]/div[1]/div/div[2]/div[2]/nav/ul/li[2]/a/span[2]");
       clickxpath("/html/body/div[4]/div[1]/div/div[2]/div[2]/nav/ul/li[2]/div/div/ul/li[2]/a");


   }
   public void SearchEmpty(String kelime) throws InterruptedException {
        Thread.sleep(4000);
         clickxpath("//*[@id=\"product-search-2\"]/input");
         Thread.sleep(4000);
         setByXpath("//*[@id=\"product-search-2\"]/input",kelime);
          Thread.sleep(3000);
          clickxpath("//*[@id=\"product-search-2\"]/button");
         Thread.sleep(4000);
       clickxpath("//*[@id=\"modalBox\"]/div/div/div[3]/button");
   }
    public void SearchCorrect(String kelime, String adres) throws InterruptedException {
        Thread.sleep(4000);
        clickxpath("//*[@id=\"product-search-2\"]/input");
        Thread.sleep(4000);
        setByXpath("//*[@id=\"product-search-2\"]/input",kelime);
        Thread.sleep(3000);
        clickxpath("//*[@id=\"product-search-2\"]/button");
        Thread.sleep(3000);
        clickxpath("/html/body/div[6]/div/div[1]/div[2]/div[2]/div/button/span[2]");
        Thread.sleep(3000);
        setByXpath("//*[@id=\"district-search-0\"]/input",adres);
        Thread.sleep(3000);
        clickxpath("//*[@id=\"district-search-0\"]/div[3]/ul/li[1]/a");
        Thread.sleep(3000);
        clickxpath("/html/body/main/div/div[1]/div[4]/div[1]/div/div/a/div[1]/img");

    }

}
