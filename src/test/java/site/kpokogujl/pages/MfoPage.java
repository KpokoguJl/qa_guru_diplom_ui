package site.kpokogujl.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MfoPage {
    SelenideElement pageHeader = $(".my0"),
            filterButton = $(byText("Фильтры")),
            additionalParamTitle = $(".header .title");

    @Step("Открываю страницу Микрозаймы.")
    public MfoPage openPage() {
        open("private/mikrozajmy");

        return this;
    }

    @Step("Раскрываю фильтры.")
    public void openAdditionalParams() {
        filterButton.click();
    }

    @Step("Проверяю, что открыта страница Микрозаймы.")
    public void pageIsOpened() {
        pageHeader.shouldHave(text("Займы онлайн на карту банка"));
    }

    @Step("Проверяю, что открыты дополнительные фильтры.")
    public void filtersIsOpened() {
        additionalParamTitle.shouldBe(visible).shouldHave(text("Дополнительные параметры"));
    }
}
