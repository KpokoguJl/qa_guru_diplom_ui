package site.kpokogujl.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import site.kpokogujl.tests.TestBase;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.currentFrameUrl;

public class MainPage extends TestBase {
    SelenideElement servicesMenu = $(".link").$(byText("Сервисы")),
            mfoButton = $(".app-icon-clock-24px"),
            creditCardButton = $(".app-icon-credit-card-24px"),
            creditButton = $(".app-icon-percent"),
            carCreditButton = $(".app-icon-key"),
            becomePartnerButton = $(By.linkText("Стать партнером")),
            becomeAgentButton = $(By.linkText("Стать агентом"));

    @Step("Открываю главную страницу.")
    public MainPage openPage() {
        open("");

        return this;
    }

    @Step("Кликаю на кнопку МФО.")
    public void mfoButtonClick() {
        mfoButton.click();
    }

    @Step("Кликаю на кнопку Кредитные карты.")
    public void creditCardButtonClick() {
        creditCardButton.click();
    }

    @Step("Кликаю на кнопку Кредиты.")
    public void creditButtonClick() {
        creditButton.click();
    }

    @Step("Кликаю на кнопку Автокредиты.")
    public void carCreditButtonClick() {
        carCreditButton.click();
    }

    @Step("Кликаю на кнопку Стать партнером.")
    public void becomePartnerButtonClick() {
        becomePartnerButton.click();
    }

    @Step("Кликаю на кнопку Стать агентом.")
    public void becomeAgentButtonClick() {
        becomeAgentButton.click();
    }

    @Step("Проверяю, что открылась страница Стать партнером.")
    public void isBecomePartnerPageOpen() {
        switchTo().window(1);
        webdriver().shouldHave(currentFrameUrl(baseUrl + "become-partner"));
    }

    @Step("Проверяю, что открылась страница Стать агентом.")
    public void isBecomeAgentPageOpen() {
        switchTo().window(1);
        webdriver().shouldHave(currentFrameUrl("https://nfc-partners.ru/"));
    }
}
