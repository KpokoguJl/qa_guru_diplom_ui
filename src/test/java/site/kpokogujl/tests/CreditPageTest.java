package site.kpokogujl.tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import site.kpokogujl.pages.CreditPage;

public class CreditPageTest extends TestBase {

    @Test
    @Owner("allure8")
    @Feature("UI tests Unicom24")
    @Story("Credit Page Tests")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Проверка дополнительных фильтров")
    void openFiltersOnCreditPageTest() {
        CreditPage creditPage = new CreditPage();

        creditPage
                .openPage()
                .openAdditionalParams();

        creditPage.filtersIsOpened();
    }
}
