package Base;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {


    public WebDriver driver;
    @Before
    public void BeforeTesting(){

        System.setProperty("webdriver.chrome.driver","C:\\Users\\testinium\\IdeaProjects\\SampleCicekSepeti\\src\\test\\resource\\chromedriver.exe");
        driver=new ChromeDriver();


    }

  @After
    public void AfterTesting() throws InterruptedException {

        Thread.sleep(4000);
        driver.quit();

    }


}
