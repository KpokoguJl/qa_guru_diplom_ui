package site.kpokogujl.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import java.time.Duration;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.currentFrameUrl;

public class CreditPage {
    SelenideElement pageHeader = $(byText(".breadcrumbs-item-text")),
            filterButton = $(byText("Фильтры")),
            additionalParamTitle = $(".header .title");

    @Step("Открываю страницу Кредиты.")
    public CreditPage openPage() {
        open("private/kredity");

        return this;
    }

    @Step("Раскрываю фильтры.")
    public void openAdditionalParams() {
        filterButton.click();
    }

    @Step("Проверяю, что открыта страница Потребительские кредиты.")
    public void pageIsOpened() {
        webdriver().shouldHave(currentFrameUrl(baseUrl + "private/kredity"));
    }

    @Step("Проверяю, что открыты дополнительные фильтры.")
    public void filtersIsOpened() {
        additionalParamTitle.shouldBe(visible).shouldHave(text("Дополнительные параметры"));
    }
}
