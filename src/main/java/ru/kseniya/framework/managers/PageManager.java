package ru.kseniya.framework.managers;

import ru.kseniya.framework.pages.CalculatorPage;
import ru.kseniya.framework.pages.StartPage;

public class PageManager {
    private static PageManager INSTANCE = null;
    private static StartPage startPage;
    private static CalculatorPage calculatorPage;


    private PageManager() {
    }

    public static PageManager getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new PageManager();
        }
        return INSTANCE;
    }

    public static StartPage getStartPage() {
        if (startPage == null) {
            startPage = new StartPage();
        }
        return startPage;
    }

    public static CalculatorPage getCalculatorPage() {
        if (calculatorPage == null) {
            calculatorPage = new CalculatorPage();
        }
        return calculatorPage;
    }

}
