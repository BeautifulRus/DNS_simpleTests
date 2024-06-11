package step;

import core.Driver;
import io.cucumber.java.ru.И;
import io.qameta.allure.Step;


import java.io.IOException;


public class AutorizationTest extends Driver {
@Step
    @И("Инициализировать драйвер")
    public void инициализироватьДрайвер() throws IOException {
        initDriver();

    }


@Step
    @И("Открыть сайт по ссылке {string}")
    public void открытьСайтПоСсылке(String url) {
    AutorizationTest autorizationTest = new AutorizationTest();
    driver.get(url);
    int a = 1;

    }


}
