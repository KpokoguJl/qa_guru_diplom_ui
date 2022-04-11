package site.kpokogujl.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CarCreditPage {
    SelenideElement pageHeader = $(".my0"),
            filterButton = $(byText("Фильтры")),
            additionalParamTitle = $(".header .title");

    @Step("Открываю страницу Автокредиты.")
    public CarCreditPage openPage() {
        open("private/avtokredity");

        return this;
    }

    @Step("Раскрываю фильтры.")
    public void openAdditionalParams() {
        filterButton.click();
    }

    @Step("Проверяю, что открыта страница Автокредит.")
    public void pageIsOpened() {
        pageHeader.shouldHave(text("Автокредит"));
    }

    @Step("Проверяю, что открыты дополнительные фильтры.")
    public void filtersIsOpened() {
        additionalParamTitle.shouldBe(visible).shouldHave(text("Дополнительные параметры"));
    }
}
