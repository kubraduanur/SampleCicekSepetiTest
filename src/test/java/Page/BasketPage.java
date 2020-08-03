package Page;

import Base.BasePage;
import org.openqa.selenium.WebDriver;

public class BasketPage extends BasePage {
    public BasketPage(WebDriver driver) {
        super(driver);
    }
    //*[@
    public void Order() throws InterruptedException {
        Thread.sleep(3000);
        clickxpath("//*[@id=\"productDetailSend\"]/div/div/div[2]/div[4]/div[2]/div[6]/div[4]/div[1]");
        Thread.sleep(3000);
        clickxpath("/html/body/div[9]/div[1]/table/tbody/tr[3]/td[7]\n");
        Thread.sleep(3000);
        clickxpath("//*[@id=\"productDetailSend\"]/div/div/div[2]/div[4]/div[2]/div[6]/div[4]/div[2]/select");
        Thread.sleep(3000);
        clickxpath(" //*[@id=\"productDetailSend\"]/div/div/div[2]/div[4]/div[2]/div[6]/div[4]/div[2]/select/option[4]");
        Thread.sleep(3000);
        clickxpath("//*[@id=\"productDetailSend\"]/div/div/div[2]/div[4]/div[2]/div[19]/div[4]/button");
    }
public void EnterInformation(String ad, String tel, String adresim, String okul, String tel2) throws InterruptedException {
Thread.sleep(3000);
  setById("GroupDeliveryAddressList_0__Address_AddressName",ad);
    Thread.sleep(3000);
setById("GroupDeliveryAddressList_0__Address_Phone_Phone",tel);
    Thread.sleep(3000);
setById("GroupDeliveryAddressList_0__Address_AddressLine",adresim);
    Thread.sleep(3000);
setById("GroupDeliveryAddressList_0__Address_SendingPlaceValue",okul);
    Thread.sleep(3000);
clickxpath("/html/body/main/div/form/div/div[1]/div/div/div[3]/div[3]/div");
    Thread.sleep(3000);
clickxpath("/html/body/main/div/form/div/div[1]/div/div/div[3]/div[3]/div/div[2]/div/div[2]");
    Thread.sleep(3000);
clickxpath("/html/body/main/div/form/div/div[1]/div/div/div[3]/div[4]/div/div[1]");
    Thread.sleep(3000);
clickxpath("/html/body/main/div/form/div/div[1]/div/div/div[3]/div[4]/div/div[1]/input");
    Thread.sleep(3000);
clickxpath("/html/body/main/div/form/div/div[1]/div/div/div[3]/div[4]/div/div[2]/div/div[1]");
Thread.sleep(3000);
clickxpath("/html/body/main/div/form/div/div[2]/div[3]/button");
Thread.sleep(3000);
clickxpath("/html/body/main/div/div/form/div[2]/div[1]/button");
    Thread.sleep(3000);
setById("PhoneNumber",tel2);

}

public void BlankCardInformation() throws InterruptedException {
    Thread.sleep(3000);
    clickxpath("/html/body/main/div/div/div[2]/div[1]/button");
    Thread.sleep(3000);
    clickxpath("//*[@id=\"confirm-order-form\"]/div[2]/div[2]/div[5]/button");
}
    public void IncorrectCardInformation(String numara) throws InterruptedException {
        Thread.sleep(3000);
       setById("CreditCardNumber",numara);
        Thread.sleep(3000);
        clickxpath("//*[@id=\"confirm-order-form\"]/div[2]/div[2]/div[5]/button");
    }



}
