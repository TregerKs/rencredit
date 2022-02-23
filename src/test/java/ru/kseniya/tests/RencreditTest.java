package ru.kseniya.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.kseniya.framework.managers.PageManager;

public class RencreditTest extends BaseTests {

    @Test
    @DisplayName("Тестирование сайта 'rencredit.ru'")
    public void test() {
        PageManager.getStartPage().clickBaseMenu("Вклады")
                .clickCalculator()
                .clickCurrency("Рубли")
                .fillInputFieldSum("300000")
                .chooseDeadline("6 месяцев")
                .fillInputFieldReplenish("50000");


        try {
            Thread.sleep(60000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
