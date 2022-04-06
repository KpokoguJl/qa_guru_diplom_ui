package site.kpokogujl.tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import site.kpokogujl.pages.UnicomMfoPage;

public class MfoPageTest extends TestBase{

    @Owner("allure8")
    @Feature("UI tests Unicom24")
    @Story("MFO Page Tests")
    @DisplayName("Проверка дополнительных фильтров")
    @Severity(SeverityLevel.BLOCKER)
    @Test
    void openFiltersOnMfoPageTest() {
        UnicomMfoPage mfoPage = new UnicomMfoPage();

        mfoPage
                .openPage()
                .openAdditionalParams();

        mfoPage.filtersIsOpened();
    }
}
