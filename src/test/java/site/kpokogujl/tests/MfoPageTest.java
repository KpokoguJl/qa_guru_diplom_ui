package site.kpokogujl.tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import site.kpokogujl.pages.MfoPage;

public class MfoPageTest extends TestBase {

    @Test
    @Owner("allure8")
    @Feature("UI tests Unicom24")
    @Story("MFO Page Tests")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Проверка дополнительных фильтров")
    void openFiltersOnMfoPageTest() {
        MfoPage mfoPage = new MfoPage();

        mfoPage
                .openPage()
                .openAdditionalParams();

        mfoPage.filtersIsOpened();
    }
}
