package site.kpokogujl.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CreditCardPage {
    SelenideElement pageHeader = $(".my0"),
            filterButton = $(byText("Фильтры")),
            additionalParamTitle = $(".header").$(".title");

    @Step("Открываю страницу Кредитные карты.")
    public CreditCardPage openPage(){
        open("private/kreditnye-karty");

        return this;
    }

    @Step("Раскрываю фильтры.")
    public void openAdditionalParams () {
        filterButton.click();
    }

    @Step("Проверяю, что открыта страница Кредитные карты.")
    public void pageIsOpened (){
        pageHeader.shouldHave(text("Кредитные карты"));
    }

    @Step("Проверяю, что открыты дополнительные фильтры.")
    public void filtersIsOpened (){
        additionalParamTitle.shouldBe(visible).shouldHave(text("Дополнительные параметры"));
    }
}
