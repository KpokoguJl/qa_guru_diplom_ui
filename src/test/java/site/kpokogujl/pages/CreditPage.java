package site.kpokogujl.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CreditPage {
    SelenideElement pageHeader = $(byText("Потребительские кредиты")),
            filterButton = $(byText("Фильтры")),
            additionalParamTitle = $(".header").$(".title");

    @Step("Открываю страницу Кредиты.")
    public CreditPage openPage(){
        open("private/kredity");

        return this;
    }

    @Step("Раскрываю фильтры.")
    public void openAdditionalParams () {
        filterButton.click();
    }
    @Step("Проверяю, что открыта страница Потребительские кредиты.")
    public void pageIsOpened (){
        pageHeader.shouldHave(text("Потребительские кредиты"));
    }

    @Step("Проверяю, что открыты дополнительные фильтры.")
    public void filtersIsOpened (){
        additionalParamTitle.shouldBe(visible).shouldHave(text("Дополнительные параметры"));
    }
}
