package site.kpokogujl.tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import site.kpokogujl.pages.*;

import static com.codeborne.selenide.Selenide.open;

public class MainPageTest extends TestBase{

    @Owner("allure8")
    @Feature("UI tests Unicom24")
    @Story("Main Page Tests")
    @DisplayName("Переход на страницу МФО")
    @Severity(SeverityLevel.BLOCKER)
    @Test
    void goToMfoPageTest() {
        MainPage mainPage = new MainPage();
        MfoPage mfoPage = new MfoPage();

        mainPage
                .openPage()
                .mfoButtonClick();

        mfoPage.pageIsOpened();
    }

    @Owner("allure8")
    @Feature("UI tests Unicom24")
    @Story("Main Page Tests")
    @DisplayName("Переход на страницу Кредитных карт")
    @Severity(SeverityLevel.BLOCKER)
    @Test
    void goToCreditCardPageTest() {
        MainPage mainPage = new MainPage();
        CreditCardPage creditCardPage = new CreditCardPage();

        mainPage
                .openPage()
                .creditCardButtonClick();

        creditCardPage.pageIsOpened();
    }

    @Owner("allure8")
    @Feature("UI tests Unicom24")
    @Story("Main Page Tests")
    @DisplayName("Переход на страницу Кредиты")
    @Severity(SeverityLevel.BLOCKER)
    @Test
    void goToCreditPageTest() {
        MainPage mainPage = new MainPage();
        CreditPage creditPage = new CreditPage();

        mainPage
                .openPage()
                .creditButtonClick();

        creditPage.pageIsOpened();
    }

    @Owner("allure8")
    @Feature("UI tests Unicom24")
    @Story("Main Page Tests")
    @DisplayName("Переход на страницу Автокредита")
    @Severity(SeverityLevel.BLOCKER)
    @Test
    void goToCarCreditPageTest() {
        MainPage mainPage = new MainPage();
        CarCreditPage carCreditPage = new CarCreditPage();

        mainPage
                .openPage()
                .carCreditButtonClick();

        carCreditPage.pageIsOpened();
    }

    @Owner("allure8")
    @Feature("UI tests Unicom24")
    @Story("Main Page Tests")
    @DisplayName("Проверка кнопки Стать партнером")
    @Severity(SeverityLevel.BLOCKER)
    @Test
    void becomePartnerTest(){
        MainPage mainPage = new MainPage();

        mainPage
                .openPage()
                .becomePartnerButtonClick();

        mainPage
                .isBecomePartnerPageOpen();
    }

    @Owner("allure8")
    @Feature("UI tests Unicom24")
    @Story("Main Page Tests")
    @DisplayName("Проверка кнопки стать Агентом")
    @Severity(SeverityLevel.BLOCKER)
    @Test
    void becomeAgentTest(){
        MainPage mainPage = new MainPage();

        mainPage
                .openPage()
                .becomeAgentButtonClick();

        mainPage
                .isBecomeAgentPageOpen();
    }

}
