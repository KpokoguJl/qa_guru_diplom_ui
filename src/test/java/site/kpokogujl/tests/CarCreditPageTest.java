package site.kpokogujl.tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import site.kpokogujl.pages.CarCreditPage;

public class CarCreditPageTest extends TestBase {

    @Owner("allure8")
    @Feature("UI tests Unicom24")
    @Story("Car Credit Page Tests")
    @DisplayName("Проверка дополнительных фильтров")
    @Severity(SeverityLevel.BLOCKER)
    @Test
    void openFiltersOnCarCreditPageTest() {
        CarCreditPage carCreditPage = new CarCreditPage();

        carCreditPage
                .openPage()
                .openAdditionalParams();

        carCreditPage.filtersIsOpened();
    }
}
