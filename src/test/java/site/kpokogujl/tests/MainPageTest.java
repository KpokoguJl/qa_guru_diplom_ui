package site.kpokogujl.tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import site.kpokogujl.pages.*;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

public class MainPageTest extends TestBase{

    @Owner("allure8")
    @Feature("UI tests Unicom24")
    @Story("Main Page Tests")
    @DisplayName("Переход на страницу МФО")
    @Severity(SeverityLevel.BLOCKER)
    @Test
    void goToMfoPageTest() {
        UnicomMainPage mainPage = new UnicomMainPage();
        UnicomMfoPage mfoPage = new UnicomMfoPage();

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
        UnicomMainPage mainPage = new UnicomMainPage();
        UnicomCreditCardPage creditCardPage = new UnicomCreditCardPage();

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
        UnicomMainPage mainPage = new UnicomMainPage();
        UnicomCreditPage creditPage = new UnicomCreditPage();

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
        UnicomMainPage mainPage = new UnicomMainPage();
        UnicomCarCreditPage carCreditPage = new UnicomCarCreditPage();

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
        UnicomMainPage mainPage = new UnicomMainPage();

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
        UnicomMainPage mainPage = new UnicomMainPage();

        mainPage
                .openPage()
                .becomeAgentButtonClick();

        mainPage
                .isBecomeAgentPageOpen();
    }

}
