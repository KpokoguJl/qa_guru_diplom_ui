package site.kpokogujl.tests;

import org.junit.jupiter.api.Test;
import site.kpokogujl.pages.UnicomCarCreditPage;

public class CarCreditPageTest extends TestBase {

    @Test
    void openFiltersOnCarCreditPageTest() {
        UnicomCarCreditPage carCreditPage = new UnicomCarCreditPage();

        carCreditPage
                .openPage()
                .openAdditionalParams();

        carCreditPage.filtersIsOpened();
    }
}
