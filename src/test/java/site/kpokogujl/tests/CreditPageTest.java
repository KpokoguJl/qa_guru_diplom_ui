package site.kpokogujl.tests;

import org.junit.jupiter.api.Test;
import site.kpokogujl.pages.UnicomCreditPage;

public class CreditPageTest extends TestBase {

    @Test
    void openFiltersOnCreditPageTest() {
        UnicomCreditPage creditPage = new UnicomCreditPage();

        creditPage
                .openPage()
                .openAdditionalParams();

        creditPage.filtersIsOpened();
    }
}
