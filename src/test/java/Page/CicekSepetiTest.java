package Page;

import Base.TestBase;
import org.junit.Test;

public class CicekSepetiTest extends TestBase {


    @Test
    public void CicekSepetiScenario() throws InterruptedException {
        new CiceksepetiScenario(driver).ScenarioHomeEnty();
        new CiceksepetiScenario(driver).ScenarioRegister();
        new CiceksepetiScenario(driver).LoginScenario();
        new CiceksepetiScenario(driver).ScenarioHomeSearch();
        new CiceksepetiScenario(driver).ScenarioBasketPage();



    }


}
