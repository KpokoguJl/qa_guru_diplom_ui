package site.kpokogujl.tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import site.kpokogujl.pages.UnicomCreditCardPage;

public class CreditCardPageTest extends TestBase {

    @Owner("allure8")
    @Feature("UI tests Unicom24")
    @Story("Credit Card Page Tests")
    @DisplayName("Проверка дополнительных фильтров")
    @Severity(SeverityLevel.BLOCKER)
    @Test
    void openFiltersOnCreditCardPageTest() {
        UnicomCreditCardPage creditCardPage = new UnicomCreditCardPage();

        creditCardPage
                .openPage()
                .openAdditionalParams();

        creditCardPage.filtersIsOpened();
    }
}
