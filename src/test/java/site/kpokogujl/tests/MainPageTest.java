package site.kpokogujl.tests;

import org.junit.jupiter.api.Test;
import site.kpokogujl.pages.*;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

public class MainPageTest extends TestBase{

    @Test
    void goToMfoPageTest() {
        UnicomMainPage mainPage = new UnicomMainPage();
        UnicomMfoPage mfoPage = new UnicomMfoPage();

        mainPage
                .openPage()
                .mfoButtonClick();

        mfoPage.pageIsOpened();
    }

    @Test
    void goToCreditCardPageTest() {
        UnicomMainPage mainPage = new UnicomMainPage();
        UnicomCreditCardPage creditCardPage = new UnicomCreditCardPage();

        mainPage
                .openPage()
                .creditCardButtonClick();

        creditCardPage.pageIsOpened();
    }

    @Test
    void goToCreditPageTest() {
        UnicomMainPage mainPage = new UnicomMainPage();
        UnicomCreditPage creditPage = new UnicomCreditPage();

        mainPage
                .openPage()
                .creditButtonClick();

        creditPage.pageIsOpened();
    }

    @Test
    void goToCarCreditPageTest() {
        UnicomMainPage mainPage = new UnicomMainPage();
        UnicomCarCreditPage carCreditPage = new UnicomCarCreditPage();

        mainPage
                .openPage()
                .carCreditButtonClick();

        carCreditPage.pageIsOpened();
    }

    @Test
    void becomePartnerTest(){
        UnicomMainPage mainPage = new UnicomMainPage();

        mainPage
                .openPage()
                .becomePartnerButtonClick();

        mainPage
                .isBecomePartnerPageOpen();
    }

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
