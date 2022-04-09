package site.kpokogujl.tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import site.kpokogujl.pages.CreditPage;

public class CreditPageTest extends TestBase {

    @Owner("allure8")
    @Feature("UI tests Unicom24")
    @Story("Credit Page Tests")
    @DisplayName("Проверка дополнительных фильтров")
    @Severity(SeverityLevel.BLOCKER)
    @Test
    void openFiltersOnCreditPageTest() {
        CreditPage creditPage = new CreditPage();

        creditPage
                .openPage()
                .openAdditionalParams();

        creditPage.filtersIsOpened();
    }
}
