package ru.kseniya.framework.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.kseniya.framework.managers.PageManager;

import java.util.List;

public class CalculatorPage extends BasePage {
    @FindBy(xpath = "//label[@class=\"calculator__currency-field\"]")
    private List<WebElement> currency;

    @FindBy(xpath = "//input[@name=\"amount\"]")
    private WebElement inputFieldSum;

    @FindBy(xpath = "//div[@id=\"period-styler\"]")
    private WebElement deadlines;

    @FindBy(xpath = "//div[@class=\"calculator__slide-input-field\"]//li")
    private List<WebElement> listOfDeadlines;

    @FindBy(xpath = "//input[@name=\"replenish\"]")
    private WebElement replenish;

    @Step("Выбираем валюту {}")

    public CalculatorPage clickCurrency(String nameCurrency) {
        for (WebElement i : currency) {
            waitUtilElementToBeClickable(i);
            if (i.getText().contains(nameCurrency)) {
                i.click();
            }
        }
        return PageManager.getCalculatorPage();
    }

    @Step("Вводим сумму {sum}")
    public CalculatorPage fillInputFieldSum(String sum) {
        fillInputField(inputFieldSum, sum);
        return PageManager.getCalculatorPage();
    }

    @Step("Выбираем срок {deadline}")
    public CalculatorPage chooseDeadline(String deadline){
        waitUtilElementToBeClickable(deadlines).click();

        //opened
        for (WebElement i : listOfDeadlines) {
            waitUtilElementToBeVisible(i);
            if (i.getText().contains(deadline)) {
                i.click();
            }
        }
        return PageManager.getCalculatorPage();
    }
    @Step("Указываем eжемесячное пополнение {sum}")
    public CalculatorPage fillInputFieldReplenish(String replenish) {
        fillInputField(inputFieldSum, replenish);
        return PageManager.getCalculatorPage();
    }
}
