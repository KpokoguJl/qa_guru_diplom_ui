package site.kpokogujl.tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import site.kpokogujl.pages.*;

import static com.codeborne.selenide.Selenide.open;

public class MainPageTest extends TestBase {

    @Test
    @Owner("allure8")
    @Feature("UI tests Unicom24")
    @Story("Main Page Tests")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Переход на страницу МФО")
    void goToMfoPageTest() {
        MainPage mainPage = new MainPage();
        MfoPage mfoPage = new MfoPage();

        mainPage
                .openPage()
                .mfoButtonClick();

        mfoPage.pageIsOpened();
    }

    @Test
    @Owner("allure8")
    @Feature("UI tests Unicom24")
    @Story("Main Page Tests")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Переход на страницу Кредитных карт")
    void goToCreditCardPageTest() {
        MainPage mainPage = new MainPage();
        CreditCardPage creditCardPage = new CreditCardPage();

        mainPage
                .openPage()
                .creditCardButtonClick();

        creditCardPage.pageIsOpened();
    }

    @Test
    @Owner("allure8")
    @Feature("UI tests Unicom24")
    @Story("Main Page Tests")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Переход на страницу Кредиты")
    void goToCreditPageTest() {
        MainPage mainPage = new MainPage();
        CreditPage creditPage = new CreditPage();

        mainPage
                .openPage()
                .creditButtonClick();

        creditPage.pageIsOpened();
    }

    @Test
    @Owner("allure8")
    @Feature("UI tests Unicom24")
    @Story("Main Page Tests")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Переход на страницу Автокредита")
    void goToCarCreditPageTest() {
        MainPage mainPage = new MainPage();
        CarCreditPage carCreditPage = new CarCreditPage();

        mainPage
                .openPage()
                .carCreditButtonClick();

        carCreditPage.pageIsOpened();
    }

    @Test
    @Owner("allure8")
    @Feature("UI tests Unicom24")
    @Story("Main Page Tests")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Проверка кнопки Стать партнером")
    void becomePartnerTest() {
        MainPage mainPage = new MainPage();

        mainPage
                .openPage()
                .becomePartnerButtonClick();

        mainPage
                .isBecomePartnerPageOpen();
    }

    @Test
    @Owner("allure8")
    @Feature("UI tests Unicom24")
    @Story("Main Page Tests")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Проверка кнопки стать Агентом")
    void becomeAgentTest() {
        MainPage mainPage = new MainPage();

        mainPage
                .openPage()
                .becomeAgentButtonClick();

        mainPage
                .isBecomeAgentPageOpen();
    }
}
