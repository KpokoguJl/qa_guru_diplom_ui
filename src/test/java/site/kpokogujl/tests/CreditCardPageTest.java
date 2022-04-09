package site.kpokogujl.tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import site.kpokogujl.pages.CreditCardPage;

public class CreditCardPageTest extends TestBase {


    @Owner("allure8")
    @Feature("UI tests Unicom24")
    @Story("Credit Card Page Tests")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Проверка дополнительных фильтров")
    void openFiltersOnCreditCardPageTest() {
        CreditCardPage creditCardPage = new CreditCardPage();

        creditCardPage
                .openPage()
                .openAdditionalParams();

        creditCardPage.filtersIsOpened();
    }
}
