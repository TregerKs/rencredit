package ru.kseniya.framework.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.kseniya.framework.managers.PageManager;

import java.util.List;

public class StartPage extends BasePage {

    @FindBy(xpath = "//li[@class=\"nav__item nav__item_parent\"]/a[@href=\"javascript:\"]")
    private List<WebElement> baseMenu;

    @FindBy(xpath = "//div[@class=\"nav__item-sub-nav\"]//a[@href=\"https://rencredit.ru/contributions/\"]")
    private WebElement calculator;

    @Step("Переходим в меню {name}")
    public StartPage clickBaseMenu(String name) {
        for (WebElement i : baseMenu) {
            waitUtilElementToBeClickable(i);
            if (i.getText().equals(name)) {
                i.click();
            }
        }
        return PageManager.getStartPage();
    }

    @Step("Выбираем Крудитный калькулятор")
    public CalculatorPage clickCalculator(){
        waitUtilElementToBeClickable(calculator).click();
        return PageManager.getCalculatorPage();
    }


}
