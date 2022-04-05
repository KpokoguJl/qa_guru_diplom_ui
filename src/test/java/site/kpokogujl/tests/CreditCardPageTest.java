package site.kpokogujl.tests;

import org.junit.jupiter.api.Test;
import site.kpokogujl.pages.UnicomCreditCardPage;

public class CreditCardPageTest extends TestBase {

    @Test
    void openFiltersOnCreditCardPageTest() {
        UnicomCreditCardPage creditCardPage = new UnicomCreditCardPage();

        creditCardPage
                .openPage()
                .openAdditionalParams();

        creditCardPage.filtersIsOpened();
    }
}
