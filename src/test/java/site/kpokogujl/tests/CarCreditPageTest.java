package site.kpokogujl.tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import site.kpokogujl.pages.CarCreditPage;

public class CarCreditPageTest extends TestBase {

    @Test
    @Owner("allure8")
    @Feature("UI tests Unicom24")
    @Story("Car Credit Page Tests")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Проверка дополнительных фильтров")
    void openFiltersOnCarCreditPageTest() {
        CarCreditPage carCreditPage = new CarCreditPage();

        carCreditPage
                .openPage()
                .openAdditionalParams();

        carCreditPage.filtersIsOpened();
    }
}
