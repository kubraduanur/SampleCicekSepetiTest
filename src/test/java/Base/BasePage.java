package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {


    public WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver=driver;

    }

    //arama hereyerde olabileceği için buraya aldık yoksa homepage de olurdu
   /* public void Search(String search) throws InterruptedException {
        Thread.sleep(4000);
        clickxpath("//*[@id=\"product-search-0\"]/input");
        Thread.sleep(4000);
        setById("product-search-0",search);


    }*/
    //information=bilgi
    public void setById(String idsend,String information){
        driver.findElement(By.id(idsend)).clear();
        driver.findElement(By.id(idsend)).sendKeys(information);



    }
    public void clickId(String idclick){

        driver.findElement(By.id(idclick)).click();


    }
    //path=yol
    public void clickxpath(String yol){

        driver.findElement(By.xpath(yol)).click();
    }

    public void setByXpath(String id2send,String information2)
    {
        driver.findElement(By.xpath(id2send)).clear();
        driver.findElement(By.xpath(id2send)).sendKeys(information2);
    }
}
